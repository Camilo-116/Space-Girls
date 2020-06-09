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
    int x;
    int y;
    private int tipo = 0;
    private int cont = 2;
    private int leg;
    private int contLeg;
    private int direct;
    private int mov;
    private int verif;
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
        leg=0;
        mov=0;
        x = katherin.getX();
        y = katherin.getY();
        DK2.setVisible(false);
        DK3.setVisible(false);
        user = System.getProperty("user.dir");
        lastDir = user + "\\src\\Resources\\Images\\Katherin\\K-D.png";
        FK.setVisible(false);
        Excl1.setVisible(false);
        Excl2.setVisible(false);
        TestMB.setVisible(false);
        TestPT.setVisible(false);
        NR1.setVisible(false);
        NR2.setVisible(false);
        cercania.start();
        finished.start();
    }
    public void dibujar(int x, int y, String dir){
                    katherin.Dibujar(this.getGraphics(), x, y, dir);

    }

    public void paint(Graphics g, Image i, int x, int y) {
        super.paint(g);
        g.drawImage(i, x, y, null);
    }
     Thread caminar=new Thread(){
            @Override
            public void run(){
            int infinito=0;
            
            while(infinito==0){
            try{
                contLeg++;
                mov++;
                  if (contLeg==3){
                   if(direct==-1){
                    dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png";
                  dibujar( x, y, dir);   
                   }
                   if(direct==1){
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-R.png";   
                  dibujar( x, y, dir);  
                   }
                   if(direct==2){
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";   
                  dibujar( x, y, dir);  
                   }
                   if(direct==-2){
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-D.png"; 
                  dibujar( x, y, dir);  
                   }
                   
                }
                
            Thread.sleep(100);
            } catch (InterruptedException e){
            
            }
            }
            }
            };
    Thread finished = new Thread() {
        public void run() {
            int seguir = 0;
            while (seguir == 0) {
                try {
                    if (win[0] && win[1]) {
                        FK.setVisible(true);
                        estado = Estado.IN_DIALOG;
                        tipo = 5;
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
    private boolean isFast(){
     if(mov<=1){
         return true;
     }
     return false;
 }
    public void movimiento(int key){
        x = katherin.getX();
                y = katherin.getY();
                int type;
                String dir = "", dir2 = "";
      
        if (estado == Estado.NOT_IN_DIALOG) {
            if (cont > 4) {
                
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
                        if (leg==1){  
                     dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png"; 
                     mov=0;
                     contLeg=0;
                     direct=-1;
                     leg=2;
                    }else{
                    mov=0;
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-L.png";
                        
                        leg=1;
                        
                        contLeg=0;
                        direct=-1;
                    
                    }
                        
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
                        if (leg==1){
                      mov=0;  
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-R.png"; 
                        
                     leg=2;
                     contLeg=0;
                     direct=1;
                    }else{
                        mov=0;
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-R.png";
                        
                        leg=1;
                        contLeg=0;
                        direct=1;
                    }
                       
                        lastDir = dir;
                        break;
                    case KeyEvent.VK_UP:
                        if (!(y - 10 < 180)) {
                            y -= 10;
                        }
                        if (leg==1){
                       mov=0; 
                     dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                        
                     leg=2;
                     contLeg=0;
                     direct=2;
                    }else{
                        mov=0;
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-B.png";
                        
                        leg=1;
                        contLeg=0;
                        direct=2;
                    }
                        
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
                        if (leg==1){
                     mov=0;
                      dir = user + "\\src\\Resources\\Images\\Katherin\\K-D.png";
                      
                     leg=2;
                     contLeg=0;
                     direct=-2;
                    }else{
                      mov=0;
                       dir = user + "\\src\\Resources\\Images\\Katherin\\K-D.png";
                      
                        leg=1;
                        contLeg=0;
                        direct=-2;
                    }
                        
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
                if (key == KeyEvent.VK_SPACE) {
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
                        case 5:
                            FK.setVisible(false);
                            lienzo.getCl().show(lienzo, "SELECCION");
                            lienzo.getSeleccion().setRequestFocusEnabled(true);
                            lienzo.getSeleccion().grabFocus();
                            break;
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Excl1 = new javax.swing.JLabel();
        Excl2 = new javax.swing.JLabel();
        FK = new javax.swing.JLabel();
        DK1 = new javax.swing.JLabel();
        DK2 = new javax.swing.JLabel();
        DK3 = new javax.swing.JLabel();
        TestMB = new javax.swing.JLabel();
        TestPT = new javax.swing.JLabel();
        NR1 = new javax.swing.JLabel();
        NR2 = new javax.swing.JLabel();
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

        FK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/FK.png"))); // NOI18N
        add(FK, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 370, 210));

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
         if (!isFast()){
            
        movimiento (evt.getKeyCode());
       }else{
           verif++;
           if(verif==6){
               verif=0;
             movimiento (evt.getKeyCode());  
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
    private javax.swing.JLabel FK;
    private javax.swing.JLabel NR1;
    private javax.swing.JLabel NR2;
    private javax.swing.JLabel TestMB;
    private javax.swing.JLabel TestPT;
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
