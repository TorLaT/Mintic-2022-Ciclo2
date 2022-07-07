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
    
    public modelo buscarEstudiante(String id){
    modelo result= null; //Por defecto
    for (int i=0; i<this.lstEstudiantes.size();i++){
        if(this.lstEstudiantes.get(i).getId().equals(id)){
            System.out.println("Estudiante encontrado");
            result=this.lstEstudiantes.get(i);
        }
    }
    return result;
    }
    
    public void modificarEst(String id, modelo est){
    
    }
        

    
}
