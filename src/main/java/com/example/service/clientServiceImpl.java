/**
 * Nombre Clase: clientServiceImpl.java
 * Descripcion: Implementación de interfaz para listar clientes dueños de proyectos.
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Pedro Barrantes Parejo  **/

package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clientServiceImpl {

	@Autowired
	ClientDao clientDao;

	public List<Client> findAll() {
		return clientDao.findAll();
	}

}
