package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CandidatosDAO;
import co.edu.unbosque.view.AgregarCandidato;
import co.edu.unbosque.view.EliminarCandidato;
import co.edu.unbosque.view.ListaEspecifica;
import co.edu.unbosque.view.ListarCandidatos;
import co.edu.unbosque.view.Menu;
import co.edu.unbosque.view.ModificarCandidato;

/**
 * Esta es la clase Controller la cual realiza el trabajo de dar indicaciones a
 * todo el programa con el fin de que funcione correctamente y siga todas las
 * instrucciones.
 * 
 * @author Natalia Vergara
 * @author Alejandra Valero
 * @version 08/02/2023 *
 */
public class Controller implements ActionListener {
	Menu menu;
	AgregarCandidato aggC;
	EliminarCandidato elC;
	ModificarCandidato modC;
	ListarCandidatos list;
	ListaEspecifica listEs;
	CandidatosDAO candao;

	/**
	 * Este es el metodo constructor y cumple con la funcion de inicializar las
	 * variables necesarias para el funcionamiento de la clase.
	 */
	public Controller() {
		menu = new Menu();
		aggC = new AgregarCandidato();
		elC = new EliminarCandidato();
		modC = new ModificarCandidato();
		list = new ListarCandidatos();
		listEs = new ListaEspecifica();
		candao = new CandidatosDAO();
		asignarOyentes();
	}

	/**
	 * Este es el metodo asignarOyentes, cumple con la funcion de agregar un
	 * ActionListener a los botones con el fin de que puedan realizar la accion que
	 * les es asignada
	 */
	public void asignarOyentes() {
		menu.getListar().addActionListener(this);
		menu.getModificar().addActionListener(this);
		menu.getEliminar().addActionListener(this);
		menu.getIngresar().addActionListener(this);
		aggC.getAgregar().addActionListener(this);
		aggC.getRegresar().addActionListener(this);
		elC.getEliminar().addActionListener(this);
		elC.getRegresar().addActionListener(this);
		modC.getModificar().addActionListener(this);
		modC.getRegresar().addActionListener(this);
		list.getLisEsp().addActionListener(this);
		list.getLisTodos().addActionListener(this);
		list.getRegresar().addActionListener(this);
		listEs.getListar().addActionListener(this);
		listEs.getRegresar().addActionListener(this);

	}

	/**
	 * Este es el metodo actionPerformed, en este se dan las instrucciones para que
	 * el programa pueda funcionar, basicamente es la parte que relaciona la vista
	 * con el modelo y se encarga de imlpementar cada funcion que se desee
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String accionado = e.getActionCommand().replace(" ", "");
		if (accionado.equalsIgnoreCase("MenuPrincipal")) {
			aggC.setVisible(false);
			elC.setVisible(false);
			modC.setVisible(false);
			list.setVisible(false);
			listEs.setVisible(false);
			menu.setVisible(true);
		} else if (accionado.equalsIgnoreCase("INGRESARCANDIDATO")) {
			menu.setVisible(false);
			aggC.setVisible(true);
		} else if (accionado.equalsIgnoreCase("MODIFICARCANDIDATOS")) {
			menu.setVisible(false);
			modC.setVisible(true);
		} else if (accionado.equalsIgnoreCase("ELIMINARCANDIDATOS")) {
			menu.setVisible(false);
			elC.setVisible(true);
		} else if (accionado.equalsIgnoreCase("LISTARCANDIDATOS")) {
			menu.setVisible(false);
			list.setVisible(true);
		} else if (accionado.equalsIgnoreCase("AGREGARCANDIDATO")) {
			String nom = aggC.getNombre().getText();
			String ape = aggC.getApellido().getText();
			String ced = aggC.getCedula().getText();
			String cargo = aggC.getCargo().getText();
			int edad = Integer.parseInt(aggC.getEdad().getText());
			candao.agregarCandidatos(nom, ape, ced, cargo, edad);
			JOptionPane.showMessageDialog(null, "CANDIDATO AGREGADO CORRECTAMENTE");
			aggC.setVisible(false);
			menu.setVisible(true);
			aggC.limpiar();
		} else if (accionado.equalsIgnoreCase("ELIMINARCANDIDATO")) {
			String ced = elC.getCedula().getText();
			if (candao.eliminarCandidato(ced)) {
				JOptionPane.showMessageDialog(null, "CANDIDATO ELIMINADO CORRECTAMENTE");
			} else {
				JOptionPane.showMessageDialog(null, "CANDIDATO NO ELIMINADO");
			}
			elC.setVisible(false);
			menu.setVisible(true);
			elC.limpiar();
		} else if (accionado.equalsIgnoreCase("MODIFICARCANDIDATO")) {
			String ced = modC.getCedula().getText();
			String cargo = modC.getCargo().getText();			
			if (candao.modificarCandidato(ced, cargo)) {
				JOptionPane.showMessageDialog(null, "CANDIDATO MODIFICADO CORRECTAMENTE");
			} else {
				JOptionPane.showMessageDialog(null, "CANDIDATO NO MODIFICADO");
			}
			modC.setVisible(false);
			menu.setVisible(true);
			modC.limpiar();
		} else if (accionado.equalsIgnoreCase("LISTARCANDIDATO")) {
			String ced = listEs.getCedula().getText();
			JOptionPane.showMessageDialog(null, candao.listarEspe(ced));
			listEs.setVisible(false);
			menu.setVisible(true);
		} else if (accionado.equalsIgnoreCase("LISTARCANDIDATOS(TODOS)")) {
			JOptionPane.showMessageDialog(null, candao.listarCandidatos());
			menu.setVisible(true);
		} else if (accionado.equalsIgnoreCase("LISTARCANDIDATO(ESPECIFICO)")) {
			list.setVisible(false);
			listEs.setVisible(true);
		} else if (accionado.equalsIgnoreCase("ELIMINARCANDIDATO")) {
			menu.setVisible(false);
			elC.setVisible(true);
		}
	}
}
