package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class JackTestAlgoritmo {

    @Order(1)
    @Test
    void testCasoEjemplo1() {
        JackAlgoritmo5 ja = new JackAlgoritmo5();
        int[] nums = {1,1,2};
        int k = ja.removeDuplicates(nums);

        int[] resultado = Arrays.copyOf(nums, k);
        System.out.println("k = " + k + " -> Resultado sin duplicados: " + Arrays.toString(resultado));

        Assertions.assertEquals(2, k);
        Assertions.assertArrayEquals(new int[]{1,2}, resultado);
    }

    @Order(2)
    @Test
    void testCasoEjemplo2() {
        JackAlgoritmo5 ja = new JackAlgoritmo5();
        int[] nums = {0,0,1,1,1,2,2,3,3,4,};
        int k = ja.removeDuplicates(nums);

        int[] resultado = Arrays.copyOf(nums, k);
        System.out.println("k = " + k + " -> Resultado sin duplicados: " + Arrays.toString(resultado));

        Assertions.assertEquals(5, k);
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4}, resultado);
    }

    @Order(3)
    @Test
    void testCasoUnicoElemento() {
        JackAlgoritmo5 ja = new JackAlgoritmo5();
        int[] nums = {7};
        int k = ja.removeDuplicates(nums);

        int[] resultado = Arrays.copyOf(nums, k);
        System.out.println("k = " + k + " -> Resultado sin duplicados: " + Arrays.toString(resultado));

        Assertions.assertEquals(1, k);
        Assertions.assertArrayEquals(new int[]{7}, resultado);
    }

    @Order(4)
    @Test
    void testCasoTodosIguales() {
        JackAlgoritmo5 ja = new JackAlgoritmo5();
        int[] nums = {5,5,5,5,5};
        int k = ja.removeDuplicates(nums);

        int[] resultado = Arrays.copyOf(nums, k);
        System.out.println("k = " + k + " -> Resultado sin duplicados: " + Arrays.toString(resultado));

        Assertions.assertEquals(1, k);
        Assertions.assertArrayEquals(new int[]{5}, resultado);
    }
}