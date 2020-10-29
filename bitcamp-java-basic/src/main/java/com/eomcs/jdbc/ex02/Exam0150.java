package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam0150 {

	public static void main(String[] args) throws Exception {
		String no = null;

		try (Scanner keyScan = new Scanner(System.in)) {

			System.out.print("번호? ");
			no = keyScan.nextLine();

		}

		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
				Statement stmt = con.createStatement();) {

			// 부모테이블의 데이터를 참조하는 자식테이블의 데이터 먼저 삭제
			int count = stmt.executeUpdate("delete from x_board_file where board_id = " + no);
			// 부모테이블의 데이터 삭제
			count = stmt.executeUpdate("delete from x_board where board_id = " + no);
				if (count == 0) {
				System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
			} else {
				System.out.println("삭제하였습니다.");
			}

		}
	}
}
