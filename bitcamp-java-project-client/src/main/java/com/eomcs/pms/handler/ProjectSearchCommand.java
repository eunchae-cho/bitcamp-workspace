package com.eomcs.pms.handler;

import java.util.List;
import java.util.Map;

import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectSearchCommand implements Command {

  ProjectDao projectDao;

  public ProjectSearchCommand(ProjectDao projectDao) {
    this.projectDao = projectDao;

  }

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[프로젝트 검색]");

    try {
         	
    	System.out.println("1: 프로젝트 이름 , 2: 관리자 이름, 3: 회원 이름");
    	String item = Prompt.inputString("검색할 번호? ");
    	String keyword = Prompt.inputString("검색어? ");
    	
    	 List<Project> list = projectDao.findByKeyword(item, keyword);
    	 System.out.println("번호, 프로젝트명, 시작일 ~ 종료일, 관리자, 팀원");

         for (Project project : list) {
           StringBuilder members = new StringBuilder();
           if (project.getMembers() != null) {
           for (Member member : project.getMembers()) {
             if (members.length() > 0) {
               members.append(",");
             }
             members.append(member.getName());
           }
           }

           System.out.printf("%d, %s, %s ~ %s, %s, [%s]\n",
               project.getNo(),
               project.getTitle(),
               project.getStartDate(),
               project.getEndDate(),
               project.getOwner().getName(),
               members.toString());
         }
    } catch (Exception e) {
      System.out.println("프로젝트 검색 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
