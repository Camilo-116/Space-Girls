/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstellarG;

import Interfaz.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Camilo Cespedes
 */
public class Katherin {
    HistoriaKatherin histo;
    int x, y;
    int width, height;
    
    Boolean colision = false, colTop = false, colBottom = false, colLeft = false, colRigth = false;
    
    
    
    public Katherin(HistoriaKatherin histo) {
        this.histo = histo;
        
        x = 313; 
        y = 222;
    }
    
    public void Dibujar (Graphics g, int x, int y, String dir){
        this.x = x;
        this.y = y;
        ImageIcon imgKat = new ImageIcon(dir);
        histo.paint(g,imgKat.getImage(), x, y );
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getY() {
        return y;
    }
    
    /*public void addArea(Area a){
        super.areas.add(a);
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }
    public Boolean isNextToSquare (int borderX, int BorderY){
        for (Area area : areas) {
            if ( area.isInside(x,y)){
                return true;
            }
        }
        return false;
    }*/
    
    
   
}
