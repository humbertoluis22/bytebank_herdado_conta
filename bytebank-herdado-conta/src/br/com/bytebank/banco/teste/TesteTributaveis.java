package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args) {
		// full qualified name FQN
		br.com.bytebank.banco.modelo.ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro= new SeguroDeVida();
		
		br.com.bytebank.banco.modelo.CalculadorDeImposto calc = new br.com.bytebank.banco.modelo.CalculadorDeImposto();
		calc.regrista(cc);
		calc.regrista(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}
