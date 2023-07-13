package com.byBank.modelo;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean depositar(double saldoDepositado) {
		if (saldoDepositado > 0) {
			this.saldo += saldoDepositado;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
	    return "Cuenta Ahorros, " + super.toString();
	}

}
