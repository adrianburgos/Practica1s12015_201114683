/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Nodos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Adrian
 */
public class Planta extends JLabel implements Cloneable {
    
    public Planta siguiente = null;
    public Planta anterior = null;
    
    private String imagen;
    private String nombre;
    private int ataque;
    private int vida;
    private String tipo;
    private String lugar;

    public Planta(String imagen, String nombre, int ataque, int vida, String tipo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.tipo = tipo;
    }

    public Planta(ImageIcon image) {
        this.setIcon(image);
    }
    
    

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }
    
}
