
public class Feiticeiro extends Mago{
	
	private String capa;
	private final String familia = "Silva";
	private int hp = 100;
	
	@Override
	public void atacar() {
		System.out.println("feiticeiro esta atacando");
	}
	
	public void lancarFeitico() {
		
	}
	
	public void receberDano() {
		//familia = "Souza";
		hp -= 10;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}
	
	

}
