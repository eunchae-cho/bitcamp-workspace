package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
// 드라이버 로딩 방법1
public class Exam0110 {
	public static void main(String[] args) {
		
		try {
			
			java.sql.Driver maraiDbDriver = new org.mariadb.jdbc.Driver();
			DriverManager.registerDriver(maraiDbDriver);
			
			java.sql.Driver oracleDriver = new oracle.jdbc.OracleDriver();
			DriverManager.registerDriver(oracleDriver);
			
			java.sql.Driver mssqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();
			DriverManager.registerDriver(mssqlDriver);
			
			
			
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
