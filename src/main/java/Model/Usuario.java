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
public class Usuario extends Pessoa {
    
    
    private String Senha;
    private String Nivel_Acesso;
   ;
    
 //Criar esse construtor principal

    public Usuario(String nome, String senha) {
        super( nome);
        this.Senha = senha;
    }

    public Usuario(String Nome, String Senha, String Nivel_Acesso,  char Sexo, String Telefone, String Email, String Endereco) {
        super( Nome, Sexo,  Telefone, Email, Endereco);
        this.Senha = Senha;
        this.Nivel_Acesso = Nivel_Acesso;
    }

    public Usuario(String Senha, String Nivel_Acesso, int Id, String Nome, char Sexo) {
        super(Id, Nome, Sexo);
        this.Senha = Senha;
        this.Nivel_Acesso = Nivel_Acesso;
    }
    
    
    //Get e Set

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNivel_Acesso() {
        return Nivel_Acesso;
    }

    public void setNivel_Acesso(String Nivel_Acesso) {
        this.Nivel_Acesso = Nivel_Acesso;
    }
    
    
    
    
}
