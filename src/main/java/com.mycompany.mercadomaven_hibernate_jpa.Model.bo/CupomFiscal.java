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

@Entity
public class CupomFiscal implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Temporal (TemporalType.DATE)
    private Date dataVenda;
    @Column
    @Temporal(TemporalType.DATE)
    private String horaVenda;
    @Column
    private float valorDesconto;
    @Column
    private float valorAcrescimo;
    @Column
    private float totalCupom;
    @Column
    private char status;

    @JoinColumn
    @ManyToOne
    private ItensCupomFiscal itensCupomFiscal;
    
    public CupomFiscal() {
    }

    public CupomFiscal(int id, Date dataVenda, String horaVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalCupom = totalCupom;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
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

    public float getTotalCupom() {
        return totalCupom;
    }

    public void setTotalCupom(float totalCupom) {
        this.totalCupom = totalCupom;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CupomFiscal{" + "id=" + id + ", dataVenda=" + dataVenda + ", horaVenda=" + horaVenda + ", valorDesconto=" + valorDesconto + ", valorAcrescimo=" + valorAcrescimo + ", totalCupom=" + totalCupom + ", status=" + status + '}';
    }
    
    
    
}
