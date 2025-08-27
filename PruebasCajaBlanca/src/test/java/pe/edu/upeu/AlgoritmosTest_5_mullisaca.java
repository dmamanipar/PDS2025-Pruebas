package pe.edu.upeu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class AlgoritmosTest_5_mullisaca {

    public static void main(String[] args) {
        Algoritmo_5_mullisaca s = new Algoritmo_5_mullisaca();

        // Caso 1: arreglo vacío
        int[] nums1 = {};
        int k1 = s.removeDuplicates(nums1);
        System.out.println("Test 1 -> k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, k1)));
        // esperado: k=0, []

        // Caso 2: un solo elemento
        int[] nums2 = {5};
        int k2 = s.removeDuplicates(nums2);
        System.out.println("Test 2 -> k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOf(nums2, k2)));
        // esperado: k=1, [5]

        // Caso 3: sin duplicados
        int[] nums3 = {1,2,3,4,5};
        int k3 = s.removeDuplicates(nums3);
        System.out.println("Test 3 -> k = " + k3 + ", nums = " + Arrays.toString(Arrays.copyOf(nums3, k3)));
        // esperado: k=5, [1,2,3,4,5]

        // Caso 4: con duplicados
        int[] nums4 = {0,0,1,1,1,2,2,3,3,4};
        int k4 = s.removeDuplicates(nums4);
        System.out.println("Test 4 -> k = " + k4 + ", nums = " + Arrays.toString(Arrays.copyOf(nums4, k4)));
        // esperado: k=5, [0,1,2,3,4]

        // Caso 5: todos iguales
        int[] nums5 = {7,7,7,7,7};
        int k5 = s.removeDuplicates(nums5);
        System.out.println("Test 5 -> k = " + k5 + ", nums = " + Arrays.toString(Arrays.copyOf(nums5, k5)));
        // esperado: k=1, [7]

        // Caso 6: mezcla larga
        int[] nums6 = {-3,-3,-2,-2,-1,0,0,0,1,1,2,3,3,4,5,5};
        int k6 = s.removeDuplicates(nums6);
        System.out.println("Test 6 -> k = " + k6 + ", nums = " + Arrays.toString(Arrays.copyOf(nums6, k6)));
        // esperado: k=9, [-3,-2,-1,0,1,2,3,4,5]
    }
}
