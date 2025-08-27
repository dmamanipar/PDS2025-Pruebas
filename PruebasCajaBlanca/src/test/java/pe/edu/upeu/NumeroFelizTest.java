package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class NumeroFelizTest {

    @Order(1)
    @Test
    void testNumeroFelizEjemplo1() {
        Algoritmos a = new Algoritmos();
        int n = 19;
        boolean resultado = a.esNumeroFeliz(n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + resultado);
        Assertions.assertTrue(resultado); // Se espera true
    }

    @Order(2)
    @Test
    void testNumeroFelizEjemplo2() {
        Algoritmos a = new Algoritmos();
        int n = 2;
        boolean resultado = a.esNumeroFeliz(n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + resultado);
        Assertions.assertFalse(resultado); // Se espera false
    }

    @Order(3)
    @Test
    void testNumeroFelizExtra1() {
        Algoritmos a = new Algoritmos();
        int n = 7;
        boolean resultado = a.esNumeroFeliz(n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + resultado);
        Assertions.assertTrue(resultado); // 7 es un número feliz
    }

    @Order(4)
    @Test
    void testNumeroFelizExtra2() {
        Algoritmos a = new Algoritmos();
        int n = 20;
        boolean resultado = a.esNumeroFeliz(n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + resultado);
        Assertions.assertFalse(resultado); // 20 no es un número feliz
    }
}
