package Abrir_Evento.Servidor.Server_Eventos.Server_Domain;

import Abrir_Evento.Organizador.Organizador_Eventos.Organizador_Domain.*;
import Inicio_Sesión.Servidor.Server_Domain.*;

public class Evento {

	private Organizador_Evento organizador;
	private Presencialidad presencialidad;
	private Usuario[] listaAsistentes;
	private String ubicacion;
	private Date fecha;

}