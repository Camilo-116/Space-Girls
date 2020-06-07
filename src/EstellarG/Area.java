/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstellarG;

/**
 *
 * @author Camilo Cespedes
 */
public class Area {
    int x, y, width, height;

    public Area(int x, int width, int y, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
    }
    
    public Boolean isInside(int x, int y){
        if( (x>=this.x && x<=this.width+this.x )&& (y>=this.y && y<=this.height+this.y)){
            return true;
        }
        return false;
    }
}
