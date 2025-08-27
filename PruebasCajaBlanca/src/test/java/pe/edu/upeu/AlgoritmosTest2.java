package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosTest2 {

    @Order(1)
    @Test
    void testEsPalindromo1() {
        Algoritmos2 a = new Algoritmos2();
        int x = 121;
        boolean resultado = a.esPalindromo(x);
        System.out.println("Entrada: " + x + " -> Resultado: " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(2)
    @Test
    void testEsPalindromo2() {
        Algoritmos2 a = new Algoritmos2();
        int x = -121;
        boolean resultado = a.esPalindromo(x);
        System.out.println("Entrada: " + x + " -> Resultado: " + resultado);
        Assertions.assertFalse(resultado);
    }

    @Order(3)
    @Test
    void testEsPalindromo3() {
        Algoritmos2 a = new Algoritmos2();
        int x = 10;
        boolean resultado = a.esPalindromo(x);
        System.out.println("Entrada: " + x + " -> Resultado: " + resultado);
        Assertions.assertFalse(resultado);
    }

    @Order(4)
    @Test
    void testEsPalindromo4() {
        Algoritmos2 a = new Algoritmos2();
        int x = 0;
        boolean resultado = a.esPalindromo(x);
        System.out.println("Entrada: " + x + " -> Resultado: " + resultado);
        Assertions.assertTrue(resultado); // 0 es palíndromo
    }

    @Order(5)
    @Test
    void testEsPalindromo5() {
        Algoritmos2 a = new Algoritmos2();
        int x = 12321;
        boolean resultado = a.esPalindromo(x);
        System.out.println("Entrada: " + x + " -> Resultado: " + resultado);
        Assertions.assertTrue(resultado);
    }
}
