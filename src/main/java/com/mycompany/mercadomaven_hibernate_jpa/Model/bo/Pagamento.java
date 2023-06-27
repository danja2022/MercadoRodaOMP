package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name="pagamento")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Column
    @Temporal(TemporalType.TIME)
    private Date horaPagamento;
    @Column
    private float valorDesconto;
    @Column
    private float valorAcrescimo;
    @Column
    private float valorPago;
    
    @Column
    private char status;
    
    

    public Pagamento() {
    }

    public Pagamento(int id, Date dataPagamento, Date horaPagamento, float valorDesconto, float valorAcrescimo, float valorPago, char status) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.horaPagamento = horaPagamento;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorPago = valorPago;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(Date horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", dataPagamento=" + dataPagamento + ", horaPagamento=" + horaPagamento + ", valorDesconto=" + valorDesconto + ", valorAcrescimo=" + valorAcrescimo + ", valorPago=" + valorPago + ", status=" + status + '}';
    }

}
