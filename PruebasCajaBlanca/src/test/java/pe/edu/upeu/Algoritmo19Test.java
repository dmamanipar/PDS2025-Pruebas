package pe.edu.upeu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Algoritmo19Test {

    Algoritmo19 algoritmo = new Algoritmo19Impl();

    @Order(1)
    @Test
    public void testNumero2() {
        String resultado = algoritmo.analizarNumero(2);
        System.out.println(resultado);
        assertEquals("2 es primo, fibonacci y es par", resultado);
    }

    @Order(2)
    @Test
    public void testNumero7() {
        String resultado = algoritmo.analizarNumero(7);
        System.out.println(resultado);
        assertEquals("7 es primo, no es fibonacci y es impar", resultado);
    }

    @Order(3)
    @Test
    public void testNumero8() {
        String resultado = algoritmo.analizarNumero(8);
        System.out.println(resultado);
        assertEquals("8 no es primo, fibonacci y es par", resultado);
    }

    @Order(4)
    @Test
    public void testNumero9() {
        String resultado = algoritmo.analizarNumero(9);
        System.out.println(resultado);
        assertEquals("9 no es primo, no es fibonacci y es impar", resultado);
    }
}
