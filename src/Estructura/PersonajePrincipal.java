/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.ArrayList;

/**
 *
 * @author Camilo Cespedes
 */
public class PersonajePrincipal {
    ArrayList<Vista>vistas;
    public PersonajePrincipal (Vista vista1){
        for (Vista vista : vistas) {
            vista=vista1;
        }
    }
}
