/**
 * Nombre Clase: clientServiceImpl.java
 * Descripcion: Implementación de interfaz para listar clientes dueños de proyectos.
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Pedro Barrantes Parejo  **/

package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClientDao;
import com.example.demo.model.Client;

@Service
public class clientServiceImpl implements ClientService {

	@Autowired
	ClientDao clientDao;

	public List<Client> findAll() {
		return clientDao.findAll();
	}

}
