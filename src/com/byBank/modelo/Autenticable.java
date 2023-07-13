package com.byBank.modelo;

public interface Autenticable {

	public void setClave(String clave);

	public boolean iniciarSesion(String clave);

}
