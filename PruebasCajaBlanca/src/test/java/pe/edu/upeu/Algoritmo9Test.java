package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Algoritmo9Test {

    @Order(1)
    @Test
    void testIncrementarMatriz1(){
        Algoritmo9 a = new Algoritmo9();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {1,2,3};

        int sumam = mn.matrizNumero(m); // calcular ANTES
        int[] r = a.incrementarMatriz(m);

        int sumar = mn.matrizNumero(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam + 1, sumar);
        ;
    }

    @Order(2)
    @Test
    void testIncrementarMatriz2(){
        Algoritmo9 a = new Algoritmo9();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {4,3,2,1};

        int sumam = mn.matrizNumero(m); // calcular ANTES
        int[] r = a.incrementarMatriz(m);

        int sumar = mn.matrizNumero(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam + 1, sumar);
        ;
    }

    @Order(3)
    @Test
    void testIncrementarMatriz3(){
        Algoritmo9 a = new Algoritmo9();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {9};

        int sumam = mn.matrizNumero(m); // calcular ANTES
        int[] r = a.incrementarMatriz(m);

        int sumar = mn.matrizNumero(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam + 1, sumar);
        ;
    }

    @Order(4)
    @Test
    void testIncrementarMatrizOverflow() {
        Algoritmo9 a = new Algoritmo9();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {9,9,9,9,9,9,9,9,9,9};

        int sumam = mn.matrizNumero(m);
        int[] r = a.incrementarMatriz(m);
        int sumar = mn.matrizNumero(r);

        System.out.println("Entrada como número (posible overflow): " + sumam);
        System.out.println("Salida como número (posible overflow): " + sumar);

        Assertions.assertNotEquals(sumam + 1, sumar,
                "Este test demuestra que matrizNumero falla con números grandes (overflow).");
    }

    @Order(5)
    @Test
    void testIncrementarMatrizBigInteger() {
        Algoritmo9 a = new Algoritmo9();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {9,9,9,9,9,9,9,9,9,9};

        BigInteger sumam = mn.matrizNumeroBig(m);
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
    }
}
