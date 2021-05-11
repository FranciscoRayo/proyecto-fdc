package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Nombre Clase: Client.java
 * Descripcion: Clase que representa a los clientes con los que ha trabajado la empresa e incluye:
 * 			   el id, nombre, fechafin, resumen, descrpcion, imagen, empresa
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

@Entity
@Table(name = "clientes")
public class Client {

	// ----------------------
	// Atributos
	// ----------------------

	/**
	 * Identificador del cliente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	private int idCli;
	/**
	 * Nombre del cliente
	 */
	private String nombre;
	/**
	 * Descripcion del cliente
	 */
	@Column(name = "descripcion")
	private String descripCli;
	/**
	 * Logo del cliente
	 */
	private String logo;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor por defecto
	 */
	public Client() {
		super();
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * @param idCli      identificador del client
	 * @param nombre     nombre del cliente
	 * @param descripCli descripción del cliente
	 * @param logo       imagen o captura del cliente
	 */
	public Client(int idCli, String nombre, String descripCli, String logo) {
		super();
		this.idCli = idCli;
		this.nombre = nombre;
		this.descripCli = descripCli;
		this.logo = logo;
	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve el identificador del cliente
	 * 
	 * @return id del cliente
	 */
	public int getIdCli() {
		return idCli;
	}

	/**
	 * Metodo que modifica el identificador del cliente
	 * 
	 * @param idCli
	 */
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	/**
	 * Metodo que devuelve el nombre del cliente
	 * 
	 * @return nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que modifica el nombre del cliente
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve la descripción del cliente
	 * 
	 * @return descripcion del cliente
	 */
	public String getDescripCli() {
		return descripCli;
	}

	/**
	 * Metodo que modifica la descripción del cliente
	 * 
	 * @param descripCli
	 */
	public void setDescripCli(String descripCli) {
		this.descripCli = descripCli;
	}

	/**
	 * Metodo que devuelve el logo del cliente
	 * 
	 * @return logo del cliente
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * Metodo que modifica el logo del cliente
	 * 
	 * @param logo
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	// ---------------------------
	// Metodo toString()
	// ---------------------------

	/**
	 * Metodo mediante el cual sacamos por pantalla una especie de informe de los
	 * clientes
	 */
	@Override
	public String toString() {
		return "Client [idCli=" + idCli + ", nombre=" + nombre + ", descripCli=" + descripCli + ", logo=" + logo + "]";
	}
}
