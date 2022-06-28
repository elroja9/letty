
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

/**
 *
 * @author Jonathan
 */
public class Categoria {
    
    private int cod_categoria;
    private String nombre;
    
    public int getCod_producto(){
    
        return cod_categoria;
    }
    
    public void setCod_categoria(int cod_categoria){
    
        this.cod_categoria=cod_categoria;
    }
    
    public String getNombre(){
    
        return nombre;
    }
    
    public void setNombre(String nombre){
    
        this.nombre=nombre;
    }
    
    
}
