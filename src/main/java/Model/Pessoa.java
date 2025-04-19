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
//Classe abstrata, nao poderei instanciar Pessoa. Nao há interveniencia de pessoa no sistema , apenas CLIENTE e USUÁRIO 
abstract public class Pessoa {
    
    //Coloco como Nivel de acesso desses dados como PROTECTED, pois só a classe pessoa e suas "filhas" CLIENTE e USUÁRIo poderão ter acesso
    protected int Id;
    protected String Nome ;
    protected char Sexo;
    protected Date Data_Nascimento;
    protected String Telefone;
    protected String Email;
    protected String Endereco;
    
    
    

    public Pessoa(int Id, String Nome, char Sexo, String Data_Nascimento, String Telefone, String Email, String Endereco ) {
        this.Id = Id;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Data_Nascimento =  new SimpleDateFormat("dd/MM/yyyy  HH:mm").parse(Data_Nascimento);
        this.Telefone = Telefone;
        this.Email = Email;
        this.Endereco=Endereco;
    }
     public Pessoa( String Nome, char Sexo, String Telefone, String Email, String Endereco ) {
        
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Endereco=Endereco;
    }

    public Pessoa(int Id, String Nome, char Sexo) {
        this.Id = Id;
        this.Nome = Nome;
        this.Sexo = Sexo;
    }

    public Pessoa(String Nome) {
        this.Nome = Nome;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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

   public String getEndereco(){
       return Endereco;
   }
   public void setEndereco(String Endereco){
       this.Endereco=Endereco;
   }
    
    
    
}
