package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "humberto"; //object literal
		//String outro = new String("humberto");
		
		String vazio = " humberto ";
		String nova = vazio.trim();
		System.out.println(vazio.contains("umb"));
		//System.out.println(vazio.isEmpty());
		System.out.println(nova.isEmpty());

		String outra = nome.replace("h", "H");
		String outro= nome.toUpperCase();
		//nome.toUpperCase();
		
		int pos =nome.indexOf("er");
		
		char c = nome.charAt(2);
		
		String sub = nome.substring(1);
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outro);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length();i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
