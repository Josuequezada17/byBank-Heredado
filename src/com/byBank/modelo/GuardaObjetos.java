package com.byBank.modelo;

public class GuardaObjetos {
	
	/**
	 * Estructura de datos de tipo array para guardar muchos objetos
	 */

	Object[] object = new Object[10];

	static int indice = 0;

	public void adicionarObject(Object ob) {
		if (indice > this.object.length) {
			throw new ArrayIndexOutOfBoundsException("Espacio de arreglo lleno");
		}

		if (indice <= this.object.length) {
			this.object[indice] = ob;
			indice++;
		}
	}

	public Object obtenerObject(int indice) {
		if (indice > this.object.length) {
			throw new ArrayIndexOutOfBoundsException("Indice mayor al del arreglo");
		}

		return this.object[indice];
	}
	
	public void mostrarObjetos() {
		if(GuardaObjetos.indice == 0 ) {
			throw new ArrayStoreException("Arreglo vacio");
		}
		int i = 0;
		while(i < this.object.length) {
			System.out.println(obtenerObject(i));
			i++;
		}
	}


}
