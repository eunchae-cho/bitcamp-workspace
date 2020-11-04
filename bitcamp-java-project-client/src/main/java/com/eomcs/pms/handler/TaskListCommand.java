package com.eomcs.pms.handler;

import java.sql.ResultSet;

import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.dao.TaskDao;

public class TaskListCommand implements Command {
	
	TaskDao taskDao;
	MemberDao memberDao;
	
	public TaskListCommand(TaskDao taskDao, MemberDao memberDao) {
		this.taskDao = taskDao;
		this.memberDao = memberDao;
	}

  @Override
  public void execute() {
    System.out.println("[작업 목록]");

    

      try (ResultSet rs = stmt.executeQuery()) {
        System.out.println("번호, 작업내용, 마감일, 작업자, 상태");

        while (rs.next()) {
          String stateLabel = null;
          switch (rs.getInt("status")) {
            case 1:
              stateLabel = "진행중";
              break;
            case 2:
              stateLabel = "완료";
              break;
            default:
              stateLabel = "신규";
          }
          System.out.printf("%d, %s, %s, %s, %s\n",
              rs.getInt("no"),
              rs.getString("content"),
              rs.getDate("deadline"),
              rs.getString("owner_name"),
              stateLabel);
        }
      
    } catch (Exception e) {
      System.out.println("작업 목록 조회 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
