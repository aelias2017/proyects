/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_1.evento.marco;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author aelias
 */
public class Marco {
    
    public static void main(String[] arg){
        JFrame frame = new JFrame("Ejemplo de eventos");
        frame.setLocation(100, 100);
        frame.setSize(50, 50);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
}
