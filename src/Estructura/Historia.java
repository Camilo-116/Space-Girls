/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import Estructura.Lienzo;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Camilo Cespedes
 */
public abstract class Historia extends Lienzo {
    PersonajePrincipal personajePrincipal;
    ArrayList<NPC>NPCS;
    ImageIcon background;
    public Historia (ImageIcon background, PersonajePrincipal personajePrincipal) {
        this.personajePrincipal=personajePrincipal;
        this.background=background;
        NPC listaNPCS = new NPC();
    }
    public Historia (ImageIcon background, PersonajePrincipal personajePrincipal, NPC listaNPCS) {
        this.personajePrincipal=personajePrincipal;
        this.background=background;
        for (NPC npc : NPCS) {
            npc.apariencia=listaNPCS.apariencia;
        }
    }
}
