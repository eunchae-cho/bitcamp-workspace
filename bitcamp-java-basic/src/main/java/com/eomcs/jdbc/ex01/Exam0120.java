package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
// 드라이버 로딩 방법2
public class Exam0120 {
	public static void main(String[] args) {
		
		try {
			// Driver Class 에서 static 블록으로 스스로 드라이버를 만들고 설정하기 때문에
			// 따로 할 필요가 없다.
			new org.mariadb.jdbc.Driver();
			new oracle.jdbc.driver.OracleDriver();
			new com.microsoft.sqlserver.jdbc.SQLServerDriver();
						
			
			
			java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://"); 
			System.out.println(driver);
			
			java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://"); 
			System.out.println(driver2);
			
			java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://"); 
			System.out.println(driver3);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
