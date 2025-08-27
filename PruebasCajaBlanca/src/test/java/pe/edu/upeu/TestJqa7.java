package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestJqa7 {

    @Order(1)
    @Test
    void testCasoEjemplo1() {
        Jqa7 j = new Jqa7();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int pos = j.buscarPosicionInsercion(nums, target);
        System.out.println("Posición: " + pos);
        Assertions.assertEquals(2, pos);
    }

    @Order(2)
    @Test
    void testCasoEjemplo2() {
        Jqa7 j = new Jqa7();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int pos = j.buscarPosicionInsercion(nums, target);
        System.out.println("Posición: " + pos);
        Assertions.assertEquals(1, pos);
    }

    @Order(3)
    @Test
    void testCasoEjemplo3() {
        Jqa7 j = new Jqa7();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int pos = j.buscarPosicionInsercion(nums, target);
        System.out.println("Posición: " + pos);
        Assertions.assertEquals(4, pos);
    }

    @Order(4)
    @Test
    void testInsertarAlInicio() {
        Jqa7 j = new Jqa7();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int pos = j.buscarPosicionInsercion(nums, target);
        System.out.println("Posición: " + pos);
        Assertions.assertEquals(0, pos);
    }

    @Order(5)
    @Test
    void testValorExistente() {
        Jqa7 j = new Jqa7();
        int[] nums = {10, 20, 30, 40};
        int target = 30;
        int pos = j.buscarPosicionInsercion(nums, target);
        System.out.println("Posición: " + pos);
        Assertions.assertEquals(2, pos);
    }

    @Order(6)
    @Test
    void testValorMayorTodos() {
        Jqa7 j = new Jqa7();
        int[] nums = {10, 20, 30, 40};
        int target = 100;
        int pos = j.buscarPosicionInsercion(nums, target);
        System.out.println("Posición: " + pos);
        Assertions.assertEquals(4, pos);
    }
}