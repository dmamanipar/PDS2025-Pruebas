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
        System.out.println("Resultado: " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(2)
    @Test
    void testNumeroUnico2() {
        Algoritmo16 a = new Algoritmo16();
        int[] nums = {4, 1, 2, 1, 2};
        int resultado = a.numeroUnico(nums);
        System.out.println("Resultado: " + resultado);
        Assertions.assertEquals(4, resultado);
    }

    @Order(3)
    @Test
    void testNumeroUnico3() {
        Algoritmo16 a = new Algoritmo16();
        int[] nums = {1};
        int resultado = a.numeroUnico(nums);
        System.out.println("Resultado: " + resultado);
        Assertions.assertEquals(1, resultado);
    }
}
