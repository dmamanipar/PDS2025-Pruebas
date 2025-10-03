package pe.edu.upeu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Algoritmo19Test {

    @Order(1)
    @Test
    @DisplayName("Test para n = 1 (2^0 = 1)")
    public void testPotenciaDeDosCaso1() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        // Verificar el método principal
        assertTrue(algoritmo.esPotenciaDeDos(1));

        // Verificar el formato de salida
        assertEquals("true", algoritmo.verificarPotenciaDeDos(1));

        System.out.println("Input: n = 1");
        System.out.println("Output: " + algoritmo.verificarPotenciaDeDos(1));
        System.out.println("Ejecutado en test: n = 1 → true");
        System.out.println("---");
    }

    @Order(2)
    @Test
    @DisplayName("Test para n = 16 (2^4 = 16)")
    public void testPotenciaDeDosCaso2() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        assertTrue(algoritmo.esPotenciaDeDos(16));
        assertEquals("true", algoritmo.verificarPotenciaDeDos(16));

        System.out.println("Input: n = 16");
        System.out.println("Output: " + algoritmo.verificarPotenciaDeDos(16));
        System.out.println("Ejecutado en test: n = 16 → true");
        System.out.println("---");
    }

    @Order(3)
    @Test
    @DisplayName("Test para n = 3 (no es potencia de dos)")
    public void testPotenciaDeDosCaso3() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        assertFalse(algoritmo.esPotenciaDeDos(3));
        assertEquals("false", algoritmo.verificarPotenciaDeDos(3));

        System.out.println("Input: n = 3");
        System.out.println("Output: " + algoritmo.verificarPotenciaDeDos(3));
        System.out.println("Ejecutado en test: n = 3 → false");
        System.out.println("---");
    }

    @Order(4)
    @Test
    @DisplayName("Test para números potencia de dos positivos")
    public void testPotenciasDeDosPositivas() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        int[] potencias = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        for (int n : potencias) {
            assertTrue(algoritmo.esPotenciaDeDos(n), "Falló para n = " + n);
            assertEquals("true", algoritmo.verificarPotenciaDeDos(n));

            System.out.println("Test ejecutado: n = " + n + " → true");
        }
        System.out.println("---");
    }

    @Order(5)
    @Test
    @DisplayName("Test para números que NO son potencia de dos")
    public void testNoPotenciasDeDos() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        int[] noPotencias = {3, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 20, 24, 28, 31, 33, 63, 127};

        for (int n : noPotencias) {
            assertFalse(algoritmo.esPotenciaDeDos(n), "Falló para n = " + n);
            assertEquals("false", algoritmo.verificarPotenciaDeDos(n));

            System.out.println("Test ejecutado: n = " + n + " → false");
        }
        System.out.println("---");
    }

    @Order(6)
    @Test
    @DisplayName("Test para números negativos")
    public void testNumerosNegativos() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        // Los números negativos no pueden ser potencias de dos
        assertFalse(algoritmo.esPotenciaDeDos(-1));
        assertFalse(algoritmo.esPotenciaDeDos(-2));
        assertFalse(algoritmo.esPotenciaDeDos(-4));
        assertFalse(algoritmo.esPotenciaDeDos(-8));
        assertFalse(algoritmo.esPotenciaDeDos(-16));

        assertEquals("false", algoritmo.verificarPotenciaDeDos(-1));
        assertEquals("false", algoritmo.verificarPotenciaDeDos(-16));

        System.out.println("Test ejecutado: números negativos → false");
        System.out.println("---");
    }

    @Order(7)
    @Test
    @DisplayName("Test para cero")
    public void testCero() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        assertFalse(algoritmo.esPotenciaDeDos(0));
        assertEquals("false", algoritmo.verificarPotenciaDeDos(0));

        System.out.println("Input: n = 0");
        System.out.println("Output: " + algoritmo.verificarPotenciaDeDos(0));
        System.out.println("Ejecutado en test: n = 0 → false");
        System.out.println("---");
    }

    @Order(8)
    @Test
    @DisplayName("Test para el número máximo del rango (2^30)")
    public void testNumeroMaximoRango() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        // 2^30 está dentro del rango de int (2^31 - 1)
        int potenciaMaxima = 1 << 30; // 2^30 = 1073741824

        assertTrue(algoritmo.esPotenciaDeDos(potenciaMaxima));
        assertEquals("true", algoritmo.verificarPotenciaDeDos(potenciaMaxima));

        System.out.println("Input: n = " + potenciaMaxima + " (2^30)");
        System.out.println("Output: " + algoritmo.verificarPotenciaDeDos(potenciaMaxima));
        System.out.println("Ejecutado en test: n = " + potenciaMaxima + " → true");
        System.out.println("---");
    }

    @Order(9)
    @Test
    @DisplayName("Test de ejecución completa con todos los casos del ejemplo")
    public void testEjecucionCompleta() {
        Algoritmo19 algoritmo = new Algoritmo19Impl();

        System.out.println("=== EJECUCIÓN COMPLETA DEL ALGORITMO ===");

        // Caso 1: n = 1
        System.out.println("Caso 1 - n = 1:");
        System.out.println("Resultado: " + algoritmo.verificarPotenciaDeDos(1));
        System.out.println("Explicación: 2^0 = 1");
        System.out.println();

        // Caso 2: n = 16
        System.out.println("Caso 2 - n = 16:");
        System.out.println("Resultado: " + algoritmo.verificarPotenciaDeDos(16));
        System.out.println("Explicación: 2^4 = 16");
        System.out.println();

        // Caso 3: n = 3
        System.out.println("Caso 3 - n = 3:");
        System.out.println("Resultado: " + algoritmo.verificarPotenciaDeDos(3));
        System.out.println("Explicación: No existe x tal que 2^x = 3");
        System.out.println();

        // Casos adicionales
        System.out.println("Casos adicionales:");
        int[] testCases = {2, 4, 32, 5, 6, 7, 8, 9, 10};
        for (int n : testCases) {
            System.out.println("n = " + n + " → " + algoritmo.verificarPotenciaDeDos(n));
        }

        System.out.println("FIN DE EJECUCIÓN ");
    }
}