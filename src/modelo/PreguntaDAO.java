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
public class PreguntaDAO {
    ConexionBD conexion;
    public PreguntaDAO(){
        conexion = new ConexionBD();
    }
     public boolean insertPregunta(String IDPregunta, String IdAsignatura, String NombreTema, String NombreAsignatura, String TextoPregunta, String Opcion1, String Opcion2, String Opcion3, String Opcion4, String OpcionCorrecta){
        
        String rptaRegistroD=null;
        PreparedStatement ps =null;
        Connection accesoBD = conexion.getConexionBD();
        
        String l = "INSERT INTO pregunta(id_Pregunta,id_Asignatura,Nombre_tema,Nombre_asignatura,Texto_Pregunta,ocp_1,ocp_2,opc_3,opc_4,opc_correcta) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try{
            ps=accesoBD.prepareStatement(l);
            ps.setString(1, IDPregunta);
            ps.setString(2, IdAsignatura);
            ps.setString(3, NombreTema);
            ps.setString(4, NombreAsignatura);
            ps.setString(5, TextoPregunta);
            ps.setString(6, Opcion1);
            ps.setString(7, Opcion2);
            ps.setString(8, Opcion3);
            ps.setString(9, Opcion4);
            ps.setString(10, OpcionCorrecta);
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
    public boolean actualizarPregunta(String IDPregunta, String IdAsignatura, String NombreTema, String NombreAsignatura, String TextoPregunta, String Opcion1, String Opcion2, String Opcion3, String Opcion4, String OpcionCorrecta) {
        String rptaregistro2 = null;
        PreparedStatement ps = null;
        Connection accesoBD = conexion.getConexionBD();
        String cs = "UPDATE pregunta SET id_Asignatura=?,Nombre_tema=?,Nombre_asignatura=?,Texto_Pregunta=?,ocp_1=?,ocp_2=?,opc_3=?,opc_4=?,opc_correcta=? WHERE id_Pregunta=?";
        try {
            ps = accesoBD.prepareStatement(cs);
            ps.setString(1, IDPregunta);
            ps.setString(2, IdAsignatura);
            ps.setString(3, NombreTema);
            ps.setString(4, NombreAsignatura);
            ps.setString(5, TextoPregunta);
            ps.setString(6, Opcion1);
            ps.setString(7, Opcion2);
            ps.setString(8, Opcion3);
            ps.setString(9, Opcion4);
            ps.setString(10, OpcionCorrecta);
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

