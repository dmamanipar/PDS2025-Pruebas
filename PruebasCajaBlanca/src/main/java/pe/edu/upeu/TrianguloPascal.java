package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

public class TrianguloPascal {

    // Genera el triángulo de Pascal cumpliendo 1 <= numRows <= 30
    public List<List<Integer>> generar(int numRows) {
        if (numRows < 1 || numRows > 30) {
            throw new IllegalArgumentException("numRows debe estar entre 1 y 30");
        }

        List<List<Integer>> triangle = new ArrayList<>();

        // Fila 0: [1]
        List<Integer> first = new ArrayList<>();
        first.add(1);
        triangle.add(first);

        // Filas siguientes
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
