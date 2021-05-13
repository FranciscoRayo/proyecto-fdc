package com.example.demo.dao;
/*
 * Clase: Interfaz EmployeeDao
 * Descripción: Clase donde se realiza la implementación de la interfaz EmployeeDao con el repositorio Jpa
 * fecha:12/05/2021
 * version: 1.0
 * Autor: Rocio Jimenez Moreno  **/
 
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	//List<Employee> findAll();

}
