package com.example.demo.service;

/**
 * Nombre Interfaz: FakeEmployeeService.java Descripcin: Cabeceras de funciones para listar empleados falsos
 * Fecha: 13/05/2021 Version: 1.0
 * Autor: Jin Mun / Pedro Barrantes
 **/

import java.util.List;

import com.example.demo.model.FakeEmployee;

public interface FakeEmployeeService {
	public List<FakeEmployee> findAll(int x);
}
