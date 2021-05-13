/**Nombre Clase: PositionServiceImpl.java
	 * Descripcion: Clase que implementa la clase PositionService y que recoge las funciones que se pueden 
	 * realizar con los cargos 
	 * Fecha: 13/05/2021
	 * Version: 1.0
	 * Autor: Jin Mun  **/

package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.PositionDao;
import com.example.demo.model.Position;

@Service
public class PositionServiceImpl implements PositionService{
	
	@Autowired
	PositionDao positionDao;

	public List<Position> findAll() {
		return positionDao.findAll();
	}

}
