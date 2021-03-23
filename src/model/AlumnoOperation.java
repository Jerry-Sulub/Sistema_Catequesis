/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
/**
 *
 * @author Gerardo
 */
public class AlumnoOperation extends Conexion{
    
    public boolean registrarAlumno(AlumnoModel alumno){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO alumnos VALUES(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, alumno.getMatricula());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setInt(4, alumno.getEdad());
            ps.setInt(5, alumno.getGrado());
            ps.setBoolean(6, alumno.isBautizo());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.print("Error en el registro del nuevo alumno"+e.getMessage());
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.print(e.getMessage());
            }
        }
    }
}
