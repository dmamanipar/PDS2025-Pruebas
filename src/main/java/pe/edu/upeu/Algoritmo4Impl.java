package pe.edu.upeu;

public class Algoritmo4Impl implements Algoritmo4 {

    @Override
    public Algoritmo4.Nodo crearNodo(int i) {
        Nodo nodo = new Nodo();
        nodo.valor = i;
        nodo.siguiente = null;
        return nodo;
    }

    @Override
    public Nodo combinarListas(Nodo lista1, Nodo lista2) {
        Nodo dummy = new Nodo();
        Nodo actual = dummy;

        while (lista1 != null && lista2 != null) {
            if (lista1.valor <= lista2.valor) {
                actual.siguiente = lista1;
                lista1 = lista1.siguiente;
            } else {
                actual.siguiente = lista2;
                lista2 = lista2.siguiente;
            }
            actual = actual.siguiente;
        }

        if (lista1 != null) {
            actual.siguiente = lista1;
        } else if (lista2 != null) {
            actual.siguiente = lista2;
        }

        return dummy.siguiente;
    }

    @Override
    public void imprimirLista(Nodo resultado) {
        Nodo actual = resultado;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(actual.valor);
            if (actual.siguiente != null) {
                sb.append(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println(sb.toString());
    }
}
