package Gestionar_Eventos.Servidor.Server_Eventos.Server_Presentacion;

import Gestionar_Eventos.Servidor.Server_Eventos.Server_Domain.*;
import Gestionar_Eventos.Organizador.Organizador_Eventos.Organizador_Domain.*;

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