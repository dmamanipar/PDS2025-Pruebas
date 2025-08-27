package pe.edu.upeu;

public class Jqa7 {

    public int buscarPosicionInsercion(int[] nums, int target) {
        int izquierda = 0;
        int derecha = nums.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (nums[medio] == target) {
                return medio;
            } else if (nums[medio] < target) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        // izquierda será la posición de inserción
        return izquierda;
    }

    // Ejemplo rápido desde el main
    public static void main(String[] args) {
        Jqa7 j = new Jqa7();
        int[] nums = {1, 3, 5, 6};
        System.out.println(j.buscarPosicionInsercion(nums, 5)); // 2
        System.out.println(j.buscarPosicionInsercion(nums, 2)); // 1
        System.out.println(j.buscarPosicionInsercion(nums, 7)); // 4
        System.out.println(j.buscarPosicionInsercion(nums, 0)); // 0
    }
}