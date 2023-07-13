package com.byBank.modelo;

public class SistemaInterno {

	private String clave = "AluraCursosOnline";

	public boolean autentica(Autenticable autenticador) {
		boolean canLogin = autenticador.iniciarSesion(this.clave);
		if (canLogin) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Login fallido");
			return false;
		}
	}

}
