package Gestionar_Eventos.Servidor.Server_Eventos.Server_Domain;

import Gestionar_Eventos.Organizador.Organizador_Eventos.Organizador_Domain.*;
import Inicio_Sesión.Servidor.Server_Domain.*;

public class Evento {

	private Organizador_Evento organizador;
	private Presencialidad presencialidad;
	private Usuario[] listaAsistentes;
	private String ubicacion;
	private Date fecha;
	private String informacion;
	private Usuario ponente;
	private int QR = null: String;
	private int numero = null: int;

}