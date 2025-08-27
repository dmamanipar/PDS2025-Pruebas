package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

public class TrianguloPascal {

    // Método principal: genera el triángulo de Pascal
    public List<List<Integer>> generar(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) return triangle;

        // Primera fila [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Construir el resto
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // primer elemento

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // último elemento
            triangle.add(row);
        }

        return triangle;
    }

    // Prueba manual
    public static void main(String[] args) {
        TrianguloPascal tp = new TrianguloPascal();
        List<List<Integer>> resultado = tp.generar(5);

        for (List<Integer> fila : resultado) {
            System.out.println(fila);
        }
    }
}
