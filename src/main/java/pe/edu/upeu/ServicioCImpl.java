package pe.edu.upeu;

public class ServicioCImpl implements ServicioC {
    
    @Override
    public int longitudUltimaPalabra(String s) {
        // Eliminar espacios al inicio y final
        s = s.trim();
        
        // Buscar el último espacio en la cadena
        int ultimoEspacio = s.lastIndexOf(' ');
        
        // Si no hay espacios, toda la cadena es una palabra
        if (ultimoEspacio == -1) {
            return s.length();
        }
        
        // Retornar la longitud de la última palabra
        return s.length() - ultimoEspacio - 1;
    }
}
