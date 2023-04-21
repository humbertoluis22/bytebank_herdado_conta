package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc1= new ContaCorrente(22,444);
//		Conta cc2= new ContaCorrente(22,444);
//		
//		
//		boolean igual = cc1.ehigual(cc2);
//		System.out.println(igual);
		
		// generics <>
		ArrayList <Conta>lista = new ArrayList<Conta>();
		 
		Conta cc= new ContaCorrente(22,444);
		lista.add(cc);
			
		Conta cc2 = new ContaCorrente(33,555);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(33,555);
		boolean existe = lista.contains(cc3);
				
		System.out.println("ja existe: "+ existe);
		
//		for(Conta conta : lista) {
//			if(conta.ehigual(cc3)) {
//				System.out.println("ja tenho essa conta!");
//			}
//		
//		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
