
public class ProntuarioMedico extends FrequenciaCardiaca {
	
	private double peso;
	private double altura;
	
	public String classificaoImc() {
		double imc = calcularImc();
		
		if (imc < 18.5) return "Magro";
		if (imc >= 18.5 && imc < 25) return "Saudável";
		
		return "Obeso";

	}
	
	public double calcularImc() {
		return peso / Math.pow(altura, 2);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "ProntuarioMedico [\npeso=" + peso + ", \naltura=" + altura + ", \nclassificaoImc=" + classificaoImc()
				+ ", \nImc=" + calcularImc() + ", \nFrequenciaCardiacaMaxima()=" + calcularFrequenciaCardiacaMaxima()
				+ ", \nFrequenciaCardiacaIdeal()=" + calcularFrequenciaCardiacaIdeal() + ", \nNome()="
				+ getNome() + ", \nSobrenome()=" + getSobrenome() + "]";
	}
	
	
	
	
	

}
