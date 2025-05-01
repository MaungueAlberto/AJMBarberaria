/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AgendamentoDAO;
import DAO.ClienteDAO;
import DAO.ServicoDAO;
import Model.Agenda;
import Model.Cliente;
import Model.Servicos;
import View.Agendamento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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
    
    public void AtualizarCliente() throws SQLException, ClassNotFoundException{
        
        //Pegar cliente da BD
        ClienteDAO clienteDAO = new ClienteDAO();
        
        /*Chama o método listarCliente().
        Armazena o retorno (uma ArrayList<Cliente>) na variável clientes.*/
        ArrayList<Cliente> clientes =  clienteDAO.listarCliente();
        
//    imprimir os nomes dos clientes --    for (Cliente c : clientes) {
//         System.out.println(c.getNome());
//        }
        
        //Exibir  cliente no ComboBox Cliente, no Agendamento
        DefaultComboBoxModel  comboBoxModel = (DefaultComboBoxModel) view.getComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes){
            comboBoxModel.addElement(cliente); //Estou a pegar o objecto cliente e inserir no Jcombobox
        }//Mas desta form vai pegar a referencia do cliente e colocar no JComboBox
         //Devo criar na classe Cliente, um toString, que retorna o nome do cliente
    
   
    
    }
    
    public void AtualizarServico() throws SQLException, ClassNotFoundException{
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servicos> servicos = servicoDAO.listarServicos();
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxServico().getModel();
        
        for(Servicos servico : servicos){
            comboBoxModel.addElement(servico);
        }
        
        
    }
}
        
    
    
   


    
    
       
        
    
    
