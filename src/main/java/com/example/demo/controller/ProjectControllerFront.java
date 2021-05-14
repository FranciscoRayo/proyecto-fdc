package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.ProjectServiceFront;

/**
 * Nombre Clase: ProjectControllerFront.java Descripcin: Clase que representa al
 * controlador del proyecto en frontoffice Fecha: 14/05/2021 Version: 1.0 Autor:
 * Jin Mun
 **/

@Controller
public class ProjectControllerFront {

	@Autowired
	ProjectServiceFront projectServiceFront;

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	// Prueba 1
	// listar proyectos
	// @GetMapping("/backoffice/proyectos")
	/*
	 * public String listProjectFront(Model pf) {
	 * log.info("----- Inside listProjectFront ");
	 * pf.addAttribute("projectListFront", projectServiceFront.findAll());
	 */

//	log.info("-------", projectServiceFront.findAll().toString());
	// return "ProjectList"; // esta es la pagina web a la que voy
	// }

}
