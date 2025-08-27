package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    // Pruebas existentes para sumaDosNumeros
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

    // Nuevas pruebas para addBinary
    @Order(5)
    @Test
    void testAddBinary1(){
        Algoritmos a = new Algoritmos();
        String result = a.addBinary("11", "1");
        Assertions.assertNotNull(result);
        System.out.println("11 + 1 = " + result);
        Assertions.assertEquals("100", result);
    }

    @Order(6)
    @Test
    void testAddBinary2(){
        Algoritmos a = new Algoritmos();
        String result = a.addBinary("1010", "1011");
        Assertions.assertNotNull(result);
        System.out.println("1010 + 1011 = " + result);
        Assertions.assertEquals("10101", result);
    }

    @Order(7)
    @Test
    void testAddBinary3(){
        Algoritmos a = new Algoritmos();
        String result = a.addBinary("0", "0");
        Assertions.assertNotNull(result);
        System.out.println("0 + 0 = " + result);
        Assertions.assertEquals("0", result);
    }

    @Order(8)
    @Test
    void testAddBinary4(){
        Algoritmos a = new Algoritmos();
        String result = a.addBinary("1111", "1111");
        Assertions.assertNotNull(result);
        System.out.println("1111 + 1111 = " + result);
        Assertions.assertEquals("11110", result);
    }

    @Order(9)
    @Test
    void testAddBinary5(){
        Algoritmos a = new Algoritmos();
        String result = a.addBinary("1", "111");
        Assertions.assertNotNull(result);
        System.out.println("1 + 111 = " + result);
        Assertions.assertEquals("1000", result);
    }

    @Order(10)
    @Test
    void testAddBinary6(){
        Algoritmos a = new Algoritmos();
        String result = a.addBinary("1000000", "1");
        Assertions.assertNotNull(result);
        System.out.println("1000000 + 1 = " + result);
        Assertions.assertEquals("1000001", result);
    }
}