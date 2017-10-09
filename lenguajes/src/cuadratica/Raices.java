/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

    
    
public class Raices {
    Usuario u;
    String x1,x2;
    public String x1(){
        float mivalor1=(float) (-u.getB()+(Math.sqrt(Math.pow(u.getB(), 2)-4*u.getA()*u.getC())))/2*u.getA();
        x1="X1= " +mivalor1;
        
        return x1;
    }
        public String x2(){
        float mivalor2=(float) (-u.getB()-(Math.sqrt(Math.pow(u.getB(), 2)-4*u.getA()*u.getC())))/2*u.getA();
        x2="X2= " +mivalor2;
        return x2;
}
        
        
     
}
