package com.eomcs.pms.service;

import java.util.List;

import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultMemberService implements MemberService {
	
	MemberDao memberDao;
	SqlSessionFactoryProxy factoryProxy;
	
	public DefaultMemberService(MemberDao memberDao, SqlSessionFactoryProxy factoryProxy) {
		this.memberDao = memberDao;
		this.factoryProxy = factoryProxy;
	}
	
	@Override
	public List<Member> list(String name) throws Exception {
		return memberDao.findByName(name);

	}

}
