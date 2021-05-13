/**
* Nombre: ProjectServiceFrontImpl.java
* Descripción: implementación de la interfaz ProjectServiceFrontImpl
* Fecha: 13/05/2021
* Versión: 1.0
* @author Francisco Rayo */

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProjectDao;
import com.example.demo.model.Project;

@Service
public class ProjectServiceFrontImpl implements ProjectServiceFront {

	@Autowired
	ProjectDao projectDao;

	/**
	 * Método para listar todos los proyectos para el front.
	 * 
	 * @author Francisco Rayo
	 */
	@Override
	public List<Project> findAll() {
		return projectDao.findAll();
	}

}
