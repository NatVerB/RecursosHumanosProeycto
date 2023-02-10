package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Esta es la clase "Menu" será en la que se creen y se contengan todos los
 * elementos para la interfaz gráfica de la pantalla para escoger una opción de
 * la empresa de recursos humanos.
 * 
 * @extends Adicional a eso se extenderá en esta clase, otra clase llamada
 *          JFrame que será el panel que nos sirva de contenedor en la interfaz
 *          grafica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class Menu extends JFrame {
	JButton ingresar, modificar, eliminar, listar;

	/**
	 * Este es el método constructor de la clase "Menu" que se encargará de crear e
	 * inicializar algunos métodos que usaremos para el correcto funcionamiento de
	 * esta ventana.
	 */

	public Menu() {
		setSize(400, 400);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Este es el método inicializarComponentes de la clase "Menu" que se encargará
	 * de inicializar cada uno de los elementos que usaremos para el correcto
	 * funcionamiento de esta ventana, en la que tendremos las opciones de: Crear un
	 * nuevo Candidato, Modificar Candidatos, Eliminar Candidatos y Listar
	 * Candidatos
	 */

	private void inicializarComponentes() {
		ingresar = new JButton("INGRESAR CANDIDATO");
		modificar = new JButton("MODIFICAR CANDIDATOS");
		eliminar = new JButton("ELIMINAR CANDIDATOS");
		listar = new JButton("LISTAR CANDIDATOS");

		add(ingresar);
		add(modificar);
		add(eliminar);
		add(listar);
		this.setLayout(new GridLayout(4, 1));
	}

	/**
	 * Método Get del botón para ingresar un nuevo candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getIngresar() {
		return ingresar;
	}

	/**
	 * Método Get del botón para modificar un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getModificar() {
		return modificar;
	}

	/**
	 * Método Get del botón para eliminar un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getEliminar() {
		return eliminar;
	}

	/**
	 * Método Get del botón para listar a un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getListar() {
		return listar;
	}
}