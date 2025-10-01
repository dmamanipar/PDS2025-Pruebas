package pe.edu.upeu;

public class BuscarCadenaImpl implements BuscarCadena {
    @Override
    public int encontrarIndice(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
