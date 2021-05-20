package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

