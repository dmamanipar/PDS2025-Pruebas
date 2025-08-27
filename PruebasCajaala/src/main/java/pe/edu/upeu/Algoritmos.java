package pe.edu.upeu;

public class Algoritmos {

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

    /**
     * Encuentra el elemento mayoritario en un arreglo usando el algoritmo de Boyer-Moore Voting.
     * El elemento mayoritario es aquel que aparece más de n/2 veces en el arreglo.
     * 
     * @param nums arreglo de enteros donde buscar el elemento mayoritario
     * @return el elemento mayoritario
     * @throws IllegalArgumentException si el arreglo está vacío o es null
     */
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser null o vacío");
        }
        
        int candidato = nums[0];
        int conteo = 1;
        
        // Primer paso: encontrar el candidato
        for (int i = 1; i < nums.length; i++) {
            if (conteo == 0) {
                candidato = nums[i];
                conteo = 1;
            } else if (nums[i] == candidato) {
                conteo++;
            } else {
                conteo--;
            }
        }
        
        // Segundo paso: verificar que el candidato es realmente el mayoritario
        // (opcional, pero buena práctica para robustez)
        conteo = 0;
        for (int num : nums) {
            if (num == candidato) {
                conteo++;
            }
        }
        
        // Verificar que realmente es mayoritario (más de n/2 veces)
        if (conteo <= nums.length / 2) {
            throw new IllegalStateException("No se encontró un elemento mayoritario válido");
        }
        
        return candidato;
    }

    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        // Prueba del algoritmo original
        int[] m = {11,15,2,7};
        int o=9;
        int[] p=a.sumaDosNumeros(m,o);
        System.out.println("["+p[0]+","+p[1]+"]");

        // Prueba del nuevo algoritmo de elemento mayoritario
        System.out.println("\n=== PRUEBAS DEL ALGORITMO DE ELEMENTO MAYORITARIO ===");
        
        // Caso 1: [3, 2, 3] -> 3
        int[] nums1 = {3, 2, 3};
        System.out.println("Caso 1: [3, 2, 3] -> " + a.majorityElement(nums1));
        
        // Caso 2: [2, 2, 1, 1, 1, 2, 2] -> 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Caso 2: [2, 2, 1, 1, 1, 2, 2] -> " + a.majorityElement(nums2));
        
        // Caso 3: [5] -> 5
        int[] nums3 = {5};
        System.out.println("Caso 3: [5] -> " + a.majorityElement(nums3));
        
        // Caso 4: [1, 1, 1] -> 1
        int[] nums4 = {1, 1, 1};
        System.out.println("Caso 4: [1, 1, 1] -> " + a.majorityElement(nums4));
        
        // Caso 5: [-1, -1, 2] -> -1
        int[] nums5 = {-1, -1, 2};
        System.out.println("Caso 5: [-1, -1, 2] -> " + a.majorityElement(nums5));
    }
}
