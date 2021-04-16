
public class Mago extends Jogador{
	
	private static String capa;

	private String nome;
	private int xp;
	
	public void atacar() {
		System.out.println("mago esta atacando");
	}

	@Override
	public void andar(int distancia) {
		// TODO Auto-generated method stub
		
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}
	
	

}
