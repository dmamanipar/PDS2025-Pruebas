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




}
