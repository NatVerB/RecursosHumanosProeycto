package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Esta es la clase "Lista Especifica" será en la que se creen y se contengan
 * todos los elementos para la interfaz gráfica de la pantalla para listar a un
 * candidato especifico por su cédula.
 * 
 * @extends Adicional a eso se extenderá en esta clase, otra clase llamada
 *          JFrame que será el panel que nos sirva de contenedor en la interfaz
 *          gráfica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class ListaEspecifica extends JFrame {
	JTextField cedula;
	JButton listar, regresar;

	/**
	 * Este es el método constructor de la clase "Lista Especifica" que se encargará
	 * de crear e inicializar algunos métodos que usaremos para el correcto
	 * funcionamiento de esta ventana.
	 */

	public ListaEspecifica() {
		setSize(400, 400);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	/**
	 * Este es el método inicializarComponentes de la clase "Lista Especifica" que
	 * se encargará de inicializar cada uno de los elementos que usaremos para el
	 * correcto funcionamiento de esta ventana, en la que tendremos las opciones de:
	 * Ingresar la cédula del candidato buscado, Listarlo y regresar de pantalla.
	 */

	private void inicializarComponentes() {
		cedula = new JTextField();
		cedula.setBorder(new TitledBorder("CEDULA"));
		add(cedula);

		listar = new JButton("LISTAR CANDIDATO");
		add(listar);

		regresar = new JButton("MENU PRINCIPAL");
		add(regresar);

		this.setLayout(new GridLayout(3, 1));
	}

	/**
	 * Método Get del campo de texto para ingresar la cédula del candidato buscado.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getCedula() {
		return cedula;
	}

	/**
	 * Método Get del botón para listar al candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getListar() {
		return listar;
	}

	/**
	 * Método Get del botón para regresar a la pantalla anterior.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getRegresar() {
		return regresar;
	}
}
