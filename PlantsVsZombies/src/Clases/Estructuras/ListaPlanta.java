/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Estructuras;

import Clases.Nodos.Planta;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian
 */
public class ListaPlanta {
    public Planta inicio;
    
    public ListaPlanta()
    {
        inicio = null;
    }
    
    public void add(Planta objeto)
    {
        if(inicio == null)
        {
            inicio = objeto;
        }
        else
        {
            Planta t = inicio.siguiente;
            Planta ant = inicio;
            while(t != null)
            {
                t = t.siguiente;
                ant = ant.siguiente; 
            }
            t = objeto;
            t.anterior = ant;
            ant.siguiente = t;
        }            
    }
    
    public Planta get(int pos)
    {
        int cant = 0;
        Planta t = inicio;
        while((t != null)&&(cant<pos))
        {
            t = t.siguiente;
            cant++;
        }
        return (Planta) t.clone();
    }
    
    public Boolean empty (ListaPlanta lista)
    {
        if(lista.inicio == null)
            return true;
        else 
            return false;
    }
    
    public int size()
    {
        int tam = 0;
        Planta t = inicio;
        while(t != null)
        {
            t = t.siguiente;
            tam++;
        }
        return tam;
    }    
    public String graficaCatalogPlantas()
    {
        int cantNodos = 1;
        String archivo="digraph G\n{\n";
        Planta t = inicio;
        while(t != null)
        {
            archivo = archivo + "node" + cantNodos + " [label = \"" +t.getNombre() + "\"];\n";
            t = t.siguiente;
            cantNodos++;
        }
        t = inicio;
        cantNodos = 1;
        while(t != null)
        {
            if(t.siguiente!=null)
            {
                archivo = archivo + "node" + cantNodos + " -> " + "node" + (cantNodos + 1) + ";\n";
            }
            cantNodos++;
            t = t.siguiente;
        }
        archivo = archivo + "}";
        return archivo;
    }
}
