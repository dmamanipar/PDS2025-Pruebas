package pe.edu.upeu.com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void testEjemplo1() {
        String[] input = {"flower", "flow", "flight"};
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testEjemplo2() {
        String[] input = {"dog", "racecar", "car"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testUnSoloElemento() {
        String[] input = {"solo"};
        assertEquals("solo", LongestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testPrefijoVacio() {
        String[] input = {"a", "b", "c"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(input));
    }
}
