/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import java.util.Date;


/**
 *
 * @author Jonathan
 */
public class Factura {
    
    private int factura_NO;
    private Date fecha;
    private String fecha_vence;
    private boolean contado;
    private String cliente;
    private double subtotal;
    private double impuesto;
    private double descuento;
    private double total;
    
    public int getFactura_NO(){
    
        return factura_NO;
    }
    
    public void setFactura_NO(int factura_NO){
    
        this.factura_NO=factura_NO;
    }
    
    public boolean getContado(){
    
        return contado;
    }
    
    public void setContado(boolean contado){
    
        this.contado=contado;
    }
    
    public String getCliente(){
    
        return cliente;
    }
    
    public void setCliente(String cliente){
    
        this.cliente=cliente;
    }
    
    public double getSubtotal(){
    
        return subtotal;
    }
    
    public void setSubtotal(double subtotal){
    
        this.subtotal=subtotal;
    }
    
    public double getImpuesto(){
    
        return impuesto;
    }
    
    public void setImpuesto(double impuesto){
    
        this.impuesto=impuesto;
    }
    
    public double getDescuento(){
    
        return descuento;
    }
    
    public void setDescuento(double descuento){
    
        this.descuento=descuento;
    }
    
    public double getTotal(){
    
        return total;
    }
    
    public void setTotal(double total){
    
        this.total=total;
    }
    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFecha_vence() {
        return fecha_vence;
    }

    public void setFecha_vence(String fecha_vence) {
        this.fecha_vence = fecha_vence;
    }

}
