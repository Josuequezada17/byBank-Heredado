package com.byBank.modelo;

public class SeguroDeVida implements Tributacion {
	

	@Override
	public double getValorImpuesto() {
		double precio = 10.0;
		return precio ;
	}

}
