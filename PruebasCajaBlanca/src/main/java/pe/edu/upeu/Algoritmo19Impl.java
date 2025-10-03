package pe.edu.upeu;

public class Algoritmo19Impl implements Algoritmo19 {

    @Override
    public boolean esPotenciaDeDos(int n) {
        if (n <= 0) {
            return false;
        }

        // Un número es potencia de dos si tiene exactamente un bit 1 en su representación binaria
        // Ejemplo: 4 = 100, 8 = 1000, 16 = 10000
        // Usamos la propiedad: n & (n - 1) == 0 para números potencia de dos
        return (n & (n - 1)) == 0;
    }

    @Override
    public String verificarPotenciaDeDos(int n) {
        boolean resultado = esPotenciaDeDos(n);
        return resultado ? "true" : "false";
    }
}