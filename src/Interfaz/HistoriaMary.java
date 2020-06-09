/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estado.Estado;
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
    Estado estado = Estado.NOT_IN_DIALOG;
    int x;
    int y;
    String dir;
    String dir2;
    String lastDir;
    String user;
    private int infinito;
    private int leg;
    private int contLeg;
    private int direct;
    private int mov;
    private int verif;
    Boolean objs[] = {false, false, false, false, false, false, false};
    int cont = 2, tipo = 0;

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
        FM.setVisible(false);
        DM1.setVisible(true);
        DM2.setVisible(false);
        DM3.setVisible(false);
        OBFA.setVisible(false);
        OBF.setVisible(false);
        Obj1.setVisible(false);
        Obj2.setVisible(false);
        Obj3.setVisible(false);
        Obj4.setVisible(false);
        Obj5.setVisible(false);
        Obj6.setVisible(false);
        Obj7.setVisible(false);
        caminarMary.start();
    }

    public void paint(Graphics g, Image i, int x, int y) {
        super.paint(g);
        g.drawImage(i, x, y, null);
    }
    public void dibujar(int x, int y, String dir) {
        mary.Dibujar(this.getGraphics(), x, y, dir);

    }
    Thread caminarMary = new Thread() {
        @Override
        public void run() {
            infinito = 0;

            while (infinito == 0) {
                try {
                    contLeg++;
                    mov++;
                    if (contLeg == 3) {
                        if (direct == -1) {
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-L.png";
                            dibujar(x, y, dir);
                        }
                        if (direct == 1) {
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-R.png";
                            dibujar(x, y, dir);
                        }
                        if (direct == 2) {
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                            dibujar(x, y, dir);
                        }
                        if (direct == -2) {
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-D.png";
                            dibujar(x, y, dir);
                        }

                    }

                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
        }
    };
    private boolean isFast() {
        if (mov <= 1) {
            return true;
        }
        return false;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FM = new javax.swing.JLabel();
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
        OBF = new javax.swing.JLabel();
        OBFA = new javax.swing.JLabel();
        VolverSeleccion = new javax.swing.JButton();
        BCK6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1400, 800));
        setMinimumSize(new java.awt.Dimension(1400, 800));
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

        FM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/FM.png"))); // NOI18N
        add(FM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        Obj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/Drill.png"))); // NOI18N
        add(Obj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 644, -1, 100));
        Obj2.getAccessibleContext().setAccessibleName("Obj");

        Obj7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/jeringa.png"))); // NOI18N
        add(Obj7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, -1, 80));

        Obj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/motor.png"))); // NOI18N
        add(Obj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 70, 80));

        Obj5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/panel.png"))); // NOI18N
        add(Obj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, 70));

        Obj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/propulsor.jpg"))); // NOI18N
        add(Obj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, -1, 100));

        Obj6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/tractor.png"))); // NOI18N
        add(Obj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 50, 60));

        Obj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/ventana.png"))); // NOI18N
        add(Obj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, -1, 70));

        DM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/DM1.png"))); // NOI18N
        add(DM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        DM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/DM2.png"))); // NOI18N
        add(DM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        DM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/DM3.png"))); // NOI18N
        add(DM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        OBF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/OBF.png"))); // NOI18N
        add(OBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        OBFA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/OBFA.png"))); // NOI18N
        add(OBFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        VolverSeleccion.setText("Volver a Seleccion de personajes");
        VolverSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverSeleccionActionPerformed(evt);
            }
        });
        add(VolverSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 260, 60));

        BCK6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Mary/OficinaMaryBarraFinal.jpg"))); // NOI18N
        add(BCK6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1400, 800));
    }// </editor-fold>//GEN-END:initComponents


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*float x = evt.getX(), y = evt.getY();
        System.out.println(x + " , " + y);*/
    }//GEN-LAST:event_formMouseClicked
    public void movimiento(int key) {
        x = mary.getX();
        y = mary.getY();
        int type;
        dir = "";

        if (estado == Estado.NOT_IN_DIALOG) {
            if (cont > 4) {
                switch (key) {
                    case KeyEvent.VK_LEFT:
                        if (y >= 240 && y <= 510) {
                            if (!(x - 10 < 150)) {
                                x -= 10;
                            }
                        } else {
                            if (y >= 200 && y <= 240) {
                                if (!(x - 10 < 360)) {
                                    x -= 10;
                                }
                            }
                        }
                        if (leg == 1) {
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-L-L.png";
                            mov = 0;
                            contLeg = 0;
                            direct = -1;
                            leg = 2;
                        } else {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-L-R.png";

                            leg = 1;

                            contLeg = 0;
                            direct = -1;

                        }

                        lastDir = dir;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (y >= 200 && y <= 410) {
                            if (!(x + 10 > 1250)) {
                                x += 10;
                            }
                        } else {
                            if (y >= 410 && y <= 510) {
                                if (!(x + 10 > 850)) {
                                    x += 10;
                                }
                            }
                        }

                        if (leg == 1) {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-R-L.png";

                            leg = 2;
                            contLeg = 0;
                            direct = 1;
                        } else {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-R-R.png";

                            leg = 1;
                            contLeg = 0;
                            direct = 1;
                        }

                        lastDir = dir;
                        break;
                    case KeyEvent.VK_UP:
                        if (x >= 150 && x <= 350) {
                            if (!(y - 10 < 240)) {
                                y -= 10;
                            }

                        } else {
                            if (x >= 360 && x <= 1250) {
                                if (!(y - 10 < 200)) {
                                    y -= 10;

                                }
                            }
                        }
                        if (leg == 1) {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B-L.png";

                            leg = 2;
                            contLeg = 0;
                            direct = 2;
                        } else {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-B-R.png";

                            leg = 1;
                            contLeg = 0;
                            direct = 2;
                        }

                        lastDir = dir;
                        break;
                    case KeyEvent.VK_DOWN:
                        if (x >= 150 && x <= 850) {
                            if (!(y + 10 > 510)) {
                                y += 10;
                            }

                        } else {
                            if (x >= 850 && x <= 1250) {
                                if (!(y + 10 > 410)) {
                                    y += 10;

                                }
                            }
                        }
                        if (leg == 1) {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-D-L.png";

                            leg = 2;
                            contLeg = 0;
                            direct = -2;
                        } else {
                            mov = 0;
                            dir = user + "\\src\\Resources\\Images\\Mary\\M-D-R.png";

                            leg = 1;
                            contLeg = 0;
                            direct = -2;
                        }

                        lastDir = dir;
                        break;
                    case KeyEvent.VK_SPACE:
                        if (y == 410) {
                            if (x >= 1050 && x <= 1130) {
                                if (objs[0] == false) {
                                    Obj1.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[0] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
                                dir = user + "\\src\\Resources\\Images\\Mary\\M-D.png";
                                lastDir = dir;
                            }
                        } else {
                            dir = lastDir;
                        }
                        if (y == 200) {
                            if (x >= 630 && x <= 790) {
                                if (objs[1] == false) {
                                    Obj2.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[1] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
                                dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                                lastDir = dir;
                            }
                        } else {
                            dir = lastDir;
                        }
                        if (y == 200) {
                            if (x >= 1150 && x <= 1250) {
                                if (objs[2] == false) {
                                    Obj3.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[2] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
                                dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                                lastDir = dir;
                            }
                        } else {
                            dir = lastDir;
                        }
                        if (x == 150) {
                            if (y >= 470 && y <= 510) {
                                if (objs[3] == false) {
                                    Obj4.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[3] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
                                dir = user + "\\src\\Resources\\Images\\Mary\\M-L.png";
                                lastDir = dir;
                            }
                        } else {
                            dir = lastDir;
                        }
                        if (y == 200) {
                            if (x >= 360 && x <= 380) {
                                if (objs[4] == false) {
                                    Obj5.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[4] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
                                dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                                lastDir = dir;
                            }
                        } else {
                            dir = lastDir;
                        }
                        if (y == 200) {
                            if (x >= 900 && x <= 950) {
                                if (objs[5] == false) {
                                    Obj6.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[5] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
                                dir = user + "\\src\\Resources\\Images\\Mary\\M-B.png";
                                lastDir = dir;
                            }
                        } else {
                            dir = lastDir;
                        }
                        if (x == 150) {
                            if (y >= 240 && y <= 280) {
                                if (objs[6] == false) {
                                    Obj7.setVisible(true);
                                    OBF.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    objs[6] = true;
                                    tipo = 2;
                                } else {
                                    OBFA.setVisible(true);
                                    estado = Estado.IN_DIALOG;
                                    tipo = 1;
                                }
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
                                                if (Obj7.isVisible() == true && estado == Estado.NOT_IN_DIALOG) {
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
            } else {
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
        } else {
            if (estado == Estado.IN_DIALOG) {
                System.out.println("en dialogo");
                if (key == KeyEvent.VK_SPACE) {
                    System.out.println("se presiona espacio");
                    switch (tipo) {
                        case 1:
                            OBFA.setVisible(false);
                            break;
                        case 2:
                            OBF.setVisible(false);
                            break;
                        case 3:
                            FM.setVisible(false);
                            lienzo.getCl().show(lienzo, "SELECCION");
                            lienzo.getSeleccion().setRequestFocusEnabled(true);
                            lienzo.getSeleccion().grabFocus();
                            lienzo.mostrarBotonLanzar(lienzo.gethistoriasWin());
                            infinito = 1;
                            break;
                    }
                    estado = Estado.NOT_IN_DIALOG;
                }
            }
        }
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (!isFast()) {

            movimiento(evt.getKeyCode());
        } else {
            verif++;
            if (verif == 6) {
                verif = 0;
                movimiento(evt.getKeyCode());
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
    private javax.swing.JLabel DM1;
    private javax.swing.JLabel DM2;
    private javax.swing.JLabel DM3;
    private javax.swing.JLabel FM;
    private javax.swing.JLabel OBF;
    private javax.swing.JLabel OBFA;
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
        FM.setVisible(true);
        estado = Estado.IN_DIALOG;
        tipo = 3;
        lienzo.setHistoriasWin(1, true);
    }
}
