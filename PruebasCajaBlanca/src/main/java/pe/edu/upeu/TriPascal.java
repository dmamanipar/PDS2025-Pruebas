package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

public class TriPascal {



    public List<List<Integer>> generarTrianguloPascal(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) return triangle;

        // Primera fila siempre [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // primer número siempre 1

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // último número siempre 1
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        TriPascal a = new TriPascal();

        int numRows = 5;
        List<List<Integer>> triangle = a.generarTrianguloPascal(numRows);
        System.out.println(triangle);
    }

}
