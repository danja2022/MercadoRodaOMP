package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class CondicaoPgto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String descricaoCondicao;
    @Column
    private int numeroParcelas;
    @Column
    private String diasPrimeiraParcela;
    @Column
    private int diaEntreParcela;
    @Column
    private char status;
    
    private Compra compra;
    
    public CondicaoPgto() {
    }

    public CondicaoPgto(int id, String descricaoCondicao, int numeroParcelas, String diasPrimeiraParcela, int diaEntreParcela, char status) {
        this.id = id;
        this.descricaoCondicao = descricaoCondicao;
        this.numeroParcelas = numeroParcelas;
        this.diasPrimeiraParcela = diasPrimeiraParcela;
        this.diaEntreParcela = diaEntreParcela;
        this.status = status;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoCondicao() {
        return descricaoCondicao;
    }

    public void setDescricaoCondicao(String descricaoCondicao) {
        this.descricaoCondicao = descricaoCondicao;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public String getDiasPrimeiraParcela() {
        return diasPrimeiraParcela;
    }

    public void setDiasPrimeiraParcela(String diasPrimeiraParcela) {
        this.diasPrimeiraParcela = diasPrimeiraParcela;
    }

    public int getDiaEntreParcela() {
        return diaEntreParcela;
    }

    public void setDiaEntreParcela(int diaEntreParcela) {
        this.diaEntreParcela = diaEntreParcela;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CondicaoPgto{" + "id=" + id + ", descricaoCondicao=" + descricaoCondicao + ", numeroParcelas=" + numeroParcelas + ", diasPrimeiraParcela=" + diasPrimeiraParcela + ", diaEntreParcela=" + diaEntreParcela + ", status=" + status + '}';
    }
    
    
    
}
