package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TrianguloPascalTest {

    @Order(1)
    @Test
    void testTrianguloPascal1() {
        TrianguloPascal tp = new TrianguloPascal();
        List<List<Integer>> resultado = tp.generar(1);

        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(1)
        );

        Assertions.assertEquals(esperado, resultado);
    }

    @Order(2)
    @Test
    void testTrianguloPascal5() {
        TrianguloPascal tp = new TrianguloPascal();

        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );

        List<List<Integer>> resultado = tp.generar(5);
        Assertions.assertEquals(esperado, resultado);
    }

    @Order(3)
    @Test
    void testTrianguloPascal3() {
        TrianguloPascal tp = new TrianguloPascal();

        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1)
        );

        List<List<Integer>> resultado = tp.generar(3);
        Assertions.assertEquals(esperado, resultado);
    }

    @Order(4)
    @Test
    void testTrianguloPascal0() {
        TrianguloPascal tp = new TrianguloPascal();
        List<List<Integer>> resultado = tp.generar(0);
        Assertions.assertTrue(resultado.isEmpty());
    }
}
