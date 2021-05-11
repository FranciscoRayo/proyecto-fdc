package com.example.controller;

import org.springframework.web.servlet.ModelAndView;
import com.example.model.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.ProjectService;

@Controller
public class ProjectController {

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);
	@Autowired
	ProjectService projectService;

	@Autowired
	// ClientService clientService;

	// Alta proyecto
	@GetMapping("/new")
	public ModelAndView newProject() {
		ModelAndView model = new ModelAndView("ProjectForm");
		model.addObject("project", new Project());
		model.addObject("clients", clientService.findAll());
		return model;
	}

	// listar proyecto
	@GetMapping("/")
	public String listarProyecto(Model m) {
		log.info("----- Inside listarProyecto");
		m.addAttribute("projectList", projectService.findAll()); // ese projectList es el objeto , así guardo la
																	// información
		log.info("-------", projectService.findAll());
		return "ProjectList"; // esta es la pagina web a la que voy
	}
}
