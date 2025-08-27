package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PoderDeDosTest {

    @Order(1)
    @Test
    void testEsPotenciaDeDos1() {
        PoderDeDos p = new PoderDeDos();
        int n = 1;
        boolean resultado = p.esPotenciaDeDos(n);
        System.out.println("n = " + n + ", Resultado: " + resultado);
        Assertions.assertTrue(resultado, "1 es potencia de 2 (2^0 = 1)");
    }

    @Order(2)
    @Test
    void testEsPotenciaDeDos16() {
        PoderDeDos p = new PoderDeDos();
        int n = 16;
        boolean resultado = p.esPotenciaDeDos(n);
        System.out.println("n = " + n + ", Resultado: " + resultado);
        Assertions.assertTrue(resultado, "16 es potencia de 2 (2^4 = 16)");
    }

    @Order(3)
    @Test
    void testEsPotenciaDeDos3() {
        PoderDeDos p = new PoderDeDos();
        int n = 3;
        boolean resultado = p.esPotenciaDeDos(n);
        System.out.println("n = " + n + ", Resultado: " + resultado);
        Assertions.assertFalse(resultado, "3 no es potencia de 2");
    }

    @Order(4)
    @Test
    void testEsPotenciaDeDosOtrosCasos() {
        PoderDeDos p = new PoderDeDos();

        // Caso: n = 2 (2^1 = 2)
        int n1 = 2;
        boolean resultado1 = p.esPotenciaDeDos(n1);
        System.out.println("n = " + n1 + ", Resultado: " + resultado1);
        Assertions.assertTrue(resultado1, "2 es potencia de 2 (2^1 = 2)");

        // Caso: n = 4 (2^2 = 4)
        int n2 = 4;
        boolean resultado2 = p.esPotenciaDeDos(n2);
        System.out.println("n = " + n2 + ", Resultado: " + resultado2);
        Assertions.assertTrue(resultado2, "4 es potencia de 2 (2^2 = 4)");

        // Caso: n = 8 (2^3 = 8)
        int n3 = 8;
        boolean resultado3 = p.esPotenciaDeDos(n3);
        System.out.println("n = " + n3 + ", Resultado: " + resultado3);
        Assertions.assertTrue(resultado3, "8 es potencia de 2 (2^3 = 8)");
    }

    @Order(5)
    @Test
    void testEsPotenciaDeDosNegativos() {
        PoderDeDos p = new PoderDeDos();

        // Caso: n = 0
        int n1 = 0;
        boolean resultado1 = p.esPotenciaDeDos(n1);
        System.out.println("n = " + n1 + ", Resultado: " + resultado1);
        Assertions.assertFalse(resultado1, "0 no es potencia de 2");

        // Caso: n = -1
        int n2 = -1;
        boolean resultado2 = p.esPotenciaDeDos(n2);
        System.out.println("n = " + n2 + ", Resultado: " + resultado2);
        Assertions.assertFalse(resultado2, "Números negativos no son potencia de 2");
    }

    @Order(6)
    @Test
    void testEsPotenciaDeDosGrandes() {
        PoderDeDos p = new PoderDeDos();

        // Caso: n = 1024 (2^10 = 1024)
        int n1 = 1024;
        boolean resultado1 = p.esPotenciaDeDos(n1);
        System.out.println("n = " + n1 + ", Resultado: " + resultado1);
        Assertions.assertTrue(resultado1, "1024 es potencia de 2 (2^10 = 1024)");

        // Caso: n = 1000 (no es potencia de 2)
        int n2 = 1000;
        boolean resultado2 = p.esPotenciaDeDos(n2);
        System.out.println("n = " + n2 + ", Resultado: " + resultado2);
        Assertions.assertFalse(resultado2, "1000 no es potencia de 2");
    }
}