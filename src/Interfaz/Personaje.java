/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import EstellarG.Historia;
import EstellarG.Katherin;
import javax.swing.ImageIcon;

/**
 *
 * @author Camilo Cespedes
 */
public class Personaje {
    Historia hist;
    int x, y, width, height;
    ImageIcon vista;
    public Personaje(Historia hist) {
        this.hist = hist;
        if (hist instanceof Katherin){
            Katherin k = (Katherin)hist;
            this.height = k.getHeight();
            this.width = k.getWidth();
            this.x = k.getX();
            this.y = k.getY();
        }/*else{
            if (hist instanceof Mary){
                hist = (Mary)hist;
            }else{
                if (hist instanceof Dorothy){
                    hist = (Dorothy)hist;
                }
            }
        
        }*/
    }

    public void update(ImageIcon vista, int x, int y) {
        this.x = x;
        this.y = y;
        this.vista = vista;
    }
    
    
}
