package com.byBank.modelo;

/**
 * Crear nuevas instancias de CuentaCorriente y CuentaAhorros
 * 
 * @version 1.0
 * @author angel
 *
 */

public abstract class Cuenta implements Comparable<Cuenta>{

	protected double saldo; // Permite que solo las clases hijas accedan
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	private static int totalCuentas = 0;

	/**
	 * Instancia una cuenta usando agencia y numero
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Cuenta(int agencia, int numero) {

		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia invalida");
		}
		if (numero < 1) {
			throw new IllegalArgumentException("Numero invalido");
		}

		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Nueva cuenta creada");
		totalCuentas++;
	}

	public abstract boolean depositar(double saldoDepositado);

	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error devuelve una
	 * excepcion.
	 * 
	 * @param saldoRetirado
	 * @throws SaldoInsuficienteException
	 */

	public void retirar(double saldoRetirado) throws SaldoInsuficienteException {
		if (saldoRetirado < 0) {
			throw new SaldoInsuficienteException("No se permite saldo negativo " + saldoRetirado);
		}
		if (this.saldo < saldoRetirado) {
			throw new SaldoInsuficienteException(
					"Fondos insuficientes, Saldo: $" + this.saldo + " Intento de retiro: $" + saldoRetirado);
		}
		this.saldo -= saldoRetirado;

	}

	public boolean transferir(double monto, Cuenta myCuenta) {
		if (monto > 0) {
			if (monto <= this.saldo) {
				try {
					this.retirar(monto);
				} catch (SaldoInsuficienteException e) {
					e.printStackTrace();
				}
				myCuenta.depositar(monto);
				return true;
			}
			return false;
		}
		return false;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int nuevaAgencia) {
		this.agencia = nuevaAgencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setTitular(Cliente myTitular) {
		this.titular = myTitular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotalCuentas() {
		return Cuenta.totalCuentas;
	}

	@Override
	public String toString() { // En vez de imprimir la referencia imprime los datos de la cuenta
		String cuenta = "Agencia: " + this.agencia + " Numero: " + this.numero + " Titular: "
				+ this.titular.getNombre();
		return cuenta;
	}

	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		return super.equals(cuenta);
		// otra opcion es:
		// return this.agencia == cuenta.getAgencia() && this.numero ==
		// cuenta.getNumero();
	}
	
	@Override                        //Orden natural o antiguo
	public int compareTo(Cuenta o) { //Ordenamiento de la interfaz Comparable
		//return this.agencia - o.getAgencia(); //otra forma
		//return Double.compare(this.saldo, o.getSaldo());
		return Integer.compare(this.agencia, o.getAgencia());
	}

}
