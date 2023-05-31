
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.util.Date;

public class Produto {
    private int id;
    private String descricao;
    private float valorCompra;
    private float valorVenda;
    private String undVenda;
    private String undCompra;
    private int fatorConversao;
    private char status;
    private String dataCadastro;
    private String barraEntrada;
    private String barraSaida;
    private float estoqueMinimo;
    private float estoqueMaximo;

    private Classe classe;
    
    private Marca marca;
    
    private HistoricoMovimentacao historicoMovimentacao;
    
    
    
    public Produto(int id, String descricao, float valorCompra, float valorVenda, String undVenda,String undCompra, int fatorConversao, char status, String dataCadastro, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo) {
        this.id = id;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.undVenda = undVenda;
        this.undVenda = undCompra;
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
        return undCompra;
    }

    public void setUndCompra(String undCompra) {
        this.undCompra = undCompra;
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
        return undVenda;
    }

    public void setUndVenda(String undVenda) {
        this.undVenda = undVenda;
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

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
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
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda=" + valorVenda + ", undVenda=" + undVenda + ", fatorConversao=" + fatorConversao + ", status=" + status + ", dataCadastro=" + dataCadastro + ", barraEntrada=" + barraEntrada + ", barraSaida=" + barraSaida + ", estoqueMinimo=" + estoqueMinimo + ", estoqueMaximo=" + estoqueMaximo + '}';
    }
    
    
}
