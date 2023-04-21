package br.com.bytebank.banco.modelo;

import java.io.Serializable;

;

/**
 * classe representa a moldura de uma conta
 * 
 * 
 * @author oem
 *
 */





public abstract class Conta implements Comparable<Conta>,Serializable{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 */
	
	//construtor  ==  rotina de iniciação 
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero ) {
		Conta.total ++;
		//System.out.println("o total de contas é de "+ total);
		this.agencia = agencia;
		this.numero=numero;
		
		//System.out.println("estou criando uma conta!");
	}
	
	
	
	

	//metedo
	// this se refere a conta da referencia q vc invoca 
	public abstract void deposita(double valor) ;

	
	
	/**
	 * valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void   saca (double valor ) throws  SaldoInsuficienteException {
	
		if(this.saldo < valor ) {
			throw new SaldoInsuficienteException("saldo:  "+this.saldo + "valor: "+valor);
			
		}
		
		
		
		this.saldo = this.saldo - valor;
		
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	 public double getSaldo(){
		 return  this.saldo;
	 }
	 
	 
	 
	 public int getNumero() {
		 return this.numero;
	 }
	 
	 public void setNumero(int novoNumero){
		 if (novoNumero <= 0) {
			 System.out.println("não pode valor <=0 ");
			 return;
		 }
		 
		 this.numero = novoNumero;
		 
	 }
	 
	 
	 public int getAgencia() {
		return this.agencia;
	}
	 public void setAgencia(int agencia) {
		 if(agencia <=0 ) {
			 System.out.println("nao pode valores menor ou igual a 0");
			 return;
		 }
		this.agencia = agencia;
	}
	 
	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 
	 public Cliente getTitular() {
		return titular;
	}
	 
	 public static int getTotal() {
		 return Conta.total;
	 }
	 
	 @Override
	 public boolean  equals(Object ref) {
		 
		 Conta contra = (Conta) ref;
		 if(this.agencia != contra.agencia) {
			 return false;
		 }
		 if(this.numero != contra.numero) {
			 return false;
		 }
		 return true;
		 
	 }
	 
	 
	 @Override
	public int compareTo(Conta outra ) {
		
		 return Double.compare(this.saldo, outra.saldo);
	}
	 
	 
	 @Override
	public String toString() {
		return "Numero: "+ this.numero + ", Agencia:  "+ this.agencia + ",saldo: " + this.saldo;
	}
}
