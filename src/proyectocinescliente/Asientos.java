/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinescliente;

import static Logica.SOUP.service;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static proyectocinescliente.Entradas.seleccionada;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public final class Asientos extends javax.swing.JFrame {
    public static int escojer=0;
    
    
    int x=5;
    int y=10;
    private final String path = System.getProperty("user.dir");
    private final String fondo = "\\src\\PNG\\fondo.jpg";
    private final String pantalla = "\\src\\PNG\\Pantalla (2).png";
    Boton [][] asientos = new Boton[x][y];
    
    /**
     * Creates new form Asientos
     */
    public Asientos() {
        initComponents();
        this.setSize(550, 400);
        pantalla();
        botones();
        fondo();
        reccorerAcientos();
        
    }
    public void fondo(){
        JLabel fondo = new JLabel();
        ImageIcon icon = new ImageIcon(path+this.fondo);  
        fondo.setBounds(0, 0, 550, 400);
        fondo.setIcon(icon);
        this.add(fondo);
    }
    
    public void pantalla(){
        JLabel pantalla = new JLabel();
        ImageIcon icon = new ImageIcon(path+this.pantalla);  
        pantalla.setBounds(30, 0, 500, 40);
        pantalla.setIcon(icon);
        this.add(pantalla);
    }

    public void botones(){
        int xx=45;
        for (int i = 0; i < x; i++) {
            int yy=5;
            for (int j = 0; j < y; j++) {
                Boton btn = new Boton(yy,xx,i,j);
                this.asientos[i][j]=btn;
                this.add(btn);
                yy=yy+52; 
            }
            xx=xx+55;
        } 
    }
    
    public void reccorerAcientos(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
//                System.out.println(service.consultaCampo(sala, i, j));
                this.asientos[i][j].disponibilidad(service.consultaCampo(seleccionada, i, j));
            }
        }
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btmContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(550, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        btmContinuar.setText("CONFIRMAR");
        btmContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(btmContinuar)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmContinuarActionPerformed
        // TODO add your handling code here:
        Factura factura = new Factura();
        factura.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btmContinuarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmContinuar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
