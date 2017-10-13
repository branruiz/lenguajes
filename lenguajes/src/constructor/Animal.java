/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author T-102
 */
public class Animal {
    private String nombre;
    private int edad;
    private boolean muerde;
       public Animal(){
        System.out.println("Estoy en el cuerpo del constructor de defecto");
    edad=5;
    nombre="abc";
    }
    public Animal(int edad){
        
        
        this.edad=edad;
    }
    
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }
    
}
