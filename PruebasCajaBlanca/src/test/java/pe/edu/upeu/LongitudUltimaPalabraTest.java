package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class LongitudUltimaPalabraTest {

    @Order(1)
    @Test
    void testEjemplo1() {
        Algoritmos a = new Algoritmos();
        String s = "Hello World";
        int result = a.longitudUltimaPalabra(s);
        System.out.println("Cadena: \"" + s + "\" -> Longitud: " + result);
        Assertions.assertEquals(5, result);
    }

    @Order(2)
    @Test
    void testEjemplo2() {
        Algoritmos a = new Algoritmos();
        String s = "   fly me   to   the moon   ";
        int result = a.longitudUltimaPalabra(s);
        System.out.println("Cadena: \"" + s + "\" -> Longitud: " + result);
        Assertions.assertEquals(4, result);
    }

    @Order(3)
    @Test
    void testEjemplo3() {
        Algoritmos a = new Algoritmos();
        String s = "luffy is still joyboy";
        int result = a.longitudUltimaPalabra(s);
        System.out.println("Cadena: \"" + s + "\" -> Longitud: " + result);
        Assertions.assertEquals(6, result);
    }

    // 🔹 Casos adicionales útiles
    @Order(4)
    @Test
    void testUnaSolaPalabra() {
        Algoritmos a = new Algoritmos();
        String s = "UPEU";
        int result = a.longitudUltimaPalabra(s);
        Assertions.assertEquals(4, result);
    }

    @Order(5)
    @Test
    void testConEspaciosFinales() {
        Algoritmos a = new Algoritmos();
        String s = "Software     ";
        int result = a.longitudUltimaPalabra(s);
        Assertions.assertEquals(8, result);
    }
}
