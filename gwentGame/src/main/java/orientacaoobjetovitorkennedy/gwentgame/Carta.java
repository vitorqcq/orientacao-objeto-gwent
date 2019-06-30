
package orientacaoobjetovitorkennedy.gwentgame;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Carta {
    private String id;
    private int tipo; // 1 = curto , 2 = medio , 3 = lonog , 4 = especial , 5 = em branco
    private double poder;
    private JButton button = new JButton();
    private ImageIcon background;
    private String descricao;
    public boolean efeitoEspecial = false;
    
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
   public ImageIcon getBackgroung(){
       return this.background;
   }
    public void setBackground(ImageIcon bg){
        this.background = bg;
    }
    
    public double getPoder(){
        return this.poder;
    }
    
    public void setPoder(int power){
        this.poder = power;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String description){
        this.descricao = description;
    }
}
