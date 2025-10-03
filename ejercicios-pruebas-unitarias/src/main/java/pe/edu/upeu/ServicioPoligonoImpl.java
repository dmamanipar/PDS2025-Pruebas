package pe.edu.upeu;

public class ServicioPoligonoImpl implements ServicioPoligono {
    @Override
    public double obtenerArea(Poligono poligono) {
        return poligono.calcularArea();
    }
}
