/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Estructuras;

import Clases.Nodos.Zombie;

/**
 *
 * @author Adrian
 */
public class ListaZombie {
    public Zombie inicio;
    
    public ListaZombie()
    {
        inicio = null;
    }
    
    public void add(Zombie objeto)
    {
        if(inicio == null)
        {
            inicio = objeto;
        }
        else
        {
            Zombie t = inicio.siguiente;
            Zombie ant = inicio;
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
    
    public Zombie get(int pos)
    {
        int cant = 0;
        Zombie t = inicio;
        while((t != null)&&(cant<pos))
        {
            t = t.siguiente;
            cant++;
        }
        return (Zombie) t.clone();
    }
    
    public Boolean empty (ListaZombie lista)
    {
        if(lista.inicio == null)
            return true;
        else 
            return false;
    }
    
    public int size()
    {
        int tam = 0;
        Zombie t = inicio;
        while(t != null)
        {
            t = t.siguiente;
            tam++;
        }
        return tam;
    } 
    
    
}
