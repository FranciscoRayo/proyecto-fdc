package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.ProjectService;

/*
 * Nombre Clase: ProjectController.java
 * Descripcin: Clase que representa al controlador del proyecto 
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

@Controller
public class ProjectController {
	
	@Autowired
	ProjectService service;
	
	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);	
	
	/**
     * Metodo que lista los proyectos
     * 
     * @param Model m
     */
	
	//listar usuarios
	@GetMapping("/")
	public String listProject(Model m) {
		log.info("----- Inside listProject");
		m.addAttribute("projectList", service.findAll()); //ese projectList es el objeto , así guardo la información 
		log.info("-------",service.findAll());
		return "ProjectList"; //esta es la pagina web a la que voy 
	}

	
}
