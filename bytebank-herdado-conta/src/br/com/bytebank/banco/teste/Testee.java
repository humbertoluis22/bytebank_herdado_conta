package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.Conta;

public class Testee {
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc= new ContaCorrente(22,444);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(33,555);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta)guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
