/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Maúngue
 */

// Herda de Pessoa 
public class Cliente extends Pessoa{
    
    private String Endereco;

    public Cliente(String Endereco, int Id, String Nome, char Sexo, String Data_Nascimento, String Telefone, String Email) {
        super(Id, Nome, Sexo, Data_Nascimento, Telefone, Email, Endereco);
        this.Endereco = Endereco;
    }

    public Cliente(String Endereco, int Id, String Nome, char Sexo) {
        super(Id, Nome, Sexo);
        this.Endereco = Endereco;
    }
    
    

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    

    

   
    

    
    
    
    
    
}
