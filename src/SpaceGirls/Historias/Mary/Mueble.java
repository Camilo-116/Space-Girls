/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceGirls.Historias.Mary;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Camilo Cespedes
 */
class Mueble {
    ArrayList<Objeto>objetos;
    ImageIcon apariencia;
    float ancho;
    float alto;
    float radioInteraccion;
    public Mueble (float radioInteraccion, float alto, float ancho, ImageIcon apariencia, Objeto ob){
        this.radioInteraccion=radioInteraccion;
        this.alto=alto;
        this.ancho=ancho;
        this.apariencia=apariencia;
        for (Objeto objeto : objetos) {
            objeto.apariencia=ob.apariencia;
        }
    }
}
