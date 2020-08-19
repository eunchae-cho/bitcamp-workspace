package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberHandler {

  MemberList memberList = new MemberList();

  public void add() {
    System.out.println("[회원 등록]");

    Member member = new Member();
    member.no = Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email = Prompt.inputString("이메일? ");
    member.password = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registeredDate = new java.sql.Date(System.currentTimeMillis());

    memberList.add(member);
  }

  public void list() {
    System.out.println("[회원 목록]");

    Member[] members = memberList.toArray();

    for (Member member : members) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          member.no,
          member.name,
          member.email,
          member.tel,
          member.registeredDate);
    }
  }

  public Member findByName(String name) {
    Member[] members = memberList.toArray();

    for (Member member : members) {
      if (member.name.equals(name)) {
        return member;
      }
    }
    return null;
  }
}
