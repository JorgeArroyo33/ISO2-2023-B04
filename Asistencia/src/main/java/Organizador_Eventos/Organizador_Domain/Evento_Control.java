package Abrir_Evento.Organizador.Organizador_Eventos.Organizador_Domain;

import Abrir_Evento.Servidor.Server_Eventos.Server_Domain.*;

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

}