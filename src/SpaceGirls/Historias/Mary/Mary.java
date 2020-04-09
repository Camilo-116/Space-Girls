/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceGirls.Historias.Mary;

import Estructura.Historia;
import Estructura.PersonajePrincipal;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Camilo Cespedes
 */
public class Mary extends Historia{
    ArrayList<Mueble>muebles;
    ArrayList<EfectodeSonido>efectosdeSonido;
    
    
    public Mary(Mueble m, EfectodeSonido ef, ImageIcon background, PersonajePrincipal personajePrincipal){
        super(background, personajePrincipal);
        for (Mueble mu : muebles) {
            mu.apariencia=m.apariencia;
            mu.ancho=m.ancho;
            mu.alto=m.alto;
            mu.radioInteraccion=m.radioInteraccion;
        }
        for (EfectodeSonido e : efectosdeSonido) {
            e.efecto=ef.efecto;
        }
    }
    
}
