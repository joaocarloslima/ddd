/**
 * 
 * @author joaoc
 * @version 1.0
 */
public class ContaPoupanca extends Conta {
	/**
	 * taxa de rendimento 
	 * retorna uma taxa de rendimento
	 */
	private double taxaDeRendimento;

	public ContaPoupanca(int numeroDaConta, String nomeDoTitular, double saldo, double taxaDeRendimento) {
		super(numeroDaConta, nomeDoTitular, saldo);
		this.taxaDeRendimento = taxaDeRendimento;
	}
	
	public ContaPoupanca() {
	}

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}
	
	
	

}
