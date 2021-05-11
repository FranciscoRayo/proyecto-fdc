package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.ProjectDao;
import com.example.model.Project;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectDao projectDAO;
	
	//Para Listar Todos
	public List<Project> findAll(){
		return projectDAO.findAll();
	}

}
