package personagens;

public class Vilao extends Personagem {
	private static final int energiaMaxima = 7;

	public Vilao(String nome, int energia,int defesa,int ataque) {
		super(nome, energia, defesa, ataque);
	}
	
	public int pegaEnergiaMaxima() {
		return energiaMaxima;
	}
	
	public void imprimir() {
		System.out.println("#####################");
		System.out.println("# Dados do Vilao");
		super.imprimir();
	}
}
