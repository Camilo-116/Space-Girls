/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcela
 */
public class CoheteAnimacion {

    int nextIcon = 1;
    int velocidad = 1;
    int velocimetro;
    Timer timer;
    frameTry ft;

    public CoheteAnimacion(frameTry ft) {
        this.ft = ft;
        velocimetro = velocidad * 150;
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velocimetro, velocimetro);

    }
    TimerTask tarea = new TimerTask() {
        @Override
        public void run() {

            Icon icono;
            switch (nextIcon) {
                case 1:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 2:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 3:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 4:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 5:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 6:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;

                    break;
                case 7:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 8:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 9:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;

                case 10:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 11:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 12:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 13:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 14:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 15:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 16:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 17:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 18:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 19:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 20:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 21:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 22:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 23:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 24:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 25:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 26:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 27:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 28:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 29:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 30:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 31:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 32:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 33:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    nextIcon++;
                    break;
                case 34:
                    icono = new ImageIcon(getClass().getResource("/Resources/Images/Animacion/" + nextIcon + ".png"));
                    ft.jLabel1.setIcon(icono);
                    break;

            }

        }

    };

}
