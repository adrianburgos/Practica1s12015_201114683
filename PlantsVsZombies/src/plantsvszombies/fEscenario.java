/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import Clases.Campo;
import Clases.Nodos.Planta;
import Clases.Nodos.Zombie;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Stack;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.colorchooser.AbstractColorChooserPanel;
/**
 *
 * @author Adrian
 */
public class fEscenario extends javax.swing.JFrame implements Runnable{
    int x,y;
    public static LinkedList<Planta> plantas = new LinkedList<Planta>();;
    public static Stack<Zombie> zombies = new Stack<Zombie>();
    public static Thread timerInsertar = new Thread();
    int tamx = 52;
    int tamy = 89;
    int j = 0;
    int contP = 5;
    int contZ = 5;
    
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
                grama.setBounds(tamx * i, tamy * j, 52, 52);
                pTablero.add(grama);
            }
        }
        url = getClass().getResource("/Imagenes/icon.png");
        ImageIcon icono = new ImageIcon(url);
        setIconImage(icono.getImage());
    }

    void GraficarCola()
    {
        int n = fPrincipal.catalogoPlantas.size();
        int posP = (int) (Math.random()*100)%n;
        plantas.add(fPrincipal.catalogoPlantas.get(posP));
        pPlantas.removeAll();
        Iterator i = plantas.iterator();
        int j = 0;
        while(i.hasNext())
        {
            Planta Temp = (Planta) i.next();
            ImageIcon icono = new ImageIcon(Temp.getImagen());
            JLabel label = new JLabel(icono);
            label.setBounds(10, tamy*j + 10, tamx, tamy);
            pPlantas.add(label);
            j++;
        }
        pPlantas.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPlantas = new javax.swing.JPanel();
        pTablero = new javax.swing.JPanel();
        pZombies = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pPlantas.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout pPlantasLayout = new javax.swing.GroupLayout(pPlantas);
        pPlantas.setLayout(pPlantasLayout);
        pPlantasLayout.setHorizontalGroup(
            pPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pPlantasLayout.setVerticalGroup(
            pPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        getContentPane().add(pPlantas);
        pPlantas.setBounds(10, 10, 102, 540);

        pTablero.setBorder(new javax.swing.border.MatteBorder(null));
        pTablero.setToolTipText("");
        pTablero.setMinimumSize(new java.awt.Dimension(520, 520));
        pTablero.setPreferredSize(new java.awt.Dimension(520, 520));
        pTablero.setLayout(null);
        getContentPane().add(pTablero);
        pTablero.setBounds(120, 10, 520, 540);

        pZombies.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout pZombiesLayout = new javax.swing.GroupLayout(pZombies);
        pZombies.setLayout(pZombiesLayout);
        pZombiesLayout.setHorizontalGroup(
            pZombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pZombiesLayout.setVerticalGroup(
            pZombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        getContentPane().add(pZombies);
        pZombies.setBounds(650, 10, 102, 540);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 560, 740, 40);

        setSize(new java.awt.Dimension(784, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String s = "digraph G\n{\n";
            s = fPrincipal.catalogoPlantas.graficaCatalogoPlantas();
            s = s + fPrincipal.catalogoZombies.graficaCatalogoZombies();
            s += "}";
            FileWriter fw = new FileWriter("C:\\Users\\Adrian\\Desktop\\Catalogos.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(s);
            pw.close();
            fw.close();
            System.out.println(s);
        }
        catch (IOException ex)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    public static javax.swing.JPanel pPlantas;
    public static javax.swing.JPanel pTablero;
    public static javax.swing.JPanel pZombies;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        try
        {
            timerInsertar.sleep(5000);
        }
        catch(InterruptedException e)
        {
            //Logger.getLogger(null)
        }
        int cantP=0;
//        Iterator i = fPrincipal.Jugadores.get(0).iterator();
//        while(i.hasNext())
//        {
//            Campo t = (Campo) i.next();
//            if(t.getTipo().equals("cantidad"))
//            {
//                cantP = Integer.parseInt(t.getAtributo());
//            }
//        }
//        i = fPrincipal.Jugadores.get(1).iterator();
//        while(i.hasNext())
//        {
//            Campo t = (Campo) i.next();
//            if(t.getTipo().equals("cantidad"))
//            {
//                cantP = Integer.parseInt(t.getAtributo());
//            }
//        }
//        while(contP<cantP && contZ<cantZ)
        while(contP<15)
        {
            
            //contZ++;
            GraficarCola();
            try
            {
                timerInsertar.sleep(5000);
            }
            catch(InterruptedException e)
            {
                //Logger.getLogger(null)
            }
            contP++;
        }
            
                
    }
}
