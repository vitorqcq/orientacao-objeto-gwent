package orientacaoobjetovitorkennedy.gwentgame;

import java.util.ArrayList;

public class CampoBatalha {

    private ArrayList<Carta> listaCartasCampo = new ArrayList<>();
    private ArrayList<Carta> containerCartasCurto = new ArrayList<>();
    private ArrayList<Carta> containerCartasMedio = new ArrayList<>();
    private ArrayList<Carta> containerCartasLongo = new ArrayList<>();
    private ArrayList<Carta> containerCartaEspecial = new ArrayList<>();

    //numero máximo de cada container de cartas é 
    private int maximoCartas = 8;

    public ArrayList<Carta> getCartasCampo() {
        return listaCartasCampo;
    }
// -----------------------------ADICIONA -----------------------------------------

    private void addCartaCurto(Carta card) {
        containerCartasCurto.add(card);
        listaCartasCampo.add(card);
        System.out.println("Carta adicionada");
    }

    private void addCartaMedio(Carta card) {
        containerCartasMedio.add(card);
        listaCartasCampo.add(card);
        System.out.println("Carta adicionada");
    }

    private void addCartaLongo(Carta card) {
        containerCartasLongo.add(card);
        listaCartasCampo.add(card);
        System.out.println("Carta adicionada");
    }

    private void addCartaEspecial(Carta card) {
        containerCartaEspecial.add(card);
        listaCartasCampo.add(card);
        System.out.println("Carta adicionada");
    }

    // ---------------------------REMOVE------------------------------------------
    private void RemoveCartaCurto(Carta card) {
        containerCartasCurto.remove(containerCartasCurto.indexOf(card));
        listaCartasCampo.remove(listaCartasCampo.indexOf(card));
        System.out.println("Carta removida");
    }

    private void RemoveCartaMedio(Carta card) {
        containerCartasMedio.remove(containerCartasMedio.indexOf(card));
        listaCartasCampo.remove(listaCartasCampo.indexOf(card));
        System.out.println("Carta removida");
    }

    private void RemoveCartaLongo(Carta card) {
        containerCartasLongo.remove(containerCartasLongo.indexOf(card));
        listaCartasCampo.remove(listaCartasCampo.indexOf(card));
        System.out.println("Carta removida");
    }

    private void RemoveCartaEspecial(Carta card) {
        containerCartaEspecial.remove(containerCartaEspecial.indexOf(card));
        listaCartasCampo.remove(listaCartasCampo.indexOf(card));
        System.out.println("Carta removida");
    }

    // ------------------ método para adicionar ----------------------------------
    public void adicionaCarta(Carta card) {
        int cardTipo = card.getTipo();
        switch (cardTipo) {
            case 1:
                if (containerCartasCurto.size() < maximoCartas) {
                    addCartaCurto(card);
                } else {
                    System.out.println("Container curto cheio");
                }   break;
            case 2:
                if (containerCartasMedio.size() < maximoCartas) {
                    addCartaMedio(card);
                } else {
                    System.out.println("Container medio cheio");
                }   break;
            case 3:
                if (containerCartasLongo.size() < maximoCartas) {
                    addCartaLongo(card);
                } else {
                    System.out.println("Container longo cheio");
                }   break;
            case 4:
                if (containerCartaEspecial.size() < 1) {
                    addCartaEspecial(card);
                } else {
                    System.out.println("Container especial cheio");
                }   break;
            default:
                System.out.println("o tipo da carta não foi reconhecido");
                break;
        }
    }
    // ------------------ FIM método para adicionar ------------------------------

    // ------------------ método para remover ------------------------------------
    public void removeCarta(Carta card) {
        int cardTipo = card.getTipo();
        switch (cardTipo) {
            case 1:
                if (containerCartasCurto.contains(card)) {
                    RemoveCartaCurto(card);
                } else {
                    System.out.println("a carta não está no campo");
                }
                break;
            case 2:
                if (containerCartasMedio.contains(card)) {
                    RemoveCartaMedio(card);
                } else {
                    System.out.println("a carta não está no campo");
                }
                break;
            case 3:
                if (containerCartasLongo.contains(card)) {
                    RemoveCartaLongo(card);
                } else {
                    System.out.println("a carta não está no campo");
                }
                break;
            case 4:
                if (containerCartaEspecial.contains(card)) {
                    RemoveCartaEspecial(card);
                } else {
                    System.out.println("a carta não está no campo");
                }
                break;
            default:
                System.out.println("o tipo da carta não foi reconhecido");
                break;
        }
    }
    //-------------Remove todas as cartas do campo -------------------------------
    public void removeTodasCartasDoCampo(){
        listaCartasCampo.removeAll(listaCartasCampo);
        containerCartasCurto.removeAll(containerCartasCurto);
        containerCartasMedio.removeAll(containerCartasMedio);
        containerCartasLongo.removeAll(containerCartasLongo);
        containerCartaEspecial.removeAll(containerCartaEspecial);
    }
}
