package com.example.demo.model;
/*
 * Nombre Clase: Employee.java
 * Descripcion: Clase que representa a los trabajadores o miembros de la empresa e incluye:
 * 			   el id, nombre, apellidos, resumen, foto, cargo
 * Fecha: 12/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipo")
public class Employee {

	// ----------------------
	// Atributos
	// ----------------------

	/**
	 * Identificador de la persona
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersona")
	private int idPers;
	/**
	 * Nombre de la persona
	 */
	@Column(name = "nombre")
	private String nombrePers;
	/**
	 * Apellidos de la persona
	 */
	private String apellidos;
	/**
	 * Resumen de la persona
	 */
	@Column(name = "resumen")
	private String resumenPers;
	/**
	 * Foto de la persona
	 */
	private String foto;
	/**
	 * Identificativo del cargo de la persona
	 */

	@ManyToOne
	@JoinColumn(name = "cargo")
	private Position cargo;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor por defecto
	 */
	public Employee() {
		super();
	}

	/**
	 * Constructor con 6 parametros
	 * 
	 * @param idPers      identificador del empleado
	 * @param nombrePers  nombre del empleado
	 * @param apellidos   apellidos del empleado
	 * @param resumenPers resumen del empleado
	 * @param foto        imagen del empleado
	 * @param cargo       identificador del cargo de la empresa
	 */
	public Employee(int idPers, String nombrePers, String apellidos, String resumenPers, String foto, Position cargo) {
		super();
		this.idPers = idPers;
		this.nombrePers = nombrePers;
		this.apellidos = apellidos;
		this.resumenPers = resumenPers;
		this.foto = foto;
		this.cargo = cargo;
	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve el identificador del empleado
	 * 
	 * @return id del empleado
	 */
	public int getIdPers() {
		return idPers;
	}

	/**
	 * Metodo que modifica el identificador del empleado
	 * 
	 * @param idPers
	 */
	public void setIdPers(int idPers) {
		this.idPers = idPers;
	}

	/**
	 * Metodo que devuelve el nombre del empleado
	 * 
	 * @return nombre del empleado
	 */
	public String getNombrePers() {
		return nombrePers;
	}

	/**
	 * Metodo que modifica el nombre del empleado
	 * 
	 * @param nombrePers
	 */
	public void setNombrePers(String nombrePers) {
		this.nombrePers = nombrePers;
	}

	/**
	 * Metodo que devuelve el apellido del empleado
	 * 
	 * @return apellido del empleado
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo que modifica el apellido del empleado
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo que devuelve el resumen del empleado
	 * 
	 * @return resumen del empleado
	 */
	public String getResumenPers() {
		return resumenPers;
	}

	/**
	 * Metodo que modifica el resumen del empleado
	 * 
	 * @param resumenPers
	 */
	public void setResumenPers(String resumenPers) {
		this.resumenPers = resumenPers;
	}

	/**
	 * Metodo que devuelve la foto del empleado
	 * 
	 * @return foto del empleado
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * Metodo que modifica la foto del empleado
	 * 
	 * @param foto
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * Metodo que devuelve el cargo del empleado
	 * 
	 * @return cargo del empleado
	 */
	public Position getCargo() {
		return cargo;
	}

	/**
	 * Metodo que modifica el identificador del empleado
	 * 
	 * @param cargo
	 */
	public void setCargo(Position cargo) {
		this.cargo = cargo;
	}

	// ---------------------------
	// Metodo toString()
	// ---------------------------

	/**
	 * Metodo mediante el cual sacamos por pantalla una especie de informe de los
	 * empleados
	 */
	@Override
	public String toString() {
		return "Employee [idPers=" + idPers + ", nombrePers=" + nombrePers + ", apellidos=" + apellidos
				+ ", resumenPers=" + resumenPers + ", foto=" + foto + ", cargo=" + cargo + "]";
	}

}
