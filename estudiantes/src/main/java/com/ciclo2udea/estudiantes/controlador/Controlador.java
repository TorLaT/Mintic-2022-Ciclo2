package com.ciclo2udea.estudiantes.controlador;

import com.ciclo2udea.estudiantes.modelo.Modelo;
import com.ciclo2udea.estudiantes.vista.Vista;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {

    public static int capturarOpcion() {
        int opcion = 0;
        while (opcion < 1 || opcion > 6) {  //Controlamos que el numero este dentro del rango
            System.out.println("Por favor ingrese Opcion: \n");
            try {
                opcion = lector.input.nextInt();
                lector.input.nextLine();//Controlando que el usuario si ingrese un numero
            } catch (InputMismatchException exception) {
                System.out.println("Opción invalida.\n");
                lector.input.nextLine();  //Omitimos la linea con el error que ingresó el usuario
            }
        }
        return opcion;
    }

    public static void ingresar() {
        //Guardamos los nombres en el array Nombres creado en la clase modelo
        System.out.println("Ingrese por favor los nombre(s): \n");

        String Nombres = lector.input.nextLine();
        Modelo.nombres.add(Nombres);

        //Guardamos los apellidos en el array Apellidos creado en la clase modelo
        System.out.println("Ingrese por favor los apellido(s): \n");
        String Apellidos = lector.input.nextLine();
        Modelo.apellidos.add(Apellidos);

        //Guardamos la fecha de nacimiento en el array nacimiento creado en la clase modelo
        System.out.println("Ingrese por favor su fecha de nacimiento: (DD-MM-AAAA)\n");
        String Nacimiento = lector.input.nextLine();
        Modelo.nacimiento.add(Nacimiento);

        //Guardamos el correo electrónico en el array correo creado en la clase modelo
        System.out.println("Ingrese por favor su correo electrónico: \n");
        String Correo = lector.input.nextLine();
        Modelo.correo.add(Correo);

        //Guardamos el numero celular (de tipo long) en el array celular creado en el modelo pero verificamos que no haya error en guardar
        Long Celular;
        System.out.println("Ingrese su numero celular (si no tiene ingrese el numero 0): \n");
        try {
            Celular = lector.input.nextLong();
            lector.input.nextLine(); //Completamos el salto de linea que nextLong esperaba
        } catch (InputMismatchException exception) {
            Celular = (long) 0;
        }
        Modelo.celular.add(Celular);

        //Guardamos el programa en el array programa creado en la clase modelo
        System.out.println("Ingrese por favor el programa de su interes: \n");
        String Programa = lector.input.nextLine();
        Modelo.programa.add(Programa);

        System.out.println("\nUsuario registrado correctamente \n");

    }

    public static void buscar() {
        System.out.println("Ingrese por favor el correo: ");

        String Correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(Correo);
        if (indice == -1) {  //Si indexof regresa un -1, quiere decir que no encontró el objeto
            System.out.println("\n Estudiante no registrado\n");
        } else {
            Vista.mostrar(indice);
        }
    }

    public static void modificar() {
        System.out.println("Ingrese por favor el correo: ");

        String Correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(Correo);
        if (indice != -1) { //Lo encontré
            System.out.println("Por favor ingrese los nombres correctamente: ");
            //String Nombre=lector.input.nextLine();
            Modelo.nombres.set(indice, lector.input.nextLine()); //Modificamos el nombre relacionado con ese indice
            System.out.println("Por favor ingrese los apellidos correctamente: ");
            String Apellidos = lector.input.nextLine();
            Modelo.apellidos.set(indice, Apellidos); //modificamos los apellidos relacionados con ese indice
            System.out.println("Por favor ingrese la fecha de nacimiento correctamente: (DD-MM-AAAA)");
            String Nacimiento = lector.input.nextLine();
            Modelo.nacimiento.set(indice, Nacimiento);
            System.out.println("Por favor ingrese el numero celular correctamente: ");
            Long Celular = lector.input.nextLong();
            lector.input.nextLine();
            Modelo.celular.set(indice, Celular);
            System.out.println("Por favor ingrese el programa de interes correctamente: ");
            String Programa = lector.input.nextLine();
            Modelo.programa.set(indice, Programa);
            System.out.println("\n Estudiante modificado correctamente. \n");
        } else {
            System.out.println("\n Estudiante no encontrado.\n ");
        }
    }

    public static void eliminar() {
        System.out.println("Ingrese por favor el correo: ");

        String Correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(Correo);
        if (indice != -1) {  //lo encontre
            Modelo.nombres.remove(indice);
            Modelo.apellidos.remove(indice);
            Modelo.nacimiento.remove(indice);
            Modelo.correo.remove(indice);
            Modelo.celular.remove(indice);
            Modelo.programa.remove(indice);
            System.out.println("Registro de estudiante eliminado correctamente. \n");

        } else {
            System.out.println("\n No puede eliminarse pues no está registrado. \n");
        }
    }
}

class lector {

    static Scanner input = new Scanner(System.in);
}




//if variable:  -> if variable==True:  variable=!  ->variable=False


//Next cuando se alimenta de numeros asume que recibe contenido numeroValor+"\n"
