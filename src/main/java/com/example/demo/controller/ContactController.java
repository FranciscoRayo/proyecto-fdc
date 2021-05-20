package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Nombre Clase: ContactController.java Descripcin: Clase para lanzar el
 * formulario de contacto en la web Fecha: 20/05/2021 Version: 1.0 Autor: Pedro
 * Barrantes
 * 
 **/

@Controller
public class ContactController {
	/**
	 * Método para listar formulario de contacto en el front
	 * 
	 * @author Pedro Barrantes
	 */
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
}
