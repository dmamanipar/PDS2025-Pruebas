package pe.edu.upeu;

public class Algoritmos {

    /**
     * Devuelve la longitud de la última palabra de una cadena.
     * Una palabra se define como una subcadena que no contiene espacios.
     *
     * @param s la cadena de entrada
     * @return la longitud de la última palabra
     */
    public int longitudUltimaPalabra(String s) {
        // Eliminar espacios al inicio y al final
        s = s.trim();

        // Dividir en palabras (separadas por uno o más espacios)
        String[] palabras = s.split(" +");

        // Retornar la longitud de la última palabra
        return palabras[palabras.length - 1].length();
    }
}
