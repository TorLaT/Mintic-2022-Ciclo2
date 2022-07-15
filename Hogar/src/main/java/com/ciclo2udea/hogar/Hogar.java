package com.ciclo2udea.hogar;

import java.util.ArrayList;
import java.util.Arrays;

public class Hogar {

    public static void main(String[] args) {
        ArrayList <Gasto> gastosMes= new ArrayList<>();
        //Forma 1
        Gasto gasto1 =new Gasto("Camilo",350000,"14/07/2022");
        gastosMes.add(gasto1);
        
       //Forma2
       gastosMes.add(new Gasto("Laura",20000,"15/07/2022"));
       gastosMes.add(new Gasto("Edith",120000,"15/07/2022"));
       gastosMes.add(new Gasto("Jairo",8000,"15/07/2022"));
       gastosMes.add(new Gasto("Esteban",500000,"15/07/2022"));
       Object[] respuesta=Solucion.informe(gastosMes);
       System.out.println(Arrays.toString(respuesta));
    }
}
