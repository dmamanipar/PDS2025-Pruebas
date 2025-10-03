package pe.edu.upeu;

public interface Algoritmo4 {
    Algoritmo4.Nodo crearNodo(int i);

    Nodo combinarListas(Nodo lista1, Nodo lista2);

    void imprimirLista(Nodo resultado);

    public class Nodo {
        public Nodo siguiente;
        public int valor;
    }
}
