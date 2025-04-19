/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Maúngue
 */
public class LoginHelper {
    //Acesso a tela Login
    private Login view;
  
    
    public LoginHelper(){
        
    }
    public LoginHelper(Login view) {
        this.view = view;
        }
   
    
    MenuPrincipal menu =new MenuPrincipal();
  
    
    // este metodo retorna um objecto do tipo Usuario
    public void FazerLogin(){
        
        String nome, senha;
        nome =view.getTxtNome().getText();
        senha= view.getTxtSenha().getText();

        Usuario usuario = new Usuario(nome, senha);
        
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      if(!usuarioDAO.autenticar(usuario)){
         view.getTxtNome().setText("");
         view.getTxtSenha().setText("");
          JOptionPane.showMessageDialog(null, "NOME OU SENHA INCORRECTA!\nVERIFIQUE OS DADOS E TENTA NOVAMENTE.");
      }else{
          view.dispose();
          //Abri Menu Principal
          menu.setVisible(true);
          menu.setResizable(false);
          menu.setLocationRelativeTo(null);
          
          
    }
    }
     
   
    
    
}
