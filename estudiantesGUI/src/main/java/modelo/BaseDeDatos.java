package modelo;

import java.util.ArrayList;

public class BaseDeDatos {
    private ArrayList<modelo> lstEstudiantes; //unico atributo
    
    public BaseDeDatos(){
     this.lstEstudiantes=new ArrayList(); //nueva lista vacia
    }
    
    public void guardarEstudiante(modelo estudiante){  //Metodo recibe modelos
    this.lstEstudiantes.add(estudiante); //guarde los modelos en la lista
        System.out.println("Estudiante guardado en la lista");
    }
    
}
