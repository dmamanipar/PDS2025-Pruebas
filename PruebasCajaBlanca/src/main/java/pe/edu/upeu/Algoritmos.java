package pe.edu.upeu;

import java.util.HashSet;

public class Algoritmos {

    // Método que ya tenías (Two Sum)
    public int[] sumaDosNumeros(int[] m, int o){
        int[] p=new int[2];
        for (int i = 0; i < m.length-1; i++) {
            for (int j = i+1; j < m.length; j++) {
                if (m[i]+m[j]==o){
                    p[0]=i;
                    p[1]=j;
                    break;
                }
            }
        }
        return p;
    }

    // 👉 Nuevo método para número feliz
    public boolean esNumeroFeliz(int n) {
        HashSet<Integer> vistos = new HashSet<>();

        while (n != 1 && !vistos.contains(n)) {
            vistos.add(n);
            n = sumaDeCuadrados(n);
        }

        return n == 1;
    }

    // Método auxiliar
    private int sumaDeCuadrados(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma += digito * digito;
            n /= 10;
        }
        return suma;
    }
}
