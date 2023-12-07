package Abrir_Evento.Servidor.Server_Eventos.Server_Presentacion;

import Abrir_Evento.Servidor.Server_Eventos.Server_Domain.*;
import Abrir_Evento.Organizador.Organizador_Eventos.Organizador_Domain.*;

public interface EventoInterface {

	/**
	 * 
	 * @param organizador
	 * @param presencialidad
	 * @param ubicacion
	 * @param fecha
	 */
	void open_event(Organizador_Evento organizador, Presencialidad presencialidad, String ubicacion, Date fecha);

}