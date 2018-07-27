/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_1.evento.raton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aelias
 */
public class EventoRaton {
    
    public static void main(String[] arg){
        JButton boton = new JButton("Click me");
        boton.setVisible(true);
        boton.setSize(50,50);
        boton.setLocation(100, 100);
        
        JFrame frame = new JFrame("Ejemplo eventos");
        frame.setLocation(200, 200);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.add(boton);
        boton.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste click en el boton oprime");
                
            }
            
        });
        
        frame.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
}) ;
    }
    
}
