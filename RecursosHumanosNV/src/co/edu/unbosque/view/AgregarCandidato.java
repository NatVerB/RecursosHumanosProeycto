package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Esta es la clase "Agregar Candidato" ser� en la que se creen y se contengan
 * todos los elementos para la interfaz gr�fica de la pantalla para agregar un
 * nuevo elemento.
 *
 * @extends Adicional a eso se extender� en esta clase, otra clase llamada
 *          JFrame que ser� el panel que nos sirva de contenedor en la interfaz
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
	 * Este es el m�todo constructor de la clase "Agregar Candidato" que se
	 * encargar� de crear e inicializar algunos m�todos que usaremos para el
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
	 * Este es el m�todo inicializarComponentes de la clase "Agregar Candidato" que
	 * se encargar� de inicializar cada uno de los elementos que usaremos para el
	 * correcto funcionameiento de esta ventana, adem�s de eso se le atribuiran
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
		 * M�todo keyTyped Este m�todo es el que se encarga de identificar los
		 * caracteres especiales y no permite digitarlos por el usuario en ning�n
		 * momento
		 * 
		 * @param KeyEvent: Es el encargado de realizar los eventos dentro del m�todo,
		 *                  es decir realiza las acciones del mismo.
		 * @return void: No retorna nada ya que su funci�n es cumplir con las acciones
		 *         dentro del m�todo.
		 */
		public void keyTyped(KeyEvent e) {
			char opr = e.getKeyChar();
			if (opr < 46 || opr > 57 || opr == 47) {
				e.consume();
			}
		}

		/** Cierre del m�todo */

		@Override
		/**
		 * M�todo keyPressed Este m�todo es llamado cada vez que una tecla ha sido
		 * oprimida,
		 * 
		 * @param KeyEvent contiene la informaci�n de la tecla que ha sido oprimida y
		 *                 soltada.
		 * @return void: No retorna nada ya que su funci�n es cumplir con las acciones
		 *         dentro del m�todo.
		 */
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		/** Cierre del m�todo */

		@Override
		/**
		 * M�todo keyReleased Este m�todo es llamado cuando una tecla ha sido soltada.
		 * 
		 * @param KeyEvent contiene la informaci�n de la tecla que ha sido oprimida y
		 *                 soltada.
		 * @return void: No retorna nada ya que su funci�n es cumplir con las acciones
		 *         dentro del m�todo.
		 */
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}/** Cierre del m�todo */
	}

	/**
	 * M�todo Get del campo de texto para ingresar el Nombre del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getNombre() {
		return nombre;
	}

	/**
	 * M�todo Get del campo de texto para ingresar el Apellido del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getApellido() {
		return apellido;
	}

	/**
	 * M�todo Get del campo de texto para ingresar la C�dula del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getCedula() {
		return cedula;
	}

	/**
	 * M�todo Get del campo de texto para ingresar la Edad del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getEdad() {
		return edad;
	}

	/**
	 * M�todo Get del campo de texto para ingresar el Cargo del candidato.
	 * 
	 * @return Retorna el JTextField.
	 */

	public JTextField getCargo() {
		return cargo;
	}

	/**
	 * M�todo Get del bot�n para agregar a un candidato.
	 * 
	 * @return Retorna el JButton.
	 */

	public JButton getAgregar() {
		return agregar;
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