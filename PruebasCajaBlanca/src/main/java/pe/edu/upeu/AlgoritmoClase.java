package pe.edu.upeu;

public class AlgoritmoClase {

    // Devuelve 0 si needle está en haystack, -1 si no está
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // por definición
        return haystack.contains(needle) ? 0 : -1;
    }

    public static void main(String[] args) {
        AlgoritmoClase a = new AlgoritmoClase();

        String haystack1 = "pruebaholaprueba";
        String needle1 = "prueba";
        int r1 = a.strStr(haystack1, needle1);
        System.out.println("Resultado 1: " + r1); // esperado 0

        String haystack2 = "prueboholapruebo";
        String needle2 = "prueba";
        int r2 = a.strStr(haystack2, needle2);
        System.out.println("Resultado 2: " + r2); // esperado -1
    }
}
