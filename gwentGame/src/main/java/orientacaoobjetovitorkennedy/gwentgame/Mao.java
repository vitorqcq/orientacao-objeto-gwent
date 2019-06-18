
package orientacaoobjetovitorkennedy.gwentgame;
import java.util.ArrayList;


public class Mao {
    private int numCartas;
    private ArrayList<Carta> lista;
    
    public ArrayList getMao()
    {
        return lista;
    }
    
    public int getNumCartas()
    {
        return numCartas;
    }
    
    public Mao()
    {
        this.numCartas = 0;
        lista= new ArrayList();
    }
    
    public void adicionaMao(Carta carta)
    {
        lista.add(carta);
        numCartas++;
    }
    
    public Carta retiraMao(int i)
    {
        Carta carta;
        carta = lista.get(i);
        lista.remove(i);
        numCartas--;
        return carta;
    }
    
}