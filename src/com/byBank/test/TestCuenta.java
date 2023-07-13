package com.byBank.test;

import com.byBank.modelo.CuentaCorriente;
import com.byBank.modelo.CuentaAhorros;

public class TestCuenta {

	public static void main(String[] args) {

		/*
		 * try { //Funciona esta version cuando se crean agencias negativas
		 * CuentaCorriente cc = new CuentaCorriente(-1, 1); CuentaAhorros ca = new
		 * CuentaAhorros(2, 2); }catch(IllegalArgumentException ex) {
		 * ex.printStackTrace();
		 * System.out.println("Algo salio mal al crear las cuentas"); }
		 */

		CuentaCorriente cc = new CuentaCorriente(-1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 2);

		cc.depositar(3000);
		cc.transferir(1000, ca);

		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());

		System.out.println("Agencia: " + cc.getAgencia() + " Numero: " + cc.getNumero());

	}

}
