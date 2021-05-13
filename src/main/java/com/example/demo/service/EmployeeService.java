/**Nombre Clase: EmployeeService.java
	 * Descripcin: Clase de interfaz que recoge las funciones que se pueden 
	 * realizar con los empleados 
	 * Fecha: 13/05/2021
	 * Version: 1.0
	 * Autor: Jin Mun  **/

package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

	// Para listar todos los empleados
	public List<Employee> findAll();

	// Para update y añadir empleado
	public void save(Employee employee);

}
