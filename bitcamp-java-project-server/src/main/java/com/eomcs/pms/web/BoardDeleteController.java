package com.eomcs.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.service.BoardService;

@Controller
public class BoardDeleteController {

	@Autowired BoardService boardService;
	

  @RequestMapping("/board/delete")
  public String execute(int no) throws Exception {
        
      if (boardService.delete(no) == 0) {
        throw new Exception("해당 번호의 게시글이 없습니다.");
      }
      return "redirect:list";
      
  }
}
