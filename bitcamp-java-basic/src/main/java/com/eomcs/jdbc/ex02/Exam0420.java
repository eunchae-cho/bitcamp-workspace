package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0420 {

	public static void main(String[] args) throws Exception {
		String title = null;
		String contents = null;
		ArrayList<String> files = new ArrayList<>();

		try (Scanner keyScan = new Scanner(System.in)) {

			System.out.print("제목? ");
			title = keyScan.nextLine();

			System.out.print("내용? ");
			contents = keyScan.nextLine();

			// 사용자로부터 첨부파일 입력 받기
			while (true) {
				System.out.print("첨부파일: (완료 :엔터키) ");
				String filename = keyScan.nextLine();
				if (filename.length() == 0) {
					break;
				}
				files.add(filename);
			}

			System.out.print("입력하시겠습니까?(y/N) ");
			String input = keyScan.nextLine();

			if (!input.equalsIgnoreCase("y") && input.length() != 0) {
				System.out.println("등록을 취소하였습니다.");
				return;
			}
		}

		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
				PreparedStatement boardStmt = con.prepareStatement(
						"" + "insert into x_board(title,contents) values(?,?)", Statement.RETURN_GENERATED_KEYS);
				PreparedStatement fileStmt = con
						.prepareStatement("insert into x_board_file(file_path,board_id) values(?,?)")) {

			boardStmt.setString(1, title);
			boardStmt.setString(2, contents);
			int count = boardStmt.executeUpdate();
			System.out.printf("%d 개 게시글 입력 성공!\n", count);

			// 위에서 입력한 게시글의 PK 값을 알아내기
			ResultSet keyRS = boardStmt.getGeneratedKeys();
			keyRS.next(); // PK가 들어있는 레코드를 한 개 가져온다.
			int boardId = keyRS.getInt(1); // 레코드에서 컬럼 값을 꺼낸다.

			// 첨부파일 입력
			int fileCount = 0;
			for (String filename : files) {
				fileStmt.setString(1, filename);

				// 위에서 게시글 입력 후에 자동 생성된 PK 값을 사용한다.
				fileStmt.setInt(2, boardId);

				fileStmt.executeUpdate();
				fileCount++;
			}
			System.out.printf("%d 개 첨부파일 입력 성공!\n", fileCount);
		}

	}
}
