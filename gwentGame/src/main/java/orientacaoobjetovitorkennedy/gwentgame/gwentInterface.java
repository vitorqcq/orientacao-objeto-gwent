

package orientacaoobjetovitorkennedy.gwentgame;

import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;



//@author vitor and Kennedy

public class gwentInterface extends javax.swing.JFrame {
    Jogo jogo = new Jogo();
    
//Cartas Player 1
    ArrayList<JButton> cartasP1curto  = new ArrayList<>();
    ArrayList<JButton> cartasP1medio  = new ArrayList<>();
    ArrayList<JButton> cartasP1longo  = new ArrayList<>();
    ArrayList<JButton> cartaP1Esp = new ArrayList<>();
    
    //Cartas Player 2
    ArrayList<JButton> cartasP2curto  = new ArrayList<>();
    ArrayList<JButton> cartasP2medio  = new ArrayList<>();
    ArrayList<JButton> cartasP2longo  = new ArrayList<>();
    ArrayList<JButton> cartaP2Esp = new ArrayList<>();
   
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
        jButton1 = new javax.swing.JButton();
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
        jPanel5.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 230, 80));

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
        jPanel9.setLayout(null);
        jPanel9.add(jSeparator2);
        jSeparator2.setBounds(0, 220, 1020, 10);
        jPanel9.add(jSeparator3);
        jSeparator3.setBounds(0, 110, 1020, 10);

        p2c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c3);
        p2c3.setBounds(280, 220, 110, 110);

        p2c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c5);
        p2c5.setBounds(520, 220, 110, 110);

        p2c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c4);
        p2c4.setBounds(400, 220, 110, 110);

        p2c8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c8);
        p2c8.setBounds(880, 220, 110, 110);

        p2c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c2);
        p2c2.setBounds(160, 220, 110, 110);

        p2c6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c6);
        p2c6.setBounds(640, 220, 110, 110);

        p2c7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c7);
        p2c7.setBounds(760, 220, 110, 110);

        p2c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c1);
        p2c1.setBounds(40, 220, 110, 110);

        p2m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m1);
        p2m1.setBounds(40, 110, 110, 110);

        p2m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m2);
        p2m2.setBounds(160, 110, 110, 110);

        p2m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m3);
        p2m3.setBounds(280, 110, 110, 110);

        p2m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m4);
        p2m4.setBounds(400, 110, 110, 110);

        p2m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m5);
        p2m5.setBounds(520, 110, 110, 110);

        p2m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m6);
        p2m6.setBounds(640, 110, 110, 110);

        p2m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m7);
        p2m7.setBounds(760, 110, 110, 110);

        p2m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m8);
        p2m8.setBounds(880, 110, 110, 110);

        p2l8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l8);
        p2l8.setBounds(880, 0, 110, 110);

        p2l7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l7);
        p2l7.setBounds(760, 0, 110, 110);

        p2l6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l6);
        p2l6.setBounds(640, 0, 110, 110);

        p2l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l5);
        p2l5.setBounds(520, 0, 110, 110);

        p2l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l4);
        p2l4.setBounds(400, 0, 110, 110);

        p2l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l3);
        p2l3.setBounds(280, 0, 110, 110);

        p2l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l2);
        p2l2.setBounds(160, 0, 110, 110);

        p2l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l1ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l1);
        p2l1.setBounds(40, 0, 110, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground.png")); // NOI18N
        jPanel9.add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 340);

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 1023, 340));

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
        jLabel17.setBounds(0, 0, 1250, 140);

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 820, 1250, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 110, 1020, 10);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(0, 220, 1020, 10);

        p1c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c2ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c2);
        p1c2.setBounds(160, 0, 110, 110);

        p1c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c1);
        p1c1.setBounds(40, 0, 110, 110);

        p1c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c4);
        p1c4.setBounds(400, 0, 110, 110);

        p1c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c3);
        p1c3.setBounds(280, 0, 110, 110);

        p1c8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c8);
        p1c8.setBounds(880, 0, 110, 110);

        p1c7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c7);
        p1c7.setBounds(760, 0, 110, 110);

        p1c6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c6);
        p1c6.setBounds(640, 0, 110, 110);

        p1c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c5);
        p1c5.setBounds(520, 0, 110, 110);

        p1m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m1);
        p1m1.setBounds(40, 110, 110, 110);

        p1m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m2);
        p1m2.setBounds(160, 110, 110, 110);

        p1m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m3);
        p1m3.setBounds(280, 110, 110, 110);

        p1m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m4);
        p1m4.setBounds(400, 110, 110, 110);

        p1m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m5);
        p1m5.setBounds(520, 110, 110, 110);

        p1m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m6);
        p1m6.setBounds(640, 110, 110, 110);

        p1m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m7);
        p1m7.setBounds(760, 110, 110, 110);

        p1m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m8);
        p1m8.setBounds(880, 110, 110, 110);

        p1l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l4);
        p1l4.setBounds(400, 220, 110, 110);

        p1l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l5);
        p1l5.setBounds(520, 220, 110, 110);

        p1l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l3);
        p1l3.setBounds(280, 220, 110, 110);

        p1l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l1);
        p1l1.setBounds(40, 220, 110, 110);

        p1l7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l7);
        p1l7.setBounds(760, 220, 110, 110);

        p1l8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l8);
        p1l8.setBounds(880, 220, 110, 110);

        p1l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l2);
        p1l2.setBounds(160, 220, 110, 110);

        p1l6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l6);
        p1l6.setBounds(640, 220, 110, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\fileiraBackground.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1030, 340);

        p1m9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m9ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m9);
        p1m9.setBounds(880, 110, 110, 110);

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 1021, 340));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        dialogoTurno.setBackground(new java.awt.Color(204, 204, 204));
        dialogoTurno.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel3.add(dialogoTurno);
        dialogoTurno.setBounds(150, 30, 80, 60);

        dialogoJogador.setBackground(new java.awt.Color(204, 204, 204));
        dialogoJogador.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel3.add(dialogoJogador);
        dialogoJogador.setBounds(10, 10, 100, 90);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator5);
        jSeparator5.setBounds(120, 0, 10, 110);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Turno:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(150, 0, 70, 25);

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 260, 110));

        especialCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel5.add(especialCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 480, 100, 110));

        p1CemiteryCards.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p1CemiteryCards.setText("0");
        jPanel5.add(p1CemiteryCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 760, -1, -1));

        p2CemiteryCards.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        p2CemiteryCards.setText("0");
        jPanel5.add(p2CemiteryCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 330, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

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
        
        for (Component component : jPanel4.getComponents()){
            if(component instanceof JButton){
                component.setVisible(true);
            }            
        }
        
        dialogoJogador.setText(jogo.jogadorDaVez.getNome());
        //startButton.setEnabled(false);
        //startButton.setVisible(false);
        
        
        

        
        
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void p1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1c8ActionPerformed

    private void p1m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1m8ActionPerformed

    private void p1l8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1l8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1l8ActionPerformed

    private void p2l8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2l8ActionPerformed

    private void p2m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2m8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2m8ActionPerformed

    private void p2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2c8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2c8ActionPerformed

    private void p2l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2l1ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        setNullCard(m1);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(0));        
        atualizaCampos();
    }//GEN-LAST:event_m1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (Component component : jPanel2.getComponents()){
            if(component instanceof JButton){
                component.setVisible(false);
            }            
        }
        
        for (Component component : jPanel9.getComponents()){
            if(component instanceof JButton){
                component.setVisible(false);
            }            
        }
        
        for (Component component : jPanel4.getComponents()){
            if(component instanceof JButton){
                component.setVisible(false);
            }            
        }
       
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
       
        
        p2c1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void p1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1c2ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        setNullCard(m2);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(1));        
        atualizaCampos();
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        setNullCard(m3);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(2));        
        atualizaCampos();
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        setNullCard(m4);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(3));        
        atualizaCampos();
    }//GEN-LAST:event_m4ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        setNullCard(m5);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(4));        
        atualizaCampos();
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        setNullCard(m6);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(5));        
        atualizaCampos();
    }//GEN-LAST:event_m6ActionPerformed

    private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
        setNullCard(m7);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(6));        
        atualizaCampos();
    }//GEN-LAST:event_m7ActionPerformed

    private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
        setNullCard(m8);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(7));        
        atualizaCampos();
    }//GEN-LAST:event_m8ActionPerformed

    private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
        setNullCard(m9);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(8));        
        atualizaCampos();
    }//GEN-LAST:event_m9ActionPerformed

    private void m10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m10ActionPerformed
        setNullCard(m10);
        jogo.jogadorDaVez.getCampo().adicionaCarta(jogo.jogadorDaVez.getMao().getCartasMao().get(9));        
        atualizaCampos();
    }//GEN-LAST:event_m10ActionPerformed

    private void p1m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1m9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1m9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jogo.passaVez();
        atualizaMaoEntreJogadores();
        dialogoJogador.setText(jogo.jogadorDaVez.getNome());
        dialogoTurno.setText(String.valueOf(jogo.turnos));
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
private void setNullCard(JButton pictureButton){
        String init= "C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images";
        String path = init.concat("emptyCard").concat(".png");
        ImageIcon imageicon = new ImageIcon(path);
        Image nullImage = imageicon.getImage().getScaledInstance(imageicon.getIconHeight(), imageicon.getIconWidth(), Image.SCALE_DEFAULT);
        imageicon.setImage(nullImage);
        pictureButton.setIcon((Icon) imageicon);
}
private void atualizaMaoEntreJogadores(){
        m1.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(0).getBackgroung());
        m2.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(1).getBackgroung());
        m3.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(2).getBackgroung());
        m4.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(3).getBackgroung());
        m5.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(4).getBackgroung());
        m6.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(5).getBackgroung());;        
        m7.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(6).getBackgroung());
        m8.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(7).getBackgroung());
        m9.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(8).getBackgroung());
        m10.setIcon((Icon)jogo.jogadorDaVez.getMao().getCartasMao().get(9).getBackgroung());
}

private void atualizaCampos(){
        //atualiza campo curto
        for(int i=0; i< jogo.jogador1.getCampo().getContainerCartasCurto().size(); i++){
            cartasP1curto.get(i).setIcon((Icon)jogo.jogador1.getCampo().getContainerCartasCurto().get(i).getBackgroung());
            cartasP1curto.get(i).setVisible(true);
        }        
        p1curtas.setText(String.valueOf(jogo.jogador1.getCampo().getContainerCartasCurto().size()));
    
        for(int i=0; i< jogo.jogador2.getCampo().getContainerCartasCurto().size(); i++){
            cartasP2curto.get(i).setIcon((Icon)jogo.jogador2.getCampo().getContainerCartasCurto().get(i).getBackgroung());
            cartasP2curto.get(i).setVisible(true);
        }
        p2curtas.setText(String.valueOf(jogo.jogador2.getCampo().getContainerCartasCurto().size()));
        
        //atualiza campo medio
        for(int i=0; i< jogo.jogador1.getCampo().getContainerCartasMedio().size(); i++){
            cartasP1medio.get(i).setIcon((Icon)jogo.jogador1.getCampo().getContainerCartasMedio().get(i).getBackgroung());
            cartasP1medio.get(i).setVisible(true);
        }
        p1medias.setText(String.valueOf(jogo.jogador1.getCampo().getContainerCartasMedio().size()));
        
        for(int i=0; i< jogo.jogador2.getCampo().getContainerCartasMedio().size(); i++){
            cartasP2medio.get(i).setIcon((Icon)jogo.jogador2.getCampo().getContainerCartasMedio().get(i).getBackgroung());
            cartasP2medio.get(i).setVisible(true);
        }
        p2medias.setText(String.valueOf(jogo.jogador2.getCampo().getContainerCartasMedio().size()));
        
        //atualiza campo longo
        for(int i=0; i< jogo.jogador1.getCampo().getContainerCartasLongo().size(); i++){
            cartasP1longo.get(i).setIcon((Icon)jogo.jogador1.getCampo().getContainerCartasLongo().get(i).getBackgroung());
            cartasP1longo.get(i).setVisible(true);
        }
        p1longas.setText(String.valueOf(jogo.jogador1.getCampo().getContainerCartasLongo().size()));
        
        for(int i=0; i< jogo.jogador2.getCampo().getContainerCartasLongo().size(); i++){
            cartasP2longo.get(i).setIcon((Icon)jogo.jogador2.getCampo().getContainerCartasLongo().get(i).getBackgroung());
            cartasP2longo.get(i).setVisible(true);
        }
        p2longas.setText(String.valueOf(jogo.jogador2.getCampo().getContainerCartasLongo().size()));
        
        //atualiza Especial
        for(int i=0; i< jogo.jogador1.getCampo().getContainerCartaEspecial().size(); i++){
            especialCard.setIcon((Icon)jogo.jogador1.getCampo().getContainerCartaEspecial().get(i).getBackgroung());
            especialCard.setVisible(true);
        }
        
        for(int i=0; i< jogo.jogador2.getCampo().getContainerCartaEspecial().size(); i++){
            especialCard.setIcon((Icon)jogo.jogador2.getCampo().getContainerCartaEspecial().get(i).getBackgroung());
            especialCard.setVisible(true);
        }
} 
}


