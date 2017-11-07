/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    
    public static void main(String[] args) {
        GeneradorClientes gencli=new GeneradorClientes();
        
        for(clientes c: gencli.generarClientes()){
            System.out.println("nombre: "+ c.getNombre()+" calle "+c.getDireccion().getCalle()+" Edad "+c.getEdad()+" Colonia: "+c.getDireccion().getColonia()+" cp: "+c.getDireccion().getCp());
        }
        
        
        
        
    }
    
}
