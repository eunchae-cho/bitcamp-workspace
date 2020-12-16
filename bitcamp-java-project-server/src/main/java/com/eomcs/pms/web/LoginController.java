package com.eomcs.pms.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class LoginController {
 
	@Autowired MemberService memberService;
	
	
	@RequestMapping("/auth/login")
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");

		System.out.println("LoginServlet 실행!");
		  String email = "";
		  Cookie[] cookies = request.getCookies();
		    if (cookies != null) {
		      for (Cookie cookie : cookies) {
		        if (cookie.getName().equals("email")) {
		          email = cookie.getValue();
		          break;
		        }
		      }
		    } else {
		    	request.setAttribute("email", email);
		    	return "/auth/form.jsp";
		    }

		    HttpSession session = request.getSession();
		    
		      String password = request.getParameter("password");
		      Cookie emailCookie = new Cookie("email", email);
		      
		      if (request.getParameter("saveEmail") != null) {
		          emailCookie.setMaxAge(60 * 60 * 24 * 7);
		        } else {
		          emailCookie.setMaxAge(0); // 유효기간이 0이면 삭제하라는 의미다.
		        }
		      response.addCookie(emailCookie);
		      
		      Member member = memberService.get(email, password);
		      if (member == null) {
		        return "/auth/loginError.jsp";
		      } else {
		        session.setAttribute("loginUser", member);
		        return "redirect:../../index.html";
		      
	}

  }
}