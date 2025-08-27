package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    @Order(1)
    @Test
    void testSumaDosNumeros(){
        Algoritmos a = new Algoritmos();
        int[] m = {11,15,2,7};
        int o=9;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(2)
    @Test
    void testSumaDosNumeros2(){
        Algoritmos a = new Algoritmos();
        int[] m = {3,2,4};
        int o=6;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(3)
    @Test
    void testSumaDosNumeros3(){
        Algoritmos a = new Algoritmos();
        int[] m = {3,3};
        int o=6;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertEquals(o,suma);
    }

    @Order(4)
    @Test
    void testSumaDosNumeros4(){
        Algoritmos a = new Algoritmos();
        int[] m = {11,15,2,7};
        int o=8;
        int[] p=a.sumaDosNumeros(m,o);
        Assertions.assertNotNull(p);
        int suma=(m[p[0]]+m[p[1]]);
        System.out.println("["+p[0]+","+p[1]+"]");
        System.out.println(suma);
        Assertions.assertNotEquals(o,suma);
    }

    //Palindromo Valido
    @Order(5)
    @Test
    void testEsPalindromoValido1() {
        Algoritmos a = new Algoritmos();
        String s = "A man, a plan, a canal: Panama";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(6)
    @Test
    void testEsPalindromoValido2() {
        Algoritmos a = new Algoritmos();
        String s = "race a car";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertFalse(resultado);
    }

    @Order(7)
    @Test
    void testEsPalindromoValido3() {
        Algoritmos a = new Algoritmos();
        String s = " ";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(8)
    @Test
    void testEsPalindromoValido4() {
        Algoritmos a = new Algoritmos();
        String s = "Madam, I'm Adam";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(9)
    @Test
    void testEsPalindromoValido5() {
        Algoritmos a = new Algoritmos();
        String s = "hello world";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertFalse(resultado);
    }

    @Order(10)
    @Test
    void testEsPalindromoValido6() {
        Algoritmos a = new Algoritmos();
        String s = "12321";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(11)
    @Test
    void testEsPalindromoValido7() {
        Algoritmos a = new Algoritmos();
        String s = "No 'x' in Nixon";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertTrue(resultado);
    }

    @Order(12)
    @Test
    void testEsPalindromoValido8() {
        Algoritmos a = new Algoritmos();
        String s = "Java";
        boolean resultado = a.esPalindromoValido(s);
        System.out.println("¿Es palíndromo '" + s + "'? " + resultado);
        Assertions.assertFalse(resultado);
    }



}
