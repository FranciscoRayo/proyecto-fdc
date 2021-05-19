
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Nombre Clase: JobsController.java Descripcin: Clase que representa al
 * controlador de las ofertas de empleo en frontoffice Fecha: 19/05/2021
 * Version: 1.0 Autor: Francisco Rayo
 **/

@Controller
public class JobsController {
	/**
	 * Método para listar las ofertas de empleo en el front
	 * 
	 * @author Francisco Rayo
	 */
	@GetMapping("/ofertas-de-trabajo")
	public String jobs() {
		return "Jobs";
	}

}
