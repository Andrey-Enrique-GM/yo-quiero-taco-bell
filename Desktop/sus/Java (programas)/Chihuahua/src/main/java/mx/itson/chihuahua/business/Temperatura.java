
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
    
    /**
     * Calcula el tiempo que tardaria un carro en recorrer cierta distancia.
     * @param distancia Distancia que recorrera el carro, son metros.
     * @param velocidad Velocidad constante a la que viaja el carro, en kilometros por hora, el programa los pasa a metros por segundo.
     * @return El tiempo que le tomo al carro recorrer esa distancia.
     */
    public static double calcularTiempo(double distancia, double velocidad){
        return distancia / (velocidad / 3.6);
    }
    
}
