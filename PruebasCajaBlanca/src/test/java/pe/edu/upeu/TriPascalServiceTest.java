package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

class TriPascalServiceTest {

    @Order(1)
    @Test
    void testTrianguloPascal5() {
        TriPascalService servicio = new TriPascalServiceImpl();
        List<List<Integer>> result = servicio.generarTrianguloPascal(5);

        System.out.println("Triángulo de Pascal con 5 filas: " + result);

        Assertions.assertEquals(5, result.size());
        Assertions.assertEquals(Arrays.asList(1), result.get(0));
        Assertions.assertEquals(Arrays.asList(1, 1), result.get(1));
        Assertions.assertEquals(Arrays.asList(1, 2, 1), result.get(2));
        Assertions.assertEquals(Arrays.asList(1, 3, 3, 1), result.get(3));
        Assertions.assertEquals(Arrays.asList(1, 4, 6, 4, 1), result.get(4));
    }

    @Order(2)
    @Test
    void testTrianguloPascal1() {
        TriPascalService servicio = new TriPascalServiceImpl();
        List<List<Integer>> result = servicio.generarTrianguloPascal(1);

        System.out.println("Triángulo de Pascal con 1 fila: " + result);

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(Arrays.asList(1), result.get(0));
    }
    @Order(3)
    @Test
    void testGenerarTrianguloPascalMockito() {
        // Crear mock de la interfaz
        TriPascalService servicioMock = Mockito.mock(TriPascalService.class);

        // Definir comportamiento simulado
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1)
        );

        Mockito.when(servicioMock.generarTrianguloPascal(2)).thenReturn(expected);

        // Ejecutar método
        List<List<Integer>> result = servicioMock.generarTrianguloPascal(2);

        // Verificar resultado
        Assertions.assertEquals(expected, result);

        // Verificar que el método se llamó correctamente
        Mockito.verify(servicioMock).generarTrianguloPascal(2);
    }
    @Order(4)
    @Test
    void testGenerarTrianguloPascalMockito5Filas() {
        TriPascalService servicioMock = Mockito.mock(TriPascalService.class);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );

        Mockito.when(servicioMock.generarTrianguloPascal(5)).thenReturn(expected);

        List<List<Integer>> result = servicioMock.generarTrianguloPascal(5);

        Assertions.assertEquals(expected, result);
        Mockito.verify(servicioMock).generarTrianguloPascal(5);
    }
}
