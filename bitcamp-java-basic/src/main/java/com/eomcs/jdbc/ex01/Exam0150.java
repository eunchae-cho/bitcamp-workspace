package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

// 드라이버 로딩 방법5
public class Exam0150 {
	public static void main(String[] args) {

		try {
			// 반드시 패키지명 포함 => fully-qualified class name
//			Class.forName("org.mariadb.jdbc.Driver"); 
//			Class.forName("oracle.jdbc.OracleDriver");
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//				
			// 드라이버 매니저가  .jar파일을 알아서 찾아서 드라이버를 자동 로딩해준다,
			java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb:");
			System.out.println(driver);

			System.out.println("테스트!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
