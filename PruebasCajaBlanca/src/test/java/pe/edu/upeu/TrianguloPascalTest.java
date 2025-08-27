package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TrianguloPascalTest {

    @Order(1)
    @Test
    void testBordeMinimo_1() {
        TrianguloPascal tp = new TrianguloPascal();
        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(1)
        );
        Assertions.assertEquals(esperado, tp.generar(1));
    }

    @Order(2)
    @Test
    void testCasoEjemplo_5() {
        TrianguloPascal tp = new TrianguloPascal();
        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );
        Assertions.assertEquals(esperado, tp.generar(5));
    }

    @Order(3)
    @Test
    void testBordeMaximo_30() {
        TrianguloPascal tp = new TrianguloPascal();
        // No verificamos todo, pero sí que tenga 30 filas y que la última empiece y termine en 1
        List<List<Integer>> tri = tp.generar(30);
        Assertions.assertEquals(30, tri.size());
        Assertions.assertEquals(1, tri.get(29).get(0).intValue());
        Assertions.assertEquals(1, tri.get(29).get(tri.get(29).size()-1).intValue());
    }

    @Order(4)
    @Test
    void testFueraDeRango_MenorA1() {
        TrianguloPascal tp = new TrianguloPascal();
        Assertions.assertThrows(IllegalArgumentException.class, () -> tp.generar(0));
    }

    @Order(5)
    @Test
    void testFueraDeRango_MayorA30() {
        TrianguloPascal tp = new TrianguloPascal();
        Assertions.assertThrows(IllegalArgumentException.class, () -> tp.generar(31));
    }
}
