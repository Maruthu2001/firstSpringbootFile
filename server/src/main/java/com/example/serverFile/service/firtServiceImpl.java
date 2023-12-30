package com.example.serverFile.service;

import java.util.Map;

import com.example.serverFile.applicationBean.ApplicationBean;
import com.example.serverFile.dao.firstDao;
import com.example.serverFile.dao.firstDaoImpl;

public class firtServiceImpl implements first {

	private static ApplicationBean appBean = new ApplicationBean();

	private static firstDao firstDDo;
	
	public firtServiceImpl() {
//		appBean.initializeBean();
		firstDDo = new firstDaoImpl();
	}

	public Map<String,Object> formName() {		
		appBean.setDemo("dinesh");
		String name = appBean.getDemo();
		return firstDDo.getData("Persons");
//		return name;
	}
}
