package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Esta es la clase "Menu" ser� en la que se creen y se contengan todos los
 * elementos para la interfaz gr�fica de la pantalla para escoger una opci�n de
 * la empresa de recursos humanos.
 * 
 * @extends Adicional a eso se extender� en esta clase, otra clase llamada
 *          JFrame que ser� el panel que nos sirva de contenedor en la interfaz
 *          grafica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class Menu extends JFrame {
	JButton ingresar, modificar, eliminar, listar;

	/**
	 * Este es el m�todo constructor de la clase "Menu" que se encargar� de crear e
	 * inicializar algunos m�todos que usaremos para el correcto funcionamiento de
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
	 * Este es el m�todo inicializarComponentes de la clase "Menu" que se encargar�
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
	 * M�todo Get del bot�n para ingresar un nuevo candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getIngresar() {
		return ingresar;
	}

	/**
	 * M�todo Get del bot�n para modificar un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getModificar() {
		return modificar;
	}

	/**
	 * M�todo Get del bot�n para eliminar un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getEliminar() {
		return eliminar;
	}

	/**
	 * M�todo Get del bot�n para listar a un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getListar() {
		return listar;
	}
}