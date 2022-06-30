package com.ciclo2udea.estudiantes.vista;

import com.ciclo2udea.estudiantes.modelo.Modelo;

public class Vista {

    public static void imprimirMenu() {
        System.out.println("UNIVERSIDAD DE ANTIOQUIA");
        System.out.println("Seleccione la tarea a realizar: (1 al 6)");
        System.out.println("1. Ingresar nuevo estudiante");
        System.out.println("2. Buscar estudiante registrado");
        System.out.println("3. Modificar estudiante registrado");
        System.out.println("4. Eliminar registro de un estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir");

    }

    public static void mostrar(int indice) {

        System.out.println("\nINFORMACIÓN DEL ESTUDIANTE: ");
        System.out.println("Nombres: " + Modelo.nombres.get(indice));
        System.out.println("Apellidos: " + Modelo.apellidos.get(indice));
        System.out.println("Fecha de nacimiento: " + Modelo.nacimiento.get(indice));
        System.out.println("Correo Electrónico: " + Modelo.correo.get(indice));
        System.out.println("Número Celular: " + Modelo.celular.get(indice));
        System.out.println("Programa de Interés: " + Modelo.programa.get(indice) + "\n");

    }

    public static void Dir() {  //Ver listado de estudiantes con for
        int medida = Modelo.nombres.size();
        for (int i = 0; i < medida; i++) {
               mostrar(i);
        }
    }
    
    public static void verDirectorio(){ //Ver listado de estudiantes con while
    int i=Modelo.nombres.size();
    int x=0;
    while (x<i){
        mostrar(x);
        x=x+1;
    }
    }

}
