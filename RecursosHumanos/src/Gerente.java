
public class Gerente extends Funcionario, Autenticavel {

	private String area;
	private double bonus;

	@Override
	public double getSalarioReal() {
		return getSalarioBase() + bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	

}
