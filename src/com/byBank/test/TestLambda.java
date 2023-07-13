package com.byBank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.byBank.modelo.Cliente;
import com.byBank.modelo.Cuenta;
import com.byBank.modelo.CuentaCorriente;

public class TestLambda {

	public static void main(String[] args) {

		List<Cuenta> myLista = new ArrayList<>();

		Cuenta cc0 = new CuentaCorriente(2, 1);
		Cliente c0 = new Cliente();
		c0.setNombre("Josue");
		cc0.setTitular(c0);
		cc0.depositar(2000);

		Cuenta cc1 = new CuentaCorriente(1, 11);
		Cliente c1 = new Cliente();
		c1.setNombre("Nicole");
		cc1.setTitular(c1);
		cc1.depositar(2500);

		Cuenta cc2 = new CuentaCorriente(6, 2);
		Cliente c2 = new Cliente();
		c2.setNombre("Andrea");
		cc2.setTitular(c2);
		cc2.depositar(3000);

		Cuenta cc3 = new CuentaCorriente(67, 3);
		Cliente c3 = new Cliente();
		c3.setNombre("Genesis");
		cc3.setTitular(c3);
		cc3.depositar(3500);

		Cuenta cc4 = new CuentaCorriente(9, 4);
		Cliente c4 = new Cliente();
		c4.setNombre("Aurora");
		cc4.setTitular(c4);
		cc4.depositar(4000);

		Cuenta cc5 = new CuentaCorriente(90, 5);
		Cliente c5 = new Cliente();
		c5.setNombre("Maria");
		cc5.setTitular(c5);
		cc5.depositar(4500);

		Cuenta cc6 = new CuentaCorriente(78, 6);
		Cliente c6 = new Cliente();
		c6.setNombre("Paulina");
		cc6.setTitular(c6);
		cc6.depositar(5000);

		Cuenta cc7 = new CuentaCorriente(79, 7);
		Cliente c7 = new Cliente();
		c7.setNombre("Ana Sof");
		cc7.setTitular(c7);
		cc7.depositar(5500);

		Cuenta cc8 = new CuentaCorriente(1, 8);
		Cliente c8 = new Cliente();
		c8.setNombre("Renata");
		cc8.setTitular(c8);
		cc8.depositar(6000);

		Cuenta cc9 = new CuentaCorriente(5, 9);
		Cliente c9 = new Cliente();
		c9.setNombre("Valentina");
		cc9.setTitular(c9);
		cc9.depositar(6500);

		myLista.add(cc0);
		myLista.add(cc1);
		myLista.add(cc2);
		myLista.add(cc3);
		myLista.add(cc4);
		myLista.add(cc5);
		myLista.add(cc6);
		myLista.add(cc7);
		myLista.add(cc8);
		myLista.add(cc9);

		System.out.println("Before");
		for (Cuenta cuenta : myLista) {
			System.out.println(cuenta);
		}

		myLista.sort((Cuenta o1, Cuenta o2)->
				Integer.compare(o1.getNumero(), o2.getNumero())
			);

		System.out.println("After, compare by number");
		for (Cuenta cuenta : myLista) {
			System.out.println(cuenta);
		}

		myLista.sort((Cuenta o1, Cuenta o2)->
				o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre())
		);

		System.out.println("After, compare by titular");
		for (Cuenta cuenta : myLista) {
			System.out.println(cuenta);
		}
		
		Collections.sort(myLista, (cuenta1, cuenta2)-> 
		Integer.compare(cuenta1.getAgencia(), cuenta2.getAgencia())
		); 
		
		
		System.out.println("After, compare by Collections, natural sort, by agencia");
//		for (Cuenta cuenta : myLista) {
//			System.out.println(cuenta);
//		}
		myLista.forEach((Cuenta cuenta)->{//For each con Lambda
			System.out.println(cuenta);
		});

		Collections.sort(myLista,  (collect1, collect2)-> 
				collect1.getTitular().getNombre().compareTo(collect2.getTitular().getNombre())
		);
		
		System.out.println("After, compare by Collections, sort by titular");
		for (Cuenta cuenta : myLista) {
			System.out.println(cuenta);
		}

	}
}
