package com.byBank.test;

public class TestMain {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

//		int edad = 19;
//		int edad2 = 20;
//		int edad3 = 21;

		// Quiero agruparlas en una sola referencia

		int[] edades = new int[5]; // Se hace como si se creara un objeto, pero se crea un array

		edades[0] = 29;
		edades[1] = 39;
		edades[2] = 49;
		edades[3] = 59;
		edades[4] = 69;

		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}

		int[] filas = new int[3];
		int[] columnas = new int[3];

		for (int i = 0; i < filas.length; i++) {
			filas[i] = 1;
			System.out.print(filas[i]);
			for (int j = 0; j < columnas.length; j++) {
				columnas[j] = 2;
				System.out.print(columnas[j]);
			}
			System.out.println();
		}

	}

}
