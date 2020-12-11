package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.service.MemberService;
import com.eomcs.pms.service.ProjectService;


@Controller
public class ProjectDetailServlet {
	
	ProjectService projectService;
	 MemberService memberService;

	public ProjectDetailServlet(ProjectService projectService, MemberService memberService) {
		this.projectService = projectService;
		this.memberService = memberService;
	}


  @RequestMapping("/project/detail")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    response.setContentType("text/html;charset=UTF-8");
      int no = Integer.parseInt(request.getParameter("no"));
      request.setAttribute("project", projectService.get(no));
      request.setAttribute("members", memberService.list());
      return "/project/detail.jsp";
  }
}
