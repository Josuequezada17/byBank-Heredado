package com.byBank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.byBank.modelo.Cuenta;
import com.byBank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		//Tanto List como ArrayList Tienen los mismos metodos, por ello compila uno u otro
		//List<Cuenta> myLista = new LinkedList<Cuenta>(); //Lista doblemente ligada
		ArrayList<Cuenta> myLista = new ArrayList<Cuenta>();
		
		// Referencia    Objeto -> HEAP
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cuenta cc2 = new CuentaCorriente(22, 34);
		Cuenta cc3 = new CuentaCorriente(22, 34);
		
		//Cliente c1 = new Cliente();
		//Gerente g1 = new Gerente();
		
		myLista.add(cc1);
		myLista.add(cc2);
		myLista.add(cc3);
		//myLista.add(c1); No son del tipo cuenta
		//myLista.add(g1); Por lo que no compilara
		
		Cuenta obtenerCuenta = (Cuenta) myLista.get(0);
//Cuenta obtenerCuenta = (Cuenta) myLista.get(0);Ya no es necesario castear por el op < >
		
		System.out.println(obtenerCuenta);
		System.out.println("----------------------------------");
		
		// Para cada cuenta en/: lista
		for(Cuenta cuentas : myLista) {
			System.out.println(cuentas);
		}
		
		boolean contiene = myLista.contains(cc2);
		if (contiene) {
			System.out.println("Si, son iguales");
			myLista.remove(cc2);
		} 
		
		for(Cuenta cuentas : myLista) {
			System.out.println(cuentas);
		}
		
	}
	
}
