
package personagens;

import itens.Item;
import java.util.Map;


public class VilaoChefe extends Vilao {
        private Map<String, Item> arma;
	
        public VilaoChefe(String nome, int energia,int defesa,int ataque, Map<String, Item> arma) {
		super(nome, energia, defesa, ataque);
                this.arma= arma;
	}
        

}
