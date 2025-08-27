package pe.edu.upeu;

public class Algoritmos2 {

    /**
     * Verifica si un número entero es palíndromo.
     * Un número es palíndromo si se lee igual de izquierda a derecha y viceversa.
     */
    public boolean esPalindromo(int x) {
        // Números negativos no pueden ser palíndromos
        if (x < 0) return false;

        int original = x;
        long invertido = 0;

        while (x != 0) {
            int digito = x % 10;
            invertido = invertido * 10 + digito;
            x /= 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Algoritmos2 a = new Algoritmos2();

        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(x1 + " ¿Es palíndromo? " + a.esPalindromo(x1)); // true
        System.out.println(x2 + " ¿Es palíndromo? " + a.esPalindromo(x2)); // false
        System.out.println(x3 + " ¿Es palíndromo? " + a.esPalindromo(x3)); // false
    }
}
