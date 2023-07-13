package com.byBank.test;

import com.byBank.modelo.CuentaAhorros;

public class TestString {

	public static void main(String[] args) {
		
		String name = "Alura";
		
		// No utilizado en el mundo real
		//String name2 = new String("Alura"); 
		
		System.out.println("Antes de metodo " + name);
		name = name.replace("A", "a");
		System.out.println("Despues de metodo " + name);
		
		String name2 = "Mario";
		
		name2.replace("o", "a");
		System.out.println(name2);
		
		String nombre = "Josue";
		
		int nombre2 = nombre.indexOf("su");
		
		boolean yes = nombre.contains("u");
		
		System.out.println("Para verificar si contiene el caracter ingresado " + yes);
		
		System.out.println("Para saber en que posicion se encuentra la secuencia " + nombre2);
		
		String prueba = nombre.trim(); //Devuelve la cadena
		
		cout(prueba);
		
		
		for(int i = 0; i < nombre.length();i++) {
		    cout(nombre.charAt(i));
		}
		
		Object cuenta = new CuentaAhorros(900, 300);
		cout(cuenta);
		
		
	}
	public static void cout(Object imprimir) { //Manera de cambiar el metodo System
			System.out.println(imprimir.toString());
		}
}
