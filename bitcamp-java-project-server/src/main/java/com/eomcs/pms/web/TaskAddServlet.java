package com.eomcs.pms.web;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.service.ProjectService;
import com.eomcs.pms.service.TaskService;

@Controller
public class TaskAddServlet  {
	
	@Autowired TaskService taskService;
	@Autowired ProjectService projectService;


	@RequestMapping("/task/add")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
   
    response.setContentType("text/html;charset=UTF-8");

    // 프로젝트 번호를 가지고 프로젝트 정보를 꺼내온다.
      Project project = projectService.get(
          Integer.parseInt(request.getParameter("projectNo")));
      request.setAttribute("project", project);
      request.getRequestDispatcher("/task/form.jsp").include(request, response);
      
      Task task = new Task();
      task.setProjectNo(Integer.parseInt(request.getParameter("projectNo")));
      task.setContent(request.getParameter("content"));
      task.setDeadline(Date.valueOf(request.getParameter("deadline")));
      task.setStatus(Integer.parseInt(request.getParameter("status")));
      task.setOwner(
          new Member()
          .setNo(Integer.parseInt(request.getParameter("owner")))
          );

      taskService.add(task);

      return "redirect:../../project/detail?no=" + request.getParameter("projectNo");

  }

 
}
