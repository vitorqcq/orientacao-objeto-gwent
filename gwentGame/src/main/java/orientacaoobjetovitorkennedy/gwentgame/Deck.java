
package orientacaoobjetovitorkennedy.gwentgame;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Carta> listaCartas = new ArrayList<>();
    
    public void setListaCartas(ArrayList<Carta> deck){
        this.listaCartas = deck;
    }
    public ArrayList<Carta> getDeck(){
        return this.listaCartas;
    }
    
    
}
