package com.ciclo2udea.estudiantes.controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {

    public static int capturarOpcion() {
        int opcion = 0;
        while (opcion < 1 || opcion > 6) {  //Controlamos que el numero este dentro del rango
            System.out.println("Opcion: \n");
            try {
                opcion = lector.input.nextInt();  //Controlando que el usuario si ingrese un numero
            } catch (InputMismatchException exception) {
                opcion = lector.input.nextInt();
            }
        }
        return opcion;
    }

}

class lector {

    static Scanner input = new Scanner(System.in);
}
