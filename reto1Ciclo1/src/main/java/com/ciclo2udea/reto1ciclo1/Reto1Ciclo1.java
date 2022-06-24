package com.ciclo2udea.reto1ciclo1;

import java.util.Scanner;

public class Reto1Ciclo1 {

    public static void main(String[] args) {
        int n= (int) ((Math.random())*30)+1;  //Libreria math desde 1 hasta 30, se castea como entero
        System.out.println(n);  //ver el numero secreto
        rifa(n,30);
    }

    public static void rifa(int n, int b) {
        Scanner input = new Scanner(System.in);  //Creamos un objeto tipo scanner para poder hacer input

        int intentos = 0;

        while (true) {
            System.out.println("Por favor ingrese un numero: ");
            int numero = input.nextInt();
            if (numero < 0 || numero > b) {//|| significa O y && significa y
                System.out.println("¡Te saliste del intervalo!");
            } else if (numero > n) {
                System.out.println("¡Ups! Te pasaste");
                intentos += 1; //intentos=intentos+1
            } else if (numero < n) {
                System.out.println("¡Ups! Estás por debajo");
                intentos = intentos + 1;
            } else if (numero == n) {
                intentos = intentos + 1;
                System.out.println("¡LO LOGRASTE! Usaste " + intentos + " intentos");
                break;
            }
        }
    }
}
