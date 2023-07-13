package com.byBank.test;

import com.byBank.modelo.*; //Generaliza tomando todas las clases del paquete

public class TestReferencias {
	
	public static void main(String[] args) {
		Funcionario myFuncionario  = new Contador();
		
		Gerente myGerente = new Gerente();
		
		myFuncionario.setNombre("Josue");
		myFuncionario.setSalario(200);
		
		myGerente.setNombre("Ximena");
		myGerente.setSalario(400);
		
		
	}
	
}
