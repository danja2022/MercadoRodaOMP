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

@Entity (name="produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String descricao;
    @Column
    private float valorCompra;
    @Column
    private float valorVenda;
    @Column
    private String unidadeVenda;
    @Column
    private String unidadeCompra;
    @Column
    private int fatorConversao;
    @Column
    private char status;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column
    private String barraEntrada;
    @Column
    private String barraSaida;
    @Column
    private float estoqueMinimo;
    @Column
    private float estoqueMaximo;

    @JoinColumn
    @ManyToOne
    private Classe classe;

    @JoinColumn
    @ManyToOne
    private Marca marca;

   

    public Produto(int id, String descricao, float valorCompra, float valorVenda, String unidadeVenda, String unidadeCompra, int fatorConversao, char status, Date dataCadastro, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo) {
        this.id = id;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.unidadeVenda = unidadeVenda;
        this.unidadeCompra = unidadeCompra;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.barraEntrada = barraEntrada;
        this.barraSaida = barraSaida;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public Produto() {

    }

    public String getUndCompra() {
        return unidadeCompra;
    }

    public void setUndCompra(String undCompra) {
        this.unidadeVenda = undCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getUndVenda() {
        return unidadeVenda;
    }

    public void setUndVenda(String undVenda) {
        this.unidadeVenda = undVenda;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public float getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda=" + valorVenda + ", undVenda=" + unidadeVenda + ", fatorConversao=" + fatorConversao + ", status=" + status + ", dataCadastro=" + dataCadastro + ", barraEntrada=" + barraEntrada + ", barraSaida=" + barraSaida + ", estoqueMinimo=" + estoqueMinimo + ", estoqueMaximo=" + estoqueMaximo + '}';
    }

}
