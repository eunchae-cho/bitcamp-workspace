package com.eomcs.pms.handler;

import java.util.Map;

import com.eomcs.pms.domain.Member;

public class WhoamiCommand implements Command {
	
	@Override
	public void execute(Map<String, Object> context) {
		
	
				Member loginUser = (Member) context.get("loginUser");
			   
				
				if (loginUser == null) {
					System.out.println("로그인을 하지 않았습니다.");
					return;
				} else {
					System.out.printf("번호? ", loginUser.getNo());
					System.out.printf("이름? ", loginUser.getName());
					System.out.printf("이메일? ", loginUser.getEmail());
					System.out.printf("암호? ", loginUser.getPassword());
					System.out.printf("사진? ", loginUser.getPhoto());
					System.out.printf("전화번호? ", loginUser.getTel());
					System.out.printf("등록일? ", loginUser.getRegisteredDate());
				}

	}
}
