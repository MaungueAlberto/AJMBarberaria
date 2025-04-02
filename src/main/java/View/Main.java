/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Maúngue
 */
import Controller.UsuarioController;
import DAO.UsuarioDAO;
import Model.Agenda;
import Model.Servicos;
import Model.Cliente;
import Model.Usuario;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws ParseException{
        //Esta e aclasse de testes 
        
        
        String nome ="ALberto";
        
        System.out.print(nome);
        
        //Objecto Servico do tipo servico,com variavel Barba que é o tipo de servico
        // objecto Barba que e um servico, vai ter os comportamentos de Servicos
        
        Servicos Barba = new  Servicos(123, "Fino", "Thomas Shelby", 65.9);
        System.out.println(Barba.getDescricao());
        System.out.println(Barba.getPreco());
        
        
        Cliente cliente = new Cliente("Maputo Matola", 123212, "Alberto José", 'M');
        //Porque cliente herdou pessou posso pegar (Get) dados de pessoa para cliente 
        System.out.println(cliente.getNome() +" "+ cliente.getId() );
        System.out.println(cliente.getSexo()+" "+cliente.getEndereco());
        
        //Desta formo posso verificar todos os daddos inseridos acima, colocando um BreakPoint e depois executar e Debug ao inves de RunFile
        System.out.println(cliente);
        
        Servicos servico = new Servicos(12321, "Desenho de ScriptWise", "Punk Fino", 340.67);
        
         
        Usuario usuario = new Usuario("Jose1309", "Geral", 7890, "Adelino", 'M');
         
        System.out.println(usuario);
        
        Agenda agenda = new Agenda(12, cliente, servico, 234.09, "09/03/2025 11:30");
        System.out.println(agenda);
        
        System.out.println(agenda.getCliente().getNome()+"  "+agenda.getData());
         
       //Agendamento agendamento = new Agendamento(1, cliente, servico, 12.09);
         
       /// System.out.printl(agendamento.getcliente().getNome());
         
      //System.outPrintln(agendamento.getId());
      
      //Conexao con= new Conexao();
      UsuarioController uc= new UsuarioController();
      uc.insert();

      
      
      
        
    }
    
}
