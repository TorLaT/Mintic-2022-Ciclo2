package com.ciclo2udea.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasTest {


    @Test
    public void testSuma() {
        double resultado=Pruebas.suma(12, 8);
        double esperado=20;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testResta() {
        double resultado=Pruebas.resta(12, 8);
        double esperado=4;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testMultiplicar() {
        double resultado=Pruebas.multiplicar(12, 8);
        double esperado=96;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testDividir() {
        double resultado=Pruebas.dividir(12, 3);
        double esperado=4;
        assertEquals(esperado,resultado);
    }


}
