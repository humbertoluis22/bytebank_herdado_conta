package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		//Por que então existe o String[] ao 
		//declararmos o método main? Ele 
		//existe para que possamos passar parâmetros a partir 
		//do terminal
		for(int i=0; i < args.length ; i++ ) {
			System.out.println(args[i]);
		}
		
	}

}
