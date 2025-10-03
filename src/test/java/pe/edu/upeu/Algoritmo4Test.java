package pe.edu.upeu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Algoritmo4Test {


    @Order(1)
    @Test
    public void testCombinarListas() {
        Algoritmo4 algoritmo = new Algoritmo4Impl();

        Algoritmo4.Nodo lista1 = algoritmo.crearNodo(1);
        lista1.siguiente = algoritmo.crearNodo(2);
        lista1.siguiente.siguiente = algoritmo.crearNodo(4);

        Algoritmo4.Nodo lista2 = algoritmo.crearNodo(1);
        lista2.siguiente = algoritmo.crearNodo(3);
        lista2.siguiente.siguiente = algoritmo.crearNodo(4);

        Algoritmo4.Nodo resultado = algoritmo.combinarListas(lista1, lista2);
        algoritmo.imprimirLista(resultado);

        int[] esperado = {1, 1, 2, 3, 4, 4};
        int i = 0;
        Algoritmo4.Nodo actual = resultado;
        while (actual != null) {
            assertEquals(esperado[i], actual.valor);
            actual = actual.siguiente;
            i++;
        }
        assertEquals(esperado.length, i);
    }

    @Order(2)
    @Test
    public void testCombinarListas2() {
        Algoritmo4 algoritmo = new Algoritmo4Impl();

        Algoritmo4.Nodo lista1 = null;
        Algoritmo4.Nodo lista2 = null;
        Algoritmo4.Nodo resultado = algoritmo.combinarListas(lista1, lista2);

        int[] esperado = {};
        int i = 0;
        Algoritmo4.Nodo actual = resultado;
        algoritmo.imprimirLista(resultado);
        while (actual != null) {
            assertEquals(esperado[i], actual.valor);
            actual = actual.siguiente;
            i++;
        }
        assertEquals(esperado.length, i);
    }

    @Order(3)
    @Test
    public void testCombinarListas3() {
        Algoritmo4 algoritmo = new Algoritmo4Impl();

        Algoritmo4.Nodo lista1 = null;
        Algoritmo4.Nodo lista2 = algoritmo.crearNodo(0);

        Algoritmo4.Nodo resultado = algoritmo.combinarListas(lista1, lista2);
        algoritmo.imprimirLista(resultado);

        int[] esperado = {0};
        int i = 0;
        Algoritmo4.Nodo actual = resultado;
        while (actual != null) {
            assertEquals(esperado[i], actual.valor);
            actual = actual.siguiente;
            i++;
        }
        assertEquals(esperado.length, i);
    }

}
