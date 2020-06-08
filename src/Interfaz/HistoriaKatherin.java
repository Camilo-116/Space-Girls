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
import Estado.*;

/**
 *
 * @author Camilo Cespedes
 */
public class HistoriaKatherin extends javax.swing.JPanel {

    Katherin katherin;
    Lienzo lienzo;
    Boolean space = false;
    Boolean win[] = {false, false};
    Estado estado;
    int alo = 0;
    int x;
    int y;
    int tipo = 0;
    int cont = 2;
    String dir;
    String lastDir;
    String user;

    public HistoriaKatherin() {
        super();
        initComponents();
        this.estado = Estado.NOT_IN_DIALOG;
        setFocusable(true);
        BCK5_1.setVisible(true);
        katherin = new Katherin(this);
        x = katherin.getX();
        y = katherin.getY();
        DK2.setVisible(false);
        DK3.setVisible(false);
        user = System.getProperty("user.dir");
        lastDir = user + "\\src\\Resources\\Images\\Katherin\\K-D.png";
        Excl1.setVisible(false);
        Excl2.setVisible(false);
        TestMB.setVisible(false);
        TestPT.setVisible(false);
        NR1.setVisible(false);
        NR2.setVisible(false);
        VolverSelec.setVisible(false);
        cercania.start();
        finished.start();
    }

    public void paint(Graphics g, Image i, int x, int y) {
        super.paint(g);
        g.drawImage(i, x, y, null);
    }
    Thread finished = new Thread() {
        public void run() {
            int seguir = 0;
            while (seguir == 0) {
                try {
                    if (win[0] && win[1]) {
                        VolverSelec.setVisible(true);
                        lienzo.setHistoriasWin(0, true);
                    }
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        }
    };
    Thread cercania = new Thread() {

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
        NR1 = new javax.swing.JLabel();
        NR2 = new javax.swing.JLabel();
        VolverSelec = new javax.swing.JButton();
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

        NR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/NR1.png"))); // NOI18N
        add(NR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        NR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/NR2.png"))); // NOI18N
        add(NR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        VolverSelec.setText("Volver A Seleccion de Personaje");
        VolverSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverSelecActionPerformed(evt);
            }
        });
        add(VolverSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 250, 60));

        BCK5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/officeK.jpg"))); // NOI18N
        add(BCK5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BCK5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/officeK.jpg"))); // NOI18N
        add(BCK5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*float x = evt.getX(), y = evt.getY();
        System.out.println(x + " , " + y);*/
    }//GEN-LAST:event_formMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        if (estado == Estado.NOT_IN_DIALOG) {
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
                        lastDir = dir;
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
                        lastDir = dir;
                        break;
                    case KeyEvent.VK_UP:
                        if (!(y - 10 < 180)) {
                            y -= 10;
                        }
                        dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                        lastDir = dir;
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
                        lastDir = dir;
                        break;
                    case KeyEvent.VK_SPACE:
                        if (x > 1160 && x < 1280) {
                            if (y > 160 && y < 190) {
                                dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                                if (win[0] == false) {
                                    estado = Estado.IN_DIALOG;
                                    TestPT.setVisible(true);
                                    tipo = 1;
                                } else {
                                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                                    estado = Estado.IN_DIALOG;
                                    NR1.setVisible(true);
                                    tipo = 3;
                                }
                            } else {
                                dir = lastDir;
                            }
                        } else {
                            if (y < 410 && y > 300) {
                                if (x > 220 && x < 260) {
                                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png";
                                    if (win[1] == false) {
                                        estado = Estado.IN_DIALOG;
                                        TestMB.setVisible(true);
                                        tipo = 2;
                                    } else {
                                        dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png";
                                        estado = Estado.IN_DIALOG;
                                        NR2.setVisible(true);
                                        tipo = 4;
                                    }
                                } else {
                                    dir = lastDir;
                                }
                            } else {
                                dir = lastDir;
                            }
                        }
                        break;
                    default:
                        dir = lastDir;
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
        } else {
            if (estado == Estado.IN_DIALOG) {
                if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    switch (tipo) {
                        case 1:
                            TestPT.setVisible(false);
                            estado = Estado.NOT_IN_DIALOG;
                            abrirPathFinder(win[0]);
                            break;
                        case 2:
                            TestMB.setVisible(false);
                            estado = Estado.NOT_IN_DIALOG;
                            abrirMemoryBot(win[1]);
                            break;
                        case 3: 
                            NR1.setVisible(false);
                            estado = Estado.NOT_IN_DIALOG;
                            break;
                        case 4: 
                            NR2.setVisible(false);
                            estado = Estado.NOT_IN_DIALOG;
                            break;
                    }
                }
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void VolverSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverSelecActionPerformed
        lienzo.getCl().show(lienzo, "SELECCION");
        lienzo.getSeleccion().setRequestFocusEnabled(true);
        lienzo.getSeleccion().grabFocus();
    }//GEN-LAST:event_VolverSelecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCK5_1;
    private javax.swing.JLabel BCK5_2;
    private javax.swing.JLabel DK1;
    private javax.swing.JLabel DK2;
    private javax.swing.JLabel DK3;
    private javax.swing.JLabel Excl1;
    private javax.swing.JLabel Excl2;
    private javax.swing.JLabel NR1;
    private javax.swing.JLabel NR2;
    private javax.swing.JLabel TestMB;
    private javax.swing.JLabel TestPT;
    private javax.swing.JButton VolverSelec;
    // End of variables declaration//GEN-END:variables

    void setKatherin(Katherin katherin) {
        this.katherin = katherin;
    }

    public void setLienzo(Lienzo lienzo) {
        this.lienzo = lienzo;
    }

    public void iniciarP() {
        katherin.Dibujar(this.getGraphics(), x, y, lastDir);
    }

    private void abrirPathFinder(Boolean win) {
        if (estado == Estado.NOT_IN_DIALOG) {
            PathFinder PT = new PathFinder(this, win);
            PT.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            PT.setResizable(false);
            PT.setLocationRelativeTo(null);
            PT.setVisible(true);
        }
    }

    public void setWin(int i, Boolean s) {
        this.win[i] = s;
    }

    public Boolean getWin(int i) {
        return win[i];
    }

    private void abrirMemoryBot(Boolean win) {
        if (estado == Estado.NOT_IN_DIALOG) {
            MemoryBot MB = new MemoryBot(this, win);
            MB.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            MB.setResizable(false);
            MB.setLocationRelativeTo(null);
            MB.setVisible(true);
        }
    }
}
