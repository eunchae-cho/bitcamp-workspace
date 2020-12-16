package com.eomcs.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eomcs.pms.service.MemberService;

@Controller
public class MemberListServlet {

	@Autowired MemberService memberService;
	
	@RequestMapping("/member/list")
	public ModelAndView execute() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", memberService.list());
		mv.setViewName("/member/list.jsp");
		return mv;
	}
}
