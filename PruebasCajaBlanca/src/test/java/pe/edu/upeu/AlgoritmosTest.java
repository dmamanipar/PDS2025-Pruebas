package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    private Algoritmos.ListNode crearLista(int[] valores) {
        if (valores.length == 0) return null;
        Algoritmos.ListNode head = new Algoritmos.ListNode(valores[0]);
        Algoritmos.ListNode actual = head;
        for (int i = 1; i < valores.length; i++) {
            actual.next = new Algoritmos.ListNode(valores[i]);
            actual = actual.next;
        }
        return head;
    }

    private int[] listaToArray(Algoritmos.ListNode head) {
        java.util.List<Integer> lista = new java.util.ArrayList<>();
        while (head != null) {
            lista.add(head.val);
            head = head.next;
        }
        return lista.stream().mapToInt(i -> i).toArray();
    }

    @Order(1)
    @Test
    void testEliminarDuplicados1() {
        Algoritmos a = new Algoritmos();
        Algoritmos.ListNode head = crearLista(new int[]{1,1,2});
        Algoritmos.ListNode res = a.eliminarDuplicados(head);
        int[] esperado = {1,2};
        System.out.println("Caso 1 → " + java.util.Arrays.toString(listaToArray(res)));
        Assertions.assertArrayEquals(esperado, listaToArray(res));
    }

    @Order(2)
    @Test
    void testEliminarDuplicados2() {
        Algoritmos a = new Algoritmos();
        Algoritmos.ListNode head = crearLista(new int[]{1,1,2,3,3});
        Algoritmos.ListNode res = a.eliminarDuplicados(head);
        int[] esperado = {1,2,3};
        System.out.println("Caso 2 → " + java.util.Arrays.toString(listaToArray(res)));
        Assertions.assertArrayEquals(esperado, listaToArray(res));
    }

    @Order(3)
    @Test
    void testListaSinDuplicados() {
        Algoritmos a = new Algoritmos();
        Algoritmos.ListNode head = crearLista(new int[]{1,2,3,4});
        Algoritmos.ListNode res = a.eliminarDuplicados(head);
        int[] esperado = {1,2,3,4};
        System.out.println("Caso 3 → " + java.util.Arrays.toString(listaToArray(res)));
        Assertions.assertArrayEquals(esperado, listaToArray(res));
    }

    @Order(4)
    @Test
    void testListaConUnSoloElemento() {
        Algoritmos a = new Algoritmos();
        Algoritmos.ListNode head = crearLista(new int[]{5});
        Algoritmos.ListNode res = a.eliminarDuplicados(head);
        int[] esperado = {5};
        System.out.println("Caso 4 → " + java.util.Arrays.toString(listaToArray(res)));
        Assertions.assertArrayEquals(esperado, listaToArray(res));
    }

    @Order(5)
    @Test
    void testListaVacia() {
        Algoritmos a = new Algoritmos();
        Algoritmos.ListNode head = null;
        Algoritmos.ListNode res = a.eliminarDuplicados(head);
        System.out.println("Caso 5 → Lista vacía → " + res);
        Assertions.assertNull(res);
    }
}
