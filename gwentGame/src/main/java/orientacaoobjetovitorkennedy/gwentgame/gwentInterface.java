

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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Player 2");

        Player1Name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Player1Name.setText("Player1");

        jLabel4.setText("Descrition 2");

        jLabel5.setText("Description 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("20");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("20");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("20");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("20");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("0");

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("0");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        m2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m2);
        m2.setBounds(150, 10, 110, 110);

        m1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m1);
        m1.setBounds(30, 10, 110, 110);

        m4.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m4);
        m4.setBounds(390, 10, 110, 110);

        m3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m3);
        m3.setBounds(270, 10, 110, 110);

        m7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m7);
        m7.setBounds(750, 10, 110, 110);

        m8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m8);
        m8.setBounds(870, 10, 110, 110);

        m6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m6);
        m6.setBounds(630, 10, 110, 110);

        m5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m5);
        m5.setBounds(510, 10, 110, 110);

        m10.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m10);
        m10.setBounds(1110, 10, 110, 110);

        m9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\emptyCard.png")); // NOI18N
        jPanel4.add(m9);
        m9.setBounds(990, 10, 110, 110);

        startButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

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

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\orientacao-objeto-gwent\\orientacao-objeto-gwent\\gwentGame\\src\\main\\java\\images\\gameBackground.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel10)
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(210, 210, 210)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(Player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1910, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel16)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel15))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel8)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel4)
                                .addGap(50, 50, 50)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel11)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel13)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel12))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addComponent(Player1Name))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        jogo.iniciaJogo();
       
        m1.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(0).getBackgroung());
        m2.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(1).getBackgroung());
        m3.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(2).getBackgroung());
        m4.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(3).getBackgroung());
        m5.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(4).getBackgroung());
        m6.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(5).getBackgroung());;        
        m7.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(6).getBackgroung());
        m8.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(7).getBackgroung());
        m9.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(8).getBackgroung());
        m10.setIcon((Icon)jogo.jogador1.getMao().getCartasMao().get(9).getBackgroung());
        
        

        
        
        
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


