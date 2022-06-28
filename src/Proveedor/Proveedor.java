/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

/**
 *
 * @author Jonathan
 */
public class Proveedor {
    
    private String ced_juridica;
    private String nombre;
    private String tel;
    private String email;
    
    public String getCed_juridica(){
    
        return ced_juridica;
    }
    
    public void setCed_juridica(String ced_juridica){
    
        this.ced_juridica=ced_juridica;
    }
    
    public String getNombre(){
    
        return nombre;
    }
    
    public void setNombre(String nombre){
    
        this.nombre=nombre;
    }
    
    public String getTel(){
    
        return tel;
    }
    
    public void setTel(String tel){
    
        this.tel=tel;
    }
    
    public String getEmail(){
    
        return email;
    }
    
    public void setEmail(String email){
    
        this.email=email;
    }
}
