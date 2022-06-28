/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import ConexionBD.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class BDProducto {
    
     public static boolean eliminarProducto(Producto producto) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_eliminar_producto(?)}";
            ps=conn.prepareCall(call);
            ps.setInt(1,producto.getCod_producto());
            rpta=ps.executeUpdate()==1? true:false;
            
            
            String call2="{CALL pa_eliminar_inventario(?)}";
            ps=conn.prepareCall(call2);
            ps.setInt(1,producto.getCod_producto());
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
     
     public static boolean insertarProducto(Producto producto) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta = false;
        try {
            //Nos conectamos 
            
            //Busca los datos del profesor
            String call = "{CALL pa_insertar_producto(?,?,?,?,?,?,?,?)}";
            //Preparamos la sentecia
            ps= conn.prepareCall(call);
            //Identificacion
            ps.setInt(1, producto.getCod_producto());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCod_categoria());
            ps.setString(4, producto.getCed_proveedor());
            ps.setDouble(5, producto.getPrecio_compra());
            ps.setDouble(6, producto.getPrecio_venta());
            ps.setBoolean(7, producto.getExonerado());
            ps.setDouble(8, producto.getImpuesto());
            rpta = ps.executeUpdate() == 1 ? true : false;
            
            String call2="{CALL pa_insertar_inventario(?,?)}";
            ps= conn.prepareCall(call2);
            //Identificacion
            ps.setInt(1, producto.getCod_producto());
            ps.setInt(2, producto.getCant());
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
     
        public static boolean modificarProducto(Producto producto) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_modificar_producto(?,?,?,?,?,?,?,?)}";
            ps=conn.prepareCall(call);
            ps.setInt(1, producto.getCod_producto());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCod_categoria());
            ps.setString(4, producto.getCed_proveedor());
            ps.setDouble(5, producto.getPrecio_compra());
            ps.setDouble(6, producto.getPrecio_venta());
            ps.setBoolean(7, producto.getExonerado());
            ps.setDouble(8, producto.getImpuesto());
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
    
}
