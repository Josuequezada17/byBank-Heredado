package com.byBank.test;

import com.byBank.modelo.*; //Generaliza tomando todas las clases del paquete

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario josue = new Contador();
		
		josue.setSalario(200);
		
		com.byBank.modelo.Gerente ximena = new com.byBank.modelo.Gerente();
		
		ximena.setSalario(400);
		
		Contador azul = new Contador();
		azul.setSalario(300);
		
		ControlBonificacion myContBonificacion = new ControlBonificacion();
		
		myContBonificacion.registrarSalarios(josue);
		myContBonificacion.registrarSalarios(ximena);
		myContBonificacion.registrarSalarios(azul);
		
		//System.out.println(myContBonificacion.registrarSalarios(ximena));
		
		
	}

}
