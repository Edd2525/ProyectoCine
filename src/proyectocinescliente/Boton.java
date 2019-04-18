/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinescliente;

import static Logica.SOUP.service;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static proyectocinescliente.Asientos.escojer;
import static proyectocinescliente.Entradas.Campos;
import static proyectocinescliente.Entradas.seleccionada;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Boton extends JButton implements ActionListener {

    private final int dimencion = 50;
    private int disponible = 1;
    private final String path = System.getProperty("user.dir");
    private final String libre = "\\src\\PNG\\Libre.png";
    private final String ocupado = "\\src\\PNG\\Ocupada.png";
    
    private int i;
    private int j;
    

    public Boton(int posx, int posy, int i, int j) {
        super.setBounds(posx, posy, dimencion, dimencion);
        super.addActionListener(this);
        this.i=i;
        this.j=j;
        this.setLibre();
    }

    public void disponibilidad(boolean x) {
        if (!x) {
            this.setEnabled(false);
        }
    }

    public void setLibre() {
        ImageIcon icon = new ImageIcon(path + this.libre);
        this.setIcon(icon);
    }

    public void setOcupado() {
        ImageIcon icon = new ImageIcon(path + this.ocupado);
        this.setIcon(icon);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.disponible == 1) {
            if ((escojer < Campos)) {
                this.setOcupado();
                this.disponible = 0;
                service.asignarCampo(seleccionada, i, j);
                escojer++;
            }

        } else {

            if (escojer > 0) {
                this.setLibre();
                this.disponible = 1;
                service.resetearCampo(seleccionada, i, j);
                escojer--;
            }

        }

    }

}
