package pe.edu.upeu;

/**
 * Clase principal que demuestra el algoritmo de elemento mayoritario
 * usando el algoritmo de Boyer-Moore Voting
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("=== ALGORITMO DE ELEMENTO MAYORITARIO ===");
        System.out.println("Implementación usando Boyer-Moore Voting");
        System.out.println("Complejidad: O(n) tiempo, O(1) espacio\n");
        
        Algoritmos algoritmos = new Algoritmos();
        
        // Demostración de casos de prueba
        demostrarAlgoritmo(algoritmos, new int[]{3, 2, 3}, "Caso básico 1");
        demostrarAlgoritmo(algoritmos, new int[]{2, 2, 1, 1, 1, 2, 2}, "Caso básico 2");
        demostrarAlgoritmo(algoritmos, new int[]{5}, "Arreglo un elemento");
        demostrarAlgoritmo(algoritmos, new int[]{1, 1, 1}, "Todos iguales");
        demostrarAlgoritmo(algoritmos, new int[]{-1, -1, 2}, "Con negativos");
        demostrarAlgoritmo(algoritmos, new int[]{7, 7, 5, 7, 5, 7, 5, 7, 5, 5, 7, 7, 7, 7, 1, 1}, "Caso complejo");
        
        System.out.println("\n=== EXPLICACIÓN DEL ALGORITMO ===");
        System.out.println("1. El algoritmo recorre el arreglo una sola vez (O(n))");
        System.out.println("2. Mantiene un candidato y un conteo");
        System.out.println("3. Si el conteo llega a 0, cambia el candidato");
        System.out.println("4. Al final, verifica que el candidato sea realmente mayoritario");
        System.out.println("5. Solo usa variables constantes (O(1) espacio)");
    }
    
    private static void demostrarAlgoritmo(Algoritmos algoritmos, int[] nums, String descripcion) {
        try {
            System.out.print(descripcion + ": [");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) System.out.print(", ");
            }
            System.out.print("] -> ");
            
            int resultado = algoritmos.majorityElement(nums);
            System.out.println(resultado);
            
            // Verificar que realmente es mayoritario contando ocurrencias
            int conteo = 0;
            for (int num : nums) {
                if (num == resultado) {
                    conteo++;
                }
            }
            System.out.println("  ✓ " + resultado + " aparece " + conteo + " veces (más de " + nums.length/2 + ")");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    }
}
