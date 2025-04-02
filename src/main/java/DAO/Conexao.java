/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author J.Solutions
 */
public class Conexao {
    
    private String  URL="jdbc:mysql://localhost:3306/BarbeariaMaungue?useSSL=false&serverTimezone=UTC";
    private String USUARIO = "root";
    private String SENHA = "Jose1309";
    
     public Connection getConnection() throws SQLException, ClassNotFoundException {
        try{
        return DriverManager.getConnection( URL, USUARIO, SENHA);
        }catch (SQLException e){
            System.err.println("ERRO AO CONECTAR DB: "+e.getMessage());
            throw e;
        }
        
     }
}
