
package orientacaoobjetovitorkennedy.gwentgame;
import java.util.ArrayList;

public class Jogador {
    private Deck deck;
    private Mao mao;
    private Cemiterio cemiterio;
    private int turnos;
    private boolean turno;
    private int hp;
    private CampoBatalha campo;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
  
}
