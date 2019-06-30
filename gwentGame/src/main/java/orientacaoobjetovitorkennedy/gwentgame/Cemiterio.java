package orientacaoobjetovitorkennedy.gwentgame;

import java.util.ArrayList;

public class Cemiterio {
    private ArrayList<Carta> cartasCemiterio = new ArrayList<>();

    public void adicionaCartasCemiterio(Carta carta) {
        cartasCemiterio.add(carta);
    }
    
     public void removeCartasCemiterio(Carta carta) {
        cartasCemiterio.remove(carta);
    }
    

    public ArrayList<Carta> getCartasCemiterio() {
        return cartasCemiterio;
    }
}
