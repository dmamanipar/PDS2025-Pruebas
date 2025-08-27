package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Ejercicios3Test {

    @Order(1)
    @Test
    void testEjemplo1() {
        Ejercicio3 a = new Ejercicio3();
        String[] strs = {"flower", "flow", "flight"};
        String resultado = a.prefijoComunMasLargo(strs);
        Assertions.assertEquals("fl", resultado);
    }

    @Order(2)
    @Test
    void testEjemplo2() {
        Ejercicio3 a = new Ejercicio3();
        String[] strs = {"dog", "racecar", "car"};
        String resultado = a.prefijoComunMasLargo(strs);
        Assertions.assertEquals("", resultado);
    }

    @Order(3)
    @Test
    void testPrefijoCompleto() {
        Ejercicio3 a = new Ejercicio3();
        String[] strs = {"test", "test", "test"};
        String resultado = a.prefijoComunMasLargo(strs);
        Assertions.assertEquals("test", resultado);
    }

    @Order(4)
    @Test
    void testPrefijoVacio() {
        Ejercicio3 a = new Ejercicio3();
        String[] strs = {"abc", "def", "ghi"};
        String resultado = a.prefijoComunMasLargo(strs);
        Assertions.assertEquals("", resultado);
    }

    @Order(5)
    @Test
    void testArrayVacio() {
        Ejercicio3 a = new Ejercicio3();
        String[] strs = {};
        String resultado = a.prefijoComunMasLargo(strs);
        Assertions.assertEquals("", resultado);
    }

    @Order(6)
    @Test
    void testUnSoloElemento() {
        Ejercicio3 a = new Ejercicio3();
        String[] strs = {"solo"};
        String resultado = a.prefijoComunMasLargo(strs);
        Assertions.assertEquals("solo", resultado);
    }

    @Order(7)
    @Test
    void testArrayNull() {
        Ejercicio3 a = new Ejercicio3();
        String resultado = a.prefijoComunMasLargo(null);
        Assertions.assertEquals("", resultado);
    }
}
