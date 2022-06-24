/*Doña Juana, tiene 7 hijos, y ha querido junto con ellos aprender java, uno de los ejercicios propuestos 
para esta practica es, meter en un arreglo las edades de todos los miembros de su familia. Quiere crear 
un proyecto que, recibiendo dicho arreglo, le retorne un arreglo que tenga en su primera posición la suma 
de todas las edades de los miembros de su hogar, en la segunda pocisión la edad del miembro mas joven de 
su hogar y por ultimo la edad del miembro con mas edad en su hogar.*/

package com.ciclo2udea.practica1;

public class Practica1 {

    public static int[] familia(int[] edades){
        
        //Busquemos al mas joven
        int joven=edades[0];
        for (int i=0;i<edades.length;i++){
            if (edades[i]<joven){
            joven=edades[i];
            }
        }
        
        //Busquemos al mayor
        int mayor=edades[0];
        for (int i=0;i<edades.length;i++){
            if (edades[i]>mayor){
            mayor=edades[i];
            }
        }
        
        //Sumamos todas las edades
        int suma=0;
        for (int i=0;i<edades.length;i++){
            suma=suma+edades[i];
        }
        
        int[] respuesta = new int[3];  //Creamos un array de enteros con solo 3 elementos
        respuesta[0]=suma;
        respuesta[1]=joven;
        respuesta[2]=mayor;
        
        return respuesta;
        
    }
    
    
    //Prueba de mi codigo
    public static void main(String[] args) {  //main, probamos que el codigo que vamos a pegar esta bien
        
        int [] ages = {23, 14, 6, 7, 8, 31, 16};  //Datos de muestra
        
        int [] respuesta = familia(ages);  //Creamos un array donde se guarde el arreglo respuesta al ejecutar la funcion familia con ages como argumento
        
        for (int i=0; i<respuesta.length;i++){  //Recorremos el arreglo respuesta
            
            System.out.println(respuesta[i]);  //Imprimimos cada valor de mi arreglo
        }
        
    }
}
