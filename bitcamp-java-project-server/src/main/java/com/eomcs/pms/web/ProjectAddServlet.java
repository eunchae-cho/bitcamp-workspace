package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.ProjectService;

@WebServlet("/project/add")
public class ProjectAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext ctx = req.getServletContext();
		ProjectService projectService = (ProjectService) ctx.getAttribute("projectService");

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		// out.println("<meta http-equiv='Refresh' content='1;url=list'>");
		out.println("<title>프로젝트등록</title></head>");
		out.println("<body>");

		try {
			out.println("<h1>프로젝트 등록</h1>");

			Project project = new Project();
			project.setTitle(req.getParameter("title"));
			project.setContent(req.getParameter("content"));
			project.setStartDate(Date.valueOf(req.getParameter("startDate")));
			project.setEndDate(Date.valueOf(req.getParameter("endDate")));

			HttpSession session = req.getSession();
			Member loginUser = (Member) session.getAttribute("loginUser");
			project.setOwner(loginUser);

			List<Member> members = new ArrayList<>();

			String[] memberNoList = req.getParameterValues("members");
			if (memberNoList != null) {
				for (String memberNo : memberNoList) {
					members.add(new Member().setNo(Integer.parseInt(memberNo)));
				}
			}
			project.setMembers(members);

			projectService.add(project);

			out.println("<p>프로젝트가 등록되었습니다!</p>");

		} catch (Exception e) {
			out.println("<h2>작업 처리 중 오류 발생!</h2>");
			out.printf("<pre>%s</pre>\n", e.getMessage());

			StringWriter errOut = new StringWriter();
			e.printStackTrace(new PrintWriter(errOut));
			out.println("<h3>상세 오류 내용</h3>");
			out.printf("<pre>%s</pre>\n", errOut.toString());
		}

		out.println("</body>");
		out.println("</html>");
	}

}
