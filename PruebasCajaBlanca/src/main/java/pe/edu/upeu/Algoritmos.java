package pe.edu.upeu;

public class Algoritmos {

    // Algoritmo Boyer-Moore para encontrar el elemento mayoritario
    public int elementoMayoritario(int[] nums) {
        int candidato = 0;
        int contador = 0;

        for (int num : nums) {
            if (contador == 0) {
                candidato = num;
            }
            contador += (num == candidato) ? 1 : -1;
        }

        return candidato; // garantizado que existe
    }

}
