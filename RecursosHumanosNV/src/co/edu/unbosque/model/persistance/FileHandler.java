package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.CandidatosDTO;

/**
 * Esta es la clase FileHandler la cual tiene como función el serializado
 * correcto de los Candidatos ingresados al programa.
 * 
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */
public class FileHandler {

	/**
	 * Este es el método readSerializable() en el cual se busca obtener la
	 * informacion ya añadida al Archivo serializado para poder ser agregados
	 * nuevamente al iniciar el programa y tener la información completa.
	 * 
	 * @return El método retorna los Candidatos que se obtuvieron al leer el archivo
	 *         serializado con el fin de agregarlos y que se puedan ver en la lista
	 *         y el programa
	 */
	public static ArrayList<CandidatosDTO> readSerializable() {
		ArrayList<CandidatosDTO> lista = new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/co/edu/unbosque/model/persistance/Serializable.n"));
            lista = (ArrayList<CandidatosDTO>) ois.readObject();

		} catch (IOException e) {
			System.out.println("Error al leer el archivo (Leer serializado)");
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("error on integriry(serializable-read)");
			System.out.println(e.getMessage());
		}
		return lista;
	}

	/**
	 * Este es el metodo writeSerializable() el cual cumple con la función de
	 * escribir los candidatos o las modificaciones realizadas a los mismos en el
	 * documento serializado para que se encuentre actualizado
	 * 
	 * @param el parametro requerido es el ArrayList en el que se encuentran
	 *           almacenados todos los candidatos añadidos
	 */
	public static void writeSerializable(Object o) {
		try {
			ObjectOutputStream escribir = new ObjectOutputStream(
					new FileOutputStream("src/co/edu/unbosque/model/persistance/Serializable.n"));
			escribir.writeObject(o);
			escribir.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found(Serializable)");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error on writing(serializable)");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
