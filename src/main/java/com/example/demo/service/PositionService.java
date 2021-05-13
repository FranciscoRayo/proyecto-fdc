/**Nombre Clase: PositionService.java
	 * Descripcin: Clase de interfaz que recoge las funciones que se pueden 
	 * realizar con los cargos de los empleados 
	 * Fecha: 13/05/2021
	 * Version: 1.0
	 * Autor: Jin Mun  **/


package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Position;

public interface PositionService {
	
	
	// Listar todos los cargos
		public List<Position> findAll();


}
