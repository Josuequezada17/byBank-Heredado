package com.byBank.test;

import com.byBank.modelo.*; //Generaliza tomando todas las clases del paquete

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario myFuncionario = new Contador();
		Gerente myFuncionario2 = new Gerente();
		
		
		myFuncionario.setNombre("Josue");
		myFuncionario.setDocumento("3453565");
		myFuncionario.setSalario(200); 
		//myFuncionario.setTipo(1);
		
		myFuncionario2.setSalario(100);
		//myFuncionario2.setTipo(0);

		System.out.println(myFuncionario.getSalario());
		System.out.println(myFuncionario.getBonificacion());
		
		System.out.println(myFuncionario2.getSalario());
		System.out.println(myFuncionario2.getBonificacion());
	}
	
}
