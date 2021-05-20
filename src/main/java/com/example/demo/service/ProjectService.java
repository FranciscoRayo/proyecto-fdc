package com.example.demo.service;

/**
 * Nombre Clase: ProjectService.java
 * Descripcion: Clase que representa a los métodos que se pueden realizar con los proyectos de la empresa e incluye: listado,
 * eliminar, etc. 
 * Fecha: 11/05/2021 -- 19/05/21
 * Version: 1.0
 * Autor: Jin Mun  **/

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectService {

	public void altaProyecto(Project project);

	public List<Project> findAll();

	public Project getOne(int id);

	public void save(Project project);

	public void deleteById(int id);

}
