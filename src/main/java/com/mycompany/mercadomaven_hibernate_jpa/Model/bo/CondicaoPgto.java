package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity (name="condicaopagamento")
public class CondicaoPgto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String descricaoCondicao;
    @Column
    private int numeroParcelas;
    @Column
    private int diaPrimeiraParcela;
    @Column
    private int diaEntreParcela;
    @Column
    private char status;
    
    public CondicaoPgto() {
    }

    public CondicaoPgto(int id, String descricaoCondicao, int numeroParcelas, int diaPrimeiraParcela, int diaEntreParcela, char status) {
        this.id = id;
        this.descricaoCondicao = descricaoCondicao;
        this.numeroParcelas = numeroParcelas;
        this.diaPrimeiraParcela = diaPrimeiraParcela;
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

    public int getDiasPrimeiraParcela() {
        return diaPrimeiraParcela;
    }

    public void setDiasPrimeiraParcela(int diasPrimeiraParcela) {
        this.diaPrimeiraParcela = diasPrimeiraParcela;
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
        return "CondicaoPgto{" + "id=" + id + ", descricaoCondicao=" + descricaoCondicao + ", numeroParcelas=" + numeroParcelas + ", diasPrimeiraParcela=" + diaPrimeiraParcela + ", diaEntreParcela=" + diaEntreParcela + ", status=" + status + '}';
    }
    
    
    
}
