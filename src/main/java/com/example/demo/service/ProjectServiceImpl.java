package com.example.demo.service;

/**
 * Clase: ProjectServiceImpl.java
 * Descripcion: Clase que implementa los métodos de la clase ProjectService con la interfaz ProjectDao
 * Fecha: 11/05/2021
 * Version: 1.0
 * @author Jin Mun  **/
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProjectDao;
import com.example.demo.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao projectDao;

	@Override
	public void altaProyecto(Project project) {
		projectDao.save(project);
	}

	public List<Project> findAll() {
		return projectDao.findAll();
	}

	public Project getOne(int id) {
		return projectDao.getOne(id);
	}

	@Override
	public void save(Project project) {
		projectDao.save(project);
	}

	@Override
	public void deleteById(int id) {
		projectDao.deleteById(id);

	}
}
