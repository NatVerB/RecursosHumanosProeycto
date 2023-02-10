package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Esta es la clase ModificarCandidato, en esta se encuentra la parte de la
 * interfaz grafica que puede ver el ususario cuando desee modificar un
 * candidado ya ingresado anteriormente
 * 
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 * 
 */
public class ModificarCandidato extends JFrame {
	JTextField cedula, cargo;
	JButton modificar, regresar;
	keyy key;

	/**
	 * Este es el metodo constructor de la clase, en el cual se inicializan algunos
	 * metodos y se le dan ciertas caracteristicas a la pantalla de la interfaz con
	 * el fin de tener un funcionamiento correcto
	 */
	public ModificarCandidato() {
		setSize(400, 400);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	/**
	 * Este metodo es inicializarComponentes() cumple con la funcion de incializar
	 * los componentes declarados anteriormente con el fin de ordenar la interfaz
	 * grafica y que sea comodo para el usuario
	 */
	private void inicializarComponentes() {
		key = new keyy();
		cedula = new JTextField();
		cedula.setBorder(new TitledBorder("CEDULA"));
		cedula.addKeyListener(key);
		add(cedula);

		cargo = new JTextField();
		cargo.setBorder(new TitledBorder("NUEVO CARGO"));
		add(cargo);

		modificar = new JButton("MODIFICAR CANDIDATO");
		add(modificar);

		regresar = new JButton("MENU PRINCIPAL");
		add(regresar);

		this.setLayout(new GridLayout(4, 1));
	}

	/**
	 * Este es el metodo limpiar y se encarga de vaciar o reiniciar los campos de
	 * texto y dejarlos en blanco
	 */
	public void limpiar() {
		cedula.setText("");
		cargo.setText("");
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
	 * Metodo get
	 * 
	 * @return retorna la componente
	 */
	public JTextField getCedula() {
		return cedula;
	}

	/**
	 * Metodo get
	 * 
	 * @return retorna la componente
	 */
	public JTextField getCargo() {
		return cargo;
	}

	/**
	 * Metodo get
	 * 
	 * @return retorna la componente
	 */
	public JButton getModificar() {
		return modificar;
	}

	/**
	 * Metodo get
	 * 
	 * @return retorna la componente
	 */
	public JButton getRegresar() {
		return regresar;
	}

}