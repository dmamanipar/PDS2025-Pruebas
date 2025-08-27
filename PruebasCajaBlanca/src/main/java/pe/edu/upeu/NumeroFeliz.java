package pe.edu.upeu;

public class NumeroFeliz {

    // Método para determinar si un número es feliz
    public boolean esNumeroFeliz(int n) {
        java.util.HashSet<Integer> vistos = new java.util.HashSet<>();

        while (n != 1 && !vistos.contains(n)) {
            vistos.add(n);
            n = sumaDeCuadrados(n);
        }

        return n == 1;
    }

    // Función auxiliar: suma de cuadrados de los dígitos
    private int sumaDeCuadrados(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma += digito * digito;
            n /= 10;
        }
        return suma;
    }

    // Programa principal
    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        // Ejemplo 1
        int n1 = 19;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + a.esNumeroFeliz(n1));

        // Ejemplo 2
        int n2 = 2;
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + a.esNumeroFeliz(n2));
    }
}
