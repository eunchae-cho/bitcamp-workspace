package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberDetailServlet {

	MemberService memberService;

	public MemberDetailServlet(MemberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping("/member/detail")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

       response.setContentType("text/html;charset=UTF-8");
      int no = Integer.parseInt(request.getParameter("no"));
      Member member = memberService.get(no);
      request.setAttribute("member", member);
      return "/member/detail.jsp";


  }
}
