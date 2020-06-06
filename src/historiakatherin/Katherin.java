/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historiakatherin;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Camilo Cespedes
 */
public class Katherin extends Historia{
    HistoriaKatherin hist;
    Personaje per;
    int x, y;
    int width = 100, height = 100;
    
    Boolean colision = false, colTop = false, colBottom = false, colLeft = false, colRigth = false;
    
    
    public Katherin(HistoriaKatherin his) {
        areas = new ArrayList();
        this.hist = his;
        x = 0; 
        y = 0;
        addArea(new Area(230, 289, 523, 277));
        addArea(new Area(50, 180, 202, 598));
        addArea(new Area(843, 557, 520, 280));
        addArea(new Area(989, 72, 428, 93));
        addArea(new Area(993, 265, 201, 65));
    }
    
    public void Dibujar (Graphics g, int x, int y, String dir){
        this.x = x;
        this.y = y;
        this.hist.update(g);
        ImageIcon imgKat = new ImageIcon(dir);
        per.update(imgKat, x, y);
        g.drawImage (imgKat.getImage(), x, y, hist);
        
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
    
    public void addArea(Area a){
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
    }
    
    
   
}
