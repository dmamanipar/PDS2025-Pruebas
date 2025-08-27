package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmoTest {

    @Order(1)
    @Test
    void testBuscarPosicionInsercion1(){
        Algoritmo a = new Algoritmo();
        int[] nums = {1,3,5,6};
        int target = 5;
        int r = a.buscarPosicionInsercion(nums, target);
        System.out.println(r);
        Assertions.assertEquals(2, r);
    }

    @Order(2)
    @Test
    void testBuscarPosicionInsercion2(){
        Algoritmo a = new Algoritmo();
        int[] nums = {1,3,5,6};
        int target = 2;
        int r = a.buscarPosicionInsercion(nums, target);
        System.out.println(r);
        Assertions.assertEquals(1, r);
    }

    @Order(3)
    @Test
    void testBuscarPosicionInsercion3(){
        Algoritmo a = new Algoritmo();
        int[] nums = {1,3,5,6};
        int target = 7;
        int r = a.buscarPosicionInsercion(nums, target);
        System.out.println(r);
        Assertions.assertEquals(4, r);
    }

    @Order(4)
    @Test
    void testBuscarPosicionInsercion4(){
        Algoritmo a = new Algoritmo();
        int[] nums = {1,3,5,6};
        int target = 0;
        int r = a.buscarPosicionInsercion(nums, target);
        System.out.println(r);
        Assertions.assertEquals(0, r);
    }
}
