package com.byBank.modelo;

//                 Extiende de Funcionario

public class Gerente extends Funcionario implements Autenticable {

	private String clave;

	@Override
	public double getBonificacion() {
		return super.getSalario() + super.getSalario() * 0.05;
		// Super sirve para acceder a los atributos de la clase padre
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if (this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}

}
