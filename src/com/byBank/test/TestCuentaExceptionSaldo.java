package com.byBank.test;

import com.byBank.modelo.*; //Generaliza tomando todas las clases del paquete

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 230902);
		
		cuenta.depositar(200);
		try {
			cuenta.retirar(2000);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
	
}
