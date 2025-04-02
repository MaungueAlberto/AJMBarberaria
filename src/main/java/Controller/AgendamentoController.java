/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import View.Agendamento;
import View.MenuPrincipal;



/**
 *
 * @author J.Solutions
 */
public class AgendamentoController {
  
    public void EntrarAgendamento(){
        
       
     
        //menu1.setEnabled(false);
        Agendamento agend = new Agendamento();
        agend.setLocationRelativeTo(null);
        agend.setVisible(true);
       
        LoginHelper log = new LoginHelper();
        log.FecharMenuPrincipal();
       
        
    } 
    
}
