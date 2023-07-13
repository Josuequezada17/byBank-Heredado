package com.byBank.modelo;

public class GuardaCuentas {

	/**
	 * Objeto para guardar muchas cuentas
	 */

	Cuenta[] cuenta = new Cuenta[10];
	
	private static int indice = 0;

	public void adicionar(Cuenta cuenta) {
		if (indice > this.cuenta.length) {
			throw new ArrayIndexOutOfBoundsException("Espacio de arreglo lleno");
		}

		if (indice <= this.cuenta.length) {
			this.cuenta[indice] = cuenta;
			indice++;
		}
	}

	public Cuenta obtenerCuenta(int indice) {
		if (indice > this.cuenta.length) {
			throw new ArrayIndexOutOfBoundsException("Indice mayor al del arreglo");
		}

		return this.cuenta[indice];
	}
	
	public int getCantidadDeElementos() {
        return GuardaCuentas.indice;
    }

}
