/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Servicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J.Solutions
 */
public class ServicoDAO {
     public Connection conexao;
    public Servicos servicos;
    
    public ServicoDAO(){
       try {
            this.conexao= new Conexao().getConnection();
        } catch (SQLException ex ) {
             Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Servicos> listarServicos() throws SQLException, ClassNotFoundException {
         java.util.ArrayList<Servicos> lista = new ArrayList<>();
        try {
            String sql = "SELECT * from servico";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                //Cliente(int id, String Descricao, String tipo, Double Preco/Valor)
                Servicos servicos = new Servicos();
                    servicos.setId(rs.getInt("id"));
                    servicos.setDescricao(rs.getString("Descricao"));
                    servicos.setTipo(rs.getString("tipo"));
                    servicos.setPreco(rs.getDouble("valor"));
                    
                lista.add(servicos);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Erro ao listar Servicos!");
            e.printStackTrace();
        }
        return lista;
    }
    
}
