/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agendamento;
import View.MenuPrincipal;

/**
 *
 * @author Alberto Maúngue
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void EntrarAgenda(){
       Agendamento agend = new Agendamento();
       agend.setVisible(true);
       agend.setLocationRelativeTo(null);
    }
}
