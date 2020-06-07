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
public class HistoriaKatherin extends javax.swing.JPanel {

    Katherin katherin;
    Personaje personaje;
    Boolean space = false;
    int alo=0;
    int x;
    int y;
    String dir;
    String dir2;
    

    public HistoriaKatherin() {
        super();
        initComponents();
        setFocusable(true);
        BCK5_1.setVisible(true);
        katherin = new Katherin(this);
        personaje = new Personaje(katherin);
    }
    public void paint (Graphics g, Image i, int x, int y){
        super.paint(g);
        g.drawImage(i, x, y, null);
    }
   
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
         x = katherin.getX();
         y = katherin.getY();
        int type;
        String dir = "", dir2 = "";
        int key = evt.getKeyCode();
        
        if(alo==0){
            y+=10;
            dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-D.png";
            alo++;
        }
        switch (key) {
            case KeyEvent.VK_LEFT:
                
                if(y<410 && y>180){
                    if(!(x-10<230)){
                        x-=10;
                    }
                }else{ 
                    if(y<675 && y>411){
                        if(!(x-10<519)){
                         x-=10;   
                        }
                    }
                }
               dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-L.png";
                break;
            case KeyEvent.VK_RIGHT:
                
               if(y<410 && y>180){
                    if(!(x+10>1240)){
                        x+=10;
                    }
                }else{ 
                    if(y<675 && y>411){
                         if(!(x+10>750)){
                        x+=10;
                    }
                    }
                }
                dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-R.png";
                break;
            case KeyEvent.VK_UP:
               if(!(y-10<180)){
                  y-=10;
                }
                dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-B.png";
                break;
            case KeyEvent.VK_DOWN:
                if((x>230 && x<519)||(x>750 && x<1240)){
                    if(!(y+10>411)){
                        y+=10;
                    }
                }else{ 
                    if(x>518 && x<751){
                         if(!(y+10>620)){
                        y+=10;
                    }
                    }
                }
              dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-D.png";
                break;
            case KeyEvent.VK_SPACE:
                if(x>1160&&x<1280){
                if(y>160&&y<190){
                     
                   dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-B.png";
                   this.abrirPuzzle();

                }
            }else{
                if(y<410 && y>300){
                if(x>220&&x<260){
                    dir= "C:/Users/Camilo Cespedes/Documents/Universidad/Tercer semestre/Programacion orientada a objetos/Proyecto POO/Recursos/Personajes/K-L.png";
                    this.abrirJuegoCartas();
                }
            }
                }
                break;
               
        }
//        if(space){
             
          
        katherin.Dibujar(this.getGraphics(), x, y, dir);

//        }

    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCK5_1;
    private javax.swing.JLabel BCK5_2;
    // End of variables declaration//GEN-END:variables

    void setKatherin(Katherin katherin) {
        this.katherin = katherin;
    }

    private void abrirPuzzle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abrirJuegoCartas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
