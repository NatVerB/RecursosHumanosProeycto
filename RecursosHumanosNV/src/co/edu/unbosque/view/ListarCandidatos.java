package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Esta es la clase "Listar Candidatos" será en la que se creen y se contengan
 * todos los elementos para la interfaz gráfica de la pantalla para listar a
 * todos los candidatos de la empresa.
 * 
 * @extends Adicional a eso se extenderá en esta clase, otra clase llamada
 *          JFrame que será el panel que nos sirva de contenedor en la interfaz
 *          gráfica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class ListarCandidatos extends JFrame {
	JButton lisTodos, lisEsp, regresar;

	/**
	 * Este es el método constructor de la clase "Listar Candidatos" que se
	 * encargará de crear e inicializar algunos métodos que usaremos para el
	 * correcto funcionamiento de esta ventana.
	 */

	public ListarCandidatos() {
		setSize(400, 400);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	/**
	 * Este es el método inicializarComponentes de la clase "Listar Candidatos" que
	 * se encargará de inicializar cada uno de los elementos que usaremos para el
	 * correcto funcionamiento de esta ventana, en la que tendremos las opciones de:
	 * Listar a todos los candidatos, Listarlo y regresar a la pantalla anterior.
	 */

	private void inicializarComponentes() {
		lisTodos = new JButton("LISTAR CANDIDATOS (TODOS)");
		add(lisTodos);

		lisEsp = new JButton("LISTAR CANDIDATO (ESPECIFICO)");
		add(lisEsp);

		regresar = new JButton("MENU PRINCIPAL");
		add(regresar);

		this.setLayout(new GridLayout(3, 1));
	}

	/**
	 * Método Get del botón para listar a los candidatos.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getLisTodos() {
		return lisTodos;
	}

	/**
	 * Método Get del botón para listar a un candidato en especifico.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getLisEsp() {
		return lisEsp;
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
