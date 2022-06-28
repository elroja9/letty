/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author Jonathan
 */
public class Cliente {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String tel;
    private double cant_credito;
    
    public String getCedula(){
        
        return cedula;
    }
    
    public void setCedula(String cedula){
    
        this.cedula=cedula;
    }
    
    public String getNombre(){
    
        return nombre;
    }
    
    public void setNombre(String nombre){
    
        this.nombre=nombre;
    }
    
    public String getApellido(){
    
        return apellido;
    }
    
    public void setApellido(String apellido){
    
        this.apellido=apellido;
    }
    
    public String getTel(){
    
        return tel;
    }
    
    public void setTel(String tel){
    
        this.tel=tel;
    }
    
    
    public double getCant_credito(){
    
        return cant_credito;
    }
    
    public void setCant_credito(double cant_credito){
    
        this.cant_credito=cant_credito;
    }
}
