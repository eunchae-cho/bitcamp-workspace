package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
// 드라이버 로딩 방법4
public class Exam0140 {
	public static void main(String[] args) {
		
		try {
			// 반드시 패키지명 포함 => fully-qualified class name
//			Class.forName("org.mariadb.jdbc.Driver"); 
//			Class.forName("oracle.jdbc.OracleDriver");
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//				
			System.out.printf("java.home=%s\n", System.getProperty("java.home"));
			System.out.printf("user.home=%s\n", System.getProperty("user.home"));
			
			System.setProperty("jdbc.drivers", "org.mariadb.jdbc.Driver:com.eomcs.jdbc.ex01.MyDriver");
		    System.out.printf("jdbc.drivers=%s\n", System.getProperty("jdbc.drivers"));
			
			java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://"); 
			System.out.println(driver);
			
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
