
package mx.itson.yegua.entidades;

import java.util.List;
import mx.itson.yegua.enums.Categoria;
import mx.itson.yegua.enums.TipoVenta;

// @author Andrey

public class Venta 
{

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the tipo
     */
    public TipoVenta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVenta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    private String cliente;
    private TipoVenta tipo;
    private double subtotal;
    private double descuento;
    private double total;
    private List<Articulo> articulos;
    
    
    /**
    * Metodo para calcular el subtotal de la venta, incluyendo tasas de interes y descuentos.
    * Este metodo no recibe parametros y no retorna ningun valor.
    * Asigna el resultado al atributo subtotal.
    */
    public void calcularSubtotal()
    {
        double subtotal = 0;
        // Este es el for-each
        for(Articulo a : articulos)
        {
            double precio = a.getPrecio();
            if (this.tipo.equals("credito")){
                // Aplica el aumento solo si la categoría NO es ALIMENTOS
                if (a.getCategoria() != Categoria.ALIMENTOS) {
                    precio *= 1.30; // Incrementa el precio un 30% para otras categorías
                }
            }
        subtotal += precio;
        }
        this.subtotal = subtotal;
    }
    
        
    /**
     * Metodo para calcular el descuento y el total final de la venta.
     * Este metodo no recibe parametros y no retorna un valor.
     * Asigna el valor del descuento al atributo descuento y el total al atributo total.
     */
    public void calcularTotal()
    {
        double descuento = 0;
        // Determina si se aplica un descuento adicional
        if (this.subtotal > 5000) {
            descuento = this.subtotal * 0.03; // 3% de descuento adicional
        }
        this.descuento = descuento;
        this.total = this.subtotal - descuento; // Calcula el total restando el descuento
    }

    
}
