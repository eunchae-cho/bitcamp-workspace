package com.eomcs.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exam0361 {
	public static void main(String[] args) throws Exception {

		try (Connection con = DriverManager
				.getConnection("jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
				Statement stmt = con.createStatement();) {

			// 부모테이블의 데이터를 참조하는 자식테이블의 데이터 먼저 삭제
			int count = stmt.executeUpdate("delete from x_board_file where board_id = 1\n");
			System.out.printf("x_board_file %d 개 삭제 성공!", count);

			// 부모테이블의 데이터 삭제
			count = stmt.executeUpdate("delete from x_board where board_id = 1\n");
			System.out.printf("x_board %d 개 삭제 성공!", count);
		}

	}
}
