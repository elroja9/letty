/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author Jonathan
 */
public class Producto {
    
    private int cod_producto;
    private String descripcion;
    private int cod_categoria;
    private String ced_proveedor;
    private double precio_compra;
    private double precio_venta;
    private boolean exonerado;
    private double impuesto;
    private int cant;

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
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

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public String getCed_proveedor() {
        return ced_proveedor;
    }

    public void setCed_proveedor(String ced_proveedor) {
        this.ced_proveedor = ced_proveedor;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public boolean getExonerado() {
        return exonerado;
    }

    public void setExonerado(boolean exonerado) {
        this.exonerado = exonerado;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    
    
}
