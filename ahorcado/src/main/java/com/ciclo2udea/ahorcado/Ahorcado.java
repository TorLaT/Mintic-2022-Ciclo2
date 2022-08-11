package com.ciclo2udea.ahorcado;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    private String[] palabras={"hipocampo","ornitorrinco","armadillo","tigrillo","orangutan","ocelote","tigon","danta"};
    static Scanner input;
    static String palabra;
    static String acumuladora;
    static int vidas;
    
    public Ahorcado(){
        this.input=new Scanner(System.in);
        this.acumuladora="";
        this.vidas=5;
        Random ran= new Random();
        int numRandom=ran.nextInt(this.palabras.length);
        this.palabra=this.palabras[numRandom];
    }
    
	//Este comentario es para ver si Git esta funcionando correctamente
	
    public static void adivinar(){
        
        //Saludos, interaccion inicial
        System.out.println("Ingresa por favor tu nombre: ");
        String nombre=input.nextLine();
        System.out.println("Ok! "+nombre+" vamos a jugar!");
        
        while (vidas>0){ //Si sigue teniendo vidas
            Boolean adivinado=true;
            System.out.println("\nIngresa una letra: ");
            String tuLetra=input.nextLine();
            if (acumuladora.contains(tuLetra)){ //Ya dijo esa letra?
                System.out.println("Disculpa, esa letra ya la dijste. Sigue jugando. Te quedan "+vidas+ "vidas.");
            }
            else{
                acumuladora=acumuladora+tuLetra; //Concatenacion
                if (palabra.contains(tuLetra)){                
                    System.out.println("Muy bien! la palabra secreta contiene tu letra!. Te quedan "+vidas+" vidas.");
                }
                else{
                    vidas=vidas-1;
                    System.out.println("No!, esa letra no esta, perdiste una vida, te quedan "+vidas+" vidas.");
                }

                //Visualizacion del progreso
                
                for (int i=0;i<palabra.length();i++){
                    char letra=palabra.charAt(i);  //Verifica el caracter a encontrar
                    if (acumuladora.contains(String.valueOf(letra))){
                        System.out.print(letra);
                    }
                    else{
                        adivinado=false;
                        System.out.print("_ ");
                    }
                    
                }
                if (adivinado==true){
                    System.out.println("\nFelicitaciones "+nombre+", GANASTE! La palabra era: "+palabra);
                    System.out.println("     ");
                    System.out.println("\\O/ ");
                    System.out.println("  |  ");
                    System.out.println("  |  ");
                    System.out.println(" / \\");
                    break;
                }
            }
        }
        
        System.out.println("\nLo siento "+nombre+", PERDISTE! La palabra era: "+palabra);
        System.out.println("______");
        System.out.println("  |  |");
        System.out.println(" O|  |");
        System.out.println(" /|\\ |");
        System.out.println("  |  |");
        System.out.println(" / \\ |");
        System.out.println("======");
    }

    public static void main(String[] args) {
       Ahorcado juego= new Ahorcado();
       juego.adivinar();
    }
}
