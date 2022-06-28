/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import ConexionBD.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class BDCliente {
    
     public static boolean eliminarCliente(Cliente cliente) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_eliminar_cliente(?)}";
            ps=conn.prepareCall(call);
            ps.setString(1,cliente.getCedula());
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
     
     public static boolean insertarCliente(Cliente cliente) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta = false;
        try {
            //Nos conectamos 
            
            //Busca los datos del profesor
            String call = "{CALL pa_insertar_cliente(?,?,?,?,?)}";
            //Preparamos la sentecia
            ps= conn.prepareCall(call);
            //Identificacion
            ps.setString(1, cliente.getCedula());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getTel());
            ps.setDouble(5, cliente.getCant_credito());
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
     
        public static boolean modificarCliente(Cliente cliente) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_modificar_cliente(?,?,?,?,?)}";
            ps=conn.prepareCall(call);
            ps.setString(1,cliente.getCedula());
            ps.setString(2,cliente.getNombre());
            ps.setString(3,cliente.getApellido());
            ps.setString(4,cliente.getTel());
            ps.setDouble(5,cliente.getCant_credito());
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
