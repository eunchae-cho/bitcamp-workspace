package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.service.TaskService;

@Controller
public class TaskListServlet {
	
	TaskService taskService;

	public TaskListServlet(TaskService taskService) {
		this.taskService = taskService;
	}


  @RequestMapping("/task/list")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception  {

	  int projectNo = Integer.parseInt(request.getParameter("no"));
      request.setAttribute("tasks", taskService.listByProject(projectNo));

     return "/task/list.jsp";
  }
}
