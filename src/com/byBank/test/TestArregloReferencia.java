package com.byBank.test;

import com.byBank.modelo.Cuenta;
import com.byBank.modelo.CuentaAhorros;
import com.byBank.modelo.CuentaCorriente;

public class TestArregloReferencia {

	public static void main(String[] args) {

		Cuenta[] cuentas = new Cuenta[5];
		CuentaCorriente cc1 = new CuentaCorriente(22, 11);
		
		cuentas[0] = cc1;
		
		// crea instancia de CuentaAhorro
        CuentaAhorros ca2 = new CuentaAhorros(22, 22);
        cuentas[1] = ca2; 

		CuentaCorriente cc2 = new CuentaCorriente(22, 22);
		
		cuentas[1] = cc2;

		System.out.println(cuentas[1].getNumero());

		// alterar el tipo ó realizando el cast
		//Cuenta ref = cuentas[0]  //compila
		CuentaCorriente ref = (CuentaCorriente)cuentas[0];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		

	}

}
