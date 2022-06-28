/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import ConexionBD.conexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class FacturaBD {
    
    public static boolean insertarFactura(Factura factura) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        try{
        
            String call= "{CALL pa_factura_crear(?,?,?,?,?,?,?,?,?)}";
            ps=conn.prepareCall(call);
            ps.setInt(1, factura.getFactura_NO());
            ps.setDate(2, (Date) factura.getFecha());
            ps.setString(3, factura.getFecha_vence());
            ps.setBoolean(4, factura.getContado());
            ps.setString(5, factura.getCliente());
            ps.setDouble(6,factura.getSubtotal());
            ps.setDouble(7,factura.getImpuesto());
            ps.setDouble(8,factura.getDescuento());
            ps.setDouble(9,factura.getTotal());
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
