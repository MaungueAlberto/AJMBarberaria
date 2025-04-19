/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import View.Agendamento;
import View.MenuPrincipal;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Maúngue
 */

public class UsuarioController {
    
   
    public void insert(){
        
    String nome ="User";
    String senha="us12";
    String Nivel_acesso=" ";
    char sexo='M';
    String telefone="+258 840101010";
    String email ="User@gmail";
    String endereco="Infulene'A'";
    
    
    Usuario usuario1 = new Usuario(nome, senha, Nivel_acesso, sexo, telefone, email, endereco);
    String name=usuario1.getNome();
    
    UsuarioDAO usuarioDAO1 =new UsuarioDAO();
    
    boolean inserido = usuarioDAO1.inserir(usuario1);
   if(inserido){
   JOptionPane.showMessageDialog(null, "Dadosdo usuário "+name+" foram inseriocos com sucesso!");
                }else{
       JOptionPane.showMessageDialog(null,"OS DADOS NAO FORAM INSERIDOS!\n TENTE NOVAMENTE.");
   }
            }
    
}

