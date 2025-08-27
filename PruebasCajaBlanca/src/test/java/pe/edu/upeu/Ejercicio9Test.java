package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class Ejercicio9Test {

    @Order(1)
    @Test
    void testPlusOne1() {
        Ejercicio9 e = new Ejercicio9();
        int[] digits = {1,2,3};
        int[] expected = {1,2,4};
        int[] result = e.plusOne(digits);
        System.out.println("Input: " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }

    @Order(2)
    @Test
    void testPlusOne2() {
        Ejercicio9 e = new Ejercicio9();
        int[] digits = {4,3,2,1};
        int[] expected = {4,3,2,2};
        int[] result = e.plusOne(digits);
        System.out.println("Input: " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }

    @Order(3)
    @Test
    void testPlusOne3() {
        Ejercicio9 e = new Ejercicio9();
        int[] digits = {9};
        int[] expected = {1,0};
        int[] result = e.plusOne(digits);
        System.out.println("Input: " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }

    @Order(4)
    @Test
    void testPlusOne4() {
        Ejercicio9 e = new Ejercicio9();
        int[] digits = {9,9,9};
        int[] expected = {1,0,0,0};
        int[] result = e.plusOne(digits);
        System.out.println("Input: " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }
}
