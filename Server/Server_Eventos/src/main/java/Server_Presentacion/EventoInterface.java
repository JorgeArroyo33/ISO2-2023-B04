package Servidor.Server_Eventos.Server_Presentacion;

/*Testing realizado con exito*/

import Organizador.Organizador_Eventos.Organizador_Domain.*;
import Servidor.Server_Eventos.Server_Domain.*;

public interface EventoInterface {

	/**
	 * 
	 * @param loginOrganizador
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 */
	void open_event(String loginOrganizador, Presencialidad presencialidad, String ubicacion, Date fecha);

	/**
	 * 
	 * @param idEvento
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 * @param informacion
	 */
	boolean edit_event(String idEvento, Presencialidad presencialidad, String ubicacion, Date fecha, String informacion);

	/**
	 * 
	 * @param idEvento
	 */
	boolean delete_event(String idEvento);

	/**
	 * 
	 * @param idEvento
	 */
	String[][] get_event_info(String idEvento);

	/**
	 * 
	 * @param loginOrganizador
	 */
	Evento[] get_events(String loginOrganizador);

	/**
	 * 
	 * @param QR
	 */
	Evento get_event_by_QR(String QR);

	/**
	 * 
	 * @param numero
	 */
	Evento get_event_by_numero(int numero);

}