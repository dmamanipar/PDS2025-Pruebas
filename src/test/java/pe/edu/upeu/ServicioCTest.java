package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServicioCTest {

    @Test
    void testLongitudUltimaPalabra_Ejemplo1() {
        // Arrange
        ServicioC servicioC = new ServicioCImpl();
        String s = "Hello World";
        
        // Act
        int resultado = servicioC.longitudUltimaPalabra(s);
        
        // Assert
        Assertions.assertEquals(5, resultado);
    }

    @Test
    void testLongitudUltimaPalabra_Ejemplo2() {
        // Arrange
        ServicioC servicioC = new ServicioCImpl();
        String s = " fly me to the moon ";
        
        // Act
        int resultado = servicioC.longitudUltimaPalabra(s);
        
        // Assert
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void testLongitudUltimaPalabra_Ejemplo3() {
        // Arrange
        ServicioC servicioC = new ServicioCImpl();
        String s = "luffy is still joyboy";
        
        // Act
        int resultado = servicioC.longitudUltimaPalabra(s);
        
        // Assert
        Assertions.assertEquals(6, resultado);
    }

    @Test
    void testLongitudUltimaPalabra_UnaPalabra() {
        // Arrange
        ServicioC servicioC = new ServicioCImpl();
        String s = "Hola";
        
        // Act
        int resultado = servicioC.longitudUltimaPalabra(s);
        
        // Assert
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void testLongitudUltimaPalabra_EspaciosAlInicio() {
        // Arrange
        ServicioC servicioC = new ServicioCImpl();
        String s = "   Hola Mundo";
        
        // Act
        int resultado = servicioC.longitudUltimaPalabra(s);
        
        // Assert
        Assertions.assertEquals(5, resultado);
    }

    @Test
    void testLongitudUltimaPalabra_EspaciosAlFinal() {
        // Arrange
        ServicioC servicioC = new ServicioCImpl();
        String s = "Hola Mundo   ";
        
        // Act
        int resultado = servicioC.longitudUltimaPalabra(s);
        
        // Assert
        Assertions.assertEquals(5, resultado);
    }
}
