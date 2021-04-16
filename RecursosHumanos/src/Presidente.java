
public final class Presidente extends FuncionarioAutenticavel{
	
	private double valorDaCotaDeAcoes;

	@Override
	public double getSalarioReal() {
		return getSalarioBase() + valorDaCotaDeAcoes;
	}

	public double getValorDaCotaDeAcoes() {
		return valorDaCotaDeAcoes;
	}

	public void setValorDaCotaDeAcoes(double valorDaCotaDeAcoes) {
		this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
	}
	

}
