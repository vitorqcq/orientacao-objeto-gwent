package orientacaoobjetovitorkennedy.gwentgame;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class Jogo {

   
    // OBJETOS GLOBAIS DA CLASSE JOGO --------------------------------------------
    //ArrayLists para guardar as imagens
    ArrayList<ImageIcon> imagensCurto = new ArrayList<>();
    ArrayList<ImageIcon> imagensMedio = new ArrayList<>();
    ArrayList<ImageIcon> imagensLongo = new ArrayList<>();
    ArrayList<ImageIcon> imagensEspeciais = new ArrayList<>();

    //ArrayLists para guardar as cartas do jogo
    ArrayList<Carta> cartasCurtoDoJogo = new ArrayList<>();
    ArrayList<Carta> cartasMedioDoJogo = new ArrayList<>();
    ArrayList<Carta> cartasLongoDoJogo = new ArrayList<>();
    ArrayList<Carta> cartasEspecialDoJogo = new ArrayList<>();
    
    //decks
    Deck deck1 = new Deck();
    Deck deck2 = new Deck();

    //jogadores
    Jogador jogador1 =  new Jogador();
    Jogador jogador2 = new Jogador();
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
            imagensLongo.add(imageicon);
        }
        System.out.println("Cartas de longo alcance carregadas");

        //carregando cartas especiais
        for (int i = 1; i <= 5; i++) {
            iString = String.valueOf(i);
            path = init.concat("especial\\").concat(iString).concat(".png");
            System.out.println("path: " + path);
            ImageIcon imageicon = new ImageIcon(path);
            carta = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
            imageicon.setImage(carta);
            imagensEspeciais.add(imageicon);
        }
        System.out.println("Cartas especiais carregadas");
    }
    // ---------------- FIM CARREGA IMAGENS DAS CARTAS ---------------------------    

// ------------------- CARREGA TODAS AS CARTAS DO JOGOG --------------------------
    // Carrega cartas curta
    private void carregaCartasCurtasJogo() {
        String nome = "";
        String id = "c";
        for (int i = 0; i < imagensCurto.size(); i++) {
            Carta carta = new Carta();
            nome = id.concat(String.valueOf(i+1));
            carta.setId(nome);
            carta.setTipo(1);
            carta.setBackground(imagensCurto.get(i));
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
            nome = id.concat(String.valueOf(i+1));
            carta.setId(nome);
            carta.setTipo(2);
            carta.setBackground(imagensMedio.get(i));
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
            nome = id.concat(String.valueOf(i+1));
            carta.setId(nome);
            carta.setTipo(3);
            carta.setBackground(imagensLongo.get(i));
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
            nome = id.concat(String.valueOf(i+1));
            carta.setId(nome);
            carta.setTipo(4);
            carta.setBackground(imagensEspeciais.get(i));
            carta.setDescricao("");
            cartasEspecialDoJogo.add(carta);
        }
    }
    // ----------- FIM DO CARREGAMENTO DAS CARTAS --------------------------------
    
    // método que chama as funções acima, que carrega todas as cartas, com suas imagens e etc
    private void carregaCartas(){
        carregaImagensCartasJogo(); // carrega imagens
        carregaCartasCurtasJogo(); //carrega cartas curto
        carregaCartasMedioJogo(); //carrega cartas medio
        carregaCartasLongoJogo(); //carrega cartas longo
        carregaCartasEspeciaisJogo(); //carrega cartas especiais
    }
    // ---------------------------------------------------------------------------
    
    //método para montar decks aleatórios com 20 cartas --------------------------
    private Deck montaDeck(){
        ArrayList<Carta> novoDeck = new ArrayList<>();
        Deck deck =  new Deck();
        //cartas curtas
        
        for(int i=0; i<6; i++){          
           Random gerador = new Random();          
           novoDeck.add(cartasCurtoDoJogo.get(gerador.nextInt(26)));        
        }
        
        //cartas medias      
        for(int i=0; i<6; i++){
           Random gerador = new Random();
           novoDeck.add(cartasMedioDoJogo.get(gerador.nextInt(15)));
        }
        
        //cartas longas        
        for(int i=0; i<6; i++){
           Random gerador = new Random();
           novoDeck.add(cartasLongoDoJogo.get(gerador.nextInt(13)));
        }
        
        //cartas especiais        
        for(int i=0; i<5; i++){
           Random posicao = new Random();
           novoDeck.add(posicao.nextInt(5), cartasEspecialDoJogo.get(i));
        }
        
        System.out.println("Deck montado");
        for(int i=0; i<novoDeck.size(); i++){
            System.out.println("posicao no deck: " + i);
            System.out.println("carta: "+ novoDeck.get(i).getId());
        }
        
        deck.setListaCartas(novoDeck);
        return deck;
    }
    // fim do método que monta decks aleatórios ----------------------------------
    
    // metodo para montar jogadores-----------------------------------------------
    private void montaJogadores(){
        ArrayList maoLista1 = new ArrayList<>();
        ArrayList maoLista2 = new ArrayList<>();
        Mao mao1 = new Mao();
        Mao mao2 = new Mao();        
        
        // monta os 2 decks dos jogadores
        deck1=montaDeck();
        deck2=montaDeck();
        
        //coloca os decks para cada jogador
        jogador1.setDeck(deck1);
        jogador2.setDeck(deck2);
        
        // seta os pontos de vida de cada jogador
        jogador1.setHp(20);
        jogador2.setHp(20);
        
        
        //monta lista com as 10 primeias cartas dos decks de cada jogador e remove dos seus decks
        for(int i=0; i<10; i++){
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
    
    public void iniciaJogo(){
        carregaCartas();
        montaJogadores();
    }
}
