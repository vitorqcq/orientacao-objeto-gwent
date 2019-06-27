
package orientacaoobjetovitorkennedy.gwentgame;

import javax.swing.ImageIcon;


public class Carta {
    private String id;
    private int tipo; // 1 = curto , 2 = medio , 3 = lonog , 4 = especial
    int poder;
    private ImageIcon background;
    private String descricao;
    
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    
    public int getPoder(){
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
