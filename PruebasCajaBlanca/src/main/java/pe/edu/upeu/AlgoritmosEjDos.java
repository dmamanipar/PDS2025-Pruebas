package pe.edu.upeu;

public class AlgoritmosEjDos {

    public boolean esPalindromo(int x) {
        if (x < 0) return false;

        int original = x;
        int invertido = 0;

        while (x != 0) {
            int digito = x % 10;
            invertido = invertido * 10 + digito;
            x /= 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        AlgoritmosEjDos a = new AlgoritmosEjDos();

        int x = 10;
        boolean resultado = a.esPalindromo(x);
        System.out.println("¿Es palíndromo? " + resultado);
    }
}