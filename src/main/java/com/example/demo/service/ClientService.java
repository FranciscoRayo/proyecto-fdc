/**
 * Nombre Clase: ClientService.java
 * Descripcion: Interfaz para listar clientes dueños de proyectos.
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Pedro Barrantes Parejo  **/

package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Client;

public interface ClientService {

	// Listar todos los clientes
	public List<Client> findAll();

	// Recuperar un cliente (no sabemos si lo vamos a necesitar)
	// public Client getOne(int idClient);

}
