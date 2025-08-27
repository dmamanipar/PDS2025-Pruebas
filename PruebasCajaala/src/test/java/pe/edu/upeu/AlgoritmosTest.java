package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AlgoritmosTest {

    private Algoritmos algoritmos;

    @BeforeEach
    void setUp() {
        algoritmos = new Algoritmos();
    }

    // ===== PRUEBAS DEL ALGORITMO ORIGINAL =====
    @Order(1)
    @Test
    void testSumaDosNumeros(){
        int[] m = {11,15,2,7};
        int o=9;
        int[] p=algoritmos.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(2)
    @Test
    void testSumaDosNumeros2(){
        int[] m = {3,2,4};
        int o=6;
        int[] p=algoritmos.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(3)
    @Test
    void testSumaDosNumeros3(){
        int[] m = {3,3};
        int o=6;
        int[] p=algoritmos.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(4)
    @Test
    void testSumaDosNumeros4(){
        int[] m = {11,15,2,7};
        int o=8;
        int[] p=algoritmos.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertNotEquals(o,suma);
    }

    // ===== PRUEBAS DEL ALGORITMO DE ELEMENTO MAYORITARIO =====
    
    @Order(5)
    @Test
    void testMajorityElement_CasoBasico1() {
        // Caso básico: [3, 2, 3] -> 3
        int[] nums = {3, 2, 3};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Caso básico 1: [3, 2, 3] -> " + resultado);
        Assertions.assertEquals(3, resultado);
    }

    @Order(6)
    @Test
    void testMajorityElement_CasoBasico2() {
        // Caso básico: [2, 2, 1, 1, 1, 2, 2] -> 2
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Caso básico 2: [2, 2, 1, 1, 1, 2, 2] -> " + resultado);
        Assertions.assertEquals(2, resultado);
    }

    @Order(7)
    @Test
    void testMajorityElement_ArregloUnElemento() {
        // Caso edge: arreglo de 1 elemento [5] -> 5
        int[] nums = {5};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Arreglo un elemento: [5] -> " + resultado);
        Assertions.assertEquals(5, resultado);
    }

    @Order(8)
    @Test
    void testMajorityElement_TodosIguales() {
        // Caso edge: todos iguales [1, 1, 1] -> 1
        int[] nums = {1, 1, 1};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Todos iguales: [1, 1, 1] -> " + resultado);
        Assertions.assertEquals(1, resultado);
    }

    @Order(9)
    @Test
    void testMajorityElement_ConNegativos() {
        // Caso con negativos: [-1, -1, 2] -> -1
        int[] nums = {-1, -1, 2};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Con negativos: [-1, -1, 2] -> " + resultado);
        Assertions.assertEquals(-1, resultado);
    }

    @Order(10)
    @Test
    void testMajorityElement_ArregloGrande() {
        // Caso con arreglo más grande: [2, 2, 2, 1, 1] -> 2
        int[] nums = {2, 2, 2, 1, 1};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Arreglo grande: [2, 2, 2, 1, 1] -> " + resultado);
        Assertions.assertEquals(2, resultado);
    }

    @Order(11)
    @Test
    void testMajorityElement_ArregloMediano() {
        // Caso con arreglo mediano: [3, 3, 3, 3, 4, 4] -> 3
        int[] nums = {3, 3, 3, 3, 4, 4};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Arreglo mediano: [3, 3, 3, 3, 4, 4] -> " + resultado);
        Assertions.assertEquals(3, resultado);
    }

    @Order(12)
    @Test
    void testMajorityElement_ArregloNull() {
        // Caso de error: arreglo null
        int[] nums = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            algoritmos.majorityElement(nums);
        });
        System.out.println("Arreglo null: Se lanza IllegalArgumentException correctamente");
    }

    @Order(13)
    @Test
    void testMajorityElement_ArregloVacio() {
        // Caso de error: arreglo vacío
        int[] nums = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            algoritmos.majorityElement(nums);
        });
        System.out.println("Arreglo vacío: Se lanza IllegalArgumentException correctamente");
    }

    @Order(14)
    @Test
    void testMajorityElement_VerificacionRobustez() {
        // Verificar que el algoritmo funciona correctamente con diferentes patrones
        // Usar un arreglo que SÍ tenga elemento mayoritario: [7, 7, 5, 7, 5, 7, 5, 7, 5, 5, 7, 7, 7, 7, 1, 1]
        // 7 aparece 9 veces, 5 aparece 4 veces, 1 aparece 2 veces. Total: 16 elementos, 7 aparece más de 8 veces
        int[] nums = {7, 7, 5, 7, 5, 7, 5, 7, 5, 5, 7, 7, 7, 7, 1, 1};
        int resultado = algoritmos.majorityElement(nums);
        System.out.println("Verificación robustez: [7, 7, 5, 7, 5, 7, 5, 7, 5, 5, 7, 7, 7, 7, 1, 1] -> " + resultado);
        
        // Verificar que realmente es mayoritario contando ocurrencias
        int conteo = 0;
        for (int num : nums) {
            if (num == resultado) {
                conteo++;
            }
        }
        Assertions.assertTrue(conteo > nums.length / 2, 
            "El resultado debe aparecer más de n/2 veces. Resultado: " + resultado + 
            ", Conteo: " + conteo + ", n/2: " + nums.length / 2);
    }
}
