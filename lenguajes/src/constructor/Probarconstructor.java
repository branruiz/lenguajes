/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import javax.swing.JFrame;

/**
 *
 * @author T-102
 */
public class Probarconstructor {
    
    public static void main(String[] args) {
    
        Animal algo=new Animal();
        int x=2;
        
        System.out.println(x);
        System.out.println(algo.getEdad());
        System.out.println(algo.getNombre());
        System.out.println(algo.isMuerde());

        Animal otro=new Animal(8);
        otro.setEdad(10);
        System.out.println(otro.getEdad());
        //vamos a usar un constructor de una clase que no hemos diseñado nosotros
        JFrame ventana=new JFrame("Hola");
               ventana.setSize(300,300);
               ventana.setVisible(true);
    }
}
