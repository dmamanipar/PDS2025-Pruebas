package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosTareaTest {

    @Order(1)
    @Test
    void testStrStrEjemplo1() {
        AlgoritmosTarea a = new AlgoritmosTarea();
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result);
    }

    @Order(2)
    @Test
    void testStrStrEjemplo2() {
        AlgoritmosTarea a = new AlgoritmosTarea();
        String haystack = "leetcode";
        String needle = "leeto";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(-1, result);
    }

    @Order(3)
    @Test
    void testStrStrAparicionEnMedio() {
        AlgoritmosTarea a = new AlgoritmosTarea();
        String haystack = "helloleetworld";
        String needle = "leet";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result);
    }

    @Order(4)
    @Test
    void testStrStrCadenaIgual() {
        AlgoritmosTarea a = new AlgoritmosTarea();
        String haystack = "abc";
        String needle = "abc";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result);
    }

    @Order(5)
    @Test
    void testStrStrNeedleVacio() {
        AlgoritmosTarea a = new AlgoritmosTarea();
        String haystack = "abc";
        String needle = "";
        int result = a.strStr(haystack, needle);
        System.out.println("Resultado: " + result);
        Assertions.assertEquals(0, result); // por definición
    }
}