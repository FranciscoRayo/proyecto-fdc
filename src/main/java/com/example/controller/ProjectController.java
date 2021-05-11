package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Project;
import com.example.service.ProjectService;

@Controller
public class ProjectController {

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

}
