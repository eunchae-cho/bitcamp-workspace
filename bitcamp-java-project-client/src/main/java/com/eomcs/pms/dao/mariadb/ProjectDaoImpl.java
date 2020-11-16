package com.eomcs.pms.dao.mariadb;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;

public class ProjectDaoImpl implements com.eomcs.pms.dao.ProjectDao {

	SqlSessionFactory sqlSessionFactory;

	public ProjectDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public int insert(Project project) throws Exception {

		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

			// 프로젝트 정보 입력
			int count = sqlSession.insert("ProjectDao.insert", project);
			sqlSession.insert("ProjectDao.insertMembers", project);
			return count;
		}
	}

	@Override
	public int delete(int no) throws Exception {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			// 프로젝트에 소속된 모든 멤버를 삭제한다.
			sqlSession.delete("ProjectDao.deleteMembers", no);

			// => 프로젝트를 삭제한다.
			return sqlSession.delete("ProjectDao.delete", no);
		}
	}

	@Override
	public Project findByNo(int no) throws Exception {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			return sqlSession.selectOne("ProjectDao.findByNo", no);
		}
	}

	@Override
	public List<Project> findAll() throws Exception {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			return sqlSession.selectList("ProjectDao.findAll");
		}
	}

	@Override
	public List<Project> findByKeyword(String item, String keyword) throws Exception {
		HashMap<String, Object> map = new HashMap<>();
		map.put("item", item);
		map.put("keyword", keyword);

		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			return sqlSession.selectList("ProjectDao.findByKeyword", map);
		}
	}

	@Override
	public int update(Project project) throws Exception {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			return sqlSession.update("ProjectDao.update", project);

		}
	}

}
