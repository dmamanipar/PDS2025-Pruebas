package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PalindromeValidTest {

    @Order(1)
    @Test
    public void testValidPalindrome() {
        PalindromeValid palindromeValid = new PalindromeValidImpl();
        boolean result = palindromeValid.isPalindrome("A man, a plan, a canal: Panama");
        Assertions.assertTrue(result);
    }

    @Order(2)
    @Test
    public void testInvalidPalindrome() {
        PalindromeValid palindromeValid = new PalindromeValidImpl();
        boolean result = palindromeValid.isPalindrome("race a car");
        Assertions.assertFalse(result);
    }

    @Order(3)
    @Test
    public void testEmptyStringPalindrome() {
        PalindromeValid palindromeValid = new PalindromeValidImpl();
        boolean result = palindromeValid.isPalindrome(" ");
        Assertions.assertTrue(result);
    }
}
