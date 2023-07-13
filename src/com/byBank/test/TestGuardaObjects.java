package com.byBank.test;

import com.byBank.modelo.Cliente;
import com.byBank.modelo.CuentaCorriente;
import com.byBank.modelo.Gerente;
import com.byBank.modelo.GuardaObjetos;

public class TestGuardaObjects {

	public static void main(String[] args) {
		
		GuardaObjetos guardaObjetos = new GuardaObjetos();
		
		CuentaCorriente cc1 = new CuentaCorriente(22, 33);
		CuentaCorriente cc2 = new CuentaCorriente(22, 34);
		Cliente c1 = new Cliente();
		Gerente g1 = new Gerente();
		
		guardaObjetos.adicionarObject(cc1);
		guardaObjetos.adicionarObject(cc2);
		guardaObjetos.adicionarObject(c1);
		guardaObjetos.adicionarObject(g1);
		
		System.out.println(guardaObjetos.obtenerObject(0));
		System.out.println(guardaObjetos.obtenerObject(1));
		System.out.println(guardaObjetos.obtenerObject(2));
		System.out.println(guardaObjetos.obtenerObject(3));
		System.out.println(guardaObjetos.obtenerObject(4));
		
		guardaObjetos.mostrarObjetos();
		
	}
	
}
