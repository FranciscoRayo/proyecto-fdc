package com.example.demo.controller;

import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Project;
import com.example.demo.service.ClientService;
import com.example.demo.service.ProjectService;

/*
 * Nombre Clase: ProjectController.java
 * Descripcin: Clase que representa al controlador del proyecto 
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

@Controller
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@Autowired
	ClientService clientService;

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	/**
	 * Metodo que lista los proyectos
	 * 
	 * @param Model m
	 */

	// listar proyectos
	@GetMapping("/backoffice/proyectos")
	public String listProject(Model m) {
		log.info("----- Inside listProject 1");
		m.addAttribute("projectList", projectService.findAll()); // ese projectList es el objeto , así guardo la
																	// información
		/*
		 * List<Project> l = projectService.findAll(); System.out.println(l.size());
		 * for(Project p:l){ System.out.println(p); }
		 */
		log.info("-------", projectService.findAll().toString());
		return "ProjectList"; // esta es la pagina web a la que voy
	}

	// Alta proyecto
	@GetMapping("backoffice/proyectos/new")
	public ModelAndView newProject() {
		ModelAndView model = new ModelAndView("ProjectForm");
		model.addObject("project", new Project());
		model.addObject("clients", clientService.findAll());
		return model;
	}

	// salvar proyecto
	@PostMapping("backoffice/proyectos/save")
	public ModelAndView saveProject(Project project) {
		log.info("----- Inside saveProject");
		log.info("----- objeto Project" + project);
		projectService.save(project);
		return new ModelAndView("redirect:/backoffice/proyectos/");
	}
}
