package com.eomcs.pms.service;

import java.util.HashMap;
import java.util.List;

import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultTaskService implements TaskService {
	
	TaskDao taskDao;
	SqlSessionFactoryProxy factoryProxy;
	
	public DefaultTaskService(TaskDao taskDao, SqlSessionFactoryProxy factoryProxy) {
		this.taskDao = taskDao;
		this.factoryProxy = factoryProxy;
	}
	
@Override
public List<Task> listByProject(int projectNo) throws Exception {
	HashMap<String,Object> map = new HashMap<>();
	map.put("projectNo", projectNo);
	return taskDao.findAll(map);
}
}
