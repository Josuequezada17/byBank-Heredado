package com.byBank.test;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {

  public static void main(String[] args) {

      Integer edadRef = 29; //autoboxinng, es creado un objeto de tipo Integer
      int primitivo = new Integer(21); //que locura!! unboxing

      List<Integer> lista = new ArrayList<>();
      lista.add(edadRef); //ok
      lista.add(primitivo); //autoboxing

      int i1 = lista.get(0);  //unboxing
      Integer i2 = lista.get(1);  //ok

      System.out.println(i1);  //29
      System.out.println(i2); //21
      
      Integer valorRef = Integer.valueOf (33); // hereda la creaci�n al m�todo valueOf
      int valuePri = valorRef.intValue (); // desenvolver, tomando el valor primitivo del objeto contenedor

      System.out.println (valuePri); // 33
      
      Integer iParseado1 = Integer.valueOf("42"); //parseando y devolviendo referencia
      int iParseado2 = Integer.parseInt("44");  //parseando y devolviendo primitivo

      System.out.println(iParseado1); //42
      System.out.println(iParseado2); //44
      
      //Constantes de la clase integer
      
      System.out.println(Integer.MAX_VALUE); // 2^31 - 1
      System.out.println(Integer.MIN_VALUE); //-2^31

      System.out.println(Integer.SIZE); // 32 bits
      System.out.println(Integer.BYTES); //4 Bytes
      
      Integer numeroObjeto = Integer.valueOf(30); //Forma fina de declarar un entero en clase objeto
      
      int primitivo1 = 40;
      
      //primitivo1 = numeroObjeto.intValue(); //Imprime 30 porque se iguala al valor de numeroObjeto
      numeroObjeto = primitivo1; //Imprime 40 porque numeroObjeto se iguala a primitivo
      
      System.out.println(primitivo1);
      System.out.println(numeroObjeto);

  }
}