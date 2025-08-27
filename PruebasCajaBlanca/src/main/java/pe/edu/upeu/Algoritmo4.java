package pe.edu.upeu;

public class Algoritmo4 {

    public static class Nodo {
        public int valor;
        public Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    public Nodo combinarListas(Nodo lista1, Nodo lista2) {
        if (esInvalida(lista1) || esInvalida(lista2)) {
            throw new IllegalArgumentException("Las listas no cumplen las restricciones");
        }

        Nodo dummy = new Nodo(0);
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
        } else {
            actual.siguiente = lista2;
        }

        return dummy.siguiente;
    }

    // Valida que la lista cumpla restricciones:
    // longitud <= 50, valores en [-100, 100], orden no decreciente
    private boolean esInvalida(Nodo lista) {
        if (lista == null) return false;

        int longitud = 0;
        int prevValor = Integer.MIN_VALUE;
        Nodo actual = lista;

        while (actual != null) {
            longitud++;
            if (longitud > 50) return true;
            if (actual.valor < -100 || actual.valor > 100) return true;
            if (actual.valor < prevValor) return true;
            prevValor = actual.valor;
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimirLista(Nodo cabeza) {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Algoritmo4 a = new Algoritmo4();

        Nodo lista1 = new Nodo(1);
        lista1.siguiente = new Nodo(2);
        lista1.siguiente.siguiente = new Nodo(4);

        Nodo lista2 = new Nodo(1);
        lista2.siguiente = new Nodo(3);
        lista2.siguiente.siguiente = new Nodo(4);

        try {
            Nodo combinada = a.combinarListas(lista1, lista2);
            a.imprimirLista(combinada);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
