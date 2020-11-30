package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.ProjectService;

@WebServlet("/project/list")
public class ProjectListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 ServletContext ctx = req.getServletContext();
		    ProjectService projectService =
		        (ProjectService) ctx.getAttribute("projectService");

		    resp.setContentType("text/html;charset=UTF-8");
		    PrintWriter out = resp.getWriter();

		    out.println("<!DOCTYPE html>");
		    out.println("<html>");
		    out.println("<head><title>프로젝트목록</title></head>");
		    out.println("<body>");


		try {
			out.println("<h1>프로젝트 목록</h1>");
			
			List<Project> list = projectService.list();
			out.println("번호, 프로젝트명, 시작일 ~ 종료일, 관리자, 팀원");

			for (Project project : list) {
				StringBuilder members = new StringBuilder();
				for (Member member : project.getMembers()) {
					if (members.length() > 0) {
						members.append(",");
					}
					members.append(member.getName());
				}

				out.printf("%d, %s, %s ~ %s, %s, [%s]\n", project.getNo(), project.getTitle(), project.getStartDate(),
						project.getEndDate(), project.getOwner().getName(), members.toString());
			}
		} catch (Exception e) {
			out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
			e.printStackTrace();
		}
	}
	
		
}
