package com.eomcs.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exam0350 {
	public static void main(String[] args) throws Exception {

		try (Connection con = DriverManager
				.getConnection("jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
				Statement stmt = con.createStatement();) {
			
	
			int count = stmt.executeUpdate(
					"update x_board set view_count = view_count + 1Exam0310.java\" + \" where board_id > 4");
			  System.out.printf("%d 개 입력 성공!", count);
		}

	}
}
