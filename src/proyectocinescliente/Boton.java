/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinescliente;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Boton extends JButton implements ActionListener{

    private final int dimencion=50;
    private int disponible=0;
    private final String path = System.getProperty("user.dir");
    private final String libre = "\\src\\PNG\\Libre.png";
    private final String ocupado = "\\src\\PNG\\Ocupada.png";
    
    
    
    public Boton(int posx, int posy){
        super.setBounds(posx, posy, dimencion, dimencion);
        super.addActionListener(this);
    }
    
    public void disponibilidad(boolean x){
        if(!x)
            this.setEnabled(false);
    }
    
    public void setLibre(){
        ImageIcon icon = new ImageIcon(path+this.libre);  
        this.setIcon(icon); 
    }
    
    public void setOcupado(){
        ImageIcon icon = new ImageIcon(path+this.ocupado);  
        this.setIcon(icon); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setOcupado();
    }
    
}
