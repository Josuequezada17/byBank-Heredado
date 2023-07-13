package com.byBank.test;

import com.byBank.modelo.Cuenta;
import com.byBank.modelo.CuentaCorriente;
import com.byBank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

	public static void main(String[] args) {
		
		GuardaCuentas gc  = new GuardaCuentas();
		
		Cuenta cc = new CuentaCorriente(1, 1);
		Cuenta cc1 = new CuentaCorriente(1, 2);
		Cuenta cc2 = new CuentaCorriente(1, 3);
		Cuenta cc3 = new CuentaCorriente(1, 4);
		Cuenta cc4 = new CuentaCorriente(1, 5);
		Cuenta cc5 = new CuentaCorriente(1, 6);
		Cuenta cc6 = new CuentaCorriente(1, 7);
		Cuenta cc7 = new CuentaCorriente(1, 8);
		
		try {
			gc.adicionar(cc);
			gc.adicionar(cc1);
			gc.adicionar(cc2);
			gc.adicionar(cc3);
			gc.adicionar(cc4);
			gc.adicionar(cc5);
			gc.adicionar(cc6);
			gc.adicionar(cc7);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Espacio insuficiente");
			e.printStackTrace();
		}
		
		System.out.println(gc.obtenerCuenta(7));
		
	}
	
}
