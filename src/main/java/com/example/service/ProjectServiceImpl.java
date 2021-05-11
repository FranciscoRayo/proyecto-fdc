/**
 * Clase: ProjectServiceImpl.java
 * Descripcion: Clase que implementa los servicios de la clase ProjectService con la interfaz ProjectDao
 * Fecha: 11/05/2021
 * Version: 1.0
 * @author Jin Mun  **/

package com.example.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProjectDao;
import com.example.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao projectDao;

	// Para listar todos
	/**
	 * Método que relaciona la clase Project con la interfaz para poder encontrar
	 * todos los proyectos disponibles
	 * @param 
	 * @author Jin Mun
	 */

	public List<Project> findAll() {
		return projectDao.findAll();

	}

}
