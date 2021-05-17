/**
 * Clase: ProjectServiceImpl.java
 * Descripcion: Clase que implementa los servicios de la clase ProjectService con la interfaz ProjectDao
 * Fecha: 11/05/2021
 * Version: 1.0
 * @author Jin Mun  **/

package com.example.demo.service;

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

	// Para listar todos
	/**
	 * Método que relaciona la clase Project con la interfaz para poder encontrar
	 * todos los proyectos disponibles
	 * 
	 * @param
	 * @author Jin Mun
	 */

	public List<Project> findAll() {
		return projectDao.findAll();
	}

	
	public Project getOne(int id) {
		return projectDao.getOne(id);//devuelve un id
	}

	
	@Override
	public void save(Project project) {
		projectDao.save(project);
	}

}
