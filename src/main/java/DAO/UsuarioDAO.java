/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J.Solutions
 */
public class UsuarioDAO {
     public Connection con;
     public Usuario usuario;
    //private String Nome;
    public UsuarioDAO() {
          try {
              try {
                  this.con = new Conexao().getConnection();
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
              }
        if (this.con == null) {
            System.err.println("Erro: Conexão com o banco de dados não foi estabelecida.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 
    
    public boolean inserir(Usuario usuario){
        PreparedStatement ps;
        
        String query = "INSERT INTO Usuario( Nome, senha, Nivel_acesso, Sexo, Telefone, Email, Endereco) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = this.con.prepareStatement(query);
            
            ps.setString(1, usuario.getNome());
            ps.setString(2,usuario.getSenha());
            ps.setString(3, usuario.getNivel_Acesso());
            ps.setString(4, String.valueOf(usuario.getSexo())); //Converte char para String
            ps.setString(5, usuario.getTelefone());
            ps.setString(6,usuario.getEmail());
            ps.setString(7,usuario.getEndereco());
           // ps.setString(1, nome);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("CONEXAO COM BD  NAO DISPONIVEL"+e.getMessage());
        }
         return true;
    }
    
     public boolean autenticar(Usuario usuario) {
            String nome = usuario.getNome();
            String senha = usuario.getSenha();
            System.out.println("Chegou ao DAO"+nome);
            System.out.println("Chegou ao DAO"+senha);
            
            ResultSet rs = null;
            PreparedStatement ps = null;
    
            try {
                String query = "SELECT * FROM Usuario WHERE nome = ?AND senha = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, usuario.getNome());  // Nome inserido
                ps.setString(2,usuario.getSenha());  // Senha do Usuario

                rs = ps.executeQuery();  // Executa a consulta

        // Verifica se existe um registro correspondente
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();  // Fechar o ResultSet
                }
                if (ps != null) {
                    ps.close();  // Fechar o PreparedStatement
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar os recursos: " + e.getMessage());
            }
        }
        return false;
    }
    
    
}
