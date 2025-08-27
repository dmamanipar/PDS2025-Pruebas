package pe.edu.upeu;

public class AlgoritmosTarea {

    // Método para encontrar el índice de la primera aparición de needle en haystack
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // caso borde
        return haystack.indexOf(needle); // retorna -1 si no lo encuentra
    }

    public static void main(String[] args) {
        AlgoritmosTarea a = new AlgoritmosTarea();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int r1 = a.strStr(haystack1, needle1);
        System.out.println("Resultado 1: " + r1); // esperado 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int r2 = a.strStr(haystack2, needle2);
        System.out.println("Resultado 2: " + r2); // esperado -1
    }

}