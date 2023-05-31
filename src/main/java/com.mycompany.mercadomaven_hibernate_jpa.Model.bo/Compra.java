
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.util.Date;

public class Compra {
    private int id;
    private Date dataCompra;
    private String horaCompra;
    private String numeroNF;
    private String tipoNF;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalNF;
    private char status;

    private ItensCompra itensCompra;
    private Pagar pagar;
    
    public Compra() {
    }

    public Compra(int id, Date dataCompra, String horaCompra, String numeroNF, String tipoNF, float valorDesconto, float valorAcrescimo, float totalNF, char Status) {
        this.id = id;
        this.dataCompra = dataCompra;
        this.horaCompra = horaCompra;
        this.numeroNF = numeroNF;
        this.tipoNF = tipoNF;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalNF = totalNF;
        this.status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
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

    public float getTotalNF() {
        return totalNF;
    }

    public void setTotalNF(float totalNF) {
        this.totalNF = totalNF;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char Status) {
        this.status = Status;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dataCompra=" + dataCompra + ", horaCompra=" + horaCompra + ", numeroNF=" + numeroNF + ", tipoNF=" + tipoNF + ", valorDesconto=" + valorDesconto + ", valorAcrescimo=" + valorAcrescimo + ", totalNF=" + totalNF + ", Status=" + status + '}';
    }
    
    
    
}
