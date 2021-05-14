
public class Conta {
	
	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldo;
	
	public Conta(int numeroDaConta, String nomeDoTitular, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
	
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
