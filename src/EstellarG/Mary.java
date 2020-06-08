/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstellarG;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import Interfaz.*;

/**
 *
 * @author Camilo Cespedes
 */
public class Mary {

    HistoriaMary hist;
    int x, y;
    int width = 100, height = 100;

    public Mary(HistoriaMary his) {
        this.hist = his;
        x = 1230;
        y = 400;
    }

    public void Dibujar(Graphics g, int x, int y, String dir) {
        this.x = x;
        this.y = y;
        ImageIcon imgMar = new ImageIcon(dir);
        hist.paint(g, imgMar.getImage(), x, y);
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
    /*public Boolean isNextToSquare (int borderX, int BorderY){
        for (Area area : areas) {
            if ( area.isInside(x,y)){
                return true;
            }
        }
        return false;
    }*/

}
