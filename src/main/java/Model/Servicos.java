/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Servicos {
    
    private int id;
    private String Descricao;
    private String Tipo;
    private Double Preco;

    public Servicos(int id, String Descricao, String Tipo, Double Preco) {
        this.id = id;
        this.Descricao = Descricao;
        this.Tipo = Tipo;
        this.Preco = Preco;
    }

    public Servicos() {
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }
    
    
  

   
    
}
