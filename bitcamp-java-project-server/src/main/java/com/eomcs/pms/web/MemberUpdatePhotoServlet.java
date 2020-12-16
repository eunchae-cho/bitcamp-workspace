package com.eomcs.pms.web;

import java.util.UUID;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

import net.coobird.thumbnailator.ThumbnailParameter;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import net.coobird.thumbnailator.name.Rename;

@Controller
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
public class MemberUpdatePhotoServlet {
	
	@Autowired MemberService memberService;
	
	
	@RequestMapping("/member/updatePhoto")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    Member member = new Member();
    member.setNo(Integer.parseInt(request.getParameter("no")));

    // 회원 사진 파일 저장
    Part photoFile = request.getPart("photo");
    if (photoFile.getSize() > 0) {
      String filename = UUID.randomUUID().toString();
      String saveFilePath =  request.getServletContext().getRealPath("/upload/" + filename);
      photoFile.write(saveFilePath);
      member.setPhoto(filename);

      generatePhotoThumbnail(saveFilePath);
    }

      if (member.getPhoto() == null) {
        throw new Exception("사진을 선택하지 않았습니다.");
      }
      memberService.update(member);
      return "redirect:detail?no=" + member.getNo();

  }

  private void generatePhotoThumbnail(String saveFilePath) {
    try {
      Thumbnails.of(saveFilePath)
      .size(30, 30)
      .outputFormat("jpg")
      .crop(Positions.CENTER)
      .toFiles(new Rename() {
        @Override
        public String apply(String name, ThumbnailParameter param) {
          return name + "_30x30";
        }
      });

      Thumbnails.of(saveFilePath)
      .size(120, 120)
      .outputFormat("jpg")
      .crop(Positions.CENTER)
      .toFiles(new Rename() {
        @Override
        public String apply(String name, ThumbnailParameter param) {
          return name + "_120x120";
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
