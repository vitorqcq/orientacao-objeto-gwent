package orientacaoobjetovitorkennedy.gwentgame;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;

public class Jogo {

    // OBJETOS GLOBAIS DA CLASSE JOGO --------------------------------------------
    //ArrayLists para guardar as imagens
    private ArrayList<ImageIcon> imagensCurto = new ArrayList<>();
    private ArrayList<ImageIcon> imagensMedio = new ArrayList<>();
    private ArrayList<ImageIcon> imagensLongo = new ArrayList<>();
    private ArrayList<ImageIcon> imagensEspeciais = new ArrayList<>();
    private ImageIcon whiteCardIcon = new ImageIcon();

    //ArrayLists para guardar as cartas do jogo
    private ArrayList<Carta> cartasCurtoDoJogo = new ArrayList<>();
    private ArrayList<Carta> cartasMedioDoJogo = new ArrayList<>();
    private ArrayList<Carta> cartasLongoDoJogo = new ArrayList<>();
    private ArrayList<Carta> cartasEspecialDoJogo = new ArrayList<>();

    //carta em branco
    public Carta whiteCard = new Carta();

    private ArrayList<Integer> poderCartasCurtas = new ArrayList<Integer>();
    private ArrayList<Integer> poderCartasMedias = new ArrayList<Integer>();
    private ArrayList<Integer> poderCartasLongo = new ArrayList<Integer>();

    //decks
    private Deck deck1 = new Deck();
    private Deck deck2 = new Deck();

    //jogadores
    Jogador jogador1 = new Jogador();
    Jogador jogador2 = new Jogador();
    Jogador jogadorDaVez = new Jogador();
    Jogador oponente = new Jogador();

    //numero de turnos que se passaram
    int turnos;

    //Mensagem enviada para usuário
    String mensagem = "";
    // FIM OBJETOS GLOBAIS DA CLASSE JOGO ---------------------------------------

    // ----------------CARREGA IMAGENS DAS CARTAS --------------------------------
    private void carregaImagensCartasJogo() {
        String iString = "";
        String init = "C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\deck\\";
        String path = "";
        Image carta;
        //carregando cartas de curto alcance
        for (int i = 1; i <= 36; i++) {
            iString = String.valueOf(i);
            path = init.concat("curto\\").concat(iString).concat(".png");
            System.out.println("path: " + path);
            ImageIcon imageicon = new ImageIcon(path);
            carta = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
            imageicon.setImage(carta);
            imageicon.setDescription(path);
            imagensCurto.add(imageicon);
        }
        System.out.println("Cartas de curto alcance carregadas");

        //carregando cartas de medio alcance
        for (int i = 1; i <= 15; i++) {
            iString = String.valueOf(i);
            path = init.concat("medio\\").concat(iString).concat(".png");
            System.out.println("path: " + path);
            ImageIcon imageicon = new ImageIcon(path);
            carta = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
            imageicon.setImage(carta);
            imageicon.setDescription(path);
            imagensMedio.add(imageicon);
        }
        System.out.println("Cartas de medio alcance carregadas");

        //carregando cartas de longo alcance
        for (int i = 1; i <= 13; i++) {
            iString = String.valueOf(i);
            path = init.concat("longo\\").concat(iString).concat(".png");
            ImageIcon imageicon = new ImageIcon(path);
            carta = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
            imageicon.setImage(carta);
            imageicon.setDescription(path);
            imagensLongo.add(imageicon);
        }
        System.out.println("Cartas de longo alcance carregadas");

        //carregando cartas especiais
        for (int i = 1; i <= 4; i++) {
            iString = String.valueOf(i);
            path = init.concat("especial\\").concat(iString).concat(".png");
            System.out.println("path: " + path);
            ImageIcon imageicon = new ImageIcon(path);
            carta = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
            imageicon.setImage(carta);
            imageicon.setDescription(path);
            imagensEspeciais.add(imageicon);
        }
        System.out.println("Cartas especiais carregadas");

        path = init.concat("emptyCard").concat(iString).concat(".png");
        ImageIcon imageicon = new ImageIcon(path);
        carta = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
        imageicon.setImage(carta);
        imageicon.setDescription(path);
        whiteCardIcon = imageicon;
    }
    // ---------------- FIM CARREGA IMAGENS DAS CARTAS ---------------------------    

//---------------------- GERANDO O PODER DAS CATAS --------------------------------
    private void carregaPoder() {
        // cartas curto
        poderCartasCurtas.add(5); // 1
        poderCartasCurtas.add(2); // 2
        poderCartasCurtas.add(5); // 3
        poderCartasCurtas.add(7); // 4
        poderCartasCurtas.add(5); // 5
        poderCartasCurtas.add(6); // 6
        poderCartasCurtas.add(10); // 7
        poderCartasCurtas.add(5); // 8
        poderCartasCurtas.add(4); // 9
        poderCartasCurtas.add(7); // 10
        poderCartasCurtas.add(4); // 11
        poderCartasCurtas.add(5); // 12
        poderCartasCurtas.add(1); // 13
        poderCartasCurtas.add(5); // 14
        poderCartasCurtas.add(1); // 15
        poderCartasCurtas.add(5); // 16
        poderCartasCurtas.add(2); // 17
        poderCartasCurtas.add(10); // 18
        poderCartasCurtas.add(10); // 19
        poderCartasCurtas.add(5); // 20
        poderCartasCurtas.add(5); // 21
        poderCartasCurtas.add(5); // 22
        poderCartasCurtas.add(1); // 23
        poderCartasCurtas.add(15); // 24
        poderCartasCurtas.add(5); // 25
        poderCartasCurtas.add(2); // 26
        poderCartasCurtas.add(6); // 27
        poderCartasCurtas.add(10); // 28
        poderCartasCurtas.add(5); // 29
        poderCartasCurtas.add(10); // 30
        poderCartasCurtas.add(6); // 31
        poderCartasCurtas.add(6); // 32
        poderCartasCurtas.add(15); // 33
        poderCartasCurtas.add(4); // 34
        poderCartasCurtas.add(0); // 35
        poderCartasCurtas.add(4); // 36

        //medias
        poderCartasMedias.add(7); // 1
        poderCartasMedias.add(2); // 2
        poderCartasMedias.add(5); // 3
        poderCartasMedias.add(4); // 4
        poderCartasMedias.add(4); // 5
        poderCartasMedias.add(10); // 6
        poderCartasMedias.add(10); // 7
        poderCartasMedias.add(5); // 8
        poderCartasMedias.add(0); // 9
        poderCartasMedias.add(5); // 10
        poderCartasMedias.add(2); // 11
        poderCartasMedias.add(2); // 12
        poderCartasMedias.add(6); // 13
        poderCartasMedias.add(5); // 14
        poderCartasMedias.add(2); // 15

        //longas
        poderCartasLongo.add(6); // 1
        poderCartasLongo.add(1); // 2
        poderCartasLongo.add(6); // 3
        poderCartasLongo.add(1); // 4
        poderCartasLongo.add(1); // 5
        poderCartasLongo.add(1); // 6
        poderCartasLongo.add(5); // 7
        poderCartasLongo.add(6); // 8
        poderCartasLongo.add(6); // 9
        poderCartasLongo.add(5); // 10
        poderCartasLongo.add(8); // 11
        poderCartasLongo.add(6); // 12
        poderCartasLongo.add(6); // 13       
    }

//---------------------- FIM GERANDO O PODER DAS CATAS --------------------------------
// ------------------- CARREGA TODAS AS CARTAS DO JOGOG --------------------------
    // Carrega cartas curta
    private void carregaCartasCurtasJogo() {
        String nome = "";
        String id = "c";
        for (int i = 0; i < imagensCurto.size(); i++) {
            Carta carta = new Carta();
            nome = id.concat(String.valueOf(i + 1));
            carta.setId(nome);
            carta.setTipo(1);
            carta.setBackground(imagensCurto.get(i));
            carta.setPoder(poderCartasCurtas.get(i));
            carta.setDescricao("");
            cartasCurtoDoJogo.add(carta);
        }
    }

    // Carrega cartas  media
    private void carregaCartasMedioJogo() {
        String nome = "";
        String id = "m";
        for (int i = 0; i < imagensMedio.size(); i++) {
            Carta carta = new Carta();
            nome = id.concat(String.valueOf(i + 1));
            carta.setId(nome);
            carta.setTipo(2);
            carta.setBackground(imagensMedio.get(i));
            carta.setPoder(poderCartasMedias.get(i));
            carta.setDescricao("");
            cartasMedioDoJogo.add(carta);
        }
    }

    // Carrega cartas longo
    private void carregaCartasLongoJogo() {
        String nome = "";
        String id = "l";
        for (int i = 0; i < imagensLongo.size(); i++) {
            Carta carta = new Carta();
            nome = id.concat(String.valueOf(i + 1));
            carta.setId(nome);
            carta.setTipo(3);
            carta.setBackground(imagensLongo.get(i));
            carta.setPoder(poderCartasLongo.get(i));
            carta.setDescricao("");
            cartasLongoDoJogo.add(carta);
        }
    }

    // Carrega cartas especiais
    private void carregaCartasEspeciaisJogo() {
        String nome = "";
        String id = "e";
        for (int i = 0; i < imagensEspeciais.size(); i++) {
            Carta carta = new Carta();
            nome = id.concat(String.valueOf(i + 1));
            carta.setId(nome);
            carta.setTipo(4);
            carta.setBackground(imagensEspeciais.get(i));
            carta.setDescricao("");
            cartasEspecialDoJogo.add(carta);
        }

        // carta em branco
        whiteCard.setId("white");
        whiteCard.setTipo(5);
        whiteCard.setDescricao("");
        whiteCard.setPoder(0);
        whiteCard.setBackground(whiteCardIcon);

    }
    // ----------- FIM DO CARREGAMENTO DAS CARTAS --------------------------------

    // método que chama as funções acima, que carrega todas as cartas, com suas imagens e etc
    private void carregaCartas() {
        carregaPoder();// carrega o pooder das cartas
        carregaImagensCartasJogo(); // carrega imagens
        carregaCartasCurtasJogo(); //carrega cartas curto
        carregaCartasMedioJogo(); //carrega cartas medio
        carregaCartasLongoJogo(); //carrega cartas longo
        carregaCartasEspeciaisJogo(); //carrega cartas especiais

    }
    // ---------------------------------------------------------------------------

    //método para montar decks aleatórios com 20 cartas --------------------------
    private Deck montaDeck() {
        ArrayList<Carta> novoDeck = new ArrayList<>();
        Set<Carta> novoDeckSet = new HashSet<Carta>();
        Deck deck = new Deck();
        //cartas curtas

        while (novoDeckSet.size() != 6) {
            Random gerador = new Random();
            novoDeckSet.add(cartasCurtoDoJogo.get(gerador.nextInt(26)));
        }
        //cartas medias      
        while (novoDeckSet.size() != 12) {
            Random gerador = new Random();
            novoDeckSet.add(cartasMedioDoJogo.get(gerador.nextInt(15)));
        }

        //cartas longas        
        while (novoDeckSet.size() != 18) {
            Random gerador = new Random();
            novoDeckSet.add(cartasLongoDoJogo.get(gerador.nextInt(13)));
        }

        //cartas especiais        
        while (novoDeckSet.size() != 20) {
            Random gerador = new Random();
            novoDeckSet.add(cartasEspecialDoJogo.get(gerador.nextInt(4)));
        }

        //CONVERTE O SET EM ARRAYLIST
        novoDeckSet.forEach(novoDeck::add);

        System.out.println("Deck montado");
        for (int i = 0; i < novoDeck.size(); i++) {
            System.out.println("posicao no deck: " + i);
            System.out.println("carta: " + novoDeck.get(i).getId());
        }

        deck.setListaCartas(novoDeck);
        return deck;
    }
    // fim do método que monta decks aleatórios ----------------------------------

    // metodo para montar jogadores-----------------------------------------------
    private void montaJogadores() {
        ArrayList maoLista1 = new ArrayList<>();
        ArrayList maoLista2 = new ArrayList<>();
        Mao mao1 = new Mao();
        Mao mao2 = new Mao();

        // monta os 2 decks dos jogadores
        deck1 = montaDeck();
        deck2 = montaDeck();

        //coloca os decks para cada jogador
        jogador1.setDeck(deck1);
        jogador2.setDeck(deck2);

        // seta os pontos de vida de cada jogador
        jogador1.setHp(20);
        jogador2.setHp(20);

        // seta os nomes cada jogador
        jogador1.setNome("Jogador 1");
        jogador2.setNome("Jogador 2");

        //monta lista com as 10 primeias cartas dos decks de cada jogador e remove dos seus decks
        for (int i = 0; i < 10; i++) {
            maoLista1.add(deck1.getDeck().get(i));
            deck1.getDeck().remove(i);

            maoLista2.add(deck2.getDeck().get(i));
            deck2.getDeck().remove(i);
        }

        // monta maos com as listas de cartas
        mao1.setMao(maoLista1);
        mao2.setMao(maoLista2);

        //coloca as maos nos jogadores
        jogador1.setMao(mao1);
        jogador2.setMao(mao2);

        // garante que o numero de turnos de cada jogador comece em 0
        jogador1.setTurnos(0);
        jogador2.setTurnos(0);
    }// Fim do metodo para montar jogadores----------------------------------------

    private void sorteiaJogador() {
        int num;

        Random gerador = new Random();
        num = gerador.nextInt(2);

        if (num == 1) {
            jogadorDaVez = jogador1;
            jogador1.setTurno(true);
            jogador1.setTurnos(1);
            oponente = jogador2;
            jogador1.setTurno(false);
        } else {
            jogadorDaVez = jogador2;
            jogador2.setTurno(true);
            jogador2.setTurnos(1);
            oponente = jogador1;
            jogador2.setTurno(false);
        }

    }

    public void passaVez() {
        if (jogadorDaVez.getNome() == jogador1.getNome()) {
            jogador1.setTurno(false);
            jogador2.setTurno(true);
            jogador2.setTurnos(jogador2.getTurnos() + 1);
            jogadorDaVez = jogador2;
            oponente = jogador1;
            turnos++;
            if(jogador2.getMao().getCartasMao().contains(whiteCard)){
                jogador2.mao=sacaCarta(jogador2);
            }
            

        } else if (jogadorDaVez.getNome() == jogador2.getNome()) {
            jogador2.setTurno(false);
            jogador1.setTurno(true);
            jogador1.setTurnos(jogador1.getTurnos() + 1);
            jogadorDaVez = jogador1;
            oponente = jogador2;
            turnos++;
            if(jogador1.getMao().getCartasMao().contains(whiteCard)){
                jogador1.mao=sacaCarta(jogador1);
            }

        }
    }
    
    private Mao sacaCarta(Jogador jogador){
        Mao novaMao =  new Mao();
        for(int i=0; i<jogador.getMao().getCartasMao().size(); i++){
            if(!jogador.getMao().getCartasMao().get(i).equals(whiteCard)){
                novaMao.adicionaMao(jogador.getMao().getCartasMao().get(i));
            }       
        }
        novaMao.adicionaMao(jogador.getDeck().getDeck().get(0));
        jogador.getDeck().getDeck().remove(0);
        int complemento = 10-novaMao.getNumCartas();
        for(int i=0; i<complemento; i++){
          novaMao.adicionaMao(whiteCard);
        }
        
        return novaMao;
    }

    // ------------------------------ CARTAS MAIS FRACAS OPONENTE ------------------------
    // pega a  carta mais fraca caso o jogadorDaVez esteja atacando com uma carta do tipo curto
    private Carta cartaMaisFracaCurtoOponente() {
        Carta maisFraca = new Carta();
        maisFraca.setPoder(9999);

        for (int i = 0; i < oponente.getCampo().getContainerCartasCurto().size(); i++) {
            if (oponente.getCampo().getContainerCartasCurto().get(i).getPoder() < maisFraca.getPoder()) {
                maisFraca = oponente.getCampo().getContainerCartasCurto().get(i);
            }
        }
        return maisFraca;
    }

    // pega a  carta mais fraca caso o jogadorDaVez esteja atacando com uma carta do tipo medio
    private Carta cartaMaisFracaMedioOponente() {
        Carta maisFraca = new Carta();
        maisFraca.setPoder(9999);
        maisFraca = cartaMaisFracaCurtoOponente();

        for (int i = 0; i < oponente.getCampo().getContainerCartasMedio().size(); i++) {
            if (oponente.getCampo().getContainerCartasMedio().get(i).getPoder() < maisFraca.getPoder()) {
                maisFraca = oponente.getCampo().getContainerCartasMedio().get(i);
            }
        }
        return maisFraca;
    }

    // pega a  carta mais fraca caso o jogadorDaVez esteja atacando com uma carta do tipo longo
    private Carta cartaMaisFracaLongoOponente() {
        Carta maisFraca = new Carta();
        maisFraca.setPoder(9999);
        maisFraca = cartaMaisFracaMedioOponente();

        for (int i = 0; i < oponente.getCampo().getContainerCartasLongo().size(); i++) {
            if (oponente.getCampo().getContainerCartasLongo().get(i).getPoder() < maisFraca.getPoder()) {
                maisFraca = oponente.getCampo().getContainerCartasLongo().get(i);
            }
        }
        return maisFraca;
    }

    private Carta getMenorCartaOponente(Carta cartaAtacante) {
        Carta cartaDefensora = new Carta();     // a carta que defenderá será a mais fraca de seu cammpo

        // caso nao haja carta no campo:
        if (oponente.getCampo().getCartasCampo().size() == 0) {
            cartaDefensora.setPoder(0);
            // se houver
        } else {
            if (cartaAtacante.getTipo() == 1) {
                cartaDefensora = cartaMaisFracaCurtoOponente();
            } else if (cartaAtacante.getTipo() == 2) {
                cartaDefensora = cartaMaisFracaMedioOponente();
            } else {
                cartaDefensora = cartaMaisFracaLongoOponente();
            }
        }
        return cartaDefensora;
    }

    // ------------------------------  FIM CARTAS MAIS FRACAS OPONENTE ------------------------
    // ----------------------------------- ATACAR ----------------------------------------
    /* public void atacar(Carta cartaAtacante, Carta cartaDefensora) {
                
        System.out.println("numero de cartas oponente: "+ oponente.getCampo().getCartasCampo().size());
        System.out.println("id carta ataque: "+ cartaAtacante.getId());
        System.out.println("pode ataque: " + cartaAtacante.getPoder());
        System.out.println("id defesa: "+ cartaDefensora.getId());
        System.out.println("pode defesa: " + cartaDefensora.getPoder());
       
        // oponente sem carta para defender
        if (oponente.getCampo().getContainerCartasCurto().size() == 0) {
            oponente.setHp(oponente.getHp() - cartaAtacante.getPoder());
        } // oponente tem carta no campo para defender
        else {
            // comparando poder entre as cartas atacante e defensora
            // se for igual
            if (cartaAtacante.getPoder() == cartaDefensora.getPoder()) {
                //as duas cartas saem do campo
                jogadorDaVez.getCampo().removeCarta(cartaAtacante);
                oponente.getCampo().removeCarta(cartaDefensora);
                // e vao ao cemitério
                jogadorDaVez.getCemiterio().adicionaCartasCemiterio(cartaAtacante);
                oponente.getCemiterio().adicionaCartasCemiterio(cartaAtacante);
            } // se a atacante for mais forte que a defensora
            else if (cartaAtacante.getPoder() > cartaDefensora.getPoder()) {
                // a vida do oponente dimimnui com a diferença do poder das duas
                oponente.setHp(oponente.getHp() - (cartaAtacante.getPoder() - cartaDefensora.getPoder()));
                oponente.getCampo().removeCarta(cartaDefensora);
                oponente.getCemiterio().adicionaCartasCemiterio(cartaDefensora);
            } // se a defensora for mais forte que a atacante (tiro no pé)
            else {
                jogadorDaVez.setHp(jogadorDaVez.getHp() - (cartaDefensora.getPoder()-cartaAtacante.getPoder()));
                jogadorDaVez.getCampo().removeCarta(cartaAtacante);
                jogadorDaVez.getCemiterio().adicionaCartasCemiterio(cartaAtacante);
            }
        }
    }*/
// ----------------------------------- fim ATACAR ----------------------------------------
    public void iniciaJogo() {
        carregaCartas();
        montaJogadores();
        sorteiaJogador();
        turnos++;
    }

}
