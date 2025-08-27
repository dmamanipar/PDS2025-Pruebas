package pe.edu.upeu;

public class Algoritmo16 {
    // Método para encontrar el número único usando XOR
    public int numeroUnico(int[] nums) {
        int unico = 0;
        for (int num : nums) {
            unico ^= num; // Se cancela cuando hay duplicados
        }
        return unico;
    }

    // Método main para probar rápido
    public static void main(String[] args) {
        Algoritmo16 a = new Algoritmo16();

        int[] nums1 = {2, 2, 1};
        System.out.println("Ejemplo 1: " + a.numeroUnico(nums1)); // Esperado: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Ejemplo 2: " + a.numeroUnico(nums2)); // Esperado: 4

        int[] nums3 = {1};
        System.out.println("Ejemplo 3: " + a.numeroUnico(nums3)); // Esperado: 1
    }
}
