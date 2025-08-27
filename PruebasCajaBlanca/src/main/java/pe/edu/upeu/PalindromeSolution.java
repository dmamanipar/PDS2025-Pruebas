package pe.edu.upeu;


public class PalindromeSolution {


    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        // StringBuilder para construir la cadena limpia
        StringBuilder cleaned = new StringBuilder();

        // Filtrar solo caracteres alfanuméricos y convertir a minúsculas
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Convertir a string para comparación
        String cleanedStr = cleaned.toString();

        // Comparar usando dos punteros (más eficiente)
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public boolean isPalindromeAlternative(String s) {
        if (s == null) {
            return false;
        }

        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String cleanedStr = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        return cleanedStr.equals(reversed);
    }


    public static void main(String[] args) {
        PalindromeSolution solution = new PalindromeSolution();

        // Ejemplo 1
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: \"" + test1 + "\"");
        System.out.println("Output: " + solution.isPalindrome(test1));
        System.out.println("Expected: true");
        System.out.println();

        // Ejemplo 2
        String test2 = "race a car";
        System.out.println("Input: \"" + test2 + "\"");
        System.out.println("Output: " + solution.isPalindrome(test2));
        System.out.println("Expected: false");
        System.out.println();

        // Ejemplo 3
        String test3 = " ";
        System.out.println("Input: \"" + test3 + "\"");
        System.out.println("Output: " + solution.isPalindrome(test3));
        System.out.println("Expected: true");
        System.out.println();
    }
}
