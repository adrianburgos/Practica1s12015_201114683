/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Adrian
 */
public class fEscenario extends javax.swing.JFrame {
    int x,y;
    public fEscenario(int x, int y) {
        initComponents();
        this.x = x;
        this.y = y;
        URL url = null;
        ImageIcon imagen;
        int tamx = 52;
        int tamy = 52;
        int h = 0;
        int k = 0;
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                if(i%2==0)
                {
                    if(j%2==0)
                    {
                        url = getClass().getResource("/Imagenes/grama1.png");
                    }
                    else
                    {
                        url = getClass().getResource("/Imagenes/grama2.png");
                    }
                }
                else
                {
                    if(j%2==1)
                    {
                        url = getClass().getResource("/Imagenes/grama1.png");
                    }
                    else
                    {
                        url = getClass().getResource("/Imagenes/grama2.png");
                    }
                }
                imagen = new ImageIcon(url);
                JLabel grama = new JLabel(imagen);
                grama.setBounds(tamx * i, tamy * j, 52, 89);
                pTablero.add(grama);
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
        pTablero = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 102, 540);

        pTablero.setBorder(new javax.swing.border.MatteBorder(null));
        pTablero.setToolTipText("");
        pTablero.setMinimumSize(new java.awt.Dimension(520, 520));
        pTablero.setPreferredSize(new java.awt.Dimension(520, 520));
        pTablero.setLayout(null);
        getContentPane().add(pTablero);
        pTablero.setBounds(120, 10, 520, 540);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(650, 10, 102, 540);

        setSize(new java.awt.Dimension(784, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fEscenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fEscenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fEscenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fEscenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pTablero;
    // End of variables declaration//GEN-END:variables
}
