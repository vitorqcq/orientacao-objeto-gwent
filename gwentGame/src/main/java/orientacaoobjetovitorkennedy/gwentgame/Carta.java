
package orientacaoobjetovitorkennedy.gwentgame;


public class Carta {
    private String id;
    private int tipo; // 1 = curto , 2 = medio , 3 = lonog , 4 = especial
 
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
   
    
    
}
