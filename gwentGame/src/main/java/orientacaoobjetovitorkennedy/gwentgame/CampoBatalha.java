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

    //Mensagem enviada para usuário
    String mensagem = "";

    public ArrayList<Carta> getCartasCampo() {
        return listaCartasCampo;
    }

    public ArrayList<Carta> getContainerCartaEspecial() {
        return containerCartaEspecial;
    }

    public ArrayList<Carta> getContainerCartasCurto() {
        return containerCartasCurto;
    }

    public ArrayList<Carta> getContainerCartasLongo() {
        return containerCartasLongo;
    }

    public ArrayList<Carta> getContainerCartasMedio() {
        return containerCartasMedio;
    }

    public ArrayList<Carta> getContainerDaCarta(int tipo) {
        ArrayList<Carta> containerDaCarta = new ArrayList<>();
        if (tipo == 1) {
            containerDaCarta = getContainerCartasCurto();
        } else if (tipo == 2) {
            containerDaCarta = getContainerCartasMedio();
        } else if (tipo == 3) {
            containerDaCarta = getContainerCartasLongo();
        } else if (tipo == 4) {
            containerDaCarta = getContainerCartaEspecial();
        }

        return containerDaCarta;
    }

// -----------------------------ADICIONA -----------------------------------------
    private void addCartaCurto(Carta card) {
        this.containerCartasCurto.add(card);
        this.listaCartasCampo.add(card);

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
    public Mao adicionaCarta(Carta card, int turnos, Mao mao, int index, Carta whiteCard) {

        int cardTipo = card.getTipo();
        switch (cardTipo) {
            case 1:
                if (containerCartasCurto.size() < maximoCartas) {
                    if (containerCartasCurto.size() < turnos) {
                        addCartaCurto(card);
                        mensagem = ("Carta curta adicionada");
                        mao.retiraMao(index, whiteCard);
                    } else {
                        mensagem = "Você não pode colocar mais cartas neste campo";
                    }
                } else {
                    mensagem = "Container curto cheio";
                }
                break;
            case 2:
                if (containerCartasMedio.size() < maximoCartas) {
                    if (containerCartasMedio.size() < turnos) {
                        addCartaMedio(card);
                        mensagem = ("Carta media adicionada");
                        mao.retiraMao(index, whiteCard);
                    } else {
                        mensagem = "Você não pode colocar mais cartas neste campo";
                    }
                } else {
                    mensagem = ("Container medio cheio");
                }
                break;
            case 3:
                if (containerCartasLongo.size() < maximoCartas) {
                    if (containerCartasLongo.size() < turnos) {
                        addCartaLongo(card);
                        mensagem = ("Carta longa adicionada");
                        mao.retiraMao(index, whiteCard);
                    } else {
                        mensagem = "Você não pode colocar mais carta neste campo";
                    }
                } else {
                    mensagem = ("Container longo cheio");
                }
                break;
            case 4:
                        if (containerCartaEspecial.size() < turnos) {
                        addCartaEspecial(card);
                        mensagem = ("Carta especial adicionada");
                        mao.retiraMao(index, whiteCard);
                    } else {
                        mensagem = "Você não pode colocar mais carta neste campo";
                    }
                
                break;
            case 5:
                    mensagem ="Não é uma carta";
                break;
            default:
                mensagem = ("o tipo da carta não foi reconhecido");
                break;
        }
        return mao;
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
                    mensagem = ("a carta não está no campo");
                }
                break;
            case 2:
                if (containerCartasMedio.contains(card)) {
                    RemoveCartaMedio(card);
                } else {
                    mensagem = ("a carta não está no campo");
                }
                break;
            case 3:
                if (containerCartasLongo.contains(card)) {
                    RemoveCartaLongo(card);
                } else {
                    mensagem = ("a carta não está no campo");
                }
                break;
            case 4:
                if (containerCartaEspecial.contains(card)) {
                    RemoveCartaEspecial(card);
                } else {
                    mensagem = ("a carta não está no campo");
                }
                break;
            default:
                mensagem = ("o tipo da carta não foi reconhecido");
                break;
        }
    }

    //-------------Remove todas as cartas do campo -------------------------------
    public void removeTodasCartasDoCampo() {
        listaCartasCampo.removeAll(listaCartasCampo);
        containerCartasCurto.removeAll(containerCartasCurto);
        containerCartasMedio.removeAll(containerCartasMedio);
        containerCartasLongo.removeAll(containerCartasLongo);
        containerCartaEspecial.removeAll(containerCartaEspecial);
    }
}
