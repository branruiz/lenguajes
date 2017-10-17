/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutables;

/**
 *
 * @author T-102
 */
public class Arreglo1 {
    public static void main(String[] args) {
        //Vamos a generar un arreglo simple
        int x[]={12,-4,7};
        System.out.println("El tamaño es: "+x.length);
        //Para accceder a un elemento hacemos lo siguiente
        System.out.println("En el indice 0 esta: "+x[2]);
        
        int []y={2,4,5};
        int []z=new int[3];
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        //vamos a iterar el arreglo z usando un ciclo for
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }        
        
        //ciclo for mejorado
        for(int i:z){
            System.out.println("Mejorado: "+i);
        }
        
        
        String mensaje="Hola como estas";
        byte []w= mensaje.getBytes();
        System.out.println("Tamaño: "+w.length);
        String codificado="";
        for(byte j:w){
            System.out.println("El byte es: "+j);
            codificado=codificado+j; 
        }
        System.out.println("El mensaje codificaado es: ");
        System.out.println(codificado);
        
    }
}
