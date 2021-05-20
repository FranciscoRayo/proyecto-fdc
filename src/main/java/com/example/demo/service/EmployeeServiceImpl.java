package com.example.demo.service;

/**
 * Nombre Clase: EmployeeServiceImpl.java Descripcin: Clase que implementa las
 * funciones que se pueden realizar con los empleados (clase Employee Service) y
 * lo relaciona con la capa Dao y sus métodos Fecha: 13/05/2021 Version: 1.0
 * Autor: Jin Mun / Pedro Barrantes
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.EmployeeDao;
import java.util.List;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	// Para listar empleados

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getOne(int id) {
		return employeeDao.getOne(id);// devuelve un id
	}
	// Para eliminar empleados

	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);
	}

	// Para añadir empleado
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);

	}

}
