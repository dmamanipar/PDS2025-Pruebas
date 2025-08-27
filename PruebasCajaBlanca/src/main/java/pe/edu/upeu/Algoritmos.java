package pe.edu.upeu;

public class Algoritmos {

    // Clase interna que representa un nodo de lista enlazada
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Método para eliminar duplicados de una lista enlazada ordenada
    public ListNode eliminarDuplicados(ListNode head) {
        if (head == null) return null;

        ListNode actual = head;
        while (actual != null && actual.next != null) {
            if (actual.val == actual.next.val) {
                actual.next = actual.next.next; // saltar duplicado
            } else {
                actual = actual.next;
            }
        }
        return head;
    }
}