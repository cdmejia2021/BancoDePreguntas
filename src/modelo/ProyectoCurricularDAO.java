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
public class ProyectoCurricularDAO {

    ConexionBD conexion;

    public ProyectoCurricularDAO() {
        conexion = new ConexionBD();
    }

    public boolean insertProyectoCurricular(String IdP, String Nombre) {
        String rptaRegistroD = null;
        PreparedStatement ps = null;
        Connection accesoBD = conexion.getConexionBD();

        String l = "INSERT INTO proyecto_curricular(id, nombre) VALUES (?,?)";
        try {
            ps = accesoBD.prepareStatement(l);
            ps.setString(1, IdP);
            ps.setString(2, Nombre);
            ps.execute();

            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                accesoBD.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean actualizarProyectoCurricular(String IdP, String Nombre) {
        String rptaregistro2 = null;
        PreparedStatement ps = null;
        Connection accesoBD = conexion.getConexionBD();
        String cs = "UPDATE proyecto_curricular SET nombre=? WHERE id=?";
        try {
            ps = accesoBD.prepareStatement(cs);
            ps.setString(1, Nombre);
            ps.setString(2, IdP);
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
