/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Interfaz.VentanaDesarrollo;

/**
 *
 * @author Camilo Cespedes
 */
public class EstadoJuego {
    Estado estadoActual;
    VentanaDesarrollo frame;

    public EstadoJuego(VentanaDesarrollo frame) {
        this.estadoActual = Estado.INICIO;
        this.frame = frame;
    }
    
    public Estado getEstadoActual() {
        return estadoActual;
    }

    /*public void setEstado(Estado estadoActual) {
        this.estadoActual = estadoActual;
        frame.setEstado(estadoActual);
    }*/
    
    
}
