package com.ciclo2udea.pruebas;

public class Pruebas {
    
    public static double suma(double a, double b){
        double resultado= a+b;
        return resultado;
    }
    
    public static double resta(double a, double b){
      double resultado= a-b;
      return resultado;
  }
    
    public static double multiplicar(double a, double b){
      double resultado= a*b;
      return resultado;
  }
    
      public static double dividir(double a, double b){
          double resultado=0;
          if (b==0){
              System.out.println("No se puede dividir valores por 0");
          } else{
            resultado= (a/b)+1;
          }
          return resultado; 
    }

}
