package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Esta es la clase "Eliminar Candidato" será en la que se creen y se contengan
 * todos los elementos para la interfaz gráfica de la pantalla para eliminar un
 * elemento.
 *
 * @extends Adicional a eso se extenderá en esta clase, otra clase llamada
 *          JFrame que será el panel que nos sirva de contenedor en la interfaz
 *          grafica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class EliminarCandidato extends JFrame {
	JTextField cedula;
	JButton eliminar, regresar;
	keyy key;

	/**
	 * Este es el método constructor de la clase "Eliminar Candidato" que se
	 * encargará de crear e inicializar algunos métodos que usaremos para el
	 * correcto fncionameiento de esta ventana.
	 */

	public EliminarCandidato() {
		setSize(400, 400);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	/**
	 * Este es el método inicializarComponentes de la clase "Eliminar Candidato" que
	 * se encargará de inicializar cada uno de los elementos que usaremos para el
	 * correcto funcionamiento de esta ventana, en la que tendremos la opción de
	 * buscar por la característica "Cedula" el elemento que deseamos eliminar.
	 * Adicional a eso tendremos dos botones que cumpliran la función de eliminar
	 * elemento y regresar a la pantalla anterior.
	 */

	private void inicializarComponentes() {
		key = new keyy();
		cedula = new JTextField();
		cedula.setBorder(new TitledBorder("CEDULA"));
		cedula.addKeyListener(key);
		add(cedula);

		eliminar = new JButton("ELIMINAR CANDIDATO");
		add(eliminar);

		regresar = new JButton("MENU PRINCIPAL");
		add(regresar);

		this.setLayout(new GridLayout(3, 1));
	}

	/**
	 * Este es el metodo limpiar y se encarga de vaciar o reiniciar los campos de
	 * texto y dejarlos en blanco
	 */
	public void limpiar() {
		cedula.setText("");
	}

	public class keyy implements KeyListener {

		@Override
		/**
		 * Método keyTyped Este método es el que se encarga de identificar los
		 * caracteres especiales y no permite digitarlos por el usuario en ningún
		 * momento
		 * 
		 * @param KeyEvent: Es el encargado de realizar los eventos dentro del método,
		 *                  es decir realiza las acciones del mismo.
		 * @return void: No retorna nada ya que su función es cumplir con las acciones
		 *         dentro del método.
		 */
		public void keyTyped(KeyEvent e) {
			char opr = e.getKeyChar();
			if (opr < 46 || opr > 57 || opr == 47) {
				e.consume();
			}
		}

		/** Cierre del método */

		@Override
		/**
		 * Método keyPressed Este método es llamado cada vez que una tecla ha sido
		 * oprimida,
		 * 
		 * @param KeyEvent contiene la información de la tecla que ha sido oprimida y
		 *                 soltada.
		 * @return void: No retorna nada ya que su función es cumplir con las acciones
		 *         dentro del método.
		 */
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		/** Cierre del método */

		@Override
		/**
		 * Método keyReleased Este método es llamado cuando una tecla ha sido soltada.
		 * 
		 * @param KeyEvent contiene la información de la tecla que ha sido oprimida y
		 *                 soltada.
		 * @return void: No retorna nada ya que su función es cumplir con las acciones
		 *         dentro del método.
		 */
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}/** Cierre del método */
	}

	/**
	 * Método Get del campo de texto para ingresar la Cédula del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getCedula() {
		return cedula;
	}

	/**
	 * Método Get del botón para eliminar el elemento.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getEliminar() {
		return eliminar;
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