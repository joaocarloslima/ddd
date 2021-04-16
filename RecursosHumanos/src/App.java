
public class App {
	public static void main(String[] args) {
		Engenheiro engenheiro = new Engenheiro();
		engenheiro.setNome("Fabiana");
		engenheiro.setCodigo(25001);
		engenheiro.setCrea(1085);
		engenheiro.setDepartamento("Ambiental");
		engenheiro.setSalarioBase(6000);
		System.out.println("Salario do Engenheiro = " + engenheiro.getSalarioReal() );
		
		Gerente gerente = new Gerente();
		gerente.setSenha("abc");
		gerente.setNome("Carlos");
		gerente.setCodigo(25002);
		gerente.setArea("Comercial");
		gerente.setBonus(1000);
		gerente.setSalarioBase(7000);
		System.out.println("Salario do Gerente = " + gerente.getSalarioReal() );
		
		Presidente presidente = new Presidente();
		presidente.setSenha("1234");
		presidente.setNome("Fernanda");
		presidente.setCodigo(25003);
		presidente.setValorDaCotaDeAcoes(5000);
		presidente.setSalarioBase(10000);
		System.out.println("Salario do Presidente = " + presidente.getSalarioReal() );
		
		Vendedor vendedor = new Vendedor();
		Vendedor vendedor3 = new Vendedor();
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.logar(presidente);
		folha.logar(gerente);
		
		folha.registrarFuncionario(engenheiro);
		folha.registrarFuncionario(gerente);
		folha.registrarFuncionario(presidente);
		folha.registrarFuncionario(vendedor);
		folha.registrarFuncionario(vendedor3);
		
		System.out.println("Valor da Folha = " + folha.getPagamentoTotal());
		
	}
}
