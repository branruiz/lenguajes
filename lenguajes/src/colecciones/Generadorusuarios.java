/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class Generadorusuarios {
    public static void main(String[] args) {
        //vamos a generar 5 usuarios
        Usuario u1=new Usuario();
        u1.setEdad(23);
        u1.setEmail("abc");
        u1.setNombre("juan");
        
        Usuario u2=new Usuario();
        u2.setEdad(20);
        u2.setEmail("pedro");
        u2.setNombre("pedro");
        
        Usuario u3=new Usuario();
        u3.setEdad(25);
        u3.setEmail("dani");
        u3.setNombre("dasniela");
        
        Usuario u4=new Usuario();
        u4.setEdad(28);
        u4.setEmail("abc");
        u4.setNombre("juan");
        
        Usuario u5=new Usuario();
        u5.setEdad(30);
        u5.setEmail("pablo1");
        u5.setNombre("pablo");
        
        //Generaremos un arreglo mutable
        
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //Vamos a iterarlo para ver los nombres
        for(Usuario u:usuarios){
            System.out.println("Nombre: "+u.getNombre()+" Email: "+u.getEmail());
        }
    }
}
