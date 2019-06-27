
package orientacaoobjetovitorkennedy.gwentgame;
import java.util.ArrayList;


public class Mao {
    private int numCartas;
     private ArrayList<Carta> listaCartasMao = new ArrayList<>();
        
    public ArrayList<Carta> getCartasMao()
    {
        return this.listaCartasMao;
    }
    public void setMao(ArrayList<Carta> cartas){
        this.listaCartasMao =cartas;
    }
    
    public int getNumCartas()
    {
        return numCartas;
    }       
    
    public void adicionaMao(Carta carta)
    {
        listaCartasMao.add(carta);
        numCartas++;
    }
    
    public void retiraMao(Carta card)
    {
        listaCartasMao.remove(card);
        numCartas--;        
    }
    
}