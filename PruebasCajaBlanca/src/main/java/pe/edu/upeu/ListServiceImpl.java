package pe.edu.upeu;

/**
 * Implementación de la lógica para eliminar duplicados de la lista ordenada (Problema 13).
 */
public class ListServiceImpl implements ListService {

    @Override
    public ListNode deleteDuplicates(ListNode head) {
        // Puntero 'current' que comienza en la cabeza de la lista.
        ListNode current = head;

        // Iteramos mientras el puntero actual y su siguiente existan.
        while (current != null && current.next != null) {

            // Si el valor del nodo actual es igual al valor del nodo siguiente...
            if (current.val == current.next.val) {
                // ...omitimos el nodo siguiente (el duplicado)
                // y reasignamos el puntero 'next' del nodo actual al nodo después del duplicado.
                current.next = current.next.next;
            } else {
                // Si los valores son diferentes, el nodo actual es único.
                // Avanzamos al siguiente nodo.
                current = current.next;
            }
        }

        // Devolvemos la cabeza de la lista modificada.
        return head;
    }
}