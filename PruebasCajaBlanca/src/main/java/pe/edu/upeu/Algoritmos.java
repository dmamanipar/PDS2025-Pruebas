package pe.edu.upeu;

public class Algoritmos {


    public boolean esNumeroFeliz(int n) {
        int lento = n;
        int rapido = siguiente(n); // arranca adelantado

        while (rapido != 1 && lento != rapido) {
            lento  = siguiente(lento);
            rapido = siguiente(siguiente(rapido));
        }
        return rapido == 1;
    }


    private int siguiente(int x) {
        int acumulado = 0;
        for (; x > 0; x /= 10) {
            int d = x % 10;
            acumulado += d * d;
        }
        return acumulado;
    }


    public static void main(String[] args) {
        Algoritmos alg = new Algoritmos();
        System.out.println("19 -> " + alg.esNumeroFeliz(19)); // true
        System.out.println("2  -> " + alg.esNumeroFeliz(2));  // false
    }
}
