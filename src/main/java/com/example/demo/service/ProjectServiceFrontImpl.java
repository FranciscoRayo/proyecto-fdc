/**
* Nombre: ProjectServiceFrontImpl.java
* Descripción: implementación de la interfaz ProjectServiceFrontImpl
* Fecha: 13/05/2021
* Versión: 1.0
* @author Francisco Rayo, Rocio Jiménez  */

package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.Project;

@Service
public class ProjectServiceFrontImpl implements ProjectServiceFront {

	/**
	 * Método para listar todos los proyectos para el front.
	 * 
	 * @author Francisco Rayo, Rocio Jiménez 
	 */
	// RestTemplate
	public List<Project> listProjectFront() {
		RestTemplate restTemplate = new RestTemplate();
		Project[] projects = restTemplate.getForObject("http://localhost:5000/backoffice/proyectos/", Project[].class);
		List<Project> listProject = Arrays.asList(projects);
		return listProject;
	}

}
