package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.util.Date;

public class CupomFiscal {
    private int id;
    private Date dataVenda;
    private String horaVenda;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalCupom;
    private char status;

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
