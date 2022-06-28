/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

/**
 *
 * @author Jonathan
 */
public class DetalleFactura {
    
    private int factura_NO;
    private int cantidad;
    private int cod_producto;
    private String descripcion;
    private double precio;
    private double subtotal;

    public int getFactura_NO() {
        return factura_NO;
    }

    public void setFactura_NO(int factura_NO) {
        this.factura_NO = factura_NO;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
