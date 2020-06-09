/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estado.Estado;
import Resources.EfectoDeSonido;
import java.util.ArrayList;
import EstellarG.*;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javafx.scene.input.KeyCode;
import javax.swing.JPanel;

/**
 *
 * @author Camilo Cespedes
 */
public class Lienzo extends JPanel {

    ArrayList<EfectoDeSonido> efectos;
    VentanaDesarrollo frame;
    Katherin katherin;
    JPanel inicio;
    JPanel ayuda;
    JPanel config;
    JPanel selec;
    Dorothy dorothy;
    CardLayout cl;
    Boolean historiasWin[] = {false, false};
    int cont = 2;

    public Lienzo() {
        super();
        initComponents();
        inicio = Inicio;
        ayuda = Ayuda;
        config = Configuracion;
        selec = Seleccion;
        historiaKatherin.setLienzo(this);
        historiaMary.setLienzo(this);
        cl = (CardLayout) this.getLayout();
        D1.setVisible(true);
        D2.setVisible(false);
        D3.setVisible(false);
        
    }

    public void setHistoriasWin(int i, Boolean s) {
        historiasWin[i] = s;
    }

    public void setFrame(VentanaDesarrollo frame) {
        this.frame = frame;
    }

    public CardLayout getCl() {
        return cl;
    }

    public JPanel getAyuda() {
        return ayuda;
    }

    public JPanel getConfig() {
        return config;
    }

    public JPanel getInicio() {
        return Inicio;
    }

    public JPanel getSeleccion() {
        return Seleccion;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JPanel();
        IrAyuda = new javax.swing.JButton();
        IrConfiguracion = new javax.swing.JButton();
        IrSeleccion = new javax.swing.JButton();
        Tittle = new javax.swing.JLabel();
        BCK1 = new javax.swing.JLabel();
        Ayuda = new javax.swing.JPanel();
        VolverInicio = new javax.swing.JButton();
        BCK2 = new javax.swing.JLabel();
        Configuracion = new javax.swing.JPanel();
        VolvInicio = new javax.swing.JButton();
        BCK3 = new javax.swing.JLabel();
        Seleccion = new javax.swing.JPanel();
        IrMary = new javax.swing.JButton();
        IrKatherin = new javax.swing.JButton();
        VolInicio = new javax.swing.JButton();
        IrDorothy = new javax.swing.JButton();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        BCK4 = new javax.swing.JLabel();
        historiaKatherin = new Interfaz.HistoriaKatherin();
        historiaMary = new Interfaz.HistoriaMary();
        HistoriaDorothy = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1400, 800));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        setLayout(new java.awt.CardLayout());

        Inicio.setMaximumSize(new java.awt.Dimension(1400, 800));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IrAyuda.setBackground(java.awt.SystemColor.text);
        IrAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b5.png"))); // NOI18N
        IrAyuda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IrAyuda.setContentAreaFilled(false);
        IrAyuda.setMaximumSize(new java.awt.Dimension(320, 270));
        IrAyuda.setMinimumSize(new java.awt.Dimension(320, 270));
        IrAyuda.setPreferredSize(new java.awt.Dimension(320, 270));
        IrAyuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b5-P.png"))); // NOI18N
        IrAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b5-S.png"))); // NOI18N
        IrAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAyudaActionPerformed(evt);
            }
        });
        Inicio.add(IrAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 340, 300));

        IrConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b7.png"))); // NOI18N
        IrConfiguracion.setContentAreaFilled(false);
        IrConfiguracion.setMaximumSize(new java.awt.Dimension(340, 283));
        IrConfiguracion.setMinimumSize(new java.awt.Dimension(340, 283));
        IrConfiguracion.setPreferredSize(new java.awt.Dimension(340, 283));
        IrConfiguracion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b7_P.png"))); // NOI18N
        IrConfiguracion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b7-S.png"))); // NOI18N
        IrConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrConfiguracionActionPerformed(evt);
            }
        });
        Inicio.add(IrConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, -1, -1));

        IrSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b6.png"))); // NOI18N
        IrSeleccion.setContentAreaFilled(false);
        IrSeleccion.setMaximumSize(new java.awt.Dimension(320, 257));
        IrSeleccion.setMinimumSize(new java.awt.Dimension(320, 257));
        IrSeleccion.setPreferredSize(new java.awt.Dimension(320, 257));
        IrSeleccion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b6-P.png"))); // NOI18N
        IrSeleccion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b6_S.png"))); // NOI18N
        IrSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrSeleccionActionPerformed(evt);
            }
        });
        Inicio.add(IrSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        Tittle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/EstellarG.png"))); // NOI18N
        Inicio.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        BCK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/InicioE.png"))); // NOI18N
        Inicio.add(BCK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Inicio, "INICIO");

        Ayuda.setMaximumSize(new java.awt.Dimension(1400, 800));
        Ayuda.setPreferredSize(new java.awt.Dimension(1400, 800));
        Ayuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VolverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12.png"))); // NOI18N
        VolverInicio.setContentAreaFilled(false);
        VolverInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12-P.png"))); // NOI18N
        VolverInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12-S.png"))); // NOI18N
        VolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverInicioActionPerformed(evt);
            }
        });
        Ayuda.add(VolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 80));

        BCK2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Ayuda.png"))); // NOI18N
        Ayuda.add(BCK2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Ayuda, "AYUDA");

        Configuracion.setMaximumSize(new java.awt.Dimension(1400, 800));
        Configuracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VolvInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12.png"))); // NOI18N
        VolvInicio.setContentAreaFilled(false);
        VolvInicio.setMaximumSize(new java.awt.Dimension(110, 79));
        VolvInicio.setMinimumSize(new java.awt.Dimension(110, 79));
        VolvInicio.setPreferredSize(new java.awt.Dimension(110, 79));
        VolvInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12-P.png"))); // NOI18N
        VolvInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12-S.png"))); // NOI18N
        VolvInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolvInicioActionPerformed(evt);
            }
        });
        Configuracion.add(VolvInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        BCK3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/configE.png"))); // NOI18N
        Configuracion.add(BCK3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Configuracion, "CONFIG");
        Configuracion.getAccessibleContext().setAccessibleName("");

        Seleccion.setMaximumSize(new java.awt.Dimension(1400, 800));
        Seleccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionFocusGained(evt);
            }
        });
        Seleccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SeleccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SeleccionKeyTyped(evt);
            }
        });
        Seleccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IrMary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b2.png"))); // NOI18N
        IrMary.setContentAreaFilled(false);
        IrMary.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b2-P.png"))); // NOI18N
        IrMary.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b2-S.png"))); // NOI18N
        IrMary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrMaryActionPerformed(evt);
            }
        });
        Seleccion.add(IrMary, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, 350));

        IrKatherin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b3.png"))); // NOI18N
        IrKatherin.setContentAreaFilled(false);
        IrKatherin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b3-P.png"))); // NOI18N
        IrKatherin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b3-S.png"))); // NOI18N
        IrKatherin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrKatherinActionPerformed(evt);
            }
        });
        Seleccion.add(IrKatherin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 330));

        VolInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12.png"))); // NOI18N
        VolInicio.setContentAreaFilled(false);
        VolInicio.setMaximumSize(new java.awt.Dimension(110, 79));
        VolInicio.setMinimumSize(new java.awt.Dimension(110, 79));
        VolInicio.setPreferredSize(new java.awt.Dimension(110, 79));
        VolInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12-P.png"))); // NOI18N
        VolInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b12-S.png"))); // NOI18N
        VolInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolInicioActionPerformed(evt);
            }
        });
        Seleccion.add(VolInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        IrDorothy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/b1-Invalid.png"))); // NOI18N
        IrDorothy.setContentAreaFilled(false);
        IrDorothy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrDorothyActionPerformed(evt);
            }
        });
        Seleccion.add(IrDorothy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 330));

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/D1.png"))); // NOI18N
        Seleccion.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, 270));

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/D2.png"))); // NOI18N
        Seleccion.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, 280));

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/D3.png"))); // NOI18N
        Seleccion.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, 280));

        BCK4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/SeleccionE.png"))); // NOI18N
        Seleccion.add(BCK4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Seleccion, "SELECCION");

        historiaKatherin.setMaximumSize(new java.awt.Dimension(1400, 800));
        historiaKatherin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                historiaKatherinFocusGained(evt);
            }
        });
        add(historiaKatherin, "KATes");

        historiaMary.setMaximumSize(new java.awt.Dimension(1400, 800));
        historiaMary.setMinimumSize(new java.awt.Dimension(1400, 800));
        add(historiaMary, "MARYes");

        javax.swing.GroupLayout HistoriaDorothyLayout = new javax.swing.GroupLayout(HistoriaDorothy);
        HistoriaDorothy.setLayout(HistoriaDorothyLayout);
        HistoriaDorothyLayout.setHorizontalGroup(
            HistoriaDorothyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        HistoriaDorothyLayout.setVerticalGroup(
            HistoriaDorothyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );

        add(HistoriaDorothy, "HISD");
    }// </editor-fold>//GEN-END:initComponents

    private void IrAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAyudaActionPerformed
        cl.show(this, "AYUDA");
    }//GEN-LAST:event_IrAyudaActionPerformed

    private void IrConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrConfiguracionActionPerformed
        cl.show(this, "CONFIG");
    }//GEN-LAST:event_IrConfiguracionActionPerformed

    private void VolvInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolvInicioActionPerformed
        cl.show(this, "INICIO");
    }//GEN-LAST:event_VolvInicioActionPerformed

    private void IrSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrSeleccionActionPerformed
        cl.show(this, "SELECCION");
        Seleccion.setRequestFocusEnabled(true);
        Seleccion.grabFocus();
    }//GEN-LAST:event_IrSeleccionActionPerformed

    private void VolInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolInicioActionPerformed

        cl.show(this, "INICIO");
    }//GEN-LAST:event_VolInicioActionPerformed

    private void IrKatherinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrKatherinActionPerformed
        
        if (cont > 3 && historiasWin[0] == false){
            cl.show(this, "KATes");
            historiaKatherin.setRequestFocusEnabled(true);
            historiaKatherin.grabFocus();
        }else{
            Seleccion.setRequestFocusEnabled(true);
            Seleccion.grabFocus();
        }
    }//GEN-LAST:event_IrKatherinActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
       
    }//GEN-LAST:event_formFocusLost

    private void VolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverInicioActionPerformed
        cl.show(this, "INICIO");
    }//GEN-LAST:event_VolverInicioActionPerformed

    private void SeleccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeleccionKeyTyped
        
    }//GEN-LAST:event_SeleccionKeyTyped

    private void SeleccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionFocusGained
       
    }//GEN-LAST:event_SeleccionFocusGained

    private void SeleccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeleccionKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            if (cont == 2) {
                D1.setVisible(false);
                D2.setVisible(true);
                cont++;
            } else {
                if (cont == 3) {
                    D2.setVisible(false);
                    D3.setVisible(true);
                    cont++;
                } else {
                    if (cont > 3) {
                        D3.setVisible(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_SeleccionKeyPressed

    private void historiaKatherinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_historiaKatherinFocusGained
        historiaKatherin.iniciarP();
    }//GEN-LAST:event_historiaKatherinFocusGained

    private void IrMaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrMaryActionPerformed
        if (cont > 3 && historiasWin[1] == false){
            cl.show(this, "MARYes");
            historiaMary.setRequestFocusEnabled(true);
            historiaMary.grabFocus();
        }else{
            Seleccion.setRequestFocusEnabled(true);
            Seleccion.grabFocus();
        }
    }//GEN-LAST:event_IrMaryActionPerformed

    private void IrDorothyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrDorothyActionPerformed
        Seleccion.setRequestFocusEnabled(true);
        Seleccion.grabFocus();
    }//GEN-LAST:event_IrDorothyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ayuda;
    private javax.swing.JLabel BCK1;
    private javax.swing.JLabel BCK2;
    private javax.swing.JLabel BCK3;
    private javax.swing.JLabel BCK4;
    private javax.swing.JPanel Configuracion;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JPanel HistoriaDorothy;
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton IrAyuda;
    private javax.swing.JButton IrConfiguracion;
    private javax.swing.JButton IrDorothy;
    private javax.swing.JButton IrKatherin;
    private javax.swing.JButton IrMary;
    private javax.swing.JButton IrSeleccion;
    private javax.swing.JPanel Seleccion;
    private javax.swing.JLabel Tittle;
    private javax.swing.JButton VolInicio;
    private javax.swing.JButton VolvInicio;
    private javax.swing.JButton VolverInicio;
    private Interfaz.HistoriaKatherin historiaKatherin;
    private Interfaz.HistoriaMary historiaMary;
    // End of variables declaration//GEN-END:variables
}
