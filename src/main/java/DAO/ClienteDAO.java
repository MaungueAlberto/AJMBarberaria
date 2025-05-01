/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alberto Maúngue
 */
public class ClienteDAO{
    
    public Connection conexao;
    public Cliente cliente;
    
    public ClienteDAO(){
       try {
            this.conexao= new Conexao().getConnection();
        } catch (SQLException ex ) {
             Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Cliente> listarCliente() throws SQLException, ClassNotFoundException {
         java.util.ArrayList<Cliente> lista = new ArrayList<>();
        try {
            String sql = "SELECT * from cliente";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                //Cliente(String nome, String sexo, Date Data_Nascimento, String Telefone, String Email, String Endereco, String pessoa_id)
                Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id"));
                    cliente.setNome(rs.getString("Nome"));
                    cliente.setSexo(rs.getString("Sexo").charAt(0));
                    cliente.setData_Nascimento(rs.getDate("Data_Nascimento"));
                    cliente.setTelefone(rs.getString("Telefone"));
                    cliente.setEmail(rs.getString("Email"));
                    cliente.setEndereco(rs.getString("Endereco"));
                lista.add(cliente);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente!");
            e.printStackTrace();
        }
        return lista;
    }
        }



