package com.ciclo2udea.estudiantes.modelo;

import com.ciclo2udea.estudiantes.controlador.Controlador;
import com.ciclo2udea.estudiantes.vista.Vista;

import java.util.ArrayList;

public class Modelo { //Creación de una clase
    
    public static ArrayList<String> nombres = new ArrayList<String>();
    public static ArrayList<String> apellidos = new ArrayList<String>();
    public static ArrayList<String> nacimiento = new ArrayList<String>();
    public static ArrayList<String> correo = new ArrayList<String>();
    public static ArrayList<Long> celular = new ArrayList<Long>();
    public static ArrayList<String> programa = new ArrayList<String>();

public static void main (String[] args){
    
while (true){
    Vista.imprimirMenu();
    int valor=Controlador.capturarOpcion();
    if (valor==1){
        System.out.println("Ingresar estudiante ");
        Controlador.ingresar();
    }
    else if (valor==2){
        System.out.println("Buscar estudiante");
        Controlador.buscar();
    }
    else if (valor==3){
        System.out.println("Modificar estudiante");
        Controlador.modificar();
    }
    else if (valor==4){
        System.out.println("Eliminar estudiante");
        Controlador.eliminar();
    }
    else if (valor==5){
        System.out.println("Ver listado de Estudiantes");
        Vista.verDirectorio();
        
    }
    else if (valor==6){
        System.out.println("\f");
        System.out.println("Hasta pronto");
        System.exit(0);
    }
}

}
}
