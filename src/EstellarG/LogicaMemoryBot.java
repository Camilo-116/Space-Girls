/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstellarG;

import java.util.Random;

/**
 * LogicaJuego 
 * En esta clase se encuentra la logica de organizacion de cartas en forma aleatoria del juego.<br>
 * Esta parte del codigo fue tomada del video de youtube perteneciente al canal de Darwin Galindo Silva.<br>
 * @author Darwin Galindo Silva <br>
 * @version 1.0 08/05/14<br>
 */
public class LogicaMemoryBot {
    /**
     * getCardNumbers<br>
     * El metodo se encarga de llenar un vector con 16 numeros del 1 al 8 de forma aleatoria, utiliza la clase Random para obtener un numero aletorio entre el 1 y el 8.<br>
     * @return el metodo retorna el arreglo lleno de forma aleatoria con numeros entre el 1 al 8 en sus 16 espacios.<br>
     */
    public int[] getCardNumbers() {
        
        int[] numbers = new int[16];
        int count = 0;
        
        while(count < 16) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 16; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }
        
        
        return numbers;
    }
}
