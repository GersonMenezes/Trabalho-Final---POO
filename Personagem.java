package personagens;

import java.util.Random;

public abstract class Personagem {
	private String nome;
	private int energia;
        private int defesa;
        private int ataque;

	private static Random dado = new Random();
	
	public Personagem(String nome, int energia,int defesa,int ataque) {
		this.nome = nome;
		this.energia = energia;
                this.defesa = defesa;
                this.ataque = ataque;
	}
	
	public String pegaNome() {
		return nome;
	}
	
	public int pegaEnergia() {
		return energia;
	}
        
        public int pegaDefesa() {
		return defesa;
	}
        
        public int pegaAtaque() {
		return ataque;
	}
        
	public boolean estaMorto() {
		if (energia == 0)
			return true;
		else
		    return false;
	}
	
	public abstract int pegaEnergiaMaxima();
	
	public void incremento() {
		if (energia < pegaEnergiaMaxima())
			energia++;
	}
        
        public void upDefesa() {
		if (defesa < pegaEnergiaMaxima())
			defesa++;
	}
        
        public void upAtaque() {
		if (ataque < pegaEnergiaMaxima())
			ataque++;
	}
	
	public void decremento() {
		if (energia > 0)
			energia--;
		if (energia == 0)
			System.out.println("\n# " + nome + " esta morto!\n");
	}
	
	public int sorte(int valorMaximo) {
		return dado.nextInt(valorMaximo) + 1;
	}
	
 	public void imprimir() {
		System.out.println("#####################");
		System.out.println("# Nome: " + nome);
		System.out.println("# Energia: " + energia);
		System.out.println("#####################");
	}
                
        public void levelUp() {
                defesa++;
                ataque++;
                energia++;
                energia++;
	}
}
