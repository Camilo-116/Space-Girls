/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import EstellarG.*;

/**
 *
 * @author Camilo Cespedes
 */
public class HistoriaMary extends javax.swing.JPanel {

    Mary mary;
    Lienzo lienzo;
    Boolean space = false;
    int x;
    int y;
    String dir;
    String dir2;
    String lastDir;
    String user;
    int cont = 2;

    public HistoriaMary() {
        super();
        initComponents();
        setFocusable(true);
        BCK6.setVisible(true);
        mary = new Mary(this);
        x = mary.getX();
        y = mary.getY();
        user = System.getProperty("user.dir");
        lastDir = user + "\\src\\Resources\\Images\\Mary\\M-D.png";
        VolverSeleccion.setVisible(false);
        DM1.setVisible(true);
        DM2.setVisible(false);
        DM3.setVisible(false);
        Obj1.setVisible(false);
        Obj2.setVisible(false);
        Obj3.setVisible(false);
        Obj4.setVisible(false);
        Obj5.setVisible(false);
        Obj6.setVisible(false);
        Obj7.setVisible(false);
    }

    public void paint(Graphics g, Image i, int x, int y) {
        super.paint(g);
        g.drawImage(i, x, y, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Obj2 = new javax.swing.JLabel();
        Obj7 = new javax.swing.JLabel();
        Obj3 = new javax.swing.JLabel();
        Obj5 = new javax.swing.JLabel();
        Obj1 = new javax.swing.JLabel();
        Obj6 = new javax.swing.JLabel();
        Obj4 = new javax.swing.JLabel();
        DM1 = new javax.swing.JLabel();
        DM2 = new javax.swing.JLabel();
        DM3 = new javax.swing.JLabel();
        VolverSeleccion = new javax.swing.JButton();
        BCK6 = new javax.swing.JLabel();
        BCK7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1400, 800));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
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

        Obj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/Drill.png"))); // NOI18N
        add(Obj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, -1, -1));
        Obj2.getAccessibleContext().setAccessibleName("Obj");

        Obj7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/jeringa.png"))); // NOI18N
        add(Obj7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 670, -1, -1));

        Obj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/motor.png"))); // NOI18N
        add(Obj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 70, 70));

        Obj5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/panel.png"))); // NOI18N
        add(Obj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 670, -1, -1));

        Obj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/propulsor.jpg"))); // NOI18N
        add(Obj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 660, -1, -1));

        Obj6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/tractor.png"))); // NOI18N
        add(Obj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 670, 60, 60));

        Obj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/ventana.png"))); // NOI18N
        add(Obj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, -1, 60));

        DM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/DM1.png"))); // NOI18N
        add(DM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        DM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/DM2.png"))); // NOI18N
        add(DM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        DM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/DM3.png"))); // NOI18N
        add(DM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        VolverSeleccion.setText("Volver a Seleccion de personajes");
        VolverSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverSeleccionActionPerformed(evt);
            }
        });
        add(VolverSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 260, 60));

        BCK6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/OficinaMaryBarraFinal.jpg"))); // NOI18N
        add(BCK6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 790));

        BCK7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/OficinaMaryBarraFinal.jpg"))); // NOI18N
        add(BCK7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 790));
    }// </editor-fold>//GEN-END:initComponents


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*float x = evt.getX(), y = evt.getY();
        System.out.println(x + " , " + y);*/
    }//GEN-LAST:event_formMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        x = mary.getX();
        y = mary.getY();
        int type;
        dir = "";
        int key = evt.getKeyCode();
        if (cont > 4) {
            switch (key) {
                case KeyEvent.VK_LEFT:
                    if (y >= 270 && y <= 540) {
                        if (!(x - 10 < 150)) {
                            x -= 10;
                        }
                    } else {
                        if (y >= 230 && y <= 270) {
                            if (!(x - 10 < 360)) {
                                x -= 10;
                            }
                        }
                    }
                    dir = user + "\\src\\Resources\\Images\\Mary\\M-L.png";
                    lastDir = dir;
                    break;
                case KeyEvent.VK_RIGHT:
                    if (y >= 230 && y <= 440) {
                        if (!(x + 10 > 1250)) {
                            x += 10;
                        }
                    } else {
                        if (y >= 440 && y <= 540) {
                            if (!(x + 10 > 850)) {
                                x += 10;
                            }
                        }
                    }

                    dir = user + "\\src\\Resources\\Images\\Mary\\M-R.png";
                    lastDir = dir;
                    break;
                case KeyEvent.VK_UP:
                    if (x >= 150 && x <= 350) {
                        if (!(y - 10 < 270)) {
                            y -= 10;
                        }

                    } else {
                        if (x >= 360 && x <= 1250) {
                            if (!(y - 10 < 230)) {
                                y -= 10;

                            }
                        }
                    }

                    dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                    lastDir = dir;
                    break;
                case KeyEvent.VK_DOWN:
                    if (x >= 150 && x <= 850) {
                        if (!(y + 10 > 540)) {
                            y += 10;
                        }

                    } else {
                        if (x >= 850 && x <= 1250) {
                            if (!(y + 10 > 440)) {
                                y += 10;

                            }
                        }
                    }

                    dir = user + "\\src\\Resources\\Images\\Mary\\M-D.png";
                    lastDir = dir;
                    break;
                case KeyEvent.VK_SPACE:
                    System.out.println(x + " , " + y);
                    if (y == 440) {
                        if (x >= 1050 && x <= 1130) {
                            Obj1.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-D.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }
                    if (y == 230) {
                        if (x >= 630 && x <= 790) {
                            Obj2.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }
                    if (y == 230) {
                        if (x >= 1150 && x <= 1250) {
                            Obj3.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }
                    if (x == 150) {
                        if (y >= 500 && y <= 540) {
                            Obj4.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-L.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }
                    if (y == 230) {
                        if (x >= 360 && x <= 380) {
                            Obj5.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }
                    if (y == 230) {
                        if (x >= 900 && x <= 950) {
                            Obj6.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }
                    if (x == 150) {
                        if (y >= 270 && y <= 310) {
                            Obj7.setVisible(true);
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-L.png";
                            lastDir = dir;
                        }
                    } else {
                        dir = lastDir;
                    }

                    if (Obj1.isVisible() == true) {
                        if (Obj2.isVisible() == true) {
                            if (Obj3.isVisible() == true) {
                                if (Obj4.isVisible() == true) {
                                    if (Obj5.isVisible() == true) {
                                        if (Obj6.isVisible() == true) {
                                            if (Obj7.isVisible() == true) {
                                                inventoryFilled();
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }
                    break;
                default:
                    dir = lastDir;
                    break;
                    
            }
            mary.Dibujar(this.getGraphics(), x, y, dir);
        }else {
                if (key == java.awt.event.KeyEvent.VK_SPACE) {
                    if (cont == 2) {
                        DM1.setVisible(false);
                        DM2.setVisible(true);
                        cont++;
                    } else {
                        if (cont == 3) {
                            DM2.setVisible(false);
                            DM3.setVisible(true);
                            cont++;
                        } else {
                            DM3.setVisible(false);
                            cont++;
                        }
                    }
                }
            }

        


    }//GEN-LAST:event_formKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        mary.Dibujar(this.getGraphics(), x, y, lastDir);
    }//GEN-LAST:event_formFocusGained

    private void VolverSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverSeleccionActionPerformed
        lienzo.getCl().show(lienzo, "SELECCION");
        lienzo.getSeleccion().setRequestFocusEnabled(true);
        lienzo.getSeleccion().grabFocus();
    }//GEN-LAST:event_VolverSeleccionActionPerformed

    public void setLienzo(Lienzo lienzo) {
        this.lienzo = lienzo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCK6;
    private javax.swing.JLabel BCK7;
    private javax.swing.JLabel DM1;
    private javax.swing.JLabel DM2;
    private javax.swing.JLabel DM3;
    private javax.swing.JLabel Obj1;
    private javax.swing.JLabel Obj2;
    private javax.swing.JLabel Obj3;
    private javax.swing.JLabel Obj4;
    private javax.swing.JLabel Obj5;
    private javax.swing.JLabel Obj6;
    private javax.swing.JLabel Obj7;
    private javax.swing.JButton VolverSeleccion;
    // End of variables declaration//GEN-END:variables

    private void inventoryFilled() {
        VolverSeleccion.setVisible(true);
        lienzo.setHistoriasWin(1, true);
    }
}
