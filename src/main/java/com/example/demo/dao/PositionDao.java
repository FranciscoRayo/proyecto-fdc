
/**Nombre Clase: PositionDao.java
 * Descripcin: Clase que recoge la interfaz de la capa Dao de los cargos de los empleados
 * Fecha: 13/05/2021
 * Version: 1.0
 * Autor: Jin Mun  **/


package com.example.demo.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Position;

@Repository
public interface PositionDao extends JpaRepository <Position, Integer> {

	//List<Client> findAll();
}
	
	
