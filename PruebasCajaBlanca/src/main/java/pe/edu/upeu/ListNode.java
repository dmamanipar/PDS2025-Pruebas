package pe.edu.upeu;

/**
 * Representa un nodo en la lista enlazada simple.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor opcional para construir la lista más fácilmente
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}