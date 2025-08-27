package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Algoritmo16Test {

    @Order(1)
    @Test
    void testNumeroUnico1() {
        Algoritmo16 a = new Algoritmo16();
        int[] nums = {2, 2, 1};
        int resultado = a.numeroUnico(nums);
        Assertions.assertNotNull(resultado);
        System.out.println("Resultado: " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(2)
    @Test
    void testNumeroUnico2() {
        Algoritmo16 a = new Algoritmo16();
        int[] nums = {4, 1, 2, 1, 2};
        int resultado = a.numeroUnico(nums);
        Assertions.assertNotNull(resultado);
        System.out.println("Resultado: " + resultado);
        Assertions.assertEquals(4, resultado);
    }

    @Order(3)
    @Test
    void testNumeroUnico3() {
        Algoritmo16 a = new Algoritmo16();
        int[] nums = {1};
        int resultado = a.numeroUnico(nums);
        Assertions.assertNotNull(resultado);
        System.out.println("Resultado: " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(4)
    @Test
    void testNumeroUnicoNoExiste() {
        Algoritmo16 a = new Algoritmo16();
        int[] nums = {3, 3, 4, 4};
        int resultado = a.numeroUnico(nums);
        // Aquí no hay número único, el resultado esperado debería ser 0
        Assertions.assertEquals(0, resultado);
        System.out.println("Resultado sin único esperado (0): " + resultado);
    }
}
