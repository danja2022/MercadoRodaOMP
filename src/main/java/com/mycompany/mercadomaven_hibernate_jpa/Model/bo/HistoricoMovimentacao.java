
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name="historicomovimentacao")
public class HistoricoMovimentacao implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column
    @Temporal(TemporalType.DATE)
    private Date hora;
    @Column
    private char tipo;
    @Column
    private float qtd;
    @Column
    private char status;

    
    @JoinColumn
    @ManyToOne
    private ItensCompra itensCompra;
    
    
    public HistoricoMovimentacao() {
    }

    public HistoricoMovimentacao(int id, Date data, Date hora, char tipo, float qtd, char status) {
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

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
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
