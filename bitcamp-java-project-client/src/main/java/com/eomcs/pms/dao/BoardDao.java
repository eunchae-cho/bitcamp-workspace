package com.eomcs.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;

public class BoardDao {
	
	public int insert(Board board) throws Exception {
		  try (Connection con = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
			        PreparedStatement stmt = con.prepareStatement(
			            "insert into pms_board(title,content,writer) values(?,?,?)")) {

			      stmt.setString(1, board.getTitle());
			      stmt.setString(2, board.getContent());
			      stmt.setInt(3, board.getWriter().getNo());
			      return stmt.executeUpdate();
		  }
	}
	
	public int delete(int no) throws Exception {
		 try (Connection con = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
			        PreparedStatement stmt = con.prepareStatement("delete from pms_board where no=?")) {

			      stmt.setInt(1, no);
			      return stmt.executeUpdate();
		 }
	}
	
	public Board findByNo(int no) throws Exception {
		 try (Connection con = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
			        PreparedStatement stmt = con.prepareStatement(
			            "select b.no, b.title, b.content, b.cdt, b.vw_cnt, m.no writer_no, m.name"
			                + " from pms_board b inner join pms_member m on b.writer=m.no"
			                + " where b.no = ?")) {

			      stmt.setInt(1, no);
			      
			      try (ResultSet rs = stmt.executeQuery()) {
			        if (rs.next()) {
			        	Board board = new Board();
			        	board.setNo(rs.getInt("no"));
			        	board.setTitle(rs.getString("title"));
			        	board.setContent(rs.getString("content"));
			        	board.setRegisteredDate(rs.getDate("cdt"));
			        	
			        	Member member = new Member();
			        	member.setNo(rs.getInt("writer_no"));
			        	member.setName(rs.getString("name"));
			        	board.setWriter(member);
			        	
			        	board.setViewCount(rs.getInt("vw_cnt"));
			        
			      
			          try (PreparedStatement stmt2 = con.prepareStatement(
			              "update pms_board set vw_cnt = vw_cnt + 1"
			                  + " where no = ?")) {
			            stmt2.setInt(1, no);
			            stmt2.executeUpdate(); 
			          }
			          return board;
			        } else {
			        	return null;
			        }
			      }
		 }
	}
	
	public List<Board> findAll() throws Exception {
		 try (Connection con = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
			        PreparedStatement stmt = con.prepareStatement(
			            "select b.no, b.title, b.cdt, b.vw_cnt, m.no writer_no, m.name"
			                + " from pms_board b inner join pms_member m on b.writer=m.no"
			                + " order by b.no desc")) {
			 
			 try (ResultSet rs = stmt.executeQuery()) {
				 ArrayList<Board> list = new ArrayList<>();
				 
				 while (rs.next()) {
					 Board board = new Board();
					 board.setNo(rs.getInt("no"));
					 board.setTitle(rs.getString("title"));
					 board.setRegisteredDate(rs.getDate("cdt"));
					 board.setViewCount(rs.getInt("vw_cnt"));
					 
					 Member member = new Member();
					 member.setNo(rs.getInt("writer_no"));
					 member.setName(rs.getString("name"));
					 
					list.add(board);
				 }
				 return list;
			 }
			 
		 }
	}
	
	public int update(Board board) throws Exception {
		  try (Connection con = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
			        PreparedStatement stmt = con.prepareStatement(
			            "update pms_board set title = ?, content = ? where no = ?")) {

			      stmt.setString(1, board.getTitle());
			      stmt.setString(2, board.getContent());
			      stmt.setInt(3, board.getNo());
			      return stmt.executeUpdate();
			    }
	}
}
