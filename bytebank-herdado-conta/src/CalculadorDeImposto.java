
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void regrista(Tributavel t ) {
		double valor = t.getValorImposto();
		this.totalImposto +=valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
