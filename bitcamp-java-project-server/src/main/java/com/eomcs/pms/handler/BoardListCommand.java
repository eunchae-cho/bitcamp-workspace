package com.eomcs.pms.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/list")
public class BoardListCommand implements Servlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletContext ctx = req.getServletContext();
		BoardService boardService = (BoardService) ctx.getAttribute("boardService");
		res.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = res.getWriter();

		try {
			out.println("[게시물 목록]");

			List<Board> list = boardService.list();

			out.println("번호, 제목, 작성자, 등록일, 조회수");

			for (Board board : list) {
				out.printf("%d, %s, %s, %s, %d\n", board.getNo(), board.getTitle(), board.getWriter().getName(),
						board.getRegisteredDate(), board.getViewCount());
			}
		} catch (Exception e) {
			out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
