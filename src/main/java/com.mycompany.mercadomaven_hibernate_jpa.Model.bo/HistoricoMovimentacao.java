
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.util.Date;

public class HistoricoMovimentacao {
    private int id;
    private Date data;
    private String hora;
    private char tipo;
    private float qtd;
    private char status;

    private ItensCompra itensCompra;
    
    
    public HistoricoMovimentacao() {
    }

    public HistoricoMovimentacao(int id, Date data, String hora, char tipo, float qtd, char status) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HistoricoMovimentacao{" + "id=" + id + ", data=" + data + ", hora=" + hora + ", tipo=" + tipo + ", qtd=" + qtd + ", status=" + status + '}';
    }
    
    
    
}
