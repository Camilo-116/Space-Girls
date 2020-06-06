/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historiakatherin;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Camilo Cespedes
 */
public class HistoriaKatherin extends javax.swing.JPanel {

    Katherin katherin;
    Personaje personaje;
    Boolean space = false;

    public HistoriaKatherin() {
        initComponents();
        katherin = new Katherin(this);
        personaje = new Personaje(katherin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OfficeK.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
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
                if (!katherin.isNextToSquare(x + katherin.getWidth() / 2 - 10, y + katherin.getHeight() / 2)) {
                    space = true;
                    x -= 10;
                    dir = "Images/K-L.jpeg";
                } else {
                    space = false;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (!katherin.isNextToSquare(x + katherin.getWidth() / 2 + 10, y + katherin.getHeight() / 2)) {
                    space = true;
                    x += 10;
                    dir = "Images/K-R.jpeg";
                } else {
                    space = false;
                }
                
                break;
            case KeyEvent.VK_UP:
                if (!katherin.isNextToSquare(x + katherin.getWidth() / 2, y + katherin.getHeight() / 2 - 10)) {
                    space = true;
                    y -= 0;
                    dir = "Images/K-B.jpeg";
                } else {
                    space = false;
                }
                
                break;
            case KeyEvent.VK_DOWN:
                if (!katherin.isNextToSquare(x + katherin.getWidth() / 2 , y + katherin.getHeight() / 2 + 10)) {
                    space = true;
                    y += 10;
                    dir = "Images/K-D.jpeg";
                } else {
                    space = false;
                }
                
                break;
        }
        if(space){
            katherin.Dibujar (this.getGraphics(), x, y, dir);
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
