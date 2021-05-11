package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	ProjectService service;

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	// listar usuarios
	@GetMapping("/")
	public String listarProyecto(Model m) {
		log.info("----- Inside listarProyecto");
		m.addAttribute("projectList", service.findAll()); // ese projectList es el objeto , así guardo la información
		log.info("-------", service.findAll());
		return "ProjectList"; // esta es la pagina web a la que voy
	}
}
