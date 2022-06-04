/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import static java.awt.Frame.ICONIFIED;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class menuC extends Menu{
    
    public menuC (){
    
    }
    
      public void reiniciar (){
          
              Scanner teclado=new Scanner(System.in);
              int opc;
           do{
        
           System.out.println("Proporcione la opcion que desea ejecutar");
           System.out.println(" (0) SALIR");
           System.out.println(" (1) Nuevo juego");
           System.out.print(" : ");
           
           
            opc=teclado.nextInt();
           System.out.println("******************************************************* ");
        
           
            switch(opc){
          
            case 1:
                
                JuegoGato Objeto = new JuegoGato();
                Objeto.jugarGato(); 
                System.out.println("******************************************************* ");
                break;
            
            case 0:
                
            this.setExtendedState(NORMAL);          
                  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                }
            });
                
                break;
            default:
                  
                System.out.println("La opcion proporcionada no es valida ");
                System.out.println("******************************************************* ");
                break;
            }
        }while(opc != 0);
      }
}
