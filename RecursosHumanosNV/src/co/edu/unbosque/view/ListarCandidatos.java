package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Esta es la clase "Listar Candidatos" ser� en la que se creen y se contengan
 * todos los elementos para la interfaz gr�fica de la pantalla para listar a
 * todos los candidatos de la empresa.
 * 
 * @extends Adicional a eso se extender� en esta clase, otra clase llamada
 *          JFrame que ser� el panel que nos sirva de contenedor en la interfaz
 *          gr�fica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class ListarCandidatos extends JFrame {
	JButton lisTodos, lisEsp, regresar;

	/**
	 * Este es el m�todo constructor de la clase "Listar Candidatos" que se
	 * encargar� de crear e inicializar algunos m�todos que usaremos para el
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
	 * Este es el m�todo inicializarComponentes de la clase "Listar Candidatos" que
	 * se encargar� de inicializar cada uno de los elementos que usaremos para el
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
	 * M�todo Get del bot�n para listar a los candidatos.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getLisTodos() {
		return lisTodos;
	}

	/**
	 * M�todo Get del bot�n para listar a un candidato en especifico.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getLisEsp() {
		return lisEsp;
	}

	/**
	 * M�todo Get del bot�n para regresar a la pantalla anterior.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getRegresar() {
		return regresar;
	}

}
