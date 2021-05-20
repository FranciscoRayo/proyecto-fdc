package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Client;

/**
 * Nombre Interfaz: ClientDao.java Descripcion: Clase para lanzar consultas a la
 * BBDD Fecha: 13/05/2021 Version: 1.0 Autor: Pedro Barrantes
 * 
 **/

@Repository
public interface ClientDao extends JpaRepository<Client, Integer> {

}