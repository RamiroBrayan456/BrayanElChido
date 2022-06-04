
package gato;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Persona {
    
    String nombre;
    String nombre0;
    String ficha;
    String ficha0;
    
    
    public void obtenerDatos(){
        this.setNombre();
        this.setFicha();
        this.setNombre0();
        this.setFicha0();
    }
    
    
     Scanner teclado=new Scanner(System.in);
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre() {       	
    nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL PRIMER JUGADOR");
    }

    
    public String getNombre0() {
        return nombre0;
    }

    public void setNombre0() {
      nombre0 = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL SEGUNDO JUGADOR");
    }
    
        public String getFicha() {
        return nombre;
    }

    public void setFicha() {       	
    ficha = JOptionPane.showInputDialog("INGRESE LA FICHA DE " + getNombre());
    }

    
    public String getFicha0() {
        return nombre0;
    }

    public void setFicha0() {
        ficha0 = JOptionPane.showInputDialog("INGRESE LA FICHA DE " + getNombre0());

    }
}
