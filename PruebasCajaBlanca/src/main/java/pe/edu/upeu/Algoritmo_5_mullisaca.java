package pe.edu.upeu;

public class Algoritmo_5_mullisaca {
    // Devuelve k = número de elementos únicos
    // y deja esos k elementos al inicio del arreglo nums.
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int k = 1; // índice del siguiente lugar para escribir un valor único
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Pequeña prueba local
    public static void main(String[] args) {
        Algoritmo_5_mullisaca s = new Algoritmo_5_mullisaca();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = s.removeDuplicates(nums);
        System.out.println("k = " + k); // esperado: 5
        for (int i = 0; i < k; i++) System.out.print(nums[i] + " "); // 0 1 2 3 4
    }
}
