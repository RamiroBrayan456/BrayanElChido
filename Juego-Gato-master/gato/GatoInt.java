/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author HP
 */
public class GatoInt extends javax.swing.JFrame {

    private boolean jugador;
    private String[][] movimientos;
  
    public GatoInt() {
        per.obtenerDatos();
        jugador = true; //se inicializa en el jujador 1 que son X
        movimientos = new String[3][3];
        llenarTablero();
        initComponents();
        Pantalla2.setText(per.nombre);
        Pantalla1.setText(per.nombre0);
       
    }
    Persona per = new Persona ();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla1 = new javax.swing.JTextField();
        Pantalla2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        consola = new javax.swing.JLabel();
        consola1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla1.setEditable(false);
        Pantalla1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        Pantalla1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pantalla1.setBorder(new javax.swing.border.MatteBorder(null));
        Pantalla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pantalla1ActionPerformed(evt);
            }
        });
        getContentPane().add(Pantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 110, 30));

        Pantalla2.setEditable(false);
        Pantalla2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        Pantalla2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pantalla2.setBorder(new javax.swing.border.MatteBorder(null));
        Pantalla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pantalla2ActionPerformed(evt);
            }
        });
        getContentPane().add(Pantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        boton1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(boton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Reiniciar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        Reiniciar.setText("Nuevo Juego");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 100, -1));

        salir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jButton1.setText("Personalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        consola.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        consola.setForeground(new java.awt.Color(255, 255, 255));
        consola.setText("Jugador 2 (o)");
        getContentPane().add(consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 20));

        consola1.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        consola1.setForeground(new java.awt.Color(255, 255, 255));
        consola1.setText("Jugador 1 (x)");
        getContentPane().add(consola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 90, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ojos de gato en fondo negro-85785.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 140, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        if(jugador && movimientos[0][0].equals("i"))
        {
            boton1.setText("X");
            setMovimiento(0,0,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null,per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[0][0].equals("i"))
        {
            boton1.setText("O");
            setMovimiento(0,0,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(jugador && movimientos[0][1].equals("i"))
        {
            boton2.setText("X");
            setMovimiento(0,1,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[0][1].equals("i"))
        {
            boton2.setText("O");
            setMovimiento(0,1,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(jugador && movimientos[0][2].equals("i"))
        {
            boton3.setText("X");
            setMovimiento(0,2,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[0][2].equals("i"))
        {
            boton3.setText("O");
            setMovimiento(0,2,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if(jugador && movimientos[1][0].equals("i"))
        {
            boton4.setText("X");
            setMovimiento(1,0,"X");
            jugador = false;
           imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[1][0].equals("i"))
        {
            boton4.setText("O");
            setMovimiento(1,0,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null,per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(jugador && movimientos[1][1].equals("i"))
        {
            boton5.setText("X");
            setMovimiento(1,1,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[1][1].equals("i"))
        {
            boton5.setText("O");
            setMovimiento(1,1,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(jugador && movimientos[1][2].equals("i"))
        {
            boton6.setText("X");
            setMovimiento(1,2,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null,per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[1][2].equals("i"))
        {
            boton6.setText("O");
            setMovimiento(1,2,"O");
            jugador = true;
           imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(jugador && movimientos[2][0].equals("i"))
        {
            boton7.setText("X");
            setMovimiento(2,0,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null,per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[2][0].equals("i"))
        {
            boton7.setText("O");
            setMovimiento(2,0,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(jugador && movimientos[2][1].equals("i"))
        {
            boton8.setText("X");
            setMovimiento(2,1,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[2][1].equals("i"))
        {
            boton8.setText("O");
            setMovimiento(2,1,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(jugador && movimientos[2][2].equals("i"))
        {
            boton9.setText("X");
            setMovimiento(2,2,"X");
            jugador = false;
            imprimirTablero();
            if(ganador1())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre + " ha ganado!!");
        }
        else if(!jugador && movimientos[2][2].equals("i"))
        {
            boton9.setText("O");
            setMovimiento(2,2,"O");
            jugador = true;
            imprimirTablero();
            if(ganador2())
            javax.swing.JOptionPane.showMessageDialog(null, per.nombre0 + " ha ganado!!");
        }
    }//GEN-LAST:event_boton9ActionPerformed

    private void Pantalla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pantalla1ActionPerformed

    }//GEN-LAST:event_Pantalla1ActionPerformed

    private void Pantalla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pantalla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pantalla2ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
    this.setExtendedState(ICONIFIED);
                new GatoInt().setVisible(true);
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
this.setExtendedState(ICONIFIED);
 new Menu().setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setExtendedState(ICONIFIED);
         
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gato().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean ganador1()
    {
        if( ((movimientos[0][0].equals("X")) && (movimientos[0][1].equals("X")) && (movimientos[0][2].equals("X")))
                || ((movimientos[1][0].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[1][2].equals("X")))
                || ((movimientos[2][0].equals("X")) && (movimientos[2][1].equals("X")) && (movimientos[2][2].equals("X")))
                || ((movimientos[0][0].equals("X")) && (movimientos[1][0].equals("X")) && (movimientos[2][0].equals("X")))
                || ((movimientos[0][1].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[2][1].equals("X")))
                || ((movimientos[0][2].equals("X")) && (movimientos[1][2].equals("X")) && (movimientos[2][2].equals("X")))
                || ((movimientos[0][0].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[2][2].equals("X")))
                || ((movimientos[0][2].equals("X")) && (movimientos[1][1].equals("X")) && (movimientos[2][0].equals("X"))))
                return true;
                
         else
            return false;
    }
    
    public boolean ganador2()
    {
        if( ((movimientos[0][0].equals("O")) && (movimientos[0][1].equals("O")) && (movimientos[0][2].equals("O")))
                || ((movimientos[1][0].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[1][2].equals("O")))
                || ((movimientos[2][0].equals("O")) && (movimientos[2][1].equals("O")) && (movimientos[2][2].equals("O")))
                || ((movimientos[0][0].equals("O")) && (movimientos[1][0].equals("O")) && (movimientos[2][0].equals("O")))
                || ((movimientos[0][1].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[2][1].equals("O")))
                || ((movimientos[0][2].equals("O")) && (movimientos[1][2].equals("O")) && (movimientos[2][2].equals("O")))
                || ((movimientos[0][0].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[2][2].equals("O")))
                || ((movimientos[0][2].equals("O")) && (movimientos[1][1].equals("O")) && (movimientos[2][0].equals("O"))))
                return true;
                
         else
            return false;
    }
    
    public void setMovimiento(int i, int j, String m)
    {
        movimientos[i][j] = m;
    }
    public void llenarTablero()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                movimientos[i][j] = "i";
            }
        }
    }
    
    public void imprimirTablero(){
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
          
            }
           
        }
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GatoInt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pantalla1;
    private javax.swing.JTextField Pantalla2;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JLabel consola;
    private javax.swing.JLabel consola1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
