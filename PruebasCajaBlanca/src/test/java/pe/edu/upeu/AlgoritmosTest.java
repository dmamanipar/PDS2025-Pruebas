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
    void testLongitudUltimaPalabra1(){
        Algoritmos a = new Algoritmos();
        String s = "Hello World";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(5, resultado);
    }

    @Order(6)
    @Test
    void testLongitudUltimaPalabra2(){
        Algoritmos a = new Algoritmos();
        String s = "   fly me   to   the moon  ";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(4, resultado);
    }

    @Order(7)
    @Test
    void testLongitudUltimaPalabra3(){
        Algoritmos a = new Algoritmos();
        String s = "luffy is still joyboy";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(6, resultado);
    }

    @Order(8)
    @Test
    void testLongitudUltimaPalabra4(){
        Algoritmos a = new Algoritmos();
        String s = "a";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(9)
    @Test
    void testLongitudUltimaPalabra5(){
        Algoritmos a = new Algoritmos();
        String s = "   a   ";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(10)
    @Test
    void testLongitudUltimaPalabra6(){
        Algoritmos a = new Algoritmos();
        String s = "word ";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(4, resultado);
    }

    @Order(11)
    @Test
    void testLongitudUltimaPalabra7(){
        Algoritmos a = new Algoritmos();
        String s = "multiple    spaces    between    words";
        int resultado = a.longitudUltimaPalabra(s);
        System.out.println("\"" + s + "\" -> " + resultado);
        Assertions.assertEquals(5, resultado);
    }
}