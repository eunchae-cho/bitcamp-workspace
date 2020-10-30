package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberDetailCommand implements Command {

  List<Member> memberList;

  public MemberDetailCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[회원 상세보기]");
    
    try {
    int no = Prompt.inputInt("번호? ", out, in);
    Member member = findByNo(no);

    if (member == null) {
      out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    out.printf("이름: %s\n", out, in, member.getName());
    out.printf("이메일: %s\n",out, in, member.getEmail());
    out.printf("사진: %s\n", out, in, member.getPhoto());
    out.printf("전화: %s\n", out, in, member.getTel());
    out.printf("등록일: %s\n", out, in, member.getRegisteredDate());
    } catch (Exception e) {
		out.printf("작업처리 중 오류 발생 - %s \n", e.getMessage());
	}
  }

  private Member findByNo(int no) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      if (member.getNo() == no) {
        return member;
      }
    }
    return null;
  }
}
