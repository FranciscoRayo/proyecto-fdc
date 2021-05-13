package com.example.demo.model;
/*
 * Nombre Clase: Position.java
 * Descripcion: Clase que representa a los cargos de los trabajadores o miembros de la empresa e incluye:
 * 			   el id, cargo
 * Fecha: 12/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
public class Position {
	// ----------------------
	// Atributos
	// ----------------------

	/**
	 * Identificador del cargo
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcargo")
	private int idCargo;
	/**
	 * Cargo que ocupa la persona en la empresa
	 */
	private String cargo;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor por defecto
	 */
	public Position() {
		super();
	}

	/**
	 * Constructor con 2 parametros
	 * 
	 * @param idCargo identificador del cargo
	 * @param cargo   cargo del empleado
	 */
	public Position(int idCargo, String cargo) {
		super();
		this.idCargo = idCargo;
		this.cargo = cargo;
	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve el identificador del cargo
	 * 
	 * @return id del cargo
	 */
	public int getIdCargo() {
		return idCargo;
	}

	/**
	 * Metodo que modifica el identificador del cargo
	 * 
	 * @param idCargo
	 */
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	/**
	 * Metodo que devuelve el cargo del empleado
	 * 
	 * @return cargo del empleado
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * Metodo que modifica el cargo del empleado
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// ---------------------------
	// Metodo toString()
	// ---------------------------

	/**
	 * Metodo mediante el cual sacamos por pantalla una especie de informe de los
	 * cargos de los empleados
	 */
	@Override
	public String toString() {
		return "Position [idCargo=" + idCargo + ", cargo=" + cargo + "]";
	}

}
