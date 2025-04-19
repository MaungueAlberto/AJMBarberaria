/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto Maúngue
 */
public class Agenda {
    private int Id;
   // Para objesto do tipo cliente, ou seja na criacao de um cliente na classe cliente, levarei esse para a classe agenda. Cliente do tipo cliente 
    private Cliente cliente;
    private Servicos servico; //Idem
    private Double valor;
    private Date data;
    private String observacao;

    public Agenda(int Id, Cliente cliente, Servicos servico, Double valor, String data) throws ParseException {
        this.Id = Id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try{
        this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
            }catch(ParseException ex){
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
    }

        }

    public Agenda() {
    }
        
      
               
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
