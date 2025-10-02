package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BuscarCadenaTest {

    @Order(1)
    @Test
    void testEncontrarIndice() {
        String haystack = "sadbutsad";
        String needle = "sad";

        BuscarCadena buscar = new BuscarCadenaImpl();
        int resultado = buscar.encontrarIndice(haystack, needle);

        // Se espera 0 porque "sad" aparece en el índice 0
        Assertions.assertEquals(0, resultado);
    }

    @Order(2)
    @Test
    void testNoEncontrado() {
        String haystack = "leetcode";
        String needle = "leeto";

        BuscarCadena buscar = new BuscarCadenaImpl();
        int resultado = buscar.encontrarIndice(haystack, needle);

        Assertions.assertEquals(-1, resultado);
    }

    @Order(3)
    @Test
    void testEncontrarIndiceMockito() {
        BuscarCadena mockBuscar = Mockito.mock(BuscarCadena.class);

        String haystack = "helloworld";
        String needle = "world";

        Mockito.when(mockBuscar.encontrarIndice(haystack, needle)).thenReturn(5);
        int resultado = mockBuscar.encontrarIndice(haystack, needle);

        Assertions.assertEquals(5, resultado);
        Mockito.verify(mockBuscar).encontrarIndice(haystack, needle);
    }
}