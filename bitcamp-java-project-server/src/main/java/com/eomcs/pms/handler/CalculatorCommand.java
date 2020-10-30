package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

import com.eomcs.util.Prompt;


public class CalculatorCommand implements Command {

	@Override
	public void execute(PrintWriter out, BufferedReader in) {
		out.println("[계산기]");

		try {
			String input = Prompt.inputString("계산식:(예: 5 + 11)", out, in);
			String[] arr = input.split(" ");
			
			if (arr.length != 3) {
				out.println("입력한 방식이 올바르지 않습니다.");
				out.println("(예: 5 + 11)");
				return;
			}

			int a = Integer.parseInt(arr[0]);
			String op = arr[1];
			int b = Integer.parseInt(arr[2]);
			int result = 0;

			switch (op) {
			case "+ ":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			default:
				out.println("해당 연산자는 지원하지 않습니다.");
				return;
			}
			
			out.printf("계산 결과 : %d %s %d = %d", a,b,op,result);
			
		} catch (Exception e) {
			out.printf("작업처리 중 오류 발생 - %s \n", e.getMessage());
		}
	}
}
