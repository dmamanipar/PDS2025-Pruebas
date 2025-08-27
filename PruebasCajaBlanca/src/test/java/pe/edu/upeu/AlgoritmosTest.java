package pe.edu.upeu;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AlgoritmosTest {

    private final Algoritmos alg = new Algoritmos();

    @Order(1)
    @Test
    void numeroFeliz_ejemplo1() {
        Assertions.assertTrue(alg.esNumeroFeliz(19));
    }

    @Order(2)
    @Test
    void numeroFeliz_ejemplo2() {

        Assertions.assertFalse(alg.esNumeroFeliz(2));
    }

    @Order(3)
    @Test
    void numeroFeliz_unoSiempreFeliz() {
        Assertions.assertTrue(alg.esNumeroFeliz(1));
    }

    @Order(4)
    @Test
    void numeroFeliz_otroCaso() {
        Assertions.assertTrue(alg.esNumeroFeliz(7));
    }
}
