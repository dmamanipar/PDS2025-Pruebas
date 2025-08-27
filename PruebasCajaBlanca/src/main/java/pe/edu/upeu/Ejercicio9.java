package pe.edu.upeu;

public class Ejercicio9 {

    public int[] plusOne(int[] digits) {
        // Recorremos el arreglo desde el último dígito
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Si es menor a 9, solo sumamos y retornamos
                return digits;
            }
            digits[i] = 0; // Si es 9, lo convertimos en 0 y seguimos
        }

        // Si llegamos aquí, significa que todos eran 9 (ejemplo: 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // El nuevo número comienza con 1 y los demás quedan en 0
        return result;
    }

    public static void main(String[] args) {
        Ejercicio9 e = new Ejercicio9();

        int[] digits1 = {1, 2, 3};
        int[] result1 = e.plusOne(digits1);
        System.out.print("Resultado 1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + (i < result1.length - 1 ? "," : ""));
        }
        System.out.println("]");

        int[] digits2 = {9, 9, 9};
        int[] result2 = e.plusOne(digits2);
        System.out.print("Resultado 2: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + (i < result2.length - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}
