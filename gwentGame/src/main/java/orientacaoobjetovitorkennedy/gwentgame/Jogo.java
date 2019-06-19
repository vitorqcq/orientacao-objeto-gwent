package orientacaoobjetovitorkennedy.gwentgame;

import java.awt.Image;
import java.util.ArrayList;
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
    public void carregaCartas(){
        carregaImagensCartasJogo(); // carrega imagens
        carregaCartasCurtasJogo(); //carrega cartas curto
        carregaCartasMedioJogo(); //carrega cartas medio
        carregaCartasLongoJogo(); //carrega cartas longo
        carregaCartasEspeciaisJogo(); //carrega cartas especiais
    }
    // ---------------------------------------------------------------------------

}
