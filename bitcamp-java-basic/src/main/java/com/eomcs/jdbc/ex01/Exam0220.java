package com.eomcs.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0220 {
	public static void main(String[] args) throws Exception {

		try (Connection con =  DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/studydb",
					"study", 
					"1111");){
			
			System.out.println("DBMS와 연결됨");
		} 
		
		System.out.println("DBMS와 연결 해제");
	}
}
