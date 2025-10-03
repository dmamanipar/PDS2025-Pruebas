package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioPoligonoTest {

    @Order(1)
    @Test
    void testAreaTriangulo() {
        Poligono triangulo = new Triangulo(10, 5); // área = 25
        ServicioPoligono servicio = new ServicioPoligonoImpl();
        Assertions.assertEquals(25, servicio.obtenerArea(triangulo));
    }

    @Order(2)
    @Test
    void testAreaRectangulo() {
        Poligono rectangulo = new Rectangulo(4, 6); // área = 24
        ServicioPoligono servicio = new ServicioPoligonoImpl();
        Assertions.assertEquals(24, servicio.obtenerArea(rectangulo));
    }

    @Order(3)
    @Test
    void testAreaConMockito() {
        Poligono poligonoMock = Mockito.mock(Poligono.class);
        Mockito.when(poligonoMock.calcularArea()).thenReturn(50.0);

        ServicioPoligono servicio = new ServicioPoligonoImpl();
        double resultado = servicio.obtenerArea(poligonoMock);

        Assertions.assertEquals(50.0, resultado);
    }
}
