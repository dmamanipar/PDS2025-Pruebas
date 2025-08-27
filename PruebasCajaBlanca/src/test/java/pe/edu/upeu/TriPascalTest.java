package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TriPascalTest {

    @Order(1)
    @Test
    void testTrianguloPascal5(){
        TriPascal a = new TriPascal();
        List<List<Integer>> result = a.generarTrianguloPascal(5);

        // ✅ Mostrar resultado en consola
        System.out.println("Triángulo de Pascal con 5 filas: " + result);

        Assertions.assertEquals(5, result.size());
        Assertions.assertEquals(Arrays.asList(1), result.get(0));
        Assertions.assertEquals(Arrays.asList(1,1), result.get(1));
        Assertions.assertEquals(Arrays.asList(1,2,1), result.get(2));
        Assertions.assertEquals(Arrays.asList(1,3,3,1), result.get(3));
        Assertions.assertEquals(Arrays.asList(1,4,6,4,1), result.get(4));
    }

    @Order(2)
    @Test
    void testTrianguloPascal1(){
        TriPascal a = new TriPascal();
        List<List<Integer>> result = a.generarTrianguloPascal(1);

        // ✅ Mostrar resultado en consola
        System.out.println("Triángulo de Pascal con 1 fila: " + result);

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(Arrays.asList(1), result.get(0));
    }


}
