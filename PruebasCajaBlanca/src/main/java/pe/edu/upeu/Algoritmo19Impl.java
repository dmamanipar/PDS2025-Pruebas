package pe.edu.upeu;

public class Algoritmo19Impl implements Algoritmo19 {

    @Override
    public boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    @Override
    public boolean esFibonacci(int n) {
        if (n < 0) return false;
        return esCuadradoPerfecto(5 * n * n + 4) || esCuadradoPerfecto(5 * n * n - 4);
    }

    private boolean esCuadradoPerfecto(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    @Override
    public boolean esPar(int n) {
        return n % 2 == 0;
    }

    @Override
    public String analizarNumero(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);

        // Primo
        if (esPrimo(n)) {
            sb.append(" es primo, ");
        } else {
            sb.append(" no es primo, ");
        }

        // Fibonacci
        if (esFibonacci(n)) {
            sb.append("fibonacci ");
        } else {
            sb.append("no es fibonacci ");
        }

        // Par/Impar
        if (esPar(n)) {
            sb.append("y es par");
        } else {
            sb.append("y es impar");
        }

        return sb.toString();
    }
}
