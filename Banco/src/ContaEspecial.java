
public class ContaEspecial extends Conta {
	
	private double limiteDeEmprestimo;

	public ContaEspecial(int numeroDaConta, String nomeDoTitular, double saldo, double limiteDeEmprestimo) {
		super(numeroDaConta, nomeDoTitular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public ContaEspecial() {
	}

	public double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	
	
	

}
