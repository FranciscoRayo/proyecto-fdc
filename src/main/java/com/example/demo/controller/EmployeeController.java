package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.service.ClientService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PositionService;


/**Nombre Clase: EmployeeController.java
 * Descripcin: Clase que recoge los controladores de este proyecto
 * con respecto a los empleados
 * Fecha: 13/05/2021
 * Version: 1.0
 * Autor: Jin Mun / Francisco Rayo / Rocio Jimenez **/


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	PositionService positionService;

	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * Metodo que lista los empleados
	 * 
	 * @param Model n
	 */

	

	// listar empleados
	@GetMapping("/backoffice/equipo")
	public String listProject(Model n) {
		log.info("----- Inside TeamList ");
		n.addAttribute("TeamList", employeeService.findAll()); 
		
		
		log.info("-------", employeeService.findAll().toString());
		return "TeamList"; //aqui es donde voy
	}

	/**
	 * Metodo que da de alta a los empleados 
	 * 
	 * @param Model model1
	 */

	//Alta/Nuevo Empleado
	
		@GetMapping("backoffice/equipo/new")
		public ModelAndView newEmployee() {
			ModelAndView model1 = new ModelAndView("TeamForm");
			model1.addObject("employee", new Employee());
						
			model1.addObject("cargos", positionService.findAll());
			return model1;
		}
		
		/**
		 * Metodo guarda a los empleados (una vez han sido dados de alta) 
		 */
		
		
	//Salvar Empleado
		
		@PostMapping("backoffice/equipo/save")
		public ModelAndView saveEmployee(Employee employee) {
			log.info("----- Inside TeamForm");	
			log.info("----- objeto Employee"+employee);	
			employeeService.save(employee);
			return new ModelAndView("redirect:/backoffice/equipo/");
		}

}
