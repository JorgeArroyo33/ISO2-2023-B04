package Servidor.Server_Eventos.Server_Domain;

/*Testing realizado con exito*/

import Organizador.Organizador_Eventos.Organizador_Domain.*;

public class Event_Controller {

	/**
	 * 
	 * @param loginOrganizador
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 */
	public void open_event(String loginOrganizador, Presencialidad presencialidad, String ubicacion, Date fecha) {
		// TODO - implement Event_Controller.open_event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param loginOrganizador
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 */
	private void open_event_presencial(String loginOrganizador, Presencialidad presencialidad, String ubicacion, Date fecha) {
		// TODO - implement Event_Controller.open_event_presencial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param loginOrganizador
	 */
	private String open_event_online(String loginOrganizador) {
		// TODO - implement Event_Controller.open_event_online
		throw new UnsupportedOperationException();
	}

	private void geolocalizar() {
		// TODO - implement Event_Controller.geolocalizar
		throw new UnsupportedOperationException();
	}

	private void conexionBluetooth() {
		// TODO - implement Event_Controller.conexionBluetooth
		throw new UnsupportedOperationException();
	}

	private void generarQR() {
		// TODO - implement Event_Controller.generarQR
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idEvento
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 * @param informacion
	 */
	public boolean edit_event(String idEvento, Presencialidad presencialidad, String ubicacion, Date fecha, String informacion) {
		// TODO - implement Event_Controller.edit_event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idEvento
	 */
	public boolean delete_event(String idEvento) {
		// TODO - implement Event_Controller.delete_event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idEvento
	 */
	public String[][] get_event_info(String idEvento) {
		// TODO - implement Event_Controller.get_event_info
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param loginOrganizador
	 */
	public Evento[] get_events(String loginOrganizador) {
		// TODO - implement Event_Controller.get_events
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param QR
	 */
	public Evento get_event_by_QR(String QR) {
		// TODO - implement Event_Controller.get_event_by_QR
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numero
	 */
	public Evento get_event_by_numero(int numero) {
		// TODO - implement Event_Controller.get_event_by_numero
		throw new UnsupportedOperationException();
	}

}