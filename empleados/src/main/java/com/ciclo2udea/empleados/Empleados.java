package com.ciclo2udea.empleados;

import java.util.Scanner;

public class Empleados {

    public static class empleado {  //Creaciòn de una clase

        private String nombre;
        //private int cedula;

        public empleado(String nombre) { //Metodo constructor
            this.nombre = nombre;
            //this.cedula=cedula;
            //System.out.println("Se construyó correctamente el empleado " + nombre);
        }

        public String getNombre() {  //metodo get
            return "Desde la clase empleados, heredado, vemos el nombre: " +nombre;
        }

        public void setNombre(String nombre) {  //metodo set
            this.nombre = nombre;
            System.out.println("El empleado ahora se llama: " + nombre);
        }

        //metodo toString()
        //devuelve un string formado por las palabras que queramos y el atributo consultado
       // @Override
        public String toString() {
            return "El empleado se llama " + nombre;
        }

    }

    //Clase operario, Clase derivada de la clase empleado.
    
    public static class Operario extends empleado {
        
        
        //Contructor de la clase operario//
        public Operario(String nombre) { //Metodo constructor
               super(nombre);   
               //System.out.println("Operario/Empleado creado");
        } 
        
        
        @Override  //Este metodo sobreescribe al metodo toString de la clase superior
        public String toString(){
            return super.toString()+ " y Es Operario.";        
        }
        
        
        
    }
    
    public static void main(String[] args) {  //Metodo principal
       
       empleado E1= new empleado("Rafa");
       Operario OP1= new Operario("Alfonso");
       System.out.println(E1);
       System.out.println(OP1);
        
    }
}

