package pe.edu.upeu;

public class Algoritmo4 {
    public int[] sumaDosNumeros(int[] m, int o){
        int[] p = new int[2];
        for (int i = 0; i < m.length-1; i++) {
            for (int j = i+1; j < m.length; j++) {
                if (m[i] + m[j] == o){
                    p[0] = i;
                    p[1] = j;
                    break;
                }
            }
        }
        return p;
    }

    // Nuevo método para fusionar dos listas ordenadas
    public int[] fusionarListasOrdenadas(int[] lista1, int[] lista2) {
        int[] resultado = new int[lista1.length + lista2.length];
        int i = 0, j = 0, k = 0;

        // Comparar elementos de ambas listas y agregar el menor al resultado
        while (i < lista1.length && j < lista2.length) {
            if (lista1[i] <= lista2[j]) {
                resultado[k] = lista1[i];
                i++;
            } else {
                resultado[k] = lista2[j];
                j++;
            }
            k++;
        }

        // Agregar elementos restantes de lista1 (si los hay)
        while (i < lista1.length) {
            resultado[k] = lista1[i];
            i++;
            k++;
        }

        // Agregar elementos restantes de lista2 (si los hay)
        while (j < lista2.length) {
            resultado[k] = lista2[j];
            j++;
            k++;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        // Prueba del método sumaDosNumeros
        int[] m = {11,15,2,7};
        int o = 9;
        int[] p = a.sumaDosNumeros(m, o);
        System.out.println("Suma dos números: [" + p[0] + "," + p[1] + "]");

        // Prueba del método fusionarListasOrdenadas
        int[] lista1 = {1,2,4};
        int[] lista2 = {1,3,4};
        int[] fusionada = a.fusionarListasOrdenadas(lista1, lista2);

        System.out.print("Lista fusionada: [");
        for (int i = 0; i < fusionada.length; i++) {
            System.out.print(fusionada[i]);
            if (i < fusionada.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}