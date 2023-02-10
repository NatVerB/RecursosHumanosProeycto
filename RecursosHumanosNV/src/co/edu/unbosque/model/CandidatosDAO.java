package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.persistance.FileHandler;

/**
 * La clase CandidatosDAO es la que contiene los metodos que se van a realizar
 * con el fin de agregar, eliminar, modificar y listar a los Candidatos
 * 
 * @author Natalia Vergara, Alejandra Valero
 * @version 08/02/2023
 */
public class CandidatosDAO implements Serializable {
	ArrayList<CandidatosDTO> lista;

	/**
	 * El metodo constructor es el encargado de inicializar las variables necesarias
	 * para la clase
	 */
	public CandidatosDAO() {
		lista = new ArrayList<CandidatosDTO>();
		lista=FileHandler.readSerializable();
	}

	/**
	 * El metodo loadSerializable es el encargado de cargar los datos almacenados
	 * dentro del cocumento serializado en la lista de candidatos cada vez que se
	 * inicie el programa
	 */


	/**
	 * El metodo agregarCandidatos es el encargado de añadir a la lista a los nuevos
	 * candidatos y ademas de actualizar el serializado
	 * 
	 * @param nombre   Nombre del candidato
	 * @param apellido Apellido del candidato
	 * @param cedula   Cedula del candidato
	 * @param cargo    Cargo del candidato
	 * @param edad     Edad del candidato
	 */
	public void agregarCandidatos(String nombre, String apellido, String cedula, String cargo, int edad) {
		lista.add(new CandidatosDTO(nombre, apellido, cedula, cargo, edad));
		FileHandler.writeSerializable(lista);
	}

	/**
	 * el metodo modificarCandidato es el encargado de modificar el candidato que el
	 * ususario desea
	 * 
	 * @param cedula Cedula del candidato
	 * @param cargoN Cargo nuevo
	 * @return retorna un boolean en donde verifica si fue o no modificado
	 */
	public boolean modificarCandidato(String cedula, String cargoN) {
		boolean mod = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCedula().equals(cedula)) {
				lista.get(i).setCargo(cargoN);
				FileHandler.writeSerializable(lista);
				mod = true;
			}
		}
		return mod;
	}

	/**
	 * el metodo eliminarCandidato cumple con la funcion de eliminar el candidato
	 * que el usuario desee
	 * 
	 * @param cedula Cedula del candidato que desea eliminar
	 * @return retorna un boolean en donde verifica si fue o no eliminado
	 */
	public boolean eliminarCandidato(String cedula) {
		boolean eli = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCedula().equals(cedula)) {
				lista.remove(i);
				FileHandler.writeSerializable(lista);
				eli = true;
			}
		}
		return eli;
	}

	/**
	 * este metodo es el encargado de listar a todas las personas agregadas en la
	 * lista
	 * 
	 * @return retorna la informacion de todos candidatos almacenados en la lista
	 */
	public String listarCandidatos() {
		String cad = "Lista de Candidatos:\n";
		for (int i = 0; i < lista.size(); i++) {
			cad += "Nombre: " + lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " Cargo: "
					+ lista.get(i).getCargo() + " Cedula: " + lista.get(i).getCedula() + " Edad: "
					+ lista.get(i).getEdad() + "\n";
		}
		return cad;
	}

	/**
	 * este metodo es el encargado de listar a la persona solicitada por el usuario
	 * 
	 * @return retorna la informacion del candidatos almacenado en la lista
	 */

	public String listarEspe(String cedula) {
		String cad = "Candidato:\n";
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCedula().equals(cedula)) {
				cad += "Nombre: " + lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " Cargo: "
						+ lista.get(i).getCargo() + " Cedula: " + lista.get(i).getCedula() + " Edad: "
						+ lista.get(i).getEdad() + "\n";
			}
		}
		return cad;
	}

	public ArrayList<CandidatosDTO> getLista() {
		return lista;
	}

}
