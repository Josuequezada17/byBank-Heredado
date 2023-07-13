package com.byBank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void retirar(double saldoRetirado) throws SaldoInsuficienteException {
		double comisionYRetiro = saldoRetirado + 0.2;
		super.retirar(comisionYRetiro);
	}

	@Override
	public boolean depositar(double saldoDepositado) {
		if (saldoDepositado > 0) {
			this.saldo += saldoDepositado;
			return true;
		}
		return false;
	}

	@Override // De la interface tributacion
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
	    return "Cuenta Corriente, " + super.toString();
	}

}
