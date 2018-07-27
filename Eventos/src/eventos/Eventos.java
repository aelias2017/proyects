/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aelias
 */
public class Eventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcoBotones marco = new MarcoBotones();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones extends JPanel{
    
    JButton boton = new JButton("Press");
    
}

