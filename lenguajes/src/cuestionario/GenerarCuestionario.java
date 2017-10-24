package cuestionario;

import java.util.ArrayList;

public class GenerarCuestionario {
    
    public ArrayList<Pregunta> generar (){
    //Primero generamos el arreglo que contenra las preguntas
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
    //replicar
    //Primero generamos cada opcion de la primer pregunta
    Opcion op11=new Opcion("Moscu",false);
    Opcion op21=new Opcion("Kiev",false);
    Opcion op31=new Opcion("Helsinki",true);
    Opcion op41=new Opcion("Turin",false);
    
    //Generamos la pregunta
    ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
    opciones1.add(op11);
    opciones1.add(op21);
    opciones1.add(op31);
    opciones1.add(op41);
    
    Pregunta p1=new Pregunta(opciones1,"Capital de finlandia");
    preguntas.add(p1);
    
    
    return preguntas;
    }
    
}
