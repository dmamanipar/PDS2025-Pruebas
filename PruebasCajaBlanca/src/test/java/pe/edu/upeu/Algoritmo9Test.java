package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pe.edu.upeu.Algoritmo9S.Algoritmo9Servicio;
import pe.edu.upeu.Algoritmo9S.Algoritmo9ServicioImpl;

import java.math.BigInteger;
import java.util.Arrays;

public class Algoritmo9Test {

    @Order(1)
    @Test
    void testIncrementarMatriz1(){
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {1,2,3};

        BigInteger sumam = mn.matrizNumeroBig(m); // número original
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r); // número incrementado

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
        ;
    }

    @Order(2)
    @Test
    void testIncrementarMatriz2(){
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {4,3,2,1};

        BigInteger sumam = mn.matrizNumeroBig(m); // calcular ANTES
        int[] r = a.incrementarMatriz(m);

        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
        ;
    }

    @Order(3)
    @Test
    void testIncrementarMatriz3(){
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {9};

        BigInteger sumam = mn.matrizNumeroBig(m); // calcular ANTES
        int[] r = a.incrementarMatriz(m);

        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
        ;
    }

    @Order(4)
    @Test
    void testIncrementarMatriz4() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {9,9,9,9,9,9,9,9,9,9};

        BigInteger sumam = mn.matrizNumeroBig(m);
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
    }

    @Order(5)
    @Test
    void testIncrementarMatriz5() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        BigInteger sumam = mn.matrizNumeroBig(m);
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
    }

    @Order(6)
    @Test
    void testIncrementarMatriz6() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {0};  // el único caso válido con cero inicial

        BigInteger sumam = mn.matrizNumeroBig(m);
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
    }

    @Order(7)
    @Test
    void testIncrementarMatriz7() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        int[] m = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0};  // el único caso válido con cero inicial

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            a.incrementarMatriz(m);
        });
        System.out.println("Se detectó el siguiente error: " + "El número no puede tener ceros iniciales");
    }

    @Order(8)
    @Test
    void testIncrementarMatriz8() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();
        int[] m = {9,9,9};

        BigInteger sumam = mn.matrizNumeroBig(m);
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
    }

    @Order(9)
    @Test
    void testIncrementarMatriz9() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        int[] m = {1, 12, 3}; // 12 no es válido (fuera de 0-9)

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            a.incrementarMatriz(m);
        });
        System.out.println("Se detectó el siguiente error: " + "Cada elemento debe estar entre 0 y 9");
    }

    @Order(10)
    @Test
    void testIncrementarMatriz10() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        MatrizNumero mn = new MatrizNumero();

        // número con 100 dígitos, todos 9
        int[] m = new int[100];
        Arrays.fill(m, 9);

        BigInteger sumam = mn.matrizNumeroBig(m);
        int[] r = a.incrementarMatriz(m);
        BigInteger sumar = mn.matrizNumeroBig(r);

        System.out.println("Entrada como número: " + sumam);
        System.out.println("Salida como número: " + sumar);

        Assertions.assertEquals(sumam.add(BigInteger.ONE), sumar);
    }

    @Order(11)
    @Test
    void testIncrementarMatriz11() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        int[] m = new int[101];
        Arrays.fill(m, 9);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            a.incrementarMatriz(m);
        });
        System.out.println("Se detectó el siguiente error: " + "La longitud sobrepasa el máximo permitido de 100");
    }

    @Order(12)
    @Test
    void testIncrementarMatriz12() {
        Algoritmo9Servicio a = new Algoritmo9ServicioImpl();
        int[] m = {};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            a.incrementarMatriz(m);
        });
        System.out.println("Se detectó el siguiente error: " + "La longitud debe estar entre 1 y 100");
    }
}
