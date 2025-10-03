package pe.edu.upeu.Algoritmo9S;

public class Algoritmo9ServicioImpl implements Algoritmo9Servicio{

    @Override
    public int[] incrementarMatriz(int[] digits) {
        // 1. Validar que no sea nulo
        if (digits == null) {
            throw new IllegalArgumentException("La matriz no debe ser nula.");
        }

        // 2. Validar longitud
        if (digits.length < 1 || digits.length > 100) {
            throw new IllegalArgumentException("La longitud de la matriz debe estar entre 1 y 100.");
        }

        // 3. Validar rango de dígitos
        for (int d : digits) {
            if (d < 0 || d > 9) {
                throw new IllegalArgumentException("Cada dígito debe estar entre 0 y 9.");
            }
        }

        // 4. Validar que no tenga ceros iniciales (excepto [0])
        if (digits.length > 1 && digits[0] == 0) {
            throw new IllegalArgumentException("No se permiten ceros iniciales en los dígitos.");
        }

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // Si todos eran 9
        int[] resultado = new int[n + 1];
        resultado[0] = 1;
        return resultado;
    }
}
