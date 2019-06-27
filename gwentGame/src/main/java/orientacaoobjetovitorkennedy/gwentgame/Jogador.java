
package orientacaoobjetovitorkennedy.gwentgame;
import java.util.ArrayList;

public class Jogador {
    private String nome;
    private Deck deck = new Deck();
    public Mao mao = new Mao();
    private Cemiterio cemiterio =  new Cemiterio();
    private int turnos;
    private boolean turno;
    private int hp;
    private CampoBatalha campo =  new CampoBatalha();

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public CampoBatalha getCampo() {
        return this.campo;
    }

    public void setCampo(CampoBatalha campo) {
        this.campo = campo;
    }

    public Cemiterio getCemiterio() {
        return this.cemiterio;
    }

    public void setCemiterio(Cemiterio cemiterio) {
        this.cemiterio = cemiterio;
    }

    public Deck getDeck() {
        return this.deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Mao getMao() {
        return this.mao;
    }

    public void setMao(Mao mao) {
        this.mao = mao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTurnos() {
        return this.turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public boolean isTurno() {
        return this.turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
  
}
