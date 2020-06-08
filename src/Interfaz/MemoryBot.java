/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import EstellarG.LogicaMemoryBot;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 * PlayGame
 * En este JFrame se organizan los botones definidos en la parte grafica y a estos se les asigna una imagen aleatoria <br>
 * contiene tambien el metodo para determinar el estado de las cartas, metodo para determinar si el usuario gano, un thread que controla el tiempo del juego <br>
 * y el metodo reiniciar.<br>
 * @author Eliana Velasquez
 * @version 2.0 17/05/20
 */
public class MemoryBot extends javax.swing.JFrame {

    
    private LogicaMemoryBot log = new LogicaMemoryBot();
    private HistoriaKatherin historiaK;
    private boolean caraUp = false;
    private ImageIcon Im1;
     private ImageIcon Im2;
     private JButton[] pbtn= new JButton [2];
     private boolean primerc= false;
     private int puntaje= 0;
     int xx=1;
     int tiempo =0, infinito = 0;
     boolean ganar;
    
     /**
      * PlayGame<br>
      * Se inicializan los valores principales del juego cuando este es ejecutado. <br>
      */
    public MemoryBot(HistoriaKatherin histK, Boolean win) {
        super();
        initComponents();
        setCards();
        this.ganar = win;
        this.historiaK = histK;
        Reset.setVisible(false);
        Time.setEnabled(false);
        Katherin.setVisible(false);
        hilo1.start();
        InfoT2.setEnabled(false);
        InfoT2.setText("Calculando su puntaje...");
        conti.setVisible(false);
    }
    
   /**
    * hilo1
    * El hilo se encarga que el juego se desarrolle en un intervalo de tiempo de 40 segundos, si el usuario no puede completar el juego en 40 segundos<br>
    * se envia un mensaje a un Jlabel llamado com1 para informarle que ha perdido.<br>
    * Tambien el hilo establece que el juego empieze a correr una vez que la variable xx sea igual a 0, esta se inicializa con el valor de 1 pero cuando el usuario presiona el boton de "Comenzar" cambia inmediatamente a 0,<br>
    * cuando la variable tiempo sea igual a 20, aparece un label con el personaje Katherine que contiene un cuadro de dialogo en donde le brinda informacion acerca de ella al usuario.<br>
    */
   

    Thread hilo1=new Thread(){
            @Override
            public void run(){
                int x=0;
                infinito=0;
            int c=0;
            while(infinito==0){
            try{
               if (xx==0){     
            Time.setText(String.valueOf(tiempo++));
               }
               c++;
               if (tiempo==10){
                   Katherin.setVisible(true);
               } 
               if (tiempo ==20){
                   Katherin.setVisible(false);
               }
               if (tiempo==40){
                   if (ganar==false){
                       InfoT.setText("Perdiste, Intentalo de nuevo");
                       Time.setText("40");
                       xx=1;
                   }
               }
            Thread.sleep(1000);
            } catch (InterruptedException e){
            
            }
            }
            }
            };

    
    /**SetCards
     * Metodo para ordenar aleatoriamente las cartas.
     * Asigna una imagen de forma aleatoria utilizando la clase LogicaJuego.<br>
     * @see LogicaJuego.java
     */
    private void setCards(){
       
        int[] numbers = log.getCardNumbers();
     
         Card1.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[0]+".png")));
         Card2.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[1]+".png")));
         Card3.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[2]+".png")));
         Card4.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[3]+".png")));
         Card5.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[4]+".png")));
         Card6.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[5]+".png")));
         Card7.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[6]+".png")));
         Card8.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[7]+".png")));
         Card9.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[8]+".png")));
         Card10.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[9]+".png")));
         Card11.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[10]+".png")));
         Card12.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[11]+".png")));
         Card13.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[12]+".png")));
         Card14.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[13]+".png")));
         Card15.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[14]+".png")));
         Card16.setDisabledIcon(new ImageIcon(getClass().getResource("../Resources/Images/MemoryBot/b"+numbers[15]+".png")));
             
    }
    /**
     * btnEnabled <br>
     * Comprueba el estado del boton y si este se encuentra disponible cuando el usuario lo selecciona.<br>
     * @param btn recibe un Jbutton <br>
     */
    
    private void btnEnabled (JButton btn){
        if (xx==0){
        if (!caraUp){
            btn.setEnabled(false);
            Im1=(ImageIcon) btn.getDisabledIcon();
            pbtn[0]=btn;
            caraUp= true;
            primerc= false;
            
        } else{
            btn.setEnabled(false);
            Im2= (ImageIcon) btn.getDisabledIcon();
            pbtn[1]=btn;
            primerc= true;
            puntaje += 100;
            pregwin();
           
            
        }
        }
    }
    /**
     * compare<br>
     * Metodo que compara las cartas seleccionadas y decide si son pares o no.<br>
     */
    private void compare (){
        if (xx==0){
        if (caraUp && primerc) {
            
            if(Im1.getDescription().compareTo(Im2.getDescription()) !=0){
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
               if (puntaje > 10) puntaje -= 50;
                
            }
            caraUp= false;
        }
        }
    }
    /**reiniciar<br>
     * Reestablece todos los valores iniciales del juego <br>
     */
    private void reiniciar(){
        Card1.setEnabled(true);
        Card2.setEnabled(true);
        Card3.setEnabled(true);
        Card4.setEnabled(true);
        Card5.setEnabled(true);
        Card6.setEnabled(true);
        Card7.setEnabled(true);
        Card8.setEnabled(true);
        Card9.setEnabled(true);
        Card10.setEnabled(true);
        Card11.setEnabled(true);
        Card12.setEnabled(true);
        Card13.setEnabled(true);
        Card14.setEnabled(true);
        Card15.setEnabled(true);
        Card16.setEnabled(true);
        
        primerc= false;
        caraUp= false;
        puntaje =0;
        InfoT1.setText("Es momento de retar a tu memoria");
        InfoT.setText("¿Puedes hacerlo? ");
        InfoT2.setText(" ");
        tiempo=0;
    }
    /**pregwin<br>
     * metodo que verifica el estado de las cartas, si todas estas se encuentran volteadas y con su par, envia un mensaje al jlabel com1 que le informa al usuario que ha ganado.<br>
     */
    private void pregwin (){
        if (!Card1.isEnabled()&&!Card2.isEnabled()&&!Card3.isEnabled()&&!Card4.isEnabled()&&!Card5.isEnabled()&&!Card6.isEnabled()&&
                !Card7.isEnabled()&&!Card8.isEnabled()&&!Card9.isEnabled()&&!Card10.isEnabled()&&!Card11.isEnabled()&&
                !Card12.isEnabled()&&!Card13.isEnabled()&&!Card14.isEnabled()&&!Card15.isEnabled()&&!Card16.isEnabled()){
            InfoT1.setText("¡FELICIDADES! Realmente estás");
            InfoT.setText("capacitad@ para esto");
            int comentario= puntaje;
            String comen = Integer.toString(comentario);
            InfoT2.setText(comen);
            conti.setVisible(true);
            infinito = 1;
            historiaK.setWin(1, true);
            if (historiaK.getWin(1) == true){
                System.out.println("la hace true");
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Card1 = new javax.swing.JButton();
        Card2 = new javax.swing.JButton();
        Card3 = new javax.swing.JButton();
        Card4 = new javax.swing.JButton();
        Card5 = new javax.swing.JButton();
        Card6 = new javax.swing.JButton();
        Card7 = new javax.swing.JButton();
        Card8 = new javax.swing.JButton();
        Card9 = new javax.swing.JButton();
        Card10 = new javax.swing.JButton();
        Card11 = new javax.swing.JButton();
        Card12 = new javax.swing.JButton();
        Card13 = new javax.swing.JButton();
        Card14 = new javax.swing.JButton();
        Card15 = new javax.swing.JButton();
        Card16 = new javax.swing.JButton();
        InfoT = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        InfoT2 = new javax.swing.JTextField();
        Time = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        TimeL = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        InfoT1 = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        Katherin = new javax.swing.JLabel();
        conti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");
        setPreferredSize(new java.awt.Dimension(857, 1176));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card1.setBorder(null);
        Card1.setBorderPainted(false);
        Card1.setContentAreaFilled(false);
        Card1.setFocusable(false);
        Card1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card1MouseExited(evt);
            }
        });
        Card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card1ActionPerformed(evt);
            }
        });
        jPanel1.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card2.setBorder(null);
        Card2.setBorderPainted(false);
        Card2.setContentAreaFilled(false);
        Card2.setFocusable(false);
        Card2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card2MouseExited(evt);
            }
        });
        Card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card2ActionPerformed(evt);
            }
        });
        jPanel1.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card3.setBorder(null);
        Card3.setBorderPainted(false);
        Card3.setContentAreaFilled(false);
        Card3.setFocusable(false);
        Card3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card3MouseExited(evt);
            }
        });
        Card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card3ActionPerformed(evt);
            }
        });
        jPanel1.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card4.setBorder(null);
        Card4.setBorderPainted(false);
        Card4.setContentAreaFilled(false);
        Card4.setFocusable(false);
        Card4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card4MouseExited(evt);
            }
        });
        Card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card4ActionPerformed(evt);
            }
        });
        jPanel1.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card5.setBorder(null);
        Card5.setBorderPainted(false);
        Card5.setContentAreaFilled(false);
        Card5.setFocusable(false);
        Card5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card5MouseExited(evt);
            }
        });
        Card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card5ActionPerformed(evt);
            }
        });
        jPanel1.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card6.setBorder(null);
        Card6.setBorderPainted(false);
        Card6.setContentAreaFilled(false);
        Card6.setFocusable(false);
        Card6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card6MouseExited(evt);
            }
        });
        Card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card6ActionPerformed(evt);
            }
        });
        jPanel1.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card7.setBorder(null);
        Card7.setBorderPainted(false);
        Card7.setContentAreaFilled(false);
        Card7.setFocusable(false);
        Card7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card7MouseExited(evt);
            }
        });
        Card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card7ActionPerformed(evt);
            }
        });
        jPanel1.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card8.setBorder(null);
        Card8.setBorderPainted(false);
        Card8.setContentAreaFilled(false);
        Card8.setFocusable(false);
        Card8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card8MouseExited(evt);
            }
        });
        Card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card8ActionPerformed(evt);
            }
        });
        jPanel1.add(Card8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card9.setBorder(null);
        Card9.setBorderPainted(false);
        Card9.setContentAreaFilled(false);
        Card9.setFocusable(false);
        Card9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card9MouseExited(evt);
            }
        });
        Card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card9ActionPerformed(evt);
            }
        });
        jPanel1.add(Card9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card10.setBorder(null);
        Card10.setBorderPainted(false);
        Card10.setContentAreaFilled(false);
        Card10.setFocusable(false);
        Card10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card10MouseExited(evt);
            }
        });
        Card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card10ActionPerformed(evt);
            }
        });
        jPanel1.add(Card10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card11.setBorder(null);
        Card11.setBorderPainted(false);
        Card11.setContentAreaFilled(false);
        Card11.setFocusable(false);
        Card11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card11MouseExited(evt);
            }
        });
        Card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card11ActionPerformed(evt);
            }
        });
        jPanel1.add(Card11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card12.setBorder(null);
        Card12.setBorderPainted(false);
        Card12.setContentAreaFilled(false);
        Card12.setFocusable(false);
        Card12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card12MouseExited(evt);
            }
        });
        Card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card12ActionPerformed(evt);
            }
        });
        jPanel1.add(Card12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card13.setBorder(null);
        Card13.setBorderPainted(false);
        Card13.setContentAreaFilled(false);
        Card13.setFocusable(false);
        Card13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card13MouseExited(evt);
            }
        });
        Card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card13ActionPerformed(evt);
            }
        });
        jPanel1.add(Card13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, -1, -1));

        Card14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card14.setBorder(null);
        Card14.setBorderPainted(false);
        Card14.setContentAreaFilled(false);
        Card14.setFocusable(false);
        Card14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card14MouseExited(evt);
            }
        });
        Card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card14ActionPerformed(evt);
            }
        });
        jPanel1.add(Card14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, -1, -1));

        Card15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card15.setBorder(null);
        Card15.setBorderPainted(false);
        Card15.setContentAreaFilled(false);
        Card15.setFocusable(false);
        Card15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card15MouseExited(evt);
            }
        });
        Card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card15ActionPerformed(evt);
            }
        });
        jPanel1.add(Card15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, -1, -1));

        Card16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/b0.png"))); // NOI18N
        Card16.setBorder(null);
        Card16.setBorderPainted(false);
        Card16.setContentAreaFilled(false);
        Card16.setFocusable(false);
        Card16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/bb.png"))); // NOI18N
        Card16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card16MouseExited(evt);
            }
        });
        Card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card16ActionPerformed(evt);
            }
        });
        jPanel1.add(Card16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        InfoT.setBackground(new java.awt.Color(255, 255, 255));
        InfoT.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        InfoT.setForeground(new java.awt.Color(255, 255, 255));
        InfoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoT.setText("¿Puedes hacerlo?");
        jPanel1.add(InfoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 360, 50));
        InfoT.getAccessibleContext().setAccessibleName(" Es momento de retar a tu memoria");

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/reiniciar.png"))); // NOI18N
        Reset.setBorder(null);
        Reset.setContentAreaFilled(false);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 50, 50));

        InfoT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoT2ActionPerformed(evt);
            }
        });
        jPanel1.add(InfoT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 162, 41));
        jPanel1.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 160, 40));

        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/playy.png"))); // NOI18N
        Start.setBorder(null);
        Start.setContentAreaFilled(false);
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        jPanel1.add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 130, 130));

        TimeL.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        TimeL.setForeground(new java.awt.Color(255, 255, 255));
        TimeL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/time.png"))); // NOI18N
        jPanel1.add(TimeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, 33));

        Score.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/point.png"))); // NOI18N
        jPanel1.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        InfoT1.setBackground(new java.awt.Color(255, 255, 255));
        InfoT1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        InfoT1.setForeground(new java.awt.Color(255, 255, 255));
        InfoT1.setText(" Es momento de retar a tu memoria");
        jPanel1.add(InfoT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 370, 50));

        T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/N2-removebg-preview.png"))); // NOI18N
        jPanel1.add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        Katherin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/2.png"))); // NOI18N
        jPanel1.add(Katherin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, -1, -1));

        conti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/Continuar.png"))); // NOI18N
        conti.setToolTipText("");
        conti.setContentAreaFilled(false);
        conti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/Continuar-P.png"))); // NOI18N
        conti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/MemoryBot/Continuar-S.png"))); // NOI18N
        conti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contiActionPerformed(evt);
            }
        });
        jPanel1.add(conti, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 855, 871);
    }// </editor-fold>//GEN-END:initComponents

    private void Card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card1ActionPerformed
        btnEnabled (Card1);
    }//GEN-LAST:event_Card1ActionPerformed

    private void Card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card2ActionPerformed
         btnEnabled (Card2);
    }//GEN-LAST:event_Card2ActionPerformed

    private void Card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card3ActionPerformed
        btnEnabled (Card3);
    }//GEN-LAST:event_Card3ActionPerformed

    private void Card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card4ActionPerformed
         btnEnabled (Card4);
    }//GEN-LAST:event_Card4ActionPerformed

    private void Card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card5ActionPerformed
         btnEnabled (Card5);
    }//GEN-LAST:event_Card5ActionPerformed

    private void Card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card6ActionPerformed
         btnEnabled (Card6);
    }//GEN-LAST:event_Card6ActionPerformed

    private void Card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card7ActionPerformed
        btnEnabled (Card7);
    }//GEN-LAST:event_Card7ActionPerformed

    private void Card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card8ActionPerformed
         btnEnabled (Card8);
    }//GEN-LAST:event_Card8ActionPerformed

    private void Card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card9ActionPerformed
          btnEnabled (Card9);
    }//GEN-LAST:event_Card9ActionPerformed

    private void Card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card10ActionPerformed
         btnEnabled (Card10);
    }//GEN-LAST:event_Card10ActionPerformed

    private void Card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card11ActionPerformed
         btnEnabled (Card11);
    }//GEN-LAST:event_Card11ActionPerformed

    private void Card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card12ActionPerformed
        btnEnabled (Card12);
    }//GEN-LAST:event_Card12ActionPerformed

    private void Card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card13ActionPerformed
        btnEnabled (Card13);
    }//GEN-LAST:event_Card13ActionPerformed

    private void Card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card14ActionPerformed
          btnEnabled (Card14);
    }//GEN-LAST:event_Card14ActionPerformed

    private void Card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card15ActionPerformed
          btnEnabled (Card15);
    }//GEN-LAST:event_Card15ActionPerformed

    private void Card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card16ActionPerformed
          btnEnabled (Card16);
    }//GEN-LAST:event_Card16ActionPerformed

    private void Card1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card1MouseExited
         compare ();
    }//GEN-LAST:event_Card1MouseExited

    private void Card2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card2MouseExited
        compare ();
    }//GEN-LAST:event_Card2MouseExited

    private void Card3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card3MouseExited
        compare ();
    }//GEN-LAST:event_Card3MouseExited

    private void Card4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card4MouseExited
       compare ();
    }//GEN-LAST:event_Card4MouseExited

    private void Card5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card5MouseExited
       compare ();
    }//GEN-LAST:event_Card5MouseExited

    private void Card6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card6MouseExited
        compare ();
    }//GEN-LAST:event_Card6MouseExited

    private void Card7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card7MouseExited
     compare ();
    }//GEN-LAST:event_Card7MouseExited

    private void Card8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card8MouseExited
       compare ();
    }//GEN-LAST:event_Card8MouseExited

    private void Card9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card9MouseExited
        compare ();
    }//GEN-LAST:event_Card9MouseExited

    private void Card10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card10MouseExited
        compare ();
    }//GEN-LAST:event_Card10MouseExited

    private void Card11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card11MouseExited
        compare ();
    }//GEN-LAST:event_Card11MouseExited

    private void Card12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card12MouseExited
        compare ();
    }//GEN-LAST:event_Card12MouseExited

    private void Card13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card13MouseExited
      compare ();
    }//GEN-LAST:event_Card13MouseExited

    private void Card14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card14MouseExited
        compare ();
    }//GEN-LAST:event_Card14MouseExited

    private void Card15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card15MouseExited
       compare ();
    }//GEN-LAST:event_Card15MouseExited

    private void Card16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card16MouseExited
        compare ();
    }//GEN-LAST:event_Card16MouseExited

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        xx=0;
        Start.setVisible(false);
        Reset.setVisible(true);
    }//GEN-LAST:event_StartActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
         reiniciar();
    }//GEN-LAST:event_ResetActionPerformed

    private void InfoT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoT2ActionPerformed

    private void contiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contiActionPerformed
        dispose();
        this.historiaK.setRequestFocusEnabled(true);
        historiaK.grabFocus();
    }//GEN-LAST:event_contiActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Card1;
    private javax.swing.JButton Card10;
    private javax.swing.JButton Card11;
    private javax.swing.JButton Card12;
    private javax.swing.JButton Card13;
    private javax.swing.JButton Card14;
    private javax.swing.JButton Card15;
    private javax.swing.JButton Card16;
    private javax.swing.JButton Card2;
    private javax.swing.JButton Card3;
    private javax.swing.JButton Card4;
    private javax.swing.JButton Card5;
    private javax.swing.JButton Card6;
    private javax.swing.JButton Card7;
    private javax.swing.JButton Card8;
    private javax.swing.JButton Card9;
    private javax.swing.JLabel InfoT;
    private javax.swing.JLabel InfoT1;
    private javax.swing.JTextField InfoT2;
    private javax.swing.JLabel Katherin;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Score;
    private javax.swing.JButton Start;
    private javax.swing.JLabel T;
    private javax.swing.JTextField Time;
    private javax.swing.JLabel TimeL;
    private javax.swing.JButton conti;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
