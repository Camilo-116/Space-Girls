/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import EstellarG.*;
import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Camilo Cespedes
 */
public class HistoriaKatherin extends javax.swing.JPanel {

    Katherin katherin;
    Personaje personaje;
    Boolean space = false;
    Boolean win[] = {false, false};
    int alo = 0;
    int x;
    int y;
    int cont = 2;
    String dir;
    String dir2;
    String user;

    public HistoriaKatherin() {
        super();
        initComponents();
        setFocusable(true);
        BCK5_1.setVisible(true);
        katherin = new Katherin(this);
        x = katherin.getX();
        y = katherin.getY();
        DK1.setVisible(true);
        DK2.setVisible(false);
        DK3.setVisible(false);
        user = System.getProperty("user.dir");
        Excl1.setVisible(false);
        Excl2.setVisible(false);
        TestMB.setVisible(false);
        TestPT.setVisible(false);
        hilo.start();
    }

    public void paint(Graphics g, Image i, int x, int y) {
        super.paint(g);
        g.drawImage(i, x, y, null);
    }

    Thread hilo = new Thread() {

        public void run() {
            int stop = 0;
            while (stop == 0) {
                try {
                    if (x > 1160 && x < 1280) {
                        if (y > 160 && y < 190) {
                            Excl1.setVisible(true);
                        } else {
                            Excl1.setVisible(false);
                        }
                    } else {
                        Excl1.setVisible(false);
                    }
                    if (y < 410 && y > 300) {
                        if (x > 220 && x < 260) {
                            Excl2.setVisible(true);
                        } else {
                            Excl2.setVisible(false);
                        }
                    } else {
                        Excl2.setVisible(false);
                    }
                    Thread.sleep(300);
                } catch (Exception e) {

                }
            }
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Excl1 = new javax.swing.JLabel();
        Excl2 = new javax.swing.JLabel();
        DK1 = new javax.swing.JLabel();
        DK2 = new javax.swing.JLabel();
        DK3 = new javax.swing.JLabel();
        TestMB = new javax.swing.JLabel();
        TestPT = new javax.swing.JLabel();
        BCK5_1 = new javax.swing.JLabel();
        BCK5_2 = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Excl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Exclamacion.png"))); // NOI18N
        add(Excl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 130, -1, -1));

        Excl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Exclamacion.png"))); // NOI18N
        add(Excl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        DK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/DK1.png"))); // NOI18N
        add(DK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, 210));

        DK2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/DK2.png"))); // NOI18N
        add(DK2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, 210));

        DK3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/DK3.png"))); // NOI18N
        add(DK3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, 210));

        TestMB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/TestMB.png"))); // NOI18N
        add(TestMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        TestPT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/TestPT.png"))); // NOI18N
        add(TestPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        BCK5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/officeK.jpg"))); // NOI18N
        add(BCK5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BCK5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/officeK.jpg"))); // NOI18N
        add(BCK5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        float x = evt.getX(), y = evt.getY();
        System.out.println(x + " , " + y);
    }//GEN-LAST:event_formMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        if (cont > 4) {
            x = katherin.getX();
            y = katherin.getY();
            int type;
            String dir = "", dir2 = "";
            switch (key) {
                case KeyEvent.VK_LEFT:

                    if (y < 410 && y > 180) {
                        if (!(x - 10 < 230)) {
                            x -= 10;
                        }
                    } else {
                        if (y < 675 && y > 411) {
                            if (!(x - 10 < 519)) {
                                x -= 10;
                            }
                        }
                    }
                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png";
                    break;
                case KeyEvent.VK_RIGHT:

                    if (y < 410 && y > 180) {
                        if (!(x + 10 > 1240)) {
                            x += 10;
                        }
                    } else {
                        if (y < 675 && y > 411) {
                            if (!(x + 10 > 750)) {
                                x += 10;
                            }
                        }
                    }
                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-R.png";
                    break;
                case KeyEvent.VK_UP:
                    if (!(y - 10 < 180)) {
                        y -= 10;
                    }
                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                    break;
                case KeyEvent.VK_DOWN:
                    if ((x > 230 && x < 519) || (x > 750 && x < 1240)) {
                        if (!(y + 10 > 411)) {
                            y += 10;
                        }
                    } else {
                        if (x > 518 && x < 751) {
                            if (!(y + 10 > 620)) {
                                y += 10;
                            }
                        }
                    }
                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-D.png";
                    break;
                case KeyEvent.VK_SPACE:
                    if (x > 1160 && x < 1280) {
                        if (y > 160 && y < 190) {
                            dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                            Excl1.setVisible(true);
                            this.abrirPuzzle();
                        }
                    } else {
                        if (y < 410 && y > 300) {
                            if (x > 220 && x < 260) {
                                dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png";
                                Excl2.setVisible(true);
                                this.abrirJuegoCartas();
                            }
                        }
                    }
                    break;

            }

            katherin.Dibujar(this.getGraphics(), x, y, dir);
        } else {
            if (key == java.awt.event.KeyEvent.VK_SPACE) {
                if (cont == 2) {
                    DK1.setVisible(false);
                    DK2.setVisible(true);
                    cont++;
                } else {
                    if (cont == 3) {
                        DK2.setVisible(false);
                        DK3.setVisible(true);
                        cont++;
                    } else {
                        DK3.setVisible(false);
                        cont++;
                    }
                }
            }
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCK5_1;
    private javax.swing.JLabel BCK5_2;
    private javax.swing.JLabel DK1;
    private javax.swing.JLabel DK2;
    private javax.swing.JLabel DK3;
    private javax.swing.JLabel Excl1;
    private javax.swing.JLabel Excl2;
    private javax.swing.JLabel TestMB;
    private javax.swing.JLabel TestPT;
    // End of variables declaration//GEN-END:variables

    void setKatherin(Katherin katherin) {
        this.katherin = katherin;
    }

    public void iniciarP() {
        katherin.Dibujar(this.getGraphics(), x, y, user + "\\src\\Resources\\Images\\Katherin\\K-D.png");
    }

    private void abrirPuzzle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abrirJuegoCartas() {
            MemoryBot MB = new MemoryBot();
            MB.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            MB.setLocationRelativeTo(null);
            MB.setVisible(true);
    }
}
