package cuestionario;

import java.util.ArrayList;

public class Pregunta {

    public Pregunta(ArrayList<Opcion> opciones, String titulo) {
        this.opciones = opciones;
        this.titulo = titulo;
    }
    
    
    private ArrayList<Opcion> opciones;
    private String titulo;

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
