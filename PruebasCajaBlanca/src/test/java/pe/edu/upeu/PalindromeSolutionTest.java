package pe.edu.upeu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Importación estática para usar assertTrue, assertFalse, assertEquals, etc.
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase PalindromeSolution
 */
class PalindromeSolutionTest {

    private PalindromeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PalindromeSolution();
    }

    @Test
    @DisplayName("Ejemplo 1: A man, a plan, a canal: Panama - debe ser true")
    void testExample1Panama() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(input),
                "\"A man, a plan, a canal: Panama\" debería ser un palíndromo");
    }

    @Test
    @DisplayName("Ejemplo 2: race a car - debe ser false")
    void testExample2RaceCar() {
        String input = "race a car";
        assertFalse(solution.isPalindrome(input),
                "\"race a car\" no debería ser un palíndromo");
    }

    @Test
    @DisplayName("Ejemplo 3: espacio en blanco - debe ser true")
    void testExample3EmptySpace() {
        String input = " ";
        assertTrue(solution.isPalindrome(input),
                "Un espacio debería ser considerado palíndromo (cadena vacía después de limpiar)");
    }

    @Test
    @DisplayName("Cadena vacía - debe ser true")
    void testEmptyString() {
        String input = "";
        assertTrue(solution.isPalindrome(input),
                "Una cadena vacía debería ser un palíndromo");
    }

    @Test
    @DisplayName("Cadena null - debe ser false")
    void testNullString() {
        assertFalse(solution.isPalindrome(null),
                "Una cadena null no debería ser considerada palíndromo");
    }

    @Test
    @DisplayName("Un solo carácter - debe ser true")
    void testSingleCharacter() {
        assertTrue(solution.isPalindrome("a"), "Un solo carácter debería ser palíndromo");
        assertTrue(solution.isPalindrome("A"), "Un solo carácter mayúscula debería ser palíndromo");
        assertTrue(solution.isPalindrome("1"), "Un solo dígito debería ser palíndromo");
    }

    @Test
    @DisplayName("Palíndromo simple - racecar")
    void testSimplePalindrome() {
        assertTrue(solution.isPalindrome("racecar"),
                "\"racecar\" debería ser un palíndromo");
    }

    @Test
    @DisplayName("Palíndromo con mayúsculas y minúsculas")
    void testMixedCasePalindrome() {
        assertTrue(solution.isPalindrome("RaceCar"),
                "\"RaceCar\" debería ser un palíndromo ignorando mayúsculas");
    }

    @Test
    @DisplayName("Palíndromo con números")
    void testPalindromeWithNumbers() {
        assertTrue(solution.isPalindrome("A1B2b1a"),
                "\"A1B2b1a\" debería ser un palíndromo con números");
    }

    @Test
    @DisplayName("No palíndromo simple")
    void testNotPalindrome() {
        assertFalse(solution.isPalindrome("hello"),
                "\"hello\" no debería ser un palíndromo");
    }

    @Test
    @DisplayName("Palíndromo con caracteres especiales")
    void testPalindromeWithSpecialChars() {
        assertTrue(solution.isPalindrome("A!B@B#A"),
                "\"A!B@B#A\" debería ser palíndromo ignorando caracteres especiales");
    }

    @Test
    @DisplayName("Solo caracteres especiales")
    void testOnlySpecialCharacters() {
        assertTrue(solution.isPalindrome("!@#$%^&*()"),
                "Solo caracteres especiales debería resultar en cadena vacía (palíndromo)");
    }

    @Test
    @DisplayName("Palíndromo largo")
    void testLongPalindrome() {
        // Crear un palíndromo largo para probar eficiencia
        StringBuilder sb = new StringBuilder();
        String base = "abcdefghijklmnopqrstuvwxyz";
        sb.append(base);
        // Agregar el reverso para hacer palíndromo
        sb.append(new StringBuilder(base).reverse());

        assertTrue(solution.isPalindrome(sb.toString()),
                "Un palíndromo largo debería ser reconocido correctamente");
    }

    @Test
    @DisplayName("Prueba del método alternativo")
    void testAlternativeMethod() {
        // Probar que ambos métodos dan el mismo resultado
        String[] testCases = {
                "A man, a plan, a canal: Panama",
                "race a car",
                " ",
                "racecar",
                "helloe
        };

        for (String testCase : testCases) {
            assertEquals(
                    solution.isPalindrome(testCase),
                    solution.isPalindromeAlternative(testCase),
                    "Ambos métodos deberían dar el mismo resultado para: \"" + testCase + "\""
            );
        }
    }
}
