package pe.edu.upeu;

public class algoritmo11 {

    // Método para calcular la raíz cuadrada entera (truncada)
    public int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int inicio = 1, fin = x, ans = 0;

        // Búsqueda binaria
        while (inicio <= fin) {
            int mid = inicio + (fin - inicio) / 2;

            if (mid <= x / mid) {
                ans = mid;       // mid es un candidato válido
                inicio = mid + 1; // buscamos un número mayor
            } else {
                fin = mid - 1;   // reducimos el rango
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        algoritmo11 a = new algoritmo11();

        int x1 = 4;
        int x2 = 8;
        int x3 = 15;

        System.out.println("Sqrt de " + x1 + " = " + a.sqrt(x1)); // 2
        System.out.println("Sqrt de " + x2 + " = " + a.sqrt(x2)); // 2
        System.out.println("Sqrt de " + x3 + " = " + a.sqrt(x3)); // 3
    }
}
