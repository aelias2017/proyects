/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_1.evento.teclado;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author aelias
 */
public class EventoTeclado {
    public static void main(String[] arg){
        JTextField inText = new JTextField("Etiqueta");
        inText.setVisible(true);
        inText.setSize(50,50);
        inText.setLocation(200, 200);
        
        JFrame frame = new JFrame("Ejemplo eventos");
        frame.setLocation(200, 200);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.add(inText);
        inText.addKeyListener(new KeyAdapter() {
            
        @Override
        public void keyPressed(KeyEvent e){
        metodoAccion(e.getKeyChar());
        }
        });
       frame.addWindowListener(new WindowAdapter() {
           
          public void windowClosing(WindowEvent e) {
          System.exit(0);
          }
        });
       
      
    }
     public static void metodoAccion(char value){
           System.out.println("mensaje valor: "+value);
       }
    
}
