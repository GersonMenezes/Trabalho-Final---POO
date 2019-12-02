package personagens;

import itens.Item;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lourenço
 */

public class SuperHeroi extends Heroi {
	private Map<String, Item> mochila;
	
	public SuperHeroi(String nome, int energia, int defesa, int ataque, int energiaMaxima, int limiteDePeso) {
                super(nome, energia+20, defesa+10, ataque+10,energiaMaxima+100,limiteDePeso+5);
		mochila = new HashMap();
	}

}
