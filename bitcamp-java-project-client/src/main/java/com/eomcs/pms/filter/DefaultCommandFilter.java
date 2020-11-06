package com.eomcs.pms.filter;

import java.util.Map;

import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.Request;

public class DefaultCommandFilter implements CommandFilter {
	
	@SuppressWarnings("unchecked")
	@Override
	public void doFilter(Request request, FilterChain next) {
		Map<String,Object> context = request.getContext();
		Map<String,Command> commandMap = (Map<String,Command>) context.get("commandMap");
		
        Command command = commandMap.get(request.getCommandPath());
        if (command != null) {
          try {
           
          } catch (Exception e) {
            // 오류가 발생하면 그 정보를 갖고 있는 객체의 클래스 이름을 출력한다.
            System.out.println("--------------------------------------------------------------");
            System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
            System.out.println("--------------------------------------------------------------");
          }
        } else {
          System.out.println("실행할 수 없는 명령입니다.");
        }
		
	}
}
