package Inicio_Sesi�n.Servidor.Server_Presentacion;

public interface UsuarioInterface {

	/**
	 * 
	 * @param login
	 * @param pass
	 */
	void authenticate(String login, String pass);

}