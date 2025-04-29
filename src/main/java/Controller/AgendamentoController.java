/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AgendamentoDAO;
import DAO.Conexao;
import Model.Agenda;
import Model.Cliente;
import Model.Servicos;
import View.Agendamento;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Alberto Maúngue
 */
public class AgendamentoController {
    
    private final Agendamento view;
    public AgendamentoController(View.Agendamento view) {
        this.view = view;
    }
    
    
    public void CarregarTabelaAg() throws SQLException, ClassNotFoundException{
        AgendamentoDAO Agdao = new AgendamentoDAO();  // Cria a instância do DAO
        List<Agenda> lista = Agdao.listarAgendamentos();  // Recupera a lista de agendamentos do banco de dados

        DefaultTableModel modelo = (DefaultTableModel) view.getTabelaAgendamento().getModel();  // Obtém o modelo da tabela

        modelo.setRowCount(0);  // Limpa a tabela antes de adicionar os dados

        // Preenche a tabela com os dados da lista de agendamentos
        for (Agenda a : lista) {
            modelo.addRow(new Object[]{
                a.getId(),                         // ID do agendamento
                a.getCliente().getNome(),           // Nome do cliente
                a.getServico().getTipo(),           // Tipo do serviço
                a.getValor(),                      // Valor do agendamento
                a.getData()                        // Data do agendamento
            });
        }
    }
    
    
  
}
        
    
    
   


    
    
       
        
    
    
