package com.example.demo.controller;

import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Project;
import com.example.demo.service.ClientService;
import com.example.demo.service.ProjectService;

/**
 * Nombre Clase: ProjectController.java
 * Descripcin: Clase que representa al controlador de los proyectos realizados por el equipo 
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

	@GetMapping("/backoffice/proyectos")
	public String listProject(Model m) {
		log.info("----- Inside listProject 1");
		m.addAttribute("projectList", projectService.findAll());
		log.info("-------", projectService.findAll().toString());
		return "ProjectList";
	}

	/**
	 * Metodo que da de alta proyectos
	 * 
	 */

	@GetMapping("backoffice/proyectos/new")
	public ModelAndView newProject() {
		ModelAndView model = new ModelAndView("ProjectForm");
		model.addObject("project", new Project());
		model.addObject("clients", clientService.findAll());
		return model;
	}

	/**
	 * Metodo que edita los proyectos
	 * 
	 * @param int id, Model m
	 * 
	 */

	@GetMapping("backoffice/proyectos/edit")
	public String editProject(@RequestParam("id") int id, Model m) {
		log.info("----- Inside editProject");
		m.addAttribute("project", projectService.getOne(id));
		m.addAttribute("clients", clientService.findAll());
		return "ProjectForm";
	}

	/**
	 * Metodo que salva los proyectos
	 * 
	 * @param Project project
	 * 
	 */

	@PostMapping("backoffice/proyectos/save")
	public ModelAndView saveProject(Project project) {
		log.info("----- Inside saveProject");
		log.info("----- objeto Project" + project);
		projectService.save(project);
		return new ModelAndView("redirect:/backoffice/proyectos/");
	}

	/**
	 * Metodo que elimina los proyectos
	 * 
	 * @author Jin Mun
	 * 
	 * @param int "id"
	 */

	@GetMapping("backoffice/proyectos/delete")

	public ModelAndView deleteProject(@RequestParam("id") int id) {
		log.info("----- Inside deleteProject");
		projectService.deleteById(id);
		return new ModelAndView("redirect:/backoffice/proyectos");
	}

}
