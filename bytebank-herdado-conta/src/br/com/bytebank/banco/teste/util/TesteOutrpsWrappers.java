package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrpsWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.doubleValue()); //unboxing 
		
		
		Double dRef= 3.2;
		System.out.println(dRef.doubleValue()); // pra pegar o primitivo
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(29);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(23.5f);
	}

}
