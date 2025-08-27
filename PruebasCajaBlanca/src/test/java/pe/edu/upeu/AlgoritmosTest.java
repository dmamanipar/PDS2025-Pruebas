package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    @Order(1)
    @Test
    void testSumaDosNumeros(){
        Algoritmos a = new Algoritmos();
        int[] m = {11,15,2,7};
        int o=9;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(2)
    @Test
    void testSumaDosNumeros2(){
        Algoritmos a = new Algoritmos();
        int[] m = {3,2,4};
        int o=6;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(3)
    @Test
    void testSumaDosNumeros3(){
        Algoritmos a = new Algoritmos();
        int[] m = {3,3};
        int o=6;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(4)
    @Test
    void testSumaDosNumeros4(){
        Algoritmos a = new Algoritmos();
        int[] m = {11,15,2,7};
        int o=8;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertNotEquals(o,suma);
    }

    @Order(5)
    @Test
    void testSqrtCaso1() {
        algoritmo11 a = new algoritmo11();
        int x = 4;
        int resultado = a.sqrt(x);
        System.out.println("Sqrt(" + x + ") = " + resultado);
        Assertions.assertEquals(2, resultado);
    }

    @Order(6)
    @Test
    void testSqrtCaso2() {
        algoritmo11 a = new algoritmo11();
        int x = 8;
        int resultado = a.sqrt(x);
        System.out.println("Sqrt(" + x + ") = " + resultado);
        Assertions.assertEquals(2, resultado); // raíz truncada
    }

    @Order(7)
    @Test
    void testSqrtCaso3() {
        algoritmo11 a = new algoritmo11();
        int x = 15;
        int resultado = a.sqrt(x);
        System.out.println("Sqrt(" + x + ") = " + resultado);
        Assertions.assertEquals(3, resultado);
    }

    @Order(8)
    @Test
    void testSqrtCaso4() {
        algoritmo11 a = new algoritmo11();
        int x = 1;
        int resultado = a.sqrt(x);
        System.out.println("Sqrt(" + x + ") = " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(9)
    @Test
    void testSqrtCaso5() {
        algoritmo11 a = new algoritmo11();
        int x = 0;
        int resultado = a.sqrt(x);
        System.out.println("Sqrt(" + x + ") = " + resultado);
        Assertions.assertEquals(0, resultado);
    }

    @Order(10)
    @Test
    void testSqrtCaso6() {
        algoritmo11 a = new algoritmo11();
        int x = 2147395599; // el cuadrado más grande antes de Integer.MAX_VALUE
        int resultado = a.sqrt(x);
        System.out.println("Sqrt(" + x + ") = " + resultado);
        Assertions.assertEquals(46339, resultado); // valor correcto
    }
}
