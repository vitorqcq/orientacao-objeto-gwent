package orientacaoobjetovitorkennedy.gwentgame;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//@author vitor and Kennedy
public class gwentInterface extends javax.swing.JFrame {

    Jogo jogo = new Jogo();

//Cartas Player 1
    ArrayList<JButton> cartasP1curto = new ArrayList<>();
    ArrayList<JButton> cartasP1medio = new ArrayList<>();
    ArrayList<JButton> cartasP1longo = new ArrayList<>();
    ArrayList<JButton> cartaP1Esp = new ArrayList<>();

    //Cartas Player 2
    ArrayList<JButton> cartasP2curto = new ArrayList<>();
    ArrayList<JButton> cartasP2medio = new ArrayList<>();
    ArrayList<JButton> cartasP2longo = new ArrayList<>();
    ArrayList<JButton> cartaP2Esp = new ArrayList<>();

    ArrayList<JButton> cartasMao = new ArrayList<>();

    ArrayList<JButton> botoesCampoAtivos = new ArrayList<>();

    Carta cartaDefensora = new Carta();
    Carta cartaAtacante = new Carta();

    //action Listener para o ataque 
    ArrayList<TheAtack> atack = new ArrayList<TheAtack>();

    public gwentInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        jogador2Nome = new javax.swing.JLabel();
        jogador1Nome = new javax.swing.JLabel();
        p1DeckCards = new javax.swing.JLabel();
        p2DeckCards = new javax.swing.JLabel();
        p2longas = new javax.swing.JLabel();
        p2Hp = new javax.swing.JLabel();
        p1Hp = new javax.swing.JLabel();
        p1medias = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        p2c3 = new javax.swing.JButton();
        p2c5 = new javax.swing.JButton();
        p2c4 = new javax.swing.JButton();
        p2c8 = new javax.swing.JButton();
        p2c2 = new javax.swing.JButton();
        p2c6 = new javax.swing.JButton();
        p2c7 = new javax.swing.JButton();
        p2c1 = new javax.swing.JButton();
        p2m1 = new javax.swing.JButton();
        p2m2 = new javax.swing.JButton();
        p2m3 = new javax.swing.JButton();
        p2m4 = new javax.swing.JButton();
        p2m5 = new javax.swing.JButton();
        p2m6 = new javax.swing.JButton();
        p2m7 = new javax.swing.JButton();
        p2m8 = new javax.swing.JButton();
        p2l8 = new javax.swing.JButton();
        p2l7 = new javax.swing.JButton();
        p2l6 = new javax.swing.JButton();
        p2l5 = new javax.swing.JButton();
        p2l4 = new javax.swing.JButton();
        p2l3 = new javax.swing.JButton();
        p2l2 = new javax.swing.JButton();
        p2l1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        p2curtas = new javax.swing.JLabel();
        p1curtas = new javax.swing.JLabel();
        p2medias = new javax.swing.JLabel();
        p1longas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        m2 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m7 = new javax.swing.JButton();
        m8 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m5 = new javax.swing.JButton();
        m10 = new javax.swing.JButton();
        m9 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        p1c2 = new javax.swing.JButton();
        p1c1 = new javax.swing.JButton();
        p1c4 = new javax.swing.JButton();
        p1c3 = new javax.swing.JButton();
        p1c8 = new javax.swing.JButton();
        p1c7 = new javax.swing.JButton();
        p1c6 = new javax.swing.JButton();
        p1c5 = new javax.swing.JButton();
        p1m1 = new javax.swing.JButton();
        p1m2 = new javax.swing.JButton();
        p1m3 = new javax.swing.JButton();
        p1m4 = new javax.swing.JButton();
        p1m5 = new javax.swing.JButton();
        p1m6 = new javax.swing.JButton();
        p1m7 = new javax.swing.JButton();
        p1m8 = new javax.swing.JButton();
        p1l4 = new javax.swing.JButton();
        p1l5 = new javax.swing.JButton();
        p1l3 = new javax.swing.JButton();
        p1l1 = new javax.swing.JButton();
        p1l7 = new javax.swing.JButton();
        p1l8 = new javax.swing.JButton();
        p1l2 = new javax.swing.JButton();
        p1l6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        p1m9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dialogoTurno = new javax.swing.JLabel();
        dialogoJogador = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        especialCard = new javax.swing.JButton();
        p1CemiteryCards = new javax.swing.JLabel();
        p2CemiteryCards = new javax.swing.JLabel();
        passaVez = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mensagem = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel5.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 280, 130));

        jogador2Nome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jogador2Nome.setText("Jogador 2");
        jPanel5.add(jogador2Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 90, -1));

        jogador1Nome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jogador1Nome.setText("Jogador 1");
        jPanel5.add(jogador1Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 770, 100, -1));

        p1DeckCards.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p1DeckCards.setText("20");
        jPanel5.add(p1DeckCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 900, -1, -1));

        p2DeckCards.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p2DeckCards.setText("20");
        jPanel5.add(p2DeckCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 190, -1, -1));

        p2longas.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        p2longas.setText("0");
        jPanel5.add(p2longas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 135, 20, 20));

        p2Hp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p2Hp.setText("20");
        jPanel5.add(p2Hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        p1Hp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p1Hp.setText("20");
        jPanel5.add(p1Hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, -1, -1));

        p1medias.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        p1medias.setText("0");
        jPanel5.add(p1medias, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 20, 20));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1020, 10));
        jPanel9.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1020, 10));

        p2c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c3ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 110, 110));

        p2c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c5ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, 110));

        p2c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c4ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 110, 110));

        p2c8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 110, 110));

        p2c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c2ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, 110));

        p2c6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c6ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 110, 110));

        p2c7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c7ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 110, 110));

        p2c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c1ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 110));

        p2m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m1ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 110));

        p2m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m2ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 110));

        p2m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m3ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, 110));

        p2m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m4ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, 110));

        p2m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m5ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 110, 110));

        p2m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m6ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 110, 110));

        p2m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m7ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 110, 110));

        p2m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 110, 110));

        p2l8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 110, 110));

        p2l7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l7ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 110, 110));

        p2l6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l6ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 110, 110));

        p2l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l5ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 110, 110));

        p2l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l4ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 110, 110));

        p2l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l3ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 110, 110));

        p2l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l2ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 110));

        p2l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l1ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground.png")); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 1023, 340));

        p2curtas.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        p2curtas.setText("0");
        jPanel5.add(p2curtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 20, 20));

        p1curtas.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        p1curtas.setText("0");
        jPanel5.add(p1curtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 20, 20));

        p2medias.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        p2medias.setText("0");
        jPanel5.add(p2medias, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 20, 20));

        p1longas.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        p1longas.setText("0");
        jPanel5.add(p1longas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, 20, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        jPanel4.add(m2);
        m2.setBounds(160, 0, 110, 110);

        m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        jPanel4.add(m1);
        m1.setBounds(40, 0, 110, 110);

        m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });
        jPanel4.add(m4);
        m4.setBounds(400, 0, 110, 110);

        m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });
        jPanel4.add(m3);
        m3.setBounds(280, 0, 110, 110);

        m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m7ActionPerformed(evt);
            }
        });
        jPanel4.add(m7);
        m7.setBounds(760, 0, 110, 110);

        m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m8ActionPerformed(evt);
            }
        });
        jPanel4.add(m8);
        m8.setBounds(880, 0, 110, 110);

        m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });
        jPanel4.add(m6);
        m6.setBounds(640, 0, 110, 110);

        m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });
        jPanel4.add(m5);
        m5.setBounds(520, 0, 110, 110);

        m10.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m10ActionPerformed(evt);
            }
        });
        jPanel4.add(m10);
        m10.setBounds(1120, 0, 110, 110);

        m9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });
        jPanel4.add(m9);
        m9.setBounds(1000, 0, 110, 110);

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\maoBackground.png")); // NOI18N
        jPanel4.add(jLabel17);
        jLabel17.setBounds(0, 0, 1260, 130);

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 840, 1250, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1020, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1020, 10));

        p1c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c2ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 110));

        p1c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c1ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 110));

        p1c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c4ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 110, 110));

        p1c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c3ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 110, 110));

        p1c8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 110, 110));

        p1c7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c7ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 110, 110));

        p1c6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c6ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 110, 110));

        p1c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c5ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 110, 110));

        p1m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m1ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 110));

        p1m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m2ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 110));

        p1m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m3ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, 110));

        p1m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m4ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, 110));

        p1m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m5ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 110, 110));

        p1m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m6ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 110, 110));

        p1m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m7ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 110, 110));

        p1m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 110, 110));

        p1l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l4ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 110, 110));

        p1l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l5ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, 110));

        p1l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l3ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 110, 110));

        p1l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l1ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 110));

        p1l7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l7ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 110, 110));

        p1l8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 110, 110));

        p1l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l2ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, 110));

        p1l6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l6ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 110, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        p1m9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m9ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 110, 110));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 1021, 340));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        dialogoTurno.setBackground(new java.awt.Color(204, 204, 204));
        dialogoTurno.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel3.add(dialogoTurno);
        dialogoTurno.setBounds(160, 20, 30, 20);

        dialogoJogador.setBackground(new java.awt.Color(204, 204, 204));
        dialogoJogador.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel3.add(dialogoJogador);
        dialogoJogador.setBounds(20, 10, 90, 30);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator5);
        jSeparator5.setBounds(120, 0, 10, 110);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Turno:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(150, 0, 70, 25);

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 260, 50));

        especialCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel5.add(especialCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 480, 100, 110));

        p1CemiteryCards.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p1CemiteryCards.setText("0");
        jPanel5.add(p1CemiteryCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 760, -1, -1));

        p2CemiteryCards.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p2CemiteryCards.setText("0");
        jPanel5.add(p2CemiteryCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 330, -1, -1));

        passaVez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        passaVez.setText("Passar a vez");
        passaVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passaVezActionPerformed(evt);
            }
        });
        jPanel5.add(passaVez, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 260, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        mensagem.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        mensagem.setForeground(new java.awt.Color(255, 255, 255));
        mensagem.setText("...");
        jPanel1.add(mensagem);

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 800, 1220, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\gameBackground.png")); // NOI18N
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1910, 990));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        jogo.iniciaJogo();

        jogo.jogador1.getCampo().removeTodasCartasDoCampo();
        jogo.jogador2.getCampo().removeTodasCartasDoCampo();

        atualizaMaoEntreJogadores();

        for (Component component : jPanel4.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(true);
            }
        }

        p2DeckCards.setText(String.valueOf(jogo.oponente.getDeck().getDeck().size()));
        p1DeckCards.setText(String.valueOf(jogo.oponente.getDeck().getDeck().size()));

        dialogoJogador.setText(jogo.jogadorDaVez.getNome());
        dialogoTurno.setText(String.valueOf(jogo.turnos));
        startButton.setEnabled(false);
        startButton.setVisible(false);

        passaVez.setVisible(true);
        passaVez.setEnabled(true);

        mensagem.setText("Vez do " + jogo.jogadorDaVez.getNome());


    }//GEN-LAST:event_startButtonActionPerformed

    private void p1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c8ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(7);
                chamaAtaque(p1c8);
            }

        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c8ActionPerformed

    private void p1m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m8ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(7);
                chamaAtaque(p1m8);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m8ActionPerformed

    private void p1l8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l8ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(7);
                chamaAtaque(p1l8);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l8ActionPerformed

    private void p2l8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l8ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(7);
                chamaAtaque(p2l8);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l8ActionPerformed

    private void p2m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m8ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(7);
                chamaAtaque(p2m8);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m8ActionPerformed

    private void p2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c8ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(7);
                chamaAtaque(p1c8);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c8ActionPerformed

    private void p2l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l1ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(10);
                chamaAtaque(p2l1);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l1ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(0);
        colocaCartaEmCampos(m1, 0);
    }//GEN-LAST:event_m1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (Component component : jPanel2.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(false);
            }
        }

        for (Component component : jPanel9.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(false);
            }
        }

        for (Component component : jPanel4.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(false);
            }
        }

        especialCard.setVisible(false);

        //adicionando botoes ao array de botoes
        // curtas player 1
        cartasP1curto.add(p1c1);
        cartasP1curto.add(p1c2);
        cartasP1curto.add(p1c3);
        cartasP1curto.add(p1c4);
        cartasP1curto.add(p1c5);
        cartasP1curto.add(p1c6);
        cartasP1curto.add(p1c7);
        cartasP1curto.add(p1c8);
        // curtas player 2
        cartasP2curto.add(p2c1);
        cartasP2curto.add(p2c2);
        cartasP2curto.add(p2c3);
        cartasP2curto.add(p2c4);
        cartasP2curto.add(p2c5);
        cartasP2curto.add(p2c6);
        cartasP2curto.add(p2c7);
        cartasP2curto.add(p2c8);

        // medio player 1
        cartasP1medio.add(p1m1);
        cartasP1medio.add(p1m2);
        cartasP1medio.add(p1m3);
        cartasP1medio.add(p1m4);
        cartasP1medio.add(p1m5);
        cartasP1medio.add(p1m6);
        cartasP1medio.add(p1m7);
        cartasP1medio.add(p1m8);
        // medio player 2
        cartasP2medio.add(p2m1);
        cartasP2medio.add(p2m2);
        cartasP2medio.add(p2m3);
        cartasP2medio.add(p2m4);
        cartasP2medio.add(p2m5);
        cartasP2medio.add(p2m6);
        cartasP2medio.add(p2m7);
        cartasP2medio.add(p2m8);

        //longo player 1
        cartasP1longo.add(p1l1);
        cartasP1longo.add(p1l2);
        cartasP1longo.add(p1l3);
        cartasP1longo.add(p1l4);
        cartasP1longo.add(p1l5);
        cartasP1longo.add(p1l6);
        cartasP1longo.add(p1l7);
        cartasP1longo.add(p1l8);
        //longo player 2
        cartasP2longo.add(p2l1);
        cartasP2longo.add(p2l2);
        cartasP2longo.add(p2l3);
        cartasP2longo.add(p2l4);
        cartasP2longo.add(p2l5);
        cartasP2longo.add(p2l6);
        cartasP2longo.add(p2l7);
        cartasP2longo.add(p2l8);

        //especial -- ambos controlam o mesmo local da carta
        cartaP1Esp.add(especialCard);
        cartaP2Esp.add(especialCard);

        //mao
        cartasMao.add(m1);
        cartasMao.add(m2);
        cartasMao.add(m3);
        cartasMao.add(m4);
        cartasMao.add(m5);
        cartasMao.add(m6);
        cartasMao.add(m7);
        cartasMao.add(m8);
        cartasMao.add(m9);
        cartasMao.add(m10);

        p2c1.setVisible(false);

        passaVez.setVisible(false);
        passaVez.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void p1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c2ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(1);
            chamaAtaque(p1c2);
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c2ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(1);
        colocaCartaEmCampos(m2, 1);
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(2);
        colocaCartaEmCampos(m3, 2);
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(3);
        colocaCartaEmCampos(m4, 3);
    }//GEN-LAST:event_m4ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(4);
        colocaCartaEmCampos(m5, 4);
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(5);
        colocaCartaEmCampos(m6, 5);
    }//GEN-LAST:event_m6ActionPerformed

    private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(6);
        colocaCartaEmCampos(m7, 6);
    }//GEN-LAST:event_m7ActionPerformed

    private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(7);
        colocaCartaEmCampos(m8, 7);
    }//GEN-LAST:event_m8ActionPerformed

    private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(8);
        colocaCartaEmCampos(m9, 8);
    }//GEN-LAST:event_m9ActionPerformed

    private void m10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m10ActionPerformed
        // avalia qual carta é se for especial e ativa seu efeito
        ativaEspecial(9);
        colocaCartaEmCampos(m10, 9);
    }//GEN-LAST:event_m10ActionPerformed

    private void p1m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m9ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(8);
                chamaAtaque(p1m9);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m9ActionPerformed

    private void passaVezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passaVezActionPerformed
        //terminaListener();

        jogo.passaVez();
        atualizaMaoEntreJogadores();
        p1DeckCards.setText(String.valueOf(jogo.jogador1.getDeck().getDeck().size()));
        p2DeckCards.setText(String.valueOf(jogo.jogador2.getDeck().getDeck().size()));

        dialogoJogador.setText(jogo.jogadorDaVez.getNome());
        dialogoTurno.setText(String.valueOf(jogo.turnos));
        mensagem.setText("Vez do " + jogo.jogadorDaVez.getNome());

    }//GEN-LAST:event_passaVezActionPerformed

    private void p1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c1ActionPerformed

        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(0);
                chamaAtaque(p1c1);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }

    }//GEN-LAST:event_p1c1ActionPerformed

    private void p1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c3ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(2);
                chamaAtaque(p1c3);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c3ActionPerformed

    private void p1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c4ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(3);
                chamaAtaque(p1c4);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c4ActionPerformed

    private void p1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c5ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(4);
                chamaAtaque(p1c5);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c5ActionPerformed

    private void p1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c6ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(5);
                chamaAtaque(p1c6);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c6ActionPerformed

    private void p1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c7ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(6);
                chamaAtaque(p1c7);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1c7ActionPerformed

    private void p1m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m1ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(0);
                chamaAtaque(p1m1);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m1ActionPerformed

    private void p1m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m2ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(1);
                chamaAtaque(p1m2);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m2ActionPerformed

    private void p1m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m3ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(2);
                chamaAtaque(p1m3);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m3ActionPerformed

    private void p1m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m4ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(3);
                chamaAtaque(p1m4);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m4ActionPerformed

    private void p1m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m5ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(4);
                chamaAtaque(p1m5);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m5ActionPerformed

    private void p1m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m6ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(5);
                chamaAtaque(p1m6);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m6ActionPerformed

    private void p1m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m7ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(6);
                chamaAtaque(p1m7);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1m7ActionPerformed

    private void p1l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l1ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(0);
                chamaAtaque(p1l1);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l1ActionPerformed

    private void p1l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l2ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(1);
                chamaAtaque(p1l2);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l2ActionPerformed

    private void p1l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l3ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(2);
                chamaAtaque(p1l3);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l3ActionPerformed

    private void p1l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l4ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(3);
                chamaAtaque(p1l4);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l4ActionPerformed

    private void p1l5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l5ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(4);
                chamaAtaque(p1l5);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l5ActionPerformed

    private void p1l6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l6ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(5);
                chamaAtaque(p1l6);
            }

        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l6ActionPerformed

    private void p1l7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l7ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador1) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(6);
                chamaAtaque(p1l7);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p1l7ActionPerformed

    private void p2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c1ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(0);
                chamaAtaque(p2c1);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c1ActionPerformed

    private void p2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c2ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(1);
                chamaAtaque(p2c2);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c2ActionPerformed

    private void p2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c3ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(2);
                chamaAtaque(p2c3);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c3ActionPerformed

    private void p2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c4ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(3);
                chamaAtaque(p2c4);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c4ActionPerformed

    private void p2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c5ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(4);
                chamaAtaque(p2c5);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c5ActionPerformed

    private void p2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c6ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(5);
                chamaAtaque(p2c6);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c6ActionPerformed

    private void p2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c7ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasCurto().get(6);
                chamaAtaque(p2c7);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2c7ActionPerformed

    private void p2m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m1ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(0);
                chamaAtaque(p2m1);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m1ActionPerformed

    private void p2m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m2ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(1);
                chamaAtaque(p2l8);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m2ActionPerformed

    private void p2m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m3ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(2);
                chamaAtaque(p2m3);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m3ActionPerformed

    private void p2m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m4ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(3);
                chamaAtaque(p2m4);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m4ActionPerformed

    private void p2m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m5ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(4);
                chamaAtaque(p2m5);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m5ActionPerformed

    private void p2m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m6ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(5);
                chamaAtaque(p2m6);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m6ActionPerformed

    private void p2m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m7ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasMedio().get(6);
                chamaAtaque(p2m7);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2m7ActionPerformed

    private void p2l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l2ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(1);
                chamaAtaque(p2l2);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l2ActionPerformed

    private void p2l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l3ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(2);
                chamaAtaque(p2l3);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l3ActionPerformed

    private void p2l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l4ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(3);
                chamaAtaque(p2l4);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l4ActionPerformed

    private void p2l5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l5ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(4);
                chamaAtaque(p2l5);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l5ActionPerformed

    private void p2l6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l6ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(5);
                chamaAtaque(p2l6);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l6ActionPerformed

    private void p2l7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l7ActionPerformed
        if (jogo.jogadorDaVez == jogo.jogador2) {
            if (jogo.jogadorDaVez.getTurnos() == 1) {
                mensagem.setText("Não é possível atacar no primeiro turno");
            } else {
                cartaAtacante = jogo.jogadorDaVez.getCampo().getContainerCartasLongo().get(6);
                chamaAtaque(p2l7);
            }
        } else {
            mensagem.setText("Você não pode atacar na vez do outro Jogador");
        }
    }//GEN-LAST:event_p2l7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gwentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gwentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gwentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gwentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gwentInterface().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dialogoJogador;
    private javax.swing.JLabel dialogoTurno;
    private javax.swing.JButton especialCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jogador1Nome;
    private javax.swing.JLabel jogador2Nome;
    private javax.swing.JButton m1;
    private javax.swing.JButton m10;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton m8;
    private javax.swing.JButton m9;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel p1CemiteryCards;
    private javax.swing.JLabel p1DeckCards;
    private javax.swing.JLabel p1Hp;
    private javax.swing.JButton p1c1;
    private javax.swing.JButton p1c2;
    private javax.swing.JButton p1c3;
    private javax.swing.JButton p1c4;
    private javax.swing.JButton p1c5;
    private javax.swing.JButton p1c6;
    private javax.swing.JButton p1c7;
    private javax.swing.JButton p1c8;
    private javax.swing.JLabel p1curtas;
    private javax.swing.JButton p1l1;
    private javax.swing.JButton p1l2;
    private javax.swing.JButton p1l3;
    private javax.swing.JButton p1l4;
    private javax.swing.JButton p1l5;
    private javax.swing.JButton p1l6;
    private javax.swing.JButton p1l7;
    private javax.swing.JButton p1l8;
    private javax.swing.JLabel p1longas;
    private javax.swing.JButton p1m1;
    private javax.swing.JButton p1m2;
    private javax.swing.JButton p1m3;
    private javax.swing.JButton p1m4;
    private javax.swing.JButton p1m5;
    private javax.swing.JButton p1m6;
    private javax.swing.JButton p1m7;
    private javax.swing.JButton p1m8;
    private javax.swing.JButton p1m9;
    private javax.swing.JLabel p1medias;
    private javax.swing.JLabel p2CemiteryCards;
    private javax.swing.JLabel p2DeckCards;
    private javax.swing.JLabel p2Hp;
    private javax.swing.JButton p2c1;
    private javax.swing.JButton p2c2;
    private javax.swing.JButton p2c3;
    private javax.swing.JButton p2c4;
    private javax.swing.JButton p2c5;
    private javax.swing.JButton p2c6;
    private javax.swing.JButton p2c7;
    private javax.swing.JButton p2c8;
    private javax.swing.JLabel p2curtas;
    private javax.swing.JButton p2l1;
    private javax.swing.JButton p2l2;
    private javax.swing.JButton p2l3;
    private javax.swing.JButton p2l4;
    private javax.swing.JButton p2l5;
    private javax.swing.JButton p2l6;
    private javax.swing.JButton p2l7;
    private javax.swing.JButton p2l8;
    private javax.swing.JLabel p2longas;
    private javax.swing.JButton p2m1;
    private javax.swing.JButton p2m2;
    private javax.swing.JButton p2m3;
    private javax.swing.JButton p2m4;
    private javax.swing.JButton p2m5;
    private javax.swing.JButton p2m6;
    private javax.swing.JButton p2m7;
    private javax.swing.JButton p2m8;
    private javax.swing.JLabel p2medias;
    private javax.swing.JButton passaVez;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
private void setNullCard(JButton pictureButton) {
        String init = "C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images";
        String path = init.concat("emptyCard").concat(".png");
        ImageIcon imageicon = new ImageIcon(path);
        Image nullImage = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
        imageicon.setImage(nullImage);
        pictureButton.setIcon((Icon) imageicon);
    }

    private void atualizaMaoEntreJogadores() {

        for (int i = 0; i < cartasMao.size(); i++) {
            if (jogo.jogadorDaVez.getMao().getCartasMao().get(i).getTipo() == 5) {
                cartasMao.get(i).setVisible(false);
                cartasMao.get(i).setEnabled(false);
            } else {
                cartasMao.get(i).setVisible(true);
                cartasMao.get(i).setEnabled(true);
            }
        }
        for (int i = 0; i < cartasMao.size(); i++) {
            cartasMao.get(i).setIcon((Icon) jogo.jogadorDaVez.getMao().getCartasMao().get(i).getBackgroung());
            jogo.jogadorDaVez.getMao().getCartasMao().get(i).setButton(cartasMao.get(i));
        }
    }

    private void atualizaContainers() {
        //atualiza campo curto
        for (int i = 0; i < jogo.jogador1.getCampo().getContainerCartasCurto().size(); i++) {
            //botao recebe a carta
            cartasP1curto.get(i).setIcon((Icon) jogo.jogador1.getCampo().getContainerCartasCurto().get(i).getBackgroung());
            cartasP1curto.get(i).setVisible(true);
            cartasP1curto.get(i).setEnabled(true);
            botoesCampoAtivos.add(cartasP1curto.get(i));

            //carta recebe botao
            jogo.jogador1.getCampo().getContainerCartasCurto().get(i).setButton(cartasP1curto.get(i));
        }
        p1curtas.setText(String.valueOf(jogo.jogador1.getCampo().getContainerCartasCurto().size()));

        for (int i = 0; i < jogo.jogador2.getCampo().getContainerCartasCurto().size(); i++) {
            cartasP2curto.get(i).setIcon((Icon) jogo.jogador2.getCampo().getContainerCartasCurto().get(i).getBackgroung());
            cartasP2curto.get(i).setVisible(true);
            cartasP2curto.get(i).setEnabled(true);
            botoesCampoAtivos.add(cartasP2curto.get(i));

            //carta recebe botao
            jogo.jogador2.getCampo().getContainerCartasCurto().get(i).setButton(cartasP2curto.get(i));
        }
        p2curtas.setText(String.valueOf(jogo.jogador2.getCampo().getContainerCartasCurto().size()));

        //atualiza campo medio
        for (int i = 0; i < jogo.jogador1.getCampo().getContainerCartasMedio().size(); i++) {
            cartasP1medio.get(i).setIcon((Icon) jogo.jogador1.getCampo().getContainerCartasMedio().get(i).getBackgroung());
            cartasP1medio.get(i).setVisible(true);
            cartasP1medio.get(i).setEnabled(true);
            botoesCampoAtivos.add(cartasP1medio.get(i));

            //carta recebe botao
            jogo.jogador1.getCampo().getContainerCartasMedio().get(i).setButton(cartasP1medio.get(i));
        }
        p1medias.setText(String.valueOf(jogo.jogador1.getCampo().getContainerCartasMedio().size()));

        for (int i = 0; i < jogo.jogador2.getCampo().getContainerCartasMedio().size(); i++) {
            cartasP2medio.get(i).setIcon((Icon) jogo.jogador2.getCampo().getContainerCartasMedio().get(i).getBackgroung());
            cartasP2medio.get(i).setVisible(true);
            cartasP2medio.get(i).setEnabled(true);
            botoesCampoAtivos.add(cartasP2medio.get(i));

            //carta recebe botao
            jogo.jogador2.getCampo().getContainerCartasMedio().get(i).setButton(cartasP2medio.get(i));
        }
        p2medias.setText(String.valueOf(jogo.jogador2.getCampo().getContainerCartasMedio().size()));

        //atualiza campo longo
        for (int i = 0; i < jogo.jogador1.getCampo().getContainerCartasLongo().size(); i++) {
            cartasP1longo.get(i).setIcon((Icon) jogo.jogador1.getCampo().getContainerCartasLongo().get(i).getBackgroung());
            cartasP1longo.get(i).setVisible(true);
            cartasP1longo.get(i).setEnabled(true);
            botoesCampoAtivos.add(cartasP1longo.get(i));

            //carta recebe botao
            jogo.jogador1.getCampo().getContainerCartasLongo().get(i).setButton(cartasP1longo.get(i));
        }
        p1longas.setText(String.valueOf(jogo.jogador1.getCampo().getContainerCartasLongo().size()));

        for (int i = 0; i < jogo.jogador2.getCampo().getContainerCartasLongo().size(); i++) {
            cartasP2longo.get(i).setIcon((Icon) jogo.jogador2.getCampo().getContainerCartasLongo().get(i).getBackgroung());
            cartasP2longo.get(i).setVisible(true);
            cartasP2longo.get(i).setEnabled(true);
            botoesCampoAtivos.add(cartasP2longo.get(i));

            //carta recebe botao
            jogo.jogador2.getCampo().getContainerCartasLongo().get(i).setButton(cartasP2longo.get(i));
        }
        p2longas.setText(String.valueOf(jogo.jogador2.getCampo().getContainerCartasLongo().size()));

        //atualiza Especial
        for (int i = 0; i < jogo.jogador1.getCampo().getContainerCartaEspecial().size(); i++) {
            especialCard.setIcon((Icon) jogo.jogador1.getCampo().getContainerCartaEspecial().get(i).getBackgroung());
            especialCard.setVisible(true);
            especialCard.setEnabled(true);
            botoesCampoAtivos.add(especialCard);

            //carta recebe botao
            jogo.jogador1.getCampo().getContainerCartaEspecial().get(i).setButton(cartaP1Esp.get(i));
        }

        for (int i = 0; i < jogo.jogador2.getCampo().getContainerCartaEspecial().size(); i++) {
            especialCard.setIcon((Icon) jogo.jogador2.getCampo().getContainerCartaEspecial().get(i).getBackgroung());
            especialCard.setVisible(true);
            especialCard.setEnabled(true);
            botoesCampoAtivos.add(especialCard);

            //carta recebe botao
            jogo.jogador2.getCampo().getContainerCartaEspecial().get(i).setButton(cartaP2Esp.get(i));
        }

        // cartas que não estao mais em campo devem desaparecer e nao serem mais habilitadas,  então:
        for (int i = 0; i < cartasP1curto.size(); i++) {
            if (!botoesCampoAtivos.contains(cartasP1curto.get(i))) {
                cartasP1curto.get(i).setVisible(false);
                cartasP1curto.get(i).setEnabled(false);
            }
        }
        for (int i = 0; i < cartasP2curto.size(); i++) {
            if (!botoesCampoAtivos.contains(cartasP2curto.get(i))) {
                cartasP2curto.get(i).setVisible(false);
                cartasP2curto.get(i).setEnabled(false);
            }
        }

        for (int i = 0; i < cartasP1medio.size(); i++) {
            if (!botoesCampoAtivos.contains(cartasP1medio.get(i))) {
                cartasP1medio.get(i).setVisible(false);
                cartasP1medio.get(i).setEnabled(false);
            }
        }
        for (int i = 0; i < cartasP2medio.size(); i++) {
            if (!botoesCampoAtivos.contains(cartasP2medio.get(i))) {
                cartasP2medio.get(i).setVisible(false);
                cartasP2medio.get(i).setEnabled(false);
            }
        }

        for (int i = 0; i < cartasP1longo.size(); i++) {
            if (!botoesCampoAtivos.contains(cartasP1longo.get(i))) {
                cartasP1longo.get(i).setVisible(false);
                cartasP1longo.get(i).setEnabled(false);
            }
        }
        for (int i = 0; i < cartasP2longo.size(); i++) {
            if (!botoesCampoAtivos.contains(cartasP2longo.get(i))) {
                cartasP2longo.get(i).setVisible(false);
                cartasP2longo.get(i).setEnabled(false);
            }
        }

        if (!botoesCampoAtivos.contains(especialCard)) {
            especialCard.setEnabled(false);
        }

    }

    //função que atualiza as cartas do campo de acordo com o turno, ou seja, se o jogador pode ou não colocar a carta em campo
    private void colocaCartaEmCampos(JButton button, int i) {
        int turnos = 0;

        // verifica qual é o jogador da vez
        if (jogo.jogadorDaVez.getNome() == "Jogador 1") {
            turnos = jogo.jogador1.getTurnos();
        } else if (jogo.jogadorDaVez.getNome() == "Jogador 2") {
            turnos = jogo.jogador2.getTurnos();
        }

        // caso ele possa colocar a carta em campo (nmr cartas < turnos), coloca -- logica implementada dentro da função chamada, ja atualizando a mao do jogador
        jogo.jogadorDaVez.mao = jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(i), turnos, jogo.jogadorDaVez.getMao(), i, jogo.whiteCard);
        atualizaMaoEntreJogadores();

        // função que atualiza a INTERFACE com as cartas dos containers
        atualizaContainers();

        // atualiza a mensagem ao usuário
        mensagem.setText(jogo.jogadorDaVez.getCampo().mensagem);

    }

    private void ativaEspecial(int i) {
        if (jogo.jogadorDaVez.getMao().getCartasMao().get(i).getTipo() == 4) {
            System.out.println(jogo.jogadorDaVez.getMao().getCartasMao().get(i).getId());
            String id = jogo.jogadorDaVez.getMao().getCartasMao().get(i).getId();

            if (id.equals("e1")) {
               // mudaBGFileira(1);
                for (Carta cartasCampo : jogo.oponente.getCampo().getContainerCartasMedio()) {
                    cartasCampo.setPoder((int) (cartasCampo.getPoder() / 2));
                    cartasCampo.efeitoEspecial = true;
                    System.out.println("caiu em 1");
                }

                for (Carta cartasDeck : jogo.oponente.getDeck().getDeck()) {
                    if (cartasDeck.getTipo() == 2) {
                        cartasDeck.setPoder((int) (cartasDeck.getPoder() / 2));
                        cartasDeck.efeitoEspecial = true;
                        System.out.println("caiu em 2");
                    }

                }

                for (Carta cartasCemiterio : jogo.oponente.getCemiterio().getCartasCemiterio()) {
                    if (cartasCemiterio.getTipo() == 2) {
                        cartasCemiterio.setPoder((int) (cartasCemiterio.getPoder() / 2));
                        cartasCemiterio.efeitoEspecial = true;
                        System.out.println("caiu em 3");
                    }

                }

                for (Carta cartasMao : jogo.oponente.getMao().getCartasMao()) {
                    if (cartasMao.getTipo() == 2) {
                        cartasMao.setPoder((int) (cartasMao.getPoder() / 2));
                        cartasMao.efeitoEspecial = true;
                        System.out.println("caiu em 4");
                    }

                }

            } else if (id.equals("e2")) {
              //  mudaBGFileira(2);
                for (Carta cartasCampo : jogo.oponente.getCampo().getContainerCartasCurto()) {
                    cartasCampo.setPoder((int) (cartasCampo.getPoder() / 2));
                    cartasCampo.efeitoEspecial = true;
                    System.out.println("caiu em 5");
                }

                for (Carta cartasDeck : jogo.oponente.getDeck().getDeck()) {
                    if (cartasDeck.getTipo() == 1) {
                        cartasDeck.setPoder((int) (cartasDeck.getPoder() / 2));
                        cartasDeck.efeitoEspecial = true;
                        System.out.println("caiu em 6");
                    }

                }

                for (Carta cartasCemiterio : jogo.oponente.getCemiterio().getCartasCemiterio()) {
                    if (cartasCemiterio.getTipo() == 1) {
                        cartasCemiterio.setPoder((int) (cartasCemiterio.getPoder() / 2));
                        cartasCemiterio.efeitoEspecial = true;
                        System.out.println("caiu em 7");
                    }

                }

                for (Carta cartasMao : jogo.oponente.getMao().getCartasMao()) {
                    if (cartasMao.getTipo() == 1) {
                        cartasMao.setPoder((int) (cartasMao.getPoder() / 2));
                        cartasMao.efeitoEspecial = true;
                        System.out.println("caiu em 8");
                    }

                }

            } else if (id.equals("e3")) {
               // mudaBGFileira(3);
                for (Carta cartasCampo : jogo.oponente.getCampo().getContainerCartasLongo()) {
                    cartasCampo.setPoder((int) (cartasCampo.getPoder() / 2));
                    cartasCampo.efeitoEspecial = true;
                    System.out.println("caiu em 9");
                }

                for (Carta cartasDeck : jogo.oponente.getDeck().getDeck()) {
                    if (cartasDeck.getTipo() == 3) {
                        cartasDeck.setPoder((int) (cartasDeck.getPoder() / 2));
                        cartasDeck.efeitoEspecial = true;
                        System.out.println("caiu em 10");
                    }

                }

                for (Carta cartasCemiterio : jogo.oponente.getCemiterio().getCartasCemiterio()) {
                    if (cartasCemiterio.getTipo() == 3) {
                        cartasCemiterio.setPoder((int) (cartasCemiterio.getPoder() / 2));
                        cartasCemiterio.efeitoEspecial = true;
                        System.out.println("caiu em 11");
                    }

                }

                for (Carta cartasMao : jogo.oponente.getMao().getCartasMao()) {
                    if (cartasMao.getTipo() == 3) {
                        cartasMao.setPoder((int) (cartasMao.getPoder() / 2));
                        cartasMao.efeitoEspecial = true;
                        System.out.println("caiu em 12");
                    }

                }
            } else if (id.equals("e4")) {
               // mudaBGFileira(4);
                for (Carta cartasCampo : jogo.oponente.getCampo().getCartasCampo()) {
                    if (cartasCampo.efeitoEspecial) {
                        cartasCampo.setPoder((int) (cartasCampo.getPoder() * 2));
                        cartasCampo.efeitoEspecial = false;
                        System.out.println("caiu em 13");
                    }
                }
                for (Carta cartasDeck : jogo.oponente.getDeck().getDeck()) {
                    if (cartasDeck.getTipo() == 3 && cartasDeck.efeitoEspecial) {
                        cartasDeck.setPoder((int) (cartasDeck.getPoder() * 2));
                        cartasDeck.efeitoEspecial = false;
                        System.out.println("caiu em 14");
                    }

                }

                for (Carta cartasCemiterio : jogo.oponente.getCemiterio().getCartasCemiterio()) {
                    if (cartasCemiterio.getTipo() == 3 && cartasCemiterio.efeitoEspecial) {
                        cartasCemiterio.setPoder((int) (cartasCemiterio.getPoder() * 2));
                        cartasCemiterio.efeitoEspecial = false;
                        System.out.println("caiu em 15");
                    }

                }

                for (Carta cartasMao : jogo.oponente.getMao().getCartasMao()) {
                    if (cartasMao.getTipo() == 3 && cartasMao.efeitoEspecial) {
                        cartasMao.setPoder((int) (cartasMao.getPoder() * 2));
                        cartasMao.efeitoEspecial = false;
                        System.out.println("caiu em 16");
                    }

                }
            }
        }
    }

    public void mudaBGFileira(int i) {
        if (i == 1) {
            if (jogo.jogadorDaVez == jogo.jogador1) {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground1.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel2.getHeight(), jLabel2.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel2.setIcon((Icon) fileira);
            } else {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground1.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel3.getHeight(), jLabel3.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel3.setIcon((Icon) fileira);

            }
        } else if (i == 2) {
           if (jogo.jogadorDaVez == jogo.jogador1) {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground2.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel2.getHeight(), jLabel2.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel2.setIcon((Icon) fileira);
            } else {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground2.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel3.getHeight(), jLabel3.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel3.setIcon((Icon) fileira);
            }
        } else if (i == 3) {
                 if (jogo.jogadorDaVez == jogo.jogador1) {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground3.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel2.getHeight(), jLabel2.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel2.setIcon((Icon) fileira);
            } else {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground3.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel3.getHeight(), jLabel3.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel3.setIcon((Icon) fileira);
            }
        } else if (i == 4) {
           if (jogo.jogadorDaVez == jogo.jogador1) {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel2.getHeight(), jLabel2.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel2.setIcon((Icon) fileira);
            } else {
                ImageIcon fileira = new ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground.png");
                Image fil = fileira.getImage().getScaledInstance(jLabel3.getHeight(), jLabel3.getWidth(), Image.SCALE_DEFAULT);
                fileira.setImage(fil);
                jLabel3.setIcon((Icon) fileira);

            }
        }
    }

    // chama a função q faz o ataque efetua um ataque
    private void chamaAtaque(JButton button) {
        // ------ efetuando ajustes para o ataque -------

       

        //caarta defensora recebe tipo 5, para ser "marcada" e ser identificada
        cartaDefensora = jogo.whiteCard;

        System.out.println("Chama Ataque, carta tipo: " + cartaAtacante.getTipo());

        if (jogo.oponente.getCampo().getContainerCartasCurto().size() == 0
                || jogo.oponente.getCampo().getContainerCartasMedio().size() == 0
                || jogo.oponente.getCampo().getContainerCartasLongo().size() == 0) {
            atacar(cartaAtacante, cartaDefensora);
            executaAtaqueInterface();
        } else {
            //--------------------Listener--------------------
            mensagem.setText("Selecione uma carata para atacar");
            iniciaListener();
        }

    }

    private void iniciaListener() {

        TheAtack at = new TheAtack();
        atack.add(at);
        for (int t = 0; t < jogo.oponente.getCampo().getCartasCampo().size(); t++) {
            jogo.oponente.getCampo().getCartasCampo().get(t).getButton().addActionListener(atack.get(atack.size() - 1));
            System.out.println(t);
        }
    }

    private void terminaListener() {
        for (int t = 0; t < jogo.oponente.getCampo().getCartasCampo().size(); t++) {
            jogo.oponente.getCampo().getCartasCampo().get(t).getButton().removeActionListener(atack.get(atack.size() - 1));
            System.out.println(t);
        }
    }

    private void limpaJogo() {
        for (Component component : jPanel2.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(false);
            }
        }

        for (Component component : jPanel9.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(false);
            }
        }

        for (Component component : jPanel4.getComponents()) {
            if (component instanceof JButton) {
                component.setVisible(false);
            }
        }

        especialCard.setVisible(false);
        passaVez.setVisible(false);
        passaVez.setEnabled(false);
    }

    // ----------------------------------- ATACAR ----------------------------------------
    public void atacar(Carta cartaAtacante, Carta cartaDefensora) {

        System.out.println("numero de cartas oponente: " + jogo.oponente.getCampo().getCartasCampo().size());
        System.out.println("id carta ataque: " + cartaAtacante.getId());
        System.out.println("pode ataque: " + cartaAtacante.getPoder());
        System.out.println("id defesa: " + cartaDefensora.getId());
        System.out.println("pode defesa: " + cartaDefensora.getPoder());

        // oponente sem carta para defender
        if (cartaAtacante.getTipo() == 1 && jogo.oponente.getCampo().getContainerCartasCurto().size() == 0) {
            jogo.oponente.setHp((int) (jogo.oponente.getHp() - cartaAtacante.getPoder()));
        } else if ((cartaAtacante.getTipo() == 2 && jogo.oponente.getCampo().getContainerCartasCurto().size() == 0)
                || (cartaAtacante.getTipo() == 2 && jogo.oponente.getCampo().getContainerCartasMedio().size() == 0)) {
            jogo.oponente.setHp((int) (jogo.oponente.getHp() - cartaAtacante.getPoder()));
        } else if ((cartaAtacante.getTipo() == 3 && jogo.oponente.getCampo().getContainerCartasCurto().size() == 0)
                || (cartaAtacante.getTipo() == 3 && jogo.oponente.getCampo().getContainerCartasMedio().size() == 0)
                || (cartaAtacante.getTipo() == 3 && jogo.oponente.getCampo().getContainerCartasLongo().size() == 0)) {
            jogo.oponente.setHp((int) (jogo.oponente.getHp() - cartaAtacante.getPoder()));
        } // oponente tem carta no campo para defender
        else {
            // comparando poder entre as cartas atacante e defensora
            // se for igual
            if (cartaAtacante.getPoder() == cartaDefensora.getPoder()) {
                //as duas cartas saem do campo
                jogo.jogadorDaVez.getCampo().removeCarta(cartaAtacante);
                jogo.oponente.getCampo().removeCarta(cartaDefensora);
                // e vao ao cemitério
                jogo.jogadorDaVez.getCemiterio().adicionaCartasCemiterio(cartaAtacante);
                jogo.oponente.getCemiterio().adicionaCartasCemiterio(cartaAtacante);
            } // se a atacante for mais forte que a defensora
            else if (cartaAtacante.getPoder() > cartaDefensora.getPoder()) {
                // a vida do oponente dimimnui com a diferença do poder das duas
                jogo.oponente.setHp((int) (jogo.oponente.getHp() - (cartaAtacante.getPoder() - cartaDefensora.getPoder())));
                jogo.oponente.getCampo().removeCarta(cartaDefensora);
                jogo.oponente.getCemiterio().adicionaCartasCemiterio(cartaDefensora);
            } // se a defensora for mais forte que a atacante (tiro no pé)
            else {
                jogo.jogadorDaVez.setHp((int) (jogo.jogadorDaVez.getHp() - (cartaDefensora.getPoder() - cartaAtacante.getPoder())));
                jogo.jogadorDaVez.getCampo().removeCarta(cartaAtacante);
                jogo.jogadorDaVez.getCemiterio().adicionaCartasCemiterio(cartaAtacante);
            }
        }
    }

    public void executaAtaqueInterface() {

        mensagem.setText("Carta Selecionada: " + cartaDefensora.getTipo());
        atacar(cartaAtacante, cartaDefensora);

        // atualiza o hp dos jogadores  na interface ao atacar
        p1Hp.setText(String.valueOf(jogo.jogador1.getHp()));
        p2Hp.setText(String.valueOf(jogo.jogador2.getHp()));

        //atualiza o numero de cartas  na interface nos cemiterios ao atacar
        p1CemiteryCards.setText(String.valueOf(jogo.jogador1.getCemiterio().getCartasCemiterio().size()));
        p2CemiteryCards.setText(String.valueOf(jogo.jogador2.getCemiterio().getCartasCemiterio().size()));

        // encerra o listener bra nao bugar
        //terminaListener();
        cartaDefensora.getButton().setVisible(false);
        cartaAtacante.getButton().setVisible(false);

        //arruma a interface das cartas em campo
        limpaJogo();
        passaVez.setVisible(true);
        passaVez.setEnabled(true);
        atualizaMaoEntreJogadores();

        // função que atualiza a INTERFACE com as cartas dos containers
        atualizaContainers();

        // se alguem for com a vida a 0 após o ataque, o jogo acaba e os jogadores são alertados do vencedor
        if (jogo.jogador1.getHp() <= 0 || jogo.jogador2.getHp() <= 0) {
            if (jogo.jogador1.getHp() <= 0) {
                JOptionPane.showMessageDialog(new JFrame(), jogo.jogador2.getNome().concat(" venceu"));
            } else {
                JOptionPane.showMessageDialog(new JFrame(), jogo.jogador1.getNome().concat(" venceu"));
            }

            limpaJogo();
        }
    }

    private class TheAtack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //enquanto a carta defensora ainda nao for selecionada, ou seja , a cartaDefesora for do tipo 5
            while (cartaDefensora == jogo.whiteCard) {
                // espera o actionPerformed de um dos botoes que chamou esse Listener
                for (Carta cartasCampo : jogo.oponente.getCampo().getCartasCampo()) {
                    System.out.println("tentativa de encotrar carta defensora");
                    System.out.println("Tipo atacante:" + cartaAtacante.getTipo());
                    System.out.println("Tipo cartasCampo: " + cartasCampo.getTipo());
                    System.out.println("Tipo cartaDefensora: " + cartaDefensora.getTipo());

                    if (e.getSource().equals(cartasCampo.getButton())) {
                        if (cartaAtacante.getTipo() == 1) {
                            if (cartasCampo.getTipo() == 2 || cartasCampo.getTipo() == 3) {
                                mensagem.setText("A carta atacante é do tipo curta. Selecione uma outra do tipo curta");

                            } else if (cartasCampo.getTipo() == 1) {
                                cartaDefensora = cartasCampo;
                            } else {
                                mensagem.setText("Selecione uma carta válida");
                            }
                        } else if (cartaAtacante.getTipo() == 2) {
                            if (cartasCampo.getTipo() == 3) {
                                mensagem.setText("A carta atacante é do tipo méida. Selecione uma outra dos tipos curta ou média");
                            } else if (cartasCampo.getTipo() == 1 || cartasCampo.getTipo() == 2) {
                                cartaDefensora = cartasCampo;
                            } else {
                                mensagem.setText("Selecione uma carta válida");
                            }
                        } else if (cartaAtacante.getTipo() == 3) {
                            if (cartasCampo.getTipo() == 1 || cartasCampo.getTipo() == 2 || cartasCampo.getTipo() == 3) {
                                cartaDefensora = cartasCampo;
                            } else {
                                mensagem.setText("Selecione uma carta válida");
                            }
                        }
                    }
                }
            }
            executaAtaqueInterface();
        }
    }
}
