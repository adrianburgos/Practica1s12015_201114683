/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author Adrian
 */
public class Cola {
    
    LinkedList<Planta> cola = new LinkedList<Planta>();
    
    public void queue(Planta planta)
    {
        cola.addFirst(planta);
    }
    
    public Planta dequeue()
    {
        return (Planta) cola.removeLast();
    }
}
