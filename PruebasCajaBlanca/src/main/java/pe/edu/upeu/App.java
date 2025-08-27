package pe.edu.upeu;

public class App {
    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        String ejemplo1 = "Hello World";
        System.out.println("Ejemplo 1: \"" + ejemplo1 + "\" -> " + a.longitudUltimaPalabra(ejemplo1));

        String ejemplo2 = "   fly me   to   the moon   ";
        System.out.println("Ejemplo 2: \"" + ejemplo2 + "\" -> " + a.longitudUltimaPalabra(ejemplo2));

        String ejemplo3 = "luffy is still joyboy";
        System.out.println("Ejemplo 3: \"" + ejemplo3 + "\" -> " + a.longitudUltimaPalabra(ejemplo3));
    }
}
