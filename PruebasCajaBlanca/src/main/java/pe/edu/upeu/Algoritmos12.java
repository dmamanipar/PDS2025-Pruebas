package pe.edu.upeu;

public class Algoritmos12{


    public int subirEscaleras(int n) {
        if (n <= 2) return n; // Casos base

        int a = 1, b = 2, res = 0;
        for (int i = 3; i <= n; i++) {
            res = a + b; // maneras(n-1) + maneras(n-2)
            a = b;
            b = res;
        }
        return res;
    }


    public static void main(String[] args) {
        Algoritmos12 a = new Algoritmos12();

        int n1 = 2;
        System.out.println("n=" + n1 + " -> " + a.subirEscaleras(n1));

        int n2 = 3;
        System.out.println("n=" + n2 + " -> " + a.subirEscaleras(n2));

        int n3 = 5;
        System.out.println("n=" + n3 + " -> " + a.subirEscaleras(n3)); 
    }
}