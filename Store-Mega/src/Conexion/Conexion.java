/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel
 */
public class Conexion {
    private static String driver= "com.mysql.cj.jdbc.Driver";
    private static String usuario = "root";
    private static String password = "root1234";
    private static String url = "jdbc:mysql://localhost:2526/bd_sistema_ventas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";   
    static{
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static Connection getConexion() {
        Connection connection=null;
        try{
            connection = DriverManager.getConnection(url,usuario,password);
        }
        catch(SQLException e){
            //Error en base de datos no se puede lograr la conexion
            System.out.println("Error:"+e);
        }
        return connection;
    }
}
