package com.example.demo.service;

/**
* Nombre: ProjectServiceFrontImpl.java
* Descripción: implementación de la interfaz ProjectServiceFront con métodos para Rest Template y encontrar por ID.
* Fecha: 13/05/2021
* Versión: 1.0
* @author Francisco Rayo, Rocio Jiménez 
**/

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.Project;

@Service
public class ProjectServiceFrontImpl implements ProjectServiceFront {

	// RestTemplate
	public List<Project> listProjectFront() {
		RestTemplate restTemplate = new RestTemplate();
		Project[] projects = restTemplate.getForObject("http://localhost:5000/backoffice/proyectos/", Project[].class);
		List<Project> listProject = Arrays.asList(projects);
		return listProject;
	}

	@Override
	public Project findById(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		Project project = restTemplate.getForObject("http://localhost:5000/backoffice/proyectos/" + id, Project.class);
		return project;
	}

}
