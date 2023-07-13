package com.byBank.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TestIterator {

	public static void main(String[] args) {

		System.out.println("Iterator en lista");
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Super Mario");
		nombres.add("Yoshi");
		nombres.add("Donkey Kong");

		Iterator<String> it = nombres.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("Iterator en conjunto");
		
		Set<String> nombres2 =new HashSet<>();
		nombres2.add("Super Mario");
		nombres2.add("Yoshi");
		nombres2.add("Donkey Kong");

		Iterator<String> it2 = nombres2.iterator();

		while(it2.hasNext()) {
		  System.out.println(it2.next());
		}
	}

}
