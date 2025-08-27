package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Algoritmos12Test {

    @Order(1)
    @Test
    void testSubirEscaleras1(){
        Algoritmos12 a = new Algoritmos12();
        int n=1;
        int resultado = a.subirEscaleras(n);
        System.out.println("n="+n+" -> "+resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(2)
    @Test
    void testSubirEscaleras2(){
        Algoritmos12 a = new Algoritmos12();
        int n=3;
        int resultado = a.subirEscaleras(n);
        System.out.println("n="+n+" -> "+resultado);
        Assertions.assertEquals(3, resultado);
    }

    @Order(3)
    @Test
    void testSubirEscaleras3(){
        Algoritmos12 a = new Algoritmos12();
        int n=5;
        int resultado = a.subirEscaleras(n);
        System.out.println("n="+n+" -> "+resultado);
        Assertions.assertEquals(8, resultado);
    }

    @Order(4)
    @Test
    void testSubirEscaleras4(){
        Algoritmos12 a = new Algoritmos12();
        int n=10;
        int resultado = a.subirEscaleras(n);
        System.out.println("n="+n+" -> "+resultado);
        Assertions.assertEquals(89, resultado);
    }

    @Order(5)
    @Test
    void testSubirEscaleras5(){
        Algoritmos12 a = new Algoritmos12();
        int n=21;
        int resultado = a.subirEscaleras(n);
        System.out.println("n="+n+" -> "+resultado);
        Assertions.assertEquals(17711, resultado);
    }
}
