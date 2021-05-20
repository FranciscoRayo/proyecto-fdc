/**
 * Clase: Interfaz ProjectDao
 * Descripción: Clase donde se realiza la implementación de la interfaz ProjectDao con el repositorio Jpa
 * fecha:11/05/2021
 * version: 1.0
 * @author Jin Mun
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
