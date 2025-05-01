/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Agenda;
import Model.Cliente;
import Model.Servicos;
import View.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Maúngue
 */
public class AgendamentoDAO {
    
    Conexao conexao = new Conexao();
    
    
//    public void inserir(Agenda agenda){
//        PreparedStatement ps;
//        String query = "INSERT INTO client Agenda(nome, tipo, valor, data) VALUES(?,?,?,?)";
//        try {
//            ps = conexao.prepareStatement(query);
//            
//            ps.setString(1,agenda.getNome());
//            ps.setString(2, agenda.getTipo());
//            ps.setString(3,agenda.getValor());
//            ps.setString(4,agenda.getData());
//           
//            ps.executeUpdate();
//            ps.close();
//             int rowsInserted = ps.executeUpdate();
//            if (rowsInserted > 0) {
//                JOptionPane.showMessageDialog(null, "Insercao bem sucedida!");
//                System.out.println("Insercao bem sucedida!");
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
//        }
//    }
    
   public List<Agenda> listarAgendamentos() throws SQLException, ClassNotFoundException {
        List<Agenda> lista = new ArrayList<>();
        String sql = "SELECT a.id, a.valor, a.data, c.Nome AS cliente_nome, s.tipo AS servico_tipo " +
                     "FROM agenda a " +
                     "JOIN cliente c ON a.cliente_id = c.id " +
                     "JOIN servico s ON a.servico_id = s.id";

        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Agenda a = new Agenda();

                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("cliente_nome"));

                Servicos servico = new Servicos();
                servico.setTipo(rs.getString("servico_tipo"));

                a.setId(rs.getInt("id"));
                a.setCliente(cliente);
                a.setServico(servico);
                a.setValor(rs.getDouble("valor"));
                a.setData(rs.getTimestamp("data"));

                lista.add(a);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar agendamentos: " + e.getMessage());
        }

        return lista;
    }
}
    
    

