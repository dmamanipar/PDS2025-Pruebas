package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmoClaseTest {

    @Order(1)
    @Test
    void testStrStrPalabraExiste() {
        AlgoritmoClase a = new AlgoritmoClase();
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result);
    }

    @Order(2)
    @Test
    void testStrStrPalabraNoExiste() {
        AlgoritmoClase a = new AlgoritmoClase();
        String haystack = "leetcode";
        String needle = "leeto";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(-1, result);
    }

    @Order(3)
    @Test
    void testStrStrCadenaIgual() {
        AlgoritmoClase a = new AlgoritmoClase();
        String haystack = "abc";
        String needle = "abc";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result);
    }

    @Order(4)
    @Test
    void testStrStrNeedleVacio() {
        AlgoritmoClase a = new AlgoritmoClase();
        String haystack = "abc";
        String needle = "";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result); // convención: needle vacío se considera "encontrado"
    }
}
