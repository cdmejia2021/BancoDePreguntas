/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class DocenteDAO {
    ConexionBD conexion;
    
    public DocenteDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertDocente(String NumeroDocumento, String TipoDocumento, String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, String Profesion, String Correo, String idProyecto){
        
        String rptaRegistroD=null;
        PreparedStatement ps =null;
        Connection accesoBD = conexion.getConexionBD();
        
        String l = "INSERT INTO docente(id,Tipo_id,Primer_nombre,Segundo_nombre,Primer_apellido,Segundo_apellido,Profesion,Correo,id_proyecto) VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            ps=accesoBD.prepareStatement(l);
            ps.setString(1, NumeroDocumento);
            ps.setString(2, TipoDocumento);
            ps.setString(3, PrimerNombre);
            ps.setString(4, SegundoNombre);
            ps.setString(5, PrimerApellido);
            ps.setString(6, SegundoApellido);
            ps.setString(7, Profesion);
            ps.setString(8, Correo);
            ps.setString(9, idProyecto);
            ps.execute();
            
            return true;
        }catch (SQLException ex){
            System.err.println(ex);
            return false;
        } finally{
            try{
                accesoBD.close();
            }catch (SQLException ex){
                System.err.println(ex);
            }
        }
    }
       public boolean actualizarDocente(String NumeroDocumento, String TipoDocumento, String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, String Profesion, String Correo, String idProyecto) {
        String rptaregistro2 = null;
        PreparedStatement ps = null;
        Connection accesoBD = conexion.getConexionBD();
        String cs = "UPDATE docente SET Tipo_id=?, Primer_nombre=?, Segundo_nombre=?, Primer_apellido=?, Segundo_apellido=?, Profesion=?, Correo=?, id_proyecto=? WHERE id=?";
        try {
            ps = accesoBD.prepareStatement(cs);
            ps.setString(1, NumeroDocumento);
            ps.setString(2, TipoDocumento);
            ps.setString(3, PrimerNombre);
            ps.setString(4, SegundoNombre);
            ps.setString(5, PrimerApellido);
            ps.setString(6, SegundoApellido);
            ps.setString(7, Profesion);
            ps.setString(8, Correo);
            ps.setString(9, idProyecto);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                accesoBD.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
