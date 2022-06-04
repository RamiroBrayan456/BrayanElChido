package gato;

//import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class gato extends javax.swing.JFrame implements ActionListener {

    Boton[][] botones;
    int contador;
    int tamano;
    int limitante;
    String jugador1, jugador2;
    String x,o;
    String ganador;

    public gato() {
        per.obtenerDatos();
        initComponents();
        contador = 0;
        initComponents();
        rellenar();
        
    }
Persona per = new Persona ();
    public void rellenar() {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Indica el tamaño del tablero"));
        this.jugador1 = per.nombre;
        this.jugador2 = per.nombre0;
       
        this.tamano = x;
        botones = new Boton[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                botones[i][j] = new Boton();
                botones[i][j].A.setBounds((i * 60) + 6, (j * 60) + 10, 60, 60);
                botones[i][j].A.addActionListener(this);
                this.add(botones[i][j].A);
            }
        }

    }
    public void salir(){
        Container cp = getContentPane();
        cp.add(new JButton("Salir"));
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getTamano() {
        return tamano;
    }

    public void actionPerformed(ActionEvent e) {
        limitante = this.getTamano() * this.getTamano();
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (e.getSource() == botones[i][j].A) {
                    Tiro(botones[i][j]);
                    if (Revisar()) {
                        JOptionPane.showMessageDialog(null, "Has ganado! " + "JUGADOR " + this.getGanador());
                        //Reiniciar();
                    } else if (contador < limitante - 1) {
                        contador++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Juego empatado!");
                        //Reiniciar();
                    }
                }
            }
        }
    }

    void Tiro(Boton X) {
        ImageIcon ICONO = null;
        if (contador % 2 == 0) {
            this.bien.setText("Es turno del jugador: " + this.getJugador2());
            X.A.setText(per.ficha);
            X.B = 1;
        } else {
            this.bien.setText("Es turno del jugador: " + this.getJugador1());
            X.A.setText(per.ficha0);
            X.B = 4;
        }
        X.A.removeActionListener(this);
    }

    boolean Revisar() {
        boolean Gano = false;
        int cap1 = 0;
        int din = 0;
        din = this.getTamano() - 1;
//===================================================PRIMER JUGADOR=========================================
        //revisar las filas
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (botones[i][j].A.getText() == per.ficha) {
                    cap1 = cap1 + 1;
                }
            }
            if (cap1 == this.getTamano()) {
                Gano = true;
                this.ganador = this.jugador1;
                break;
            }
            cap1 = 0;
        }

        //revisar las columnas
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (botones[j][i].A.getText() == per.ficha) {
                    cap1 = cap1 + 1;
                }

            }
            if (cap1 == this.getTamano()) {
                Gano = true;
                this.ganador = this.jugador1;
                break;
            }
            cap1 = 0;
        }
        cap1 = 0;

        for (int i = 0; i < this.getTamano(); i++) {
            if (botones[(this.getTamano() - 1) - i][i].A.getText() == per.ficha) {
                cap1 = cap1 + 1;
                
            }
            if (cap1 == this.getTamano()) {
                
                Gano = true;
                this.ganador = this.jugador1;

                break;
            }
            cap1 = 0;

        }
        //COMPROBAR LA DIAGONAL 
        for (int i = 0; i < this.getTamano(); i++) {
            if (botones[i][i].A.getText() == per.ficha) {
                cap1 = cap1 + 1;
            }
        }
        if (cap1 == this.getTamano()) {
            Gano = true;
            this.ganador = this.jugador1;

        }
//===================================================SEGUNDO JUGADOR=========================================
//revisar las filas
        cap1 = 0;
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (botones[i][j].A.getText() == per.ficha0) {
                    cap1 = cap1 + 1;
                    
                }
            }
            if (cap1 == this.getTamano()) {
                Gano = true;
                this.ganador = this.jugador2;
                break;
            }
            cap1 = 0;
        }

        //revisar las columnas
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (botones[j][i].A.getText() == per.ficha0) {
                    cap1 = cap1 + 1;
                    
                }

            }
            if (cap1 == this.getTamano()) {
                Gano = true;
                this.ganador = this.jugador2;
                break;
            }
            cap1 = 0;
        }
        //COMPROBACION DE LA DIAGONAL INVERSA
        cap1 = 0;
        for (int i = 0; i < this.getTamano(); i++) {
            if (botones[(this.getTamano() - 1) - i][i].A.getText() ==per.ficha0) {
                cap1 = cap1 + 1;
                
            }
            if (cap1 == this.getTamano()) {
               
                Gano = true;
                this.ganador = this.jugador2;

                break;
            }
            cap1 = 0;

        }
        cap1 = 0;

        //COMPROBAR LA DIAGONAL 
        for (int i = 0; i < this.getTamano(); i++) {
            if (botones[i][i].A.getText() == per.ficha) {
                cap1 = cap1 + 1;
               
            }
        }
        if (cap1 == this.getTamano()) {
            Gano = true;
            this.ganador = this.jugador2;

        }
        return Gano;
    }

    public String getGanador() {
        return ganador;
    }

    void Reiniciar() {
        contador = 0;
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                botones[i][j].A.setText(null);
                botones[i][j].B = 0;
                botones[i][j].A.addActionListener(this);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        bien = new javax.swing.JLabel();

        jLabel1.setText("BIENVENIDO");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bien, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(bien, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gato().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel bien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel1;             
}
