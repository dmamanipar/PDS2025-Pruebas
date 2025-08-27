package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosEjDosTest {

    @Order(1)
    @Test
    void testEsPalindromo1() {
        AlgoritmosEjDos a = new AlgoritmosEjDos();
        int x = 121;
        boolean resultado = a.esPalindromo(x);
        System.out.println(x);
        System.out.println("¿Es palíndromo? " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(2)
    @Test
    void testEsPalindromo2() {
        AlgoritmosEjDos a = new AlgoritmosEjDos();
        int x = -121;
        boolean resultado = a.esPalindromo(x);
        System.out.println(x);
        System.out.println("¿Es palíndromo? " + resultado);
        Assertions.assertFalse(resultado);
    }

    @Order(3)
    @Test
    void testEsPalindromo3() {
        AlgoritmosEjDos a = new AlgoritmosEjDos();
        int x = 10;
        boolean resultado = a.esPalindromo(x);
        System.out.println(x);
        System.out.println("¿Es palíndromo? " + resultado);
        Assertions.assertFalse(resultado);
    }

}