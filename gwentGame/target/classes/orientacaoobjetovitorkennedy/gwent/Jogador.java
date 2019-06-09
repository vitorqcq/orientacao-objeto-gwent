/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gwent;
import java.util.ArrayList;

/**
 *
 * @author kenne
 */
public class Jogador {

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    private Deck deck;
    private Mao mao;
    private Cemiterio cemiterio;
    private int turnos;
    private boolean turno;
    private int hp;
    private CampoBatalha campo;
    
    
}
