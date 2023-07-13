package com.byBank.modelo;

public class CalculadoraDeImpuesto {

	private double totalImpuesto;

	public void registra(Tributacion myTributacion) {
		double valor = myTributacion.getValorImpuesto();
		this.totalImpuesto += valor;
	}

	public double getTotalImpuesto() {
		return this.totalImpuesto;
	}

}
