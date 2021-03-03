/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 */
public class Conexion {
    private Connection conexion;
    
    private final String url = "jdbc:mysql://localhost/sistemacatequesis?serverTimezone=UTC";
    private final String user = "root";
    private final String pass = "Mydb2000";
    
    public Connection getConexion(){
        try {
            this.conexion = DriverManager.getConnection(url, user,pass);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción en: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
        return conexion;
    }
}
