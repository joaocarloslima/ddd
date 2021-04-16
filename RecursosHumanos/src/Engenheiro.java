
public class Engenheiro extends Funcionario {

	private String departamento;
	private int crea;
	
	@Override
	public double getSalarioReal() {
		return getSalarioBase() * 1.5;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCrea() {
		return crea;
	}

	public void setCrea(int crea) {
		this.crea = crea;
	}

}
