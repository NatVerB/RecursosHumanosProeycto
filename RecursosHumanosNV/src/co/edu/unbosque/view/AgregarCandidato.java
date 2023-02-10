package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Esta es la clase "Agregar Candidato" será en la que se creen y se contengan
 * todos los elementos para la interfaz gráfica de la pantalla para agregar un
 * nuevo elemento.
 *
 * @extends Adicional a eso se extenderá en esta clase, otra clase llamada
 *          JFrame que será el panel que nos sirva de contenedor en la interfaz
 *          grafica de esta ventana.
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023
 *
 */

public class AgregarCandidato extends JFrame {
	JTextField nombre, apellido, cedula, edad, cargo;
	JButton agregar, regresar;
	keyy key;

	/**
	 * Este es el método constructor de la clase "Agregar Candidato" que se
	 * encargará de crear e inicializar algunos métodos que usaremos para el
	 * correcto fncionameiento de esta ventana.
	 */

	public AgregarCandidato() {
		setSize(400, 600);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	/**
	 * Este es el método inicializarComponentes de la clase "Agregar Candidato" que
	 * se encargará de inicializar cada uno de los elementos que usaremos para el
	 * correcto funcionameiento de esta ventana, además de eso se le atribuiran
	 * caracteristicas como nombre, apellido, cedula, etc.
	 */

	private void inicializarComponentes() {
		key = new keyy();
		nombre = new JTextField();
		nombre.setBorder(new TitledBorder("NOMBRES"));
		add(nombre);

		apellido = new JTextField();
		apellido.setBorder(new TitledBorder("APELLIDOS"));
		add(apellido);

		cedula = new JTextField();
		cedula.setBorder(new TitledBorder("CEDULA"));
		cedula.addKeyListener(key);
		add(cedula);

		edad = new JTextField();
		edad.setBorder(new TitledBorder("EDAD"));
		edad.addKeyListener(key);
		add(edad);

		cargo = new JTextField();
		cargo.setBorder(new TitledBorder("CARGO"));
		add(cargo);

		agregar = new JButton("AGREGAR CANDIDATO");
		add(agregar);

		regresar = new JButton("MENU PRINCIPAL");
		add(regresar);

		this.setLayout(new GridLayout(7, 1));
	}

	/**
	 * Este es el metodo limpiar y se encarga de vaciar o reiniciar los campos de
	 * texto y dejarlos en blanco
	 */
	public void limpiar() {
		nombre.setText("");
		apellido.setText("");
		cedula.setText("");
		edad.setText("");
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
	 * Método Get del campo de texto para ingresar el Nombre del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getNombre() {
		return nombre;
	}

	/**
	 * Método Get del campo de texto para ingresar el Apellido del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getApellido() {
		return apellido;
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
	 * Método Get del campo de texto para ingresar la Edad del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getEdad() {
		return edad;
	}

	/**
	 * Método Get del campo de texto para ingresar el Cargo del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getCargo() {
		return cargo;
	}

	/**
	 * Método Get del botón para agregar a un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getAgregar() {
		return agregar;
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