package com.ciclo2udea.hogar;

import java.util.ArrayList;

public class Solucion {
    public static Object[] informe(ArrayList<Gasto> casa){
        //Inicializo Variables
        double gastoTotal=0.0;
        String menosGastador=casa.get(0).getNombreMiembro();
        double menorGasto=casa.get(0).getTotalGasto();
        String mayorGastador=casa.get(0).getNombreMiembro();
        double mayorGasto=casa.get(0).getTotalGasto();
        
        //Itero la lista
        for (int i=0;i<casa.size();i++){
            //empiezo a acumular en mi variable acumuladora
        gastoTotal=gastoTotal+casa.get(i).getTotalGasto();
        //Verifico cual es en realidad el gasto menor
        if (casa.get(i).getTotalGasto()<menorGasto){
            menorGasto=casa.get(i).getTotalGasto();
            menosGastador=casa.get(i).getNombreMiembro();
        }
        if (casa.get(i).getTotalGasto()>mayorGasto){
            mayorGasto=casa.get(i).getTotalGasto();
            mayorGastador=casa.get(i).getNombreMiembro();
            }
        }
        /*Object [] informe = new Object[5];
        informe[0]=gastoTotal;
        informe[1]=menosGastador;
        //Y asi sucesivamente*/
        
        Object [] informe= new Object[]{gastoTotal, menosGastador, menorGasto, mayorGastador, mayorGasto};
        return informe;
    }
    
}
