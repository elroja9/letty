/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

import ConexionBD.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class BDProveedor {
    
     public static boolean insertarProveedor(Proveedor proveedor) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta = false;
        try {
            //Nos conectamos 
            
            //Busca los datos del profesor
            String call = "{CALL pa_insertar_proveedor(?,?,?,?)}";
            //Preparamos la sentecia
            ps= conn.prepareCall(call);
            //Identificacion
            ps.setString(1, proveedor.getCed_juridica());
            ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getTel());
            ps.setString(4, proveedor.getEmail());
            rpta = ps.executeUpdate() == 1 ? true : false;

        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
             conn.close();
             ps.close();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            conn.close();
            ps.close();
        }

        conn.close();
        ps.close();
        return rpta;
        
    }
    
    public static boolean modificarProveedor(Proveedor proveedor) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_modificar_proveedor(?,?,?,?)}";
            ps=conn.prepareCall(call);
            ps.setString(1,proveedor.getCed_juridica());
            ps.setString(2,proveedor.getNombre());
            ps.setString(3,proveedor.getTel());
            ps.setString(4,proveedor.getEmail());
            rpta=ps.executeUpdate() == 1 ? true:false;
        }catch (SQLException ex) {
             System.err.println(ex.getMessage());
             conn.close();
             ps.close();
           

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            conn.close();
            ps.close();
        }
        
        conn.close();
        ps.close();
        return rpta;
    }
    
    public static boolean eliminarProveedor(Proveedor proveedor) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_eliminar_proveedor(?)}";
            ps=conn.prepareCall(call);
            ps.setString(1,proveedor.getCed_juridica());
            rpta=ps.executeUpdate()==1? true:false;
        }catch (SQLException ex) {
             System.err.println(ex.getMessage());
             conn.close();
             ps.close();
           

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            conn.close();
            ps.close();
        }
        
        conn.close();
        ps.close();
        return rpta;
    }
    
    
}
