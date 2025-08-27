package pe.edu.upeu;

public class TestAlgoritmos {
    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        // Casos de prueba
        probarCaso(a, new int[]{3, 2, 3}, 3, "Ejemplo 1");
        probarCaso(a, new int[]{2, 2, 1, 1, 1, 2, 2}, 2, "Ejemplo 2");
        probarCaso(a, new int[]{1, 1, 1, 2, 3, 1, 4, 1}, 1, "Ejemplo 3");
        probarCaso(a, new int[]{5, 5, 5, 5, 2, 3, 5}, 5, "Ejemplo 4");
    }

    private static void probarCaso(Algoritmos a, int[] nums, int esperado, String nombreCaso) {
        int resultado = a.elementoMayoritario(nums);
        if (resultado == esperado) {
            System.out.println(nombreCaso + " ✅ PASA -> Mayoría: " + resultado);
        } else {
            System.out.println(nombreCaso + " ❌ FALLA -> Obtuvo: " + resultado + ", Esperado: " + esperado);
        }
    }
}
