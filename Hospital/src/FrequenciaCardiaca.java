
public class FrequenciaCardiaca {
	
	private String nome;
	private String sobrenome;
	private int diaDoNascimento;
	private int mesDoNascimento;
	private int anoDoNascimento;
	
	public int calcularFrequenciaCardiacaMaxima() {
		return 220 - calcularIdade();
	}
	
	public int calcularFrequenciaCardiacaIdeal() {
		return (int) (0.7 * calcularFrequenciaCardiacaMaxima());
	} 
	
	private int calcularIdade() {
		int ano = 2021;
		int mes = 05;
		int dia = 14;
		
		int idade = ano - anoDoNascimento;
		if (mes < mesDoNascimento) idade--;
		if (mes == mesDoNascimento && dia < diaDoNascimento) idade--;		

		return idade;
	}
	
	public FrequenciaCardiaca(String nome, String sobrenome, int diaDoNascimento, int mesDoNascimento,
			int anoDoNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaDoNascimento = diaDoNascimento;
		this.mesDoNascimento = mesDoNascimento;
		this.anoDoNascimento = anoDoNascimento;
	}
	
	public FrequenciaCardiaca() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDiaDoNascimento() {
		return diaDoNascimento;
	}

	public void setDiaDoNascimento(int diaDoNascimento) {
		this.diaDoNascimento = diaDoNascimento;
	}

	public int getMesDoNascimento() {
		return mesDoNascimento;
	}

	public void setMesDoNascimento(int mesDoNascimento) {
		this.mesDoNascimento = mesDoNascimento;
	}

	public int getAnoDoNascimento() {
		return anoDoNascimento;
	}

	public void setAnoDoNascimento(int anoDoNascimento) {
		this.anoDoNascimento = anoDoNascimento;
	}
	
	
	
	
	
}
