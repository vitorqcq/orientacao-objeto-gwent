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
   private  ArrayList<ImageIcon> imagensCurto = new ArrayList<>();
   private  ArrayList<ImageIcon> imagensMedio = new ArrayList<>();
   private  ArrayList<ImageIcon> imagensLongo = new ArrayList<>();
   private  ArrayList<ImageIcon> imagensEspeciais = new ArrayList<>();

    //ArrayLists para guardar as cartas do jogo
   private  ArrayList<Carta> cartasCurtoDoJogo = new ArrayList<>();
   private  ArrayList<Carta> cartasMedioDoJogo = new ArrayList<>();
   private  ArrayList<Carta> cartasLongoDoJogo = new ArrayList<>();
   private  ArrayList<Carta> cartasEspecialDoJogo = new ArrayList<>();
    
    //decks
   private  Deck deck1 = new Deck();
   private  Deck deck2 = new Deck();

    //jogadores
    Jogador jogador1 =  new Jogador();
    Jogador jogador2 = new Jogador();
    Jogador jogadorDaVez = new Jogador();
   
    //numero de turnos que se passaram
    int turnos;
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
        for (int i = 1; i <= 5; i++) {
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
        Set<Carta> novoDeckSet =  new HashSet<Carta>();
        Deck deck =  new Deck();
        //cartas curtas
        
        while(novoDeckSet.size()<=6){
           Random gerador = new Random();          
           novoDeckSet.add(cartasCurtoDoJogo.get(gerador.nextInt(26)));   
        }
        //cartas medias      
        while(novoDeckSet.size()<=12){
           Random gerador = new Random();
           novoDeckSet.add(cartasMedioDoJogo.get(gerador.nextInt(15)));
        }
        
        //cartas longas        
        while(novoDeckSet.size()<=18){
           Random gerador = new Random();
           novoDeckSet.add(cartasLongoDoJogo.get(gerador.nextInt(13)));
        }
        
        //cartas especiais        
        while(novoDeckSet.size()<=20){
             Random gerador = new Random();
           novoDeckSet.add(cartasEspecialDoJogo.get(gerador.nextInt(5)));
        }
        
        //CONVERTE O SET EM ARRAYLIST
        novoDeckSet.forEach(novoDeck::add);
        
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
        
         // seta os nomes cada jogador
        jogador1.setNome("Jogador 1");
        jogador2.setNome("Jogador 2");
        
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
    
       
   private void  sorteiaJogador(){
       int num;
       
       Random gerador = new Random();          
       num = gerador.nextInt(2);
       
       if(num ==1){
           jogadorDaVez = jogador1;
           jogador1.setTurno(true);
           jogador1.setTurnos(1);
       }
       else{
           jogadorDaVez =jogador2;
           jogador2.setTurno(true);
           jogador2.setTurnos(1);
       }
           
   }
   public void passaVez(){
       if(jogadorDaVez.getNome() == jogador1.getNome()){
           jogador1.setTurno(false);
           jogador2.setTurno(true);
           jogador2.setTurnos(jogador2.getTurnos()+1);
           jogadorDaVez = jogador2;
           turnos++;
       }
       else if(jogadorDaVez.getNome() == jogador2.getNome()){
           jogador2.setTurno(false);
           jogador1.setTurno(true);
           jogador1.setTurnos(jogador1.getTurnos()+1);
           jogadorDaVez = jogador1;
           turnos++;
       }
   }
      
   
   public void iniciaJogo(){
        carregaCartas();
        montaJogadores();
        sorteiaJogador();
    }
   private void primeiroTurno(){
       
   }
}
