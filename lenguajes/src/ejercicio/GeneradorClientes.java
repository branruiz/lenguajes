/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;


public class GeneradorClientes {

    ArrayList <clientes> generarClientes(){
        ArrayList <clientes> generar=new ArrayList<clientes>();
        
        direccion d1 =new direccion("pol","lop",55020,"eca");
        direccion d2 =new direccion("ytgf","gghgt",55020,"eca");
        direccion d3 =new direccion("67eette","hyhjhhh",55020,"eca");
        
        clientes c1 =new clientes("juan",15,"sfew@",d1);
        clientes c2 =new clientes("pedrito",69,"putitos",d2);
        clientes c3 =new clientes("pacoi",14,"lol@",d3);
        
       generar.add(c1);
       generar.add(c2);
       generar.add(c3);
       
        
        return generar;
    }
    
}