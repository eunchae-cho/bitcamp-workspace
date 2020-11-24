package com.eomcs.pms.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/list")
public class BoardListCommand extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletContext ctx = req.getServletContext();
		BoardService boardService = (BoardService) ctx.getAttribute("boardService");
		res.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		try {
			out.println("<table>");
			res.setContentType("text/html;charset=UTF-8");		

			out.println("<head><title>[게시물 목록]</title></head>");
		
			List<Board> list = boardService.list();
			
			out.println("<tr><td>번호</td>,"
					+ " <td>제목</td>,"
					+ " <td>작성자</td>,"
					+ " <td>등록일</td>,"
					+ " <td>조회수</td></tr>");
	
			for (Board board : list) {
				out.printf("<tr><td>%d</td>,"
						+ " <td>%s</td>,"
						+ " <td>%s</td>,"
						+ " <td>%s</td>,"
						+ " <td>%d</td></tr>\n",
						board.getNo(), board.getTitle(), board.getWriter().getName(),
						board.getRegisteredDate(), board.getViewCount());
		
			}	
			out.println("</table>");
		} catch (Exception e) {
			out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());
			
			StringWriter errOut = new StringWriter();
			e.printStackTrace(new PrintWriter(errOut));
			out.printf("<pre>%s</pre>\n",errOut.toString());
		}
		
		out.println("</body>");
		out.println("</html>");
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
