/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author Jonathan
 */
public class Usuario {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String tel;
    private String usuario;
    private String clave;
    private String puesto;
    
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
    
    public String getUsuario(){
    
        return usuario;
    }
    
    public void setUsuario(String usuario){
    
        this.usuario=usuario;
    }
    
    public String getClave(){
    
        return clave;
    }
    
    public void setClave(String clave){
    
        this.clave=clave;
    }
    
    public String getPuesto(){
    
        return puesto;
    }
    
    public void setPuesto(String puesto){
    
        this.puesto=puesto;
    }
}
