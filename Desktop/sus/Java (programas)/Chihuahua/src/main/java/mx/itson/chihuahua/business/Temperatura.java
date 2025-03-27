
package mx.itson.chihuahua.business;

// @author Andrey

public class Temperatura 
{
 
    /**
     * Convierte grados centigrados a fahrenheit.
     * @param centigrados La cantidad de grados centigrados que se quiere convertir a fahrenheit.
     * @return El valor convertido a fahrenheit.
     */
    public static double convertirGrados(double centigrados){
        return centigrados * 1.8 + 32;
    }
    
    public static double calcularTiempo(double distancia, double velocidad){
        return distancia / (velocidad / 3.6);
    }
    
}
