package pe.edu.upeu;

public class PoderDeDos {

    public boolean esPotenciaDeDos(int n) {
        // Si n es menor o igual a 0, no puede ser potencia de 2
        if (n <= 0) {
            return false;
        }

        // Un número es potencia de 2 si n & (n-1) == 0
        // Esto funciona porque las potencias de 2 en binario tienen solo un bit en 1
        // Por ejemplo: 8 = 1000, 8-1 = 0111, 1000 & 0111 = 0000
        return (n & (n - 1)) == 0;
    }

    // Método alternativo usando logaritmos (menos eficiente pero más intuitivo)
    public boolean esPotenciaDeDosAlternativo(int n) {
        if (n <= 0) {
            return false;
        }

        // Dividir repetitivamente por 2
        while (n % 2 == 0) {
            n = n / 2;
        }

        // Si llegamos a 1, era potencia de 2
        return n == 1;
    }

    public static void main(String[] args) {
        PoderDeDos p = new PoderDeDos();

        // Ejemplo 1: n = 1
        int n1 = 1;
        boolean resultado1 = p.esPotenciaDeDos(n1);
        System.out.println("n = " + n1 + ", Resultado: " + resultado1 + " (2^0 = 1)");

        // Ejemplo 2: n = 16
        int n2 = 16;
        boolean resultado2 = p.esPotenciaDeDos(n2);
        System.out.println("n = " + n2 + ", Resultado: " + resultado2 + " (2^4 = 16)");

        // Ejemplo 3: n = 3
        int n3 = 3;
        boolean resultado3 = p.esPotenciaDeDos(n3);
        System.out.println("n = " + n3 + ", Resultado: " + resultado3 + " (no es potencia de 2)");
    }
}