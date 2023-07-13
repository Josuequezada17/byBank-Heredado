package com.byBank.modelo;

public class ControlBonificacion {
	
	private double suma;
	
	public double registrarSalarios(Funcionario myFuncionario) {
		this.suma = myFuncionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
		//otra opción return this.suma += myFuncionario.getBonificacion();
	}
	
	//Este metodo al ser el mas generico, podra acceder de cierta forma 
	//a las bonificaciones de cada trabajador y de este modo podra manejarlas
	
}
