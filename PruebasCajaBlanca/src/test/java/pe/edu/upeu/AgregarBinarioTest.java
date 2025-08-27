package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AgregarBinarioTest {

    @Order(1)
    @Test
    void testSumarBinarios1() {
        AgregarBinario ab = new AgregarBinario();
        String a = "11";
        String b = "1";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "100";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);

        // Verificación adicional: convertir a decimal para comprobar
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        int decimalResultado = Integer.parseInt(resultado, 2);
        Assertions.assertEquals(decimalA + decimalB, decimalResultado);
    }

    @Order(2)
    @Test
    void testSumarBinarios2() {
        AgregarBinario ab = new AgregarBinario();
        String a = "1010";
        String b = "1011";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "10101";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);

        // Verificación adicional
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        int decimalResultado = Integer.parseInt(resultado, 2);
        Assertions.assertEquals(decimalA + decimalB, decimalResultado);
    }

    @Order(3)
    @Test
    void testSumarBinariosCasoSimple() {
        AgregarBinario ab = new AgregarBinario();
        String a = "0";
        String b = "0";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "0";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);
    }

    @Order(4)
    @Test
    void testSumarBinariosUnoCero() {
        AgregarBinario ab = new AgregarBinario();
        String a = "1";
        String b = "0";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "1";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);
    }

    @Order(5)
    @Test
    void testSumarBinariosUnoUno() {
        AgregarBinario ab = new AgregarBinario();
        String a = "1";
        String b = "1";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "10";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);
    }

    @Order(6)
    @Test
    void testSumarBinariosDiferentesLongitudes() {
        AgregarBinario ab = new AgregarBinario();
        String a = "1111";
        String b = "1";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "10000";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);

        // Verificación: 1111 (15) + 1 (1) = 10000 (16)
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        int decimalResultado = Integer.parseInt(resultado, 2);
        Assertions.assertEquals(decimalA + decimalB, decimalResultado);
    }

    @Order(7)
    @Test
    void testSumarBinariosCarryMultiple() {
        AgregarBinario ab = new AgregarBinario();
        String a = "111";
        String b = "1";
        String resultado = ab.sumarBinarios(a, b);
        String esperado = "1000";

        System.out.println("a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");
        System.out.println("Esperado: \"" + esperado + "\"");

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(esperado, resultado);

        // Verificación: 111 (7) + 1 (1) = 1000 (8)
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        int decimalResultado = Integer.parseInt(resultado, 2);
        Assertions.assertEquals(decimalA + decimalB, decimalResultado);
    }
}