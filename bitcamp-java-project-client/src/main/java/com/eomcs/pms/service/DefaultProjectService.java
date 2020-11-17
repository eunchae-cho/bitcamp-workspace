package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;

import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultProjectService implements ProjectService {
	ProjectDao projectDao;
	TaskDao taskDao;
	SqlSessionFactoryProxy factoryProxy;

	public DefaultProjectService(ProjectDao projectDao, TaskDao taskDao, SqlSessionFactoryProxy factoryProxy) {
		this.projectDao = projectDao;
		this.taskDao = taskDao;
		this.factoryProxy = factoryProxy;
	}

	@Override
	public int add(Project project) throws Exception {
		try {
			factoryProxy.startTransaction();
			projectDao.insert(project);
			projectDao.insertMembers(project);
			factoryProxy.commit();
			return 1;
			
		} catch (Exception e) {
			factoryProxy.rollback();
			throw e;

		} finally {
			factoryProxy.endTransaction();
		}
	}

	@Override
	public int delete(int no) throws Exception {
		try {
			factoryProxy.startTransaction();
			taskDao.deleteByProjectNo(no);
			projectDao.deleteMembers(no);
			int count = projectDao.delete(no);
			factoryProxy.commit();
			return count;

		} catch (Exception e) {
			factoryProxy.rollback();
			throw e;

		} finally {
			factoryProxy.endTransaction();
		}
	}
	
	@Override
	public int update(Project project) throws Exception {
		return projectDao.update(project);
	}
	
	@Override
	public List<Project> list(String keyword) throws Exception {
		return projectDao.findAll(keyword);
	}
	
	@Override
	public List<Project> list(Map<String, Object> keywords) throws Exception { 
		return projectDao.findByDetailKeyword(keywords);
	}
	
	@Override
	public Project get(int no) throws Exception {
		return projectDao.findByNo(no);
	}
}
