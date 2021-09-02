
/**
 * 
 * @author joaoc
 * Classe que representa um conta 
 */
public class Conta {

	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldo;
	
	/**
	 * Método que cria uma conta
	 * @param int numeroDaConta numero da conta do banco 
	 * @param String nomeDoTitular nome do titular
	 * @param double saldo saldo da conta 
	 */
	public Conta(int numeroDaConta, String nomeDoTitular, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
	
	/**
	 * 
	 * @param valorDoSaque
	 */
	public void sacar(double valorDoSaque){
		if (valorDoSaque > 0) saldo -= valorDoSaque;
	}
	
	public void depositar(double valorDoDeposito) {
		if(valorDoDeposito > 0) saldo += valorDoDeposito;
	}
	
	public void transferir(double valor, Conta contaDeDestino) {
		this.sacar(valor);
		contaDeDestino.depositar(valor);
	}

	/**
	 * 
	 * @return int numero da conta
	 */
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
