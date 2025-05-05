/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Alberto Maúngue
 */

// Herda de Pessoa 
public class Cliente extends Pessoa{

public Cliente() {
        super();
        
    }
    
    private String Endereco;

    public Cliente(String Endereco, int Id, String Nome, char Sexo, String Data_Nascimento, String Telefone, String Email) {
        super(Id, Nome, Sexo, Data_Nascimento, Telefone, Email, Endereco);
        this.Endereco = Endereco;
    }

    public Cliente(String Endereco, int Id, String Nome, char Sexo) {
        super(Id, Nome, Sexo);
        this.Endereco = Endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Date getData_Nascimento() {
        return Data_Nascimento;
    }

    public void setData_Nascimento(Date Data_Nascimento) {
        this.Data_Nascimento = Data_Nascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    

    @Override
    public String toString(){
        return getNome();
    }

   
    

    
    
    
    
    
}
