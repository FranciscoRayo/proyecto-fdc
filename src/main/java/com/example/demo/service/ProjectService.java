/**
 *  Nombre Clase: ProjectService.java
 * Descripcion: Clase que representa a los servicios que se pueden realizar con los proyectos de la empresa e incluye: listado,
 * eliminar, etc. 
 * Fecha: 11/05/2021 -- 19/05/21
 * Version: 1.0
 * Autor: Jin Mun  **/

package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectService {

	public void altaProyecto(Project project);

	// Listar proyectos
	public List<Project> findAll();

	// Para recuperar proyectos
	public Project getOne(int id);

	// Salvar proyecto
	public void save(Project project);

	// Eliminar proyectos

	public void deleteById(int id);

}
