package pe.edu.upeu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para verificar el funcionamiento del método deleteDuplicates.
 */
public class Servicio13Test {

    private ListService listService;

    // ================== CONFIGURACIÓN INICIAL ==================

    /**
     * Inicializa el servicio antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        listService = new ListServiceImpl();
    }

    // ================== MÉTODOS AUXILIARES ==================

    /**
     * Crea una lista enlazada simple a partir de un arreglo de enteros.
     */
    private ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(0); // Nodo ficticio para simplificar la creación
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next; // Retorna la cabeza real
    }

    /**
     * Convierte una lista enlazada a una representación en cadena.
     * Ejemplo: 1->2->3
     */
    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        return sb.toString();
    }

    // ================== PRUEBAS ==================

    @Test
    @DisplayName("Test 1: Ejemplo [1, 1, 2] -> [1, 2]")
    void testExample1() {
        ListNode head = createList(new int[]{1, 1, 2});
        ListNode result = listService.deleteDuplicates(head);
        assertEquals("1->2", listToString(result));
    }

    @Test
    @DisplayName("Test 2: Ejemplo [1, 1, 2, 3, 3] -> [1, 2, 3]")
    void testExample2() {
        ListNode head = createList(new int[]{1, 1, 2, 3, 3});
        ListNode result = listService.deleteDuplicates(head);
        assertEquals("1->2->3", listToString(result));
    }

    @Test
    @DisplayName("Test 3: Sin duplicados [1, 2, 3, 4] -> [1, 2, 3, 4]")
    void testNoDuplicates() {
        ListNode head = createList(new int[]{1, 2, 3, 4});
        ListNode result = listService.deleteDuplicates(head);
        assertEquals("1->2->3->4", listToString(result));
    }

    @Test
    @DisplayName("Test 4: Lista nula/vacía -> null")
    void testNullList() {
        ListNode head = createList(new int[]{});
        ListNode result = listService.deleteDuplicates(head);
        assertNull(result);
    }
}
