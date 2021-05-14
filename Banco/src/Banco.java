
public class Banco {
	
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaCorrente.setSaldo(1000);
		
		contaCorrente.sacar(50);
		contaCorrente.depositar(150);
		
		contaCorrente.transferir(100, contaPoupanca);
		
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}

}
