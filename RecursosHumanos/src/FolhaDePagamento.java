
public class FolhaDePagamento {
	
	private double pagamentoTotal = 0;
	
	public double getPagamentoTotal() {
		return pagamentoTotal;
	}

	public void registrarFuncionario(Funcionario funcionario) {
		pagamentoTotal = pagamentoTotal + funcionario.getSalarioReal(); 
	}
	
	public void logar(FuncionarioAutenticavel funcionario) {
		if (funcionario.autenticar("123")) {
			System.out.println("Logado com sucesso");
		}else {
			System.out.println("Erro ao logar");
		}
	}



}
