package com.byBank.test;

import com.byBank.modelo.*;

public class TestSistemaInterno {

		public static void main(String[] args) {
			SistemaInterno sistema = new SistemaInterno();
			Gerente gerente1 = new Gerente();
			Administrador admin = new Administrador();
			
			gerente1.setClave("AluraCursosOnline");
			sistema.autentica(gerente1);
			sistema.autentica(admin);
		}
}
