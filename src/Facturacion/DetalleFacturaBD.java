/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import ConexionBD.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class DetalleFacturaBD {
    
    
    public static boolean insertarProducto(DetalleFactura detalleFactura) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        try{
        
            String call="{CALL pa_detalle_factura_crear(?,?,?,?,?,?)}";
            ps=conn.prepareCall(call);
            ps.setInt(1, detalleFactura.getFactura_NO());
            ps.setInt(2,detalleFactura.getCantidad());
            ps.setInt(3,detalleFactura.getCod_producto());
            ps.setString(4, detalleFactura.getDescripcion());
            ps.setDouble(5, detalleFactura.getPrecio());
            ps.setDouble(6, detalleFactura.getSubtotal());
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
