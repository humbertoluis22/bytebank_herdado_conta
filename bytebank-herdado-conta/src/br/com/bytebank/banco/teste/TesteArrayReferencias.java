package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] referencias = new Conta[5];
		
				
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		referencias[0] = cc1;
		
		ContaPoupanca cc2= new ContaPoupanca(223, 332);
		referencias[1]= cc2;
		
		Cliente cliente = new Cliente();
		//referencias[2] = cliente;
		
		
		ContaPoupanca ref =(ContaPoupanca) referencias[1];
		
		//System.out.println(contas[1].getNumero());
		System.out.println(ref.getNumero());
		
		
		try {
		//System.out.println(referencias[3].getNumero());
		
		
		} catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("deu erro");
		}
		
		
	}

}
