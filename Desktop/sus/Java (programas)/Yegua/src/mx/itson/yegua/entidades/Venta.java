/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.yegua.entidades;

import java.util.List;
import mx.itson.yegua.enums.TipoVenta;

/**
 *
 * @author Andrey
 */
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
    
    
    public void calcularSubtotal()
    {
        double subtotal = 0;
        // Este es el for-each
        for(Articulo a : this.articulos)
        {
            double precio = a.getPrecio();
            if (this.TipoVenta.equals("credito") && !a.getCategoria().equalsIgnoreCase("alimentos"))
            {
                precio *= 1.30; // Incrementa el precio un 30%
            }
        subtotal += precio;
            }
        
        // Aplica un descuento del 3% si el subtotal supera los $5000
        if (subtotal > 5000)
        {
            subtotal *= 0.97; // Aplica el descuento de 3%
        }
        
        this.subtotal = subtotal;
        }
    


        
        
}
