package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaSerializacao {

	public static void main(String[] args) throws Exception, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("humberto");
		cliente.setProfissao("dev");
		cliente.setCpf("11111111111");
			
		ContaCorrente  cc = new ContaCorrente(222,444);
		cc.deposita(222.3);
		cc.setTitular(cliente);
		
					
 
		String nome = "Humberto Luis";
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
