package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PrefijoComunTest {

    @Order(1)
    @Test
    void testPrefijoComunEjemplo1() {
        PrefijoComun pc = new PrefijoComunImpl();
        String[] input = {"flower", "flow", "flight"};
        String resultado = pc.encontrarPrefijoMasLargo(input);
        Assertions.assertEquals("fl", resultado);
    }

    @Order(2)
    @Test
    void testPrefijoComunEjemplo2() {
        PrefijoComun pc = new PrefijoComunImpl();
        String[] input = {"dog", "racecar", "car"};
        String resultado = pc.encontrarPrefijoMasLargo(input);
        Assertions.assertEquals("", resultado);
    }

    @Order(3)
    @Test
    void testUnSoloElemento() {
        PrefijoComun pc = new PrefijoComunImpl();
        String[] input = {"solo"};
        Assertions.assertEquals("solo", pc.encontrarPrefijoMasLargo(input));
    }

    @Order(4)
    @Test
    void testArregloVacio() {
        PrefijoComun pc = new PrefijoComunImpl();
        String[] input = {};
        Assertions.assertEquals("", pc.encontrarPrefijoMasLargo(input));
    }

    @Order(5)
    @Test
    void testCadenaVaciaEnMedio() {
        PrefijoComun pc = new PrefijoComunImpl();
        String[] input = {"abc", "", "abcd"};
        Assertions.assertEquals("", pc.encontrarPrefijoMasLargo(input));
    }

    @Order(6)
    @Test
    void testMockitoSimulacion() {
        PrefijoComun mock = Mockito.mock(PrefijoComun.class);

        String[] input = {"flower", "flow", "flight"};
        Mockito.when(mock.encontrarPrefijoMasLargo(input)).thenReturn("fl");

        String resultado = mock.encontrarPrefijoMasLargo(input);
        Assertions.assertEquals("fl", resultado);

        Mockito.verify(mock).encontrarPrefijoMasLargo(input);
    }
}
