/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.*;
/**
 *
 * @author ubuntu
 */
public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/personas?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";
    Connection con;
    public Conexion(){
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        }catch(Exception e){
            
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
