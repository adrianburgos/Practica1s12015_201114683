/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import Clases.*;
import java.net.URL;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrian
 */
public class fPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form fPrincipal
     */
    
    public fJugadores jugadores = null;
    public static LinkedList<LinkedList> Jugadores = new LinkedList<LinkedList>();
    public static LinkedList<Planta> catalogoPlantas = new LinkedList<Planta>();
    public static LinkedList<Zombie> catalogoZombies = new LinkedList<Zombie>();
    public fPrincipal() {
        initComponents();
        //setLocationRelativeTo(null);
        bPlantas.setOpaque(false);
        bPlantas.setContentAreaFilled(false);
        bZombies.setOpaque(false);
        bZombies.setContentAreaFilled(false);
        
        //bZombies.setBorderPainted(false);
        URL url = getClass().getResource("/Imagenes/icon.png");
        ImageIcon icono = new ImageIcon(url);
        setIconImage(icono.getImage());
        lDimensiones.setVisible(false);
        bIniciar.setVisible(false);
        tfX.setVisible(false);
        tfY.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bZombies = new javax.swing.JButton();
        bPlantas = new javax.swing.JButton();
        bIniciar = new javax.swing.JButton();
        tfY = new javax.swing.JTextField();
        tfX = new javax.swing.JTextField();
        lDimensiones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        bZombies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zombie2.png"))); // NOI18N
        bZombies.setContentAreaFilled(false);
        bZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZombiesActionPerformed(evt);
            }
        });
        getContentPane().add(bZombies);
        bZombies.setBounds(280, 250, 52, 89);

        bPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planta1.png"))); // NOI18N
        bPlantas.setContentAreaFilled(false);
        bPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlantasActionPerformed(evt);
            }
        });
        getContentPane().add(bPlantas);
        bPlantas.setBounds(50, 250, 52, 89);

        bIniciar.setText("Iniciar");
        bIniciar.setContentAreaFilled(false);
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(bIniciar);
        bIniciar.setBounds(150, 460, 73, 23);

        tfY.setText("4");
        tfY.setOpaque(false);
        getContentPane().add(tfY);
        tfY.setBounds(217, 425, 30, 20);

        tfX.setText("5");
        tfX.setOpaque(false);
        getContentPane().add(tfX);
        tfX.setBounds(133, 425, 30, 20);

        lDimensiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dimensiones.png"))); // NOI18N
        getContentPane().add(lDimensiones);
        lDimensiones.setBounds(85, 370, 210, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 370, 500);

        setSize(new java.awt.Dimension(376, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlantasActionPerformed
        jugadores = new fJugadores("plantas");
        jugadores.setVisible(true);
        bPlantas.setEnabled(false);
        bPlantas.setBorderPainted(false);
        if(!bPlantas.isEnabled()&&!bZombies.isEnabled())
        {
            lDimensiones.setVisible(true);
            bIniciar.setVisible(true);
            tfX.setVisible(true);
            tfY.setVisible(true);
        }
        //this.setVisible(false);
    }//GEN-LAST:event_bPlantasActionPerformed

    private void bZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZombiesActionPerformed
        // TODO add your handling code here:
        jugadores = new fJugadores("zombies");
        jugadores.setVisible(true);
        bZombies.setEnabled(false);
        bZombies.setBorderPainted(false);
        if(!bPlantas.isEnabled()&&!bZombies.isEnabled())
        {
            lDimensiones.setVisible(true);
            bIniciar.setVisible(true);
            tfX.setVisible(true);
            tfY.setVisible(true);
        }
    }//GEN-LAST:event_bZombiesActionPerformed

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        // TODO add your handling code here:
        try
        {
            int x = Integer.parseInt(tfX.getText());
            int y = Integer.parseInt(tfY.getText());
            if(0 < x && x <= 10 && 0 < y && y <= 10)
            {
                fCatalogoPlantas cp = new fCatalogoPlantas();
                cp.setVisible(true);
            }
            else
            {
                System.out.println("Las dimensiones debe de estar entre 1 y 10");
            }
        }
        catch(Exception e)
        {
            System.out.println("los datos ingresados no son numeros");
        }
               
    }//GEN-LAST:event_bIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bPlantas;
    private javax.swing.JButton bZombies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lDimensiones;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    // End of variables declaration//GEN-END:variables
}
