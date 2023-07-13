package com.byBank.test;

import com.byBank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

	public CuentaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean depositar(double saldoDepositado) {
		if(saldoDepositado >= 1) {
		super.saldo = saldoDepositado;
		return true;
		}
		return false;
	}

	
}
