/*
 * Nombre Clase: Project.java
 * Descripcion: Clase que representa a los proyectos en los que ha trabajado la empresa e incluye:
 * 	el id, proyecto, fechafin, resumen, descrpcion, imagen, empresa
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Nombre Clase: Project.java
 * Descripcion: Clase que representa a los proyectos en los que ha trabajado la empresa e incluye:
 * 			   el id, proyecto, fechafin, resumen, descrpcion, imagen, empresa
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

@Entity
@Table(name = "proyectos")
public class Project {

	// ----------------------
	// Atributos
	// ----------------------

	/**
	 * Identificador del proyecto
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproyecto")
	private int id;
	/**
	 * Nombre del proyecto
	 */
	private String proyecto;
	/**
	 * Fecha de finalización del proyecto
	 */
	private String fechafin;
	/**
	 * Resumen del proyecto
	 */
	private String resumen;
	/**
	 * Descripción del proyecto
	 */
	private String descripcion;
	/**
	 * Imagen o captura del proyecto
	 */
	private String imagen;
	/**
	 * Identificativo de la empresa
	 */
	private int empresa;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor por defecto
	 */
	public Project() {
		super();
	}

	/**
	 * Constructor con 7 parametros
	 * 
	 * @param id          identificador del proyecto
	 * @param proyecto    nombre del proyecto
	 * @param fechafin    fecha finalización del proyecto
	 * @param resumen     resumen del proyecto
	 * @param descripción descripción detallada del proyecto
	 * @param imagen      imagen o captura del proyecto
	 * @param empresa     identificador de la empresa
	 */
	public Project(int id, String proyecto, String fechafin, String resumen, String descripcion, String imagen,
			int empresa) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.fechafin = fechafin;
		this.resumen = resumen;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.empresa = empresa;
	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve el identificador del proyecto
	 * 
	 * @return id del proyecto
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo que modifica el identificador del proyecto
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo que devuelve el nombre del proyecto
	 * 
	 * @return nombre del proyecto
	 */
	public String getProyecto() {
		return proyecto;
	}

	/**
	 * Metodo que modifica el nombre del proyecto
	 * 
	 * @param proyecto
	 */
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	/**
	 * Metodo que devuelve la fecha de finalización del proyecto
	 * 
	 * @return fecha fin del proyecto
	 */
	public String getFechafin() {
		return fechafin;
	}

	/**
	 * Metodo que modifica la fecha de finalización del proyecto
	 * 
	 * @param fechafin
	 */
	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}

	/**
	 * Metodo que devuelve un breve resumen del proyecto
	 * 
	 * @return resumen del proyecto
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Metodo que modifica el resumen del proyecto
	 * 
	 * @param resumen
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * Metodo que devuelve una descripción detallada del proyecto
	 * 
	 * @return descripción del proyecto
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Metodo que modifica la descripción del proyecto
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Metodo que devuelve una imagen del proyecto
	 * 
	 * @return imagen del proyecto
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * Metodo que modifica la imagen del proyecto
	 * 
	 * @param imagen
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * Metodo que devuelve un identificador de la empresa
	 * 
	 * @return identificador de la empresa
	 */
	public int getEmpresa() {
		return empresa;
	}

	/**
	 * Metodo que modifica el identificador de la empresa
	 * 
	 * @param empresa
	 */
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	// ---------------------------
	// Metodo toString()
	// ---------------------------

	/**
	 * Metodo mediante el cual sacamos por pantalla una especie de informe de los
	 * proyectos
	 */
	@Override
	public String toString() {
		return "Project [id=" + id + ", proyecto=" + proyecto + ", fechafin=" + fechafin + ", resumen=" + resumen
				+ ", descripcion=" + descripcion + ", imagen=" + imagen + ", empresa=" + empresa + "]";
	}
}