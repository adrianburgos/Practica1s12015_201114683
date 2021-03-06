/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import Clases.Nodos.Planta;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author Adrian
 */
public class fCatalogoPlantas extends javax.swing.JFrame {

    Planta planta = null;
    int tamx = 52;
    int tamy = 89;
    int cant = 0;
    
    public fCatalogoPlantas() {
        initComponents();
        spCatalogo.setLayout(null);
        
        URL url = getClass().getResource("/Imagenes/icon.png");
        ImageIcon icono = new ImageIcon(url);
        setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spCatalogo = new javax.swing.JScrollPane();
        tfImagen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sAP = new javax.swing.JSpinner();
        sHP = new javax.swing.JSpinner();
        bFinalizar = new javax.swing.JButton();
        bExtra = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        bGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalogo Plantas");
        getContentPane().setLayout(null);

        spCatalogo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(spCatalogo);
        spCatalogo.setBounds(0, 0, 560, 450);
        getContentPane().add(tfImagen);
        tfImagen.setBounds(570, 30, 140, 20);

        jLabel1.setText("Imagen");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 10, 50, 14);
        getContentPane().add(tfNombre);
        tfNombre.setBounds(570, 80, 80, 20);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 60, 50, 14);

        jLabel3.setText("HP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 110, 50, 14);

        jLabel4.setText("Tipo de Ataque");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 220, 80, 14);

        sAP.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        getContentPane().add(sAP);
        sAP.setBounds(570, 180, 40, 20);

        sHP.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        sHP.setName(""); // NOI18N
        getContentPane().add(sHP);
        sHP.setBounds(570, 130, 40, 20);

        bFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/finalizar.png"))); // NOI18N
        bFinalizar.setContentAreaFilled(false);
        bFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(bFinalizar);
        bFinalizar.setBounds(570, 400, 180, 30);

        bExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        bExtra.setContentAreaFilled(false);
        bExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExtraActionPerformed(evt);
            }
        });
        getContentPane().add(bExtra);
        bExtra.setBounds(720, 25, 30, 30);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Directo", "Disparo" }));
        cbTipo.setName(""); // NOI18N
        getContentPane().add(cbTipo);
        cbTipo.setBounds(570, 240, 100, 20);

        jLabel6.setText("AP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 160, 50, 14);

        bGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        bGuardar.setContentAreaFilled(false);
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bGuardar);
        bGuardar.setBounds(570, 280, 40, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 0, 600, 600);

        setSize(new java.awt.Dimension(774, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinalizarActionPerformed
        System.out.println("Catalogo Plantas:\n");
//        Iterator i = fPrincipal.catalogoPlantas.iterator();
//        while (i.hasNext())
//        {
//            Planta t = (Planta) i.next();
//            System.out.println("\tImagen: " + t.getImagen() + "\n\tNombre: " + t.getNombre() + "\n\tVida: "
//                    + t.getVida() + "\n\tAtaque: " + t.getAtaque() + "\n\tTipo de Ataque: " + t.getTipo()+ "\n");
//        }
        fCatalogoZombies cz = new fCatalogoZombies();
        cz.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bFinalizarActionPerformed

    private void bExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExtraActionPerformed
        JFileChooser buscar = new JFileChooser("C:\\Users\\Adrian\\Documents\\GitHub\\Practica1s12015_201114683\\PlantsVsZombies\\src\\Imagenes\\Plantas");
        buscar.showOpenDialog(null);
        tfImagen.setText(buscar.getSelectedFile().toString());
    }//GEN-LAST:event_bExtraActionPerformed

    void CrearLabel(JLabel label, String texto, int pos)
    {
        label = new JLabel(texto);
        label.setBounds(100 * pos, tamy * cant + 40 , 60, 20);
        spCatalogo.add(label);
        spCatalogo.repaint();
    }
    
    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        planta = new Planta(tfImagen.getText(), tfNombre.getText(), (int) sAP.getValue(), (int) sHP.getValue(), cbTipo.getSelectedItem().toString());
        fPrincipal.catalogoPlantas.add(planta);
        ImageIcon imagen = new ImageIcon(planta.getImagen());
        JLabel p = new JLabel(imagen);
        p.setBounds(10,tamy*cant + 10,52,89);
        spCatalogo.add(p);
        spCatalogo.repaint();
        CrearLabel(p, planta.getNombre(), 1);
        CrearLabel(p, Integer.toString(planta.getVida()), 2);
        CrearLabel(p, Integer.toString(planta.getAtaque()), 3);
        CrearLabel(p, planta.getTipo(), 4);
        cant++;
    }//GEN-LAST:event_bGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(fCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fCatalogoPlantas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExtra;
    private javax.swing.JButton bFinalizar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner sAP;
    private javax.swing.JSpinner sHP;
    private javax.swing.JScrollPane spCatalogo;
    private javax.swing.JTextField tfImagen;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
