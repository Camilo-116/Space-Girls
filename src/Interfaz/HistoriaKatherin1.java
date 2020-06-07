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

/**
 *
 * @author Camilo Cespedes
 */
public class HistoriaKatherin1 extends javax.swing.JPanel {

    Katherin katherin;
    Personaje personaje;
    Boolean space = false;

    public HistoriaKatherin1() {
        super();
        initComponents();
        setFocusable(true);
        BCK5.setVisible(true);
        //personaje = new Personaje(katherin);
        
    }
    public void paint (Graphics g, Image i, int x, int y){
        super.paint(g);
        /*g.drawRect(230, 523, 289, 277);
        g.drawRect(50, 202, 180,  598);
        g.drawRect(843, 520, 557, 280);
        g.drawRect(989, 428, 72, 93);
        g.drawRect(843, 557, 520, 280);*/
        g.drawImage(i, x, y, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BCK5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));
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

        BCK5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Katherin/officeK.jpg"))); // NOI18N
        add(BCK5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        float x = evt.getX(), y = evt.getY();
        System.out.println(x + " , " + y);
    }//GEN-LAST:event_formMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int x = katherin.getX(), y = katherin.getY();
        int type;
        String dir = "", dir2 = "";
        int key = evt.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                katherin.setWidth(96);
                katherin.setHeight(123);
                if (!katherin.isNextToSquare(x - 10, y + katherin.getHeight())) {
                    space = true;
                    x -= 10;
                    dir = "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-L.png";
                } else {
                    space = false;
                }
                break;
            case KeyEvent.VK_RIGHT:
                katherin.setWidth(120);
                katherin.setHeight(106);
                if (!katherin.isNextToSquare(x + katherin.getWidth() + 10, y + katherin.getHeight())) {
                    space = true;
                    x += 10;
                    dir = "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-R.png";
                } else {
                    space = false;
                }
                
                break;
            case KeyEvent.VK_UP:
                katherin.setWidth(118);
                katherin.setHeight(106);
                if (!katherin.isNextToSquare(x + katherin.getWidth(), y - 10)) {
                    space = true;
                    y -= 10;
                    dir = "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-B.png";
                } else {
                    space = false;
                }
                
                break;
            case KeyEvent.VK_DOWN:
                if (!katherin.isNextToSquare(x + katherin.getWidth() / 2 , y + katherin.getHeight() / 2 + 10)) {
                    space = true;
                    y += 10;
                    dir = "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-D.png";
                } else {
                    space = false;
                }
                
                break;
        }
        if(space){
            katherin.Dibujar(this.getGraphics(), x, y, dir);
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCK5;
    // End of variables declaration//GEN-END:variables

    void setKatherin(Katherin katherin) {
        this.katherin = katherin;
    }

    /*void Pressed(java.awt.event.KeyEvent evt) {
        
    }*/
}
