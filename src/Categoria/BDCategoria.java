/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

import ConexionBD.conexionBD;
import java.net.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jonathan
 */
public class BDCategoria {
    
    public static boolean insertarCategoria(Categoria categoria) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta = false;
        try {
            //Nos conectamos 
            
            //Busca los datos del profesor
            String call = "{CALL pa_insertar_categoria(?,?)}";
            //Preparamos la sentecia
            ps= conn.prepareCall(call);
            //Identificacion
            ps.setInt(1, categoria.getCod_producto());
            ps.setString(2, categoria.getNombre());
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
    
    public static boolean modificarCategorias(Categoria categoria) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_modificar_categoria(?,?)}";
            ps=conn.prepareCall(call);
            ps.setInt(1,categoria.getCod_producto());
            ps.setString(2,categoria.getNombre());
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
    
    public static boolean eliminarCategoria(Categoria categoria) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_eliminar_categoria(?)}";
            ps=conn.prepareCall(call);
            ps.setInt(1,categoria.getCod_producto());
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
    
    public void reporteCategoria() throws SQLException{
    
        JasperReport reporte;
        JasperPrint vista;
        Connection conn=conexionBD.getConnection();
        
        try{
           
            URL direccion = this.getClass().getResource("reporteCategoria.jasper");
            reporte = (JasperReport) JRLoader.loadObject(direccion);
            
            vista = JasperFillManager.fillReport(reporte,null,conn);
            JasperViewer.viewReport(vista, false);

            }catch (JRException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        conn.close();
    }
    
}
