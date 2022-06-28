/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;
import ConexionBD.conexionBD;
import Principal.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonathan
 */
public class BDUsuario {
    
    public void loguearUsuario(String ced_usuario,String clave) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        
        if(conn!=null){
        
            PreparedStatement ps=null;
            ps=conn.prepareStatement("select * from tb_usuario where cedula_usuario=? and clave=?");
            ps.setString(1,ced_usuario);
            ps.setString(2, clave);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            
                Principal principal = null;
                principal.setVisible(true);
            }
            
            conn.close();
            ps.close();
        }
        else {JOptionPane.showMessageDialog(null,"No hay conexion");}
    }
    
    public static Usuario buscarUsuario(String usuarioId,String clave) throws SQLException {
        return buscarUsuario (usuarioId,clave, null);
    }
    
    public static Usuario buscarUsuario(String usuarioId,String clave,Usuario usuario) throws SQLException{
        Connection conn=conexionBD.getConnection();
        String nombre = null;
        String apellido=null;
        if(conn!=null){
        
            PreparedStatement ps=null;
            ps=conn.prepareStatement("select * from tb_usuario where cedula_usuario=?");
            ps.setString(1, usuarioId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (usuario == null) {
                    usuario = new Usuario() {};
                    nombre=rs.getString("nombre");
                    apellido=rs.getString("apellido");
                }
                usuario.setCedula(usuarioId);
                usuario.setClave(clave);
                usuario.setNombre(nombre);
                usuario.setApellido(apellido);
                }
            conn.close();
            ps.close();
            return usuario; 
        }
        else{JOptionPane.showMessageDialog(null,"No conecto");}
        
        
        return null;        
    }
    
     public static boolean eliminarUsuario(Usuario usuario) throws SQLException{
    
        Connection conn=conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_eliminar_usuario(?)}";
            ps=conn.prepareCall(call);
            ps.setString(1,usuario.getCedula());
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
     
     public static boolean insertarUsuario(Usuario usuario) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta = false;
        try {
            //Nos conectamos 
            
            //Busca los datos del profesor
            String call = "{CALL pa_insertar_usuario(?,?,?,?,?,?)}";
            //Preparamos la sentecia
            ps= conn.prepareCall(call);
            //Identificacion
            ps.setString(1, usuario.getCedula());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getTel());
            ps.setString(5, usuario.getClave());
            ps.setString(6, usuario.getPuesto());
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
     
        public static boolean modificarUsuario(Usuario usuario) throws SQLException{
    
        Connection conn= conexionBD.getConnection();
        PreparedStatement ps=null;
        boolean rpta=false;
        
        try{
        
            String call="{CALL pa_modificar_usuario(?,?,?,?,?,?)}";
            ps=conn.prepareCall(call);
            ps.setString(1,usuario.getCedula());
            ps.setString(2,usuario.getNombre());
            ps.setString(3,usuario.getApellido());
            ps.setString(4,usuario.getTel());
            ps.setString(5,usuario.getClave());
            ps.setString(6,usuario.getPuesto());
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