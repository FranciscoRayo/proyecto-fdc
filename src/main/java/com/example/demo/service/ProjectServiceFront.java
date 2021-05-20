package com.example.demo.service;

/**
* Nombre: ProjectServiceFront.java
* Descripción: interfaz ProjectServiceFront con métodos para listar los proyectos y encontrar por ID.
* Fecha: 13/05/2021
* Versión: 1.0
* @author Francisco Rayo 
**/

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectServiceFront {

	public List<Project> listProjectFront();

	public Project findById(Integer id);

}
