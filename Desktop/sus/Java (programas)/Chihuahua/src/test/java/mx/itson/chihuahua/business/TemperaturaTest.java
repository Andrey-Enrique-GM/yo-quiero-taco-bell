/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.chihuahua.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Andrey
 */
public class TemperaturaTest {
    
    public TemperaturaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of convertirGrados method, of class Temperatura.
     */
    @org.junit.jupiter.api.Test
    public void testConvertirGrados() {
        // Nombre y descripcion del caso de prueba
        System.out.println("convertirGrados");
        // Input (datos de entrada)
        double centigrados = 32.3;
        // Expected result (resultado esperado)
        double expResult = 90.14;
        
        // Actual result (resultado obtenido)
        double result = Temperatura.convertirGrados(centigrados);
        
        // Ejecucuion de la prueba (compara el esperado con el obtenido)
        assertEquals(expResult, result, 0.5);
    }

    /**
     * Test of calcularTiempo method, of class Temperatura.
     */
    @Test
    public void testCalcularTiempo() {
        System.out.println("calcularTiempo");
        double distancia = 502;
        double velocidad = 118;
        double expResult = 15.3;
        
        double result = Temperatura.calcularTiempo(distancia, velocidad);
        assertEquals(expResult, result, 0.5);
    }
    
}
