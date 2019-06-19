

package orientacaoobjetovitorkennedy.gwentgame;

import java.util.ArrayList;
import javax.swing.Icon;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Player1Name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton138 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jButton174 = new javax.swing.JButton();
        jButton175 = new javax.swing.JButton();
        jButton176 = new javax.swing.JButton();
        jButton177 = new javax.swing.JButton();
        jButton178 = new javax.swing.JButton();
        jButton179 = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2482, 0, 0, 1296));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Player 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 80, -1));

        Player1Name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Player1Name.setText("Player1");
        getContentPane().add(Player1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 760, 80, -1));

        jLabel4.setText("Descrition 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 110, -1));

        jLabel5.setText("Description 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 780, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("20");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 890, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("20");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("0");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 20, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("10");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("0");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 20, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(null);
        jPanel9.add(jSeparator2);
        jSeparator2.setBounds(0, 220, 1020, 10);
        jPanel9.add(jSeparator3);
        jSeparator3.setBounds(0, 110, 1020, 10);

        p2c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c3);
        p2c3.setBounds(250, 220, 110, 110);

        p2c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c5);
        p2c5.setBounds(490, 220, 110, 110);

        p2c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c4);
        p2c4.setBounds(370, 220, 110, 110);

        p2c8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2c8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2c8);
        p2c8.setBounds(850, 220, 110, 110);

        p2c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c2);
        p2c2.setBounds(130, 220, 110, 110);

        p2c6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c6);
        p2c6.setBounds(610, 220, 110, 110);

        p2c7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c7);
        p2c7.setBounds(730, 220, 110, 110);

        p2c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2c1);
        p2c1.setBounds(10, 220, 110, 110);

        p2m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m1);
        p2m1.setBounds(10, 110, 110, 110);

        p2m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m2);
        p2m2.setBounds(130, 110, 110, 110);

        p2m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m3);
        p2m3.setBounds(250, 110, 110, 110);

        p2m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m4);
        p2m4.setBounds(370, 110, 110, 110);

        p2m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m5);
        p2m5.setBounds(490, 110, 110, 110);

        p2m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m6);
        p2m6.setBounds(610, 110, 110, 110);

        p2m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2m7);
        p2m7.setBounds(730, 110, 110, 110);

        p2m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2m8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2m8);
        p2m8.setBounds(850, 110, 110, 110);

        p2l8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p2l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2l8ActionPerformed(evt);
            }
        });
        jPanel9.add(p2l8);
        p2l8.setBounds(850, 0, 110, 110);

        p2l7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l7);
        p2l7.setBounds(730, 0, 110, 110);

        p2l6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l6);
        p2l6.setBounds(610, 0, 110, 110);

        p2l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l5);
        p2l5.setBounds(490, 0, 110, 110);

        p2l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l4);
        p2l4.setBounds(370, 0, 110, 110);

        p2l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l3);
        p2l3.setBounds(250, 0, 110, 110);

        p2l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l2);
        p2l2.setBounds(130, 0, 110, 110);

        p2l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel9.add(p2l1);
        p2l1.setBounds(10, 0, 110, 110);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 970, 340));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("0");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 20, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("0");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 20, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("0");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 20, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("0");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, 20, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jButton138.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton138);
        jButton138.setBounds(150, 10, 110, 110);

        jButton171.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton171);
        jButton171.setBounds(30, 10, 110, 110);

        jButton172.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton172);
        jButton172.setBounds(390, 10, 110, 110);

        jButton173.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton173);
        jButton173.setBounds(270, 10, 110, 110);

        jButton174.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton174);
        jButton174.setBounds(750, 10, 110, 110);

        jButton175.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton175);
        jButton175.setBounds(870, 10, 110, 110);

        jButton176.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton176);
        jButton176.setBounds(630, 10, 110, 110);

        jButton177.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton177);
        jButton177.setBounds(510, 10, 110, 110);

        jButton178.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton178);
        jButton178.setBounds(1110, 10, 110, 110);

        jButton179.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(jButton179);
        jButton179.setBounds(990, 10, 110, 110);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 810, 1250, 130));

        startButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 230, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 110, 1020, 10);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(0, 220, 1020, 10);

        p1c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c2);
        p1c2.setBounds(130, 0, 110, 110);

        p1c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c1);
        p1c1.setBounds(10, 0, 110, 110);

        p1c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c4);
        p1c4.setBounds(370, 0, 110, 110);

        p1c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c3);
        p1c3.setBounds(250, 0, 110, 110);

        p1c8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1c8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1c8);
        p1c8.setBounds(850, 0, 110, 110);

        p1c7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c7);
        p1c7.setBounds(730, 0, 110, 110);

        p1c6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c6);
        p1c6.setBounds(610, 0, 110, 110);

        p1c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1c5);
        p1c5.setBounds(490, 0, 110, 110);

        p1m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m1);
        p1m1.setBounds(10, 110, 110, 110);

        p1m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m2);
        p1m2.setBounds(130, 110, 110, 110);

        p1m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m3);
        p1m3.setBounds(250, 110, 110, 110);

        p1m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m4);
        p1m4.setBounds(370, 110, 110, 110);

        p1m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m5);
        p1m5.setBounds(490, 110, 110, 110);

        p1m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m6);
        p1m6.setBounds(610, 110, 110, 110);

        p1m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1m7);
        p1m7.setBounds(730, 110, 110, 110);

        p1m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1m8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1m8);
        p1m8.setBounds(850, 110, 110, 110);

        p1l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l4);
        p1l4.setBounds(370, 220, 110, 110);

        p1l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l5);
        p1l5.setBounds(490, 220, 110, 110);

        p1l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l3);
        p1l3.setBounds(250, 220, 110, 110);

        p1l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l1);
        p1l1.setBounds(10, 220, 110, 110);

        p1l7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l7);
        p1l7.setBounds(730, 220, 110, 110);

        p1l8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        p1l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1l8ActionPerformed(evt);
            }
        });
        jPanel2.add(p1l8);
        p1l8.setBounds(850, 220, 110, 110);

        p1l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l2);
        p1l2.setBounds(130, 220, 110, 110);

        p1l6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel2.add(p1l6);
        p1l6.setBounds(610, 220, 110, 110);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 970, 340));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\gameBackground.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1930, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        jogo.carregaCartas();
        
        System.out.println("curto");
        for(int i =0; i<jogo.cartasCurtoDoJogo.size(); i++){
            System.out.println("id: "+ jogo.cartasCurtoDoJogo.get(i).getId());
             System.out.println("id: "+ jogo.cartasCurtoDoJogo.get(i).getTipo());
             System.out.println("imagem altura "+ jogo.cartasCurtoDoJogo.get(i).getBackgroung().getIconHeight());} 
        
         System.out.println("medio");
            for(int i =0; i<jogo.cartasMedioDoJogo.size(); i++){
            System.out.println("id: "+ jogo.cartasMedioDoJogo.get(i).getId());
             System.out.println("id: "+ jogo.cartasMedioDoJogo.get(i).getTipo());
             System.out.println("imagem altura "+ jogo.cartasMedioDoJogo.get(i).getBackgroung().getIconHeight());}    
        p1m2.setIcon((Icon) jogo.imagensCurto.get(1));
        
        
        
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
    private javax.swing.JLabel Player1Name;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton175;
    private javax.swing.JButton jButton176;
    private javax.swing.JButton jButton177;
    private javax.swing.JButton jButton178;
    private javax.swing.JButton jButton179;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton p1c1;
    private javax.swing.JButton p1c2;
    private javax.swing.JButton p1c3;
    private javax.swing.JButton p1c4;
    private javax.swing.JButton p1c5;
    private javax.swing.JButton p1c6;
    private javax.swing.JButton p1c7;
    private javax.swing.JButton p1c8;
    private javax.swing.JButton p1l1;
    private javax.swing.JButton p1l2;
    private javax.swing.JButton p1l3;
    private javax.swing.JButton p1l4;
    private javax.swing.JButton p1l5;
    private javax.swing.JButton p1l6;
    private javax.swing.JButton p1l7;
    private javax.swing.JButton p1l8;
    private javax.swing.JButton p1m1;
    private javax.swing.JButton p1m2;
    private javax.swing.JButton p1m3;
    private javax.swing.JButton p1m4;
    private javax.swing.JButton p1m5;
    private javax.swing.JButton p1m6;
    private javax.swing.JButton p1m7;
    private javax.swing.JButton p1m8;
    private javax.swing.JButton p2c1;
    private javax.swing.JButton p2c2;
    private javax.swing.JButton p2c3;
    private javax.swing.JButton p2c4;
    private javax.swing.JButton p2c5;
    private javax.swing.JButton p2c6;
    private javax.swing.JButton p2c7;
    private javax.swing.JButton p2c8;
    private javax.swing.JButton p2l1;
    private javax.swing.JButton p2l2;
    private javax.swing.JButton p2l3;
    private javax.swing.JButton p2l4;
    private javax.swing.JButton p2l5;
    private javax.swing.JButton p2l6;
    private javax.swing.JButton p2l7;
    private javax.swing.JButton p2l8;
    private javax.swing.JButton p2m1;
    private javax.swing.JButton p2m2;
    private javax.swing.JButton p2m3;
    private javax.swing.JButton p2m4;
    private javax.swing.JButton p2m5;
    private javax.swing.JButton p2m6;
    private javax.swing.JButton p2m7;
    private javax.swing.JButton p2m8;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

}


