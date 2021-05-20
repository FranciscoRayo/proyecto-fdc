package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Project;
import com.example.demo.service.ProjectServiceFront;

/**
 * Nombre Clase: ProjectControllerFront.java Descripcin: Clase que representa al
 * controlador del proyecto en frontoffice Fecha: 14/05/2021 Version: 1.0 Autor:
 * Jin Mun, Rocío Jiménez , Francisco Rayo
 **/

@Controller
public class ProjectControllerFront {

	@Autowired
	ProjectServiceFront projectServiceFront;

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	/**
	 * Método para listar todos los proyectos para el front
	 * 
	 * @param Model pf
	 */

	@GetMapping("/proyectos")
	public String listProjectFront(Model pf) {
		pf.addAttribute("projectListFront", projectServiceFront.listProjectFront());
		return "FrontProjectList";
	}

	/**
	 * Método para cargar la home en el front
	 * 
	 */

	@GetMapping("/")
	public String index() {
		return "index"; // esta es la pagina web a la que voy
	}

	/**
	 * Método para listar los detalles de un proyecto en el front
	 * 
	 * @param Integer id, Model pf
	 */

	@GetMapping("/proyectos/{id}")
	public String detailProject(@PathVariable Integer id, Model pf) {
		Project project = projectServiceFront.findById(id);
		pf.addAttribute(project);
		// pf.addAttribute(client);
		return "FrontProjectDetail";
	}
}
