
package orientacaoobjetovitorkennedy.gwentgame;
import java.util.ArrayList;


public class Mao {
    private int numCartas;
    private ArrayList<Carta> listaCartasMao;
    
    public ArrayList getMao()
    {
        return listaCartasMao;
    }
    
    public int getNumCartas()
    {
        return numCartas;
    }
    
    public Mao()
    {
        this.numCartas = 0;
        listaCartasMao= new ArrayList();
    }
    
    public void adicionaMao(Carta carta)
    {
        listaCartasMao.add(carta);
        numCartas++;
    }
    
    public Carta retiraMao(int i)
    {
        Carta carta;
        carta = listaCartasMao.get(i);
        listaCartasMao.remove(i);
        numCartas--;
        return carta;
    }
    
}