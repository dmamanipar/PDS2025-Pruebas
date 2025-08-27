package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmoTest4 {
    @Order(1)
    @Test
    void testSumaDosNumeros(){
        Algoritmos a = new Algoritmos();
        int[] m = {11,15,2,7};
        int o = 9;
        int[] p = a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma = (m[p[0]] + m[p[1]]);
        System.out.println("[" + p[0] + "," + p[1] + "]");
        System.out.println(suma);
        Assertions.assertEquals(o, suma);
    }

    @Order(2)
    @Test
    void testSumaDosNumeros2(){
        Algoritmos a = new Algoritmos();
        int[] m = {3,2,4};
        int o = 6;
        int[] p = a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma = (m[p[0]] + m[p[1]]);
        System.out.println("[" + p[0] + "," + p[1] + "]");
        System.out.println(suma);
        Assertions.assertEquals(o, suma);
    }

    @Order(3)
    @Test
    void testSumaDosNumeros3(){
        Algoritmos a = new Algoritmos();
        int[] m = {3,3};
        int o = 6;
        int[] p = a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma = (m[p[0]] + m[p[1]]);
        System.out.println("[" + p[0] + "," + p[1] + "]");
        System.out.println(suma);
        Assertions.assertEquals(o, suma);
    }

    @Order(4)
    @Test
    void testSumaDosNumeros4(){
        Algoritmos a = new Algoritmos();
        int[] m = {11,15,2,7};
        int o = 8;
        int[] p = a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma = (m[p[0]] + m[p[1]]);
        System.out.println("[" + p[0] + "," + p[1] + "]");
        System.out.println(suma);
        Assertions.assertNotEquals(o, suma);
    }

    // Nuevos tests para fusionarListasOrdenadas
    @Order(5)
    @Test
    void testFusionarListasOrdenadas1(){
        Algoritmos a = new Algoritmos();
        int[] lista1 = {1,2,4};
        int[] lista2 = {1,3,4};
        int[] resultado = a.fusionarListasOrdenadas(lista1, lista2);
        int[] esperado = {1,1,2,3,4,4};

        Assertions.assertNotNull(resultado);
        Assertions.assertArrayEquals(esperado, resultado);

        System.out.print("Resultado: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    @Order(6)
    @Test
    void testFusionarListasOrdenadas2(){
        Algoritmos a = new Algoritmos();
        int[] lista1 = {};
        int[] lista2 = {1};
        int[] resultado = a.fusionarListasOrdenadas (lista1, lista2);
        int[] esperado = {1};

        Assertions.assertNotNull(resultado);
        Assertions.assertArrayEquals(esperado, resultado);
    }

    @Order(7)
    @Test
    void testFusionarListasOrdenadas3(){
        Algoritmos a = new Algoritmos();
        int[] lista1 = {1};
        int[] lista2 = {};
        int[] resultado = a.fusionarListasOrdenadas(lista1, lista2);
        int[] esperado = {1};

        Assertions.assertNotNull(resultado);
        Assertions.assertArrayEquals(esperado, resultado);
    }
}