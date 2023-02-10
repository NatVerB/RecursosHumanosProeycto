package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase en donde crearemos a los candidatos con sus respectivas caracter�sticas
 * 
 * @author Natalia Vergara, Alejandra Valero
 * @version 08/02/2023
 */

public class CandidatosDTO implements Serializable {
	public String nombre, apellido, cedula, cargo;
	public int edad;

	/**
	 * Metodo constructor vacio
	 */

	public CandidatosDTO() {
	}

	/**
	 * Este es el m�todo constructor de la clase "Candidatos DTO" que se encargar�
	 * de crear e inicializar algunos m�todos y variables que usaremos para el
	 * correcto funcionamiento de esta ventana.
	 * 
	 * @param nombre   Nombre del candidato
	 * @param apellido Apellido del candidato
	 * @param cedula   C�dula del candidato
	 * @param cargo    Cargo del candidato
	 * @param edad     Edad del candidato
	 */

	public CandidatosDTO(String nombre, String apellido, String cedula, String cargo, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.cargo = cargo;
		this.edad = edad;
	}

	/**
	 * Este es el m�todo toString de la clase "Candidatos DTO" que se encargar� de
	 * retornar todos los datos guardados en las variables para que podamos
	 * imprimirlos de manera correcta, para eso los va a los concatenar en una
	 * cadena.
	 * 
	 */

	@Override
	public String toString() {
		return this.nombre + "," + this.apellido + "," + this.cedula + "," + this.cargo + "," + this.edad;
	}

	/**
	 * M�todo Get del Nombre del candidato.
	 * 
	 * @return Retorna el Nombre en un String.
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo Set del Nombre del candidato.
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo Get del Apellido del candidato.
	 * 
	 * @return Retorna el Apellido en un String.
	 */

	public String getApellido() {
		return apellido;
	}

	/**
	 * M�todo Set del Apellido del candidato.
	 */

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * M�todo Get de la C�dula del candidato.
	 * 
	 * @return Retorna la C�dula en un String.
	 */

	public String getCedula() {
		return cedula;
	}

	/**
	 * M�todo Set de la C�dula del candidato.
	 */

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * M�todo Get del Cargo del candidato.
	 * 
	 * @return Retorna el Cargo en un String.
	 */

	public String getCargo() {
		return cargo;
	}

	/**
	 * M�todo Set del cargo del candidato.
	 */

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * M�todo Get de la Edad del candidato.
	 * 
	 * @return Retorna la Edad en un int.
	 */

	public int getEdad() {
		return edad;
	}

	/**
	 * M�todo Set de la Edad del candidato.
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
