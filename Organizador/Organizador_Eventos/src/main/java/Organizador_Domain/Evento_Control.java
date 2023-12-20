package Gestionar_Eventos.Organizador.Organizador_Eventos.Organizador_Domain;

import Gestionar_Eventos.Servidor.Server_Eventos.Server_Domain.*;
import Inicio_Sesión.Servidor.Server_Domain.*;

public class Evento_Control {

	/**
	 * 
	 * @param organizador
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 * @param ponente
	 */
	public void open_event(Organizador_Evento organizador, Presencialidad presencialidad, String ubicacion, Date fecha, Usuario ponente) {
		// TODO - implement Evento_Control.open_event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param organizador
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 * @param ponente
	 */
	private void open_event_presencial(Organizador_Evento organizador, Presencialidad presencialidad, String ubicacion, Date fecha, Usuario ponente) {
		// TODO - implement Evento_Control.open_event_presencial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param organizador
	 * @param ubicacion
	 * @param fecha
	 * @param ponente
	 */
	private String open_event_online(Organizador_Evento organizador, String ubicacion, Date fecha, Usuario ponente) {
		// TODO - implement Evento_Control.open_event_online
		throw new UnsupportedOperationException();
	}

	private void geolocalizar() {
		// TODO - implement Evento_Control.geolocalizar
		throw new UnsupportedOperationException();
	}

	private void conexionBluetooth() {
		// TODO - implement Evento_Control.conexionBluetooth
		throw new UnsupportedOperationException();
	}

	private void generarQR() {
		// TODO - implement Evento_Control.generarQR
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idEvento
	 * @param presencialida
	 * @param ubicacion
	 * @param fecha
	 * @param informacion
	 */
	public boolean edit_event(String idEvento, Presencialidad presencialida, String ubicacion, Date fecha, String informacion) {
		// TODO - implement Evento_Control.edit_event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idEvento
	 */
	public boolean delete_event(String idEvento) {
		// TODO - implement Evento_Control.delete_event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idEvento
	 */
	public String[][] get_event_info(String idEvento) {
		// TODO - implement Evento_Control.get_event_info
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param organizador
	 */
	public Evento[] get_events(Organizador_Evento organizador) {
		// TODO - implement Evento_Control.get_events
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param QR
	 */
	public Evento get_event_by_QR(String QR) {
		// TODO - implement Evento_Control.get_event_by_QR
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numero
	 */
	public Evento get_event_by_numero(int numero) {
		// TODO - implement Evento_Control.get_event_by_numero
		throw new UnsupportedOperationException();
	}

}