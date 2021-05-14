/**
* Nombre: ProjectServiceFrontImpl.java
* Descripción: interfaz ProjectServiceFrontImpl
* Fecha: 13/05/2021
* Versión: 1.0
* @author Francisco Rayo */

package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectServiceFront {

	/**
	 * Método para listar todos los proyectos para el front. Se desarrolla en la
	 * implementación.
	 * 
	 * @author Francisco Rayo
	 */

	public List<Project> listProjectFront();

}
