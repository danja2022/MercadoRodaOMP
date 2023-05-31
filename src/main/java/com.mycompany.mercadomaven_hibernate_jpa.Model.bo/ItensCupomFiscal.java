
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;


public class ItensCupomFiscal {
       private int id;
       private float qtdProduto;
       private float valorUnitarioProduto;
       private char Status;
       
   
       private Produto produto;
       private HistoricoMovimentacao historicoMovimentacao;
       
       
    public ItensCupomFiscal() {
    }

    public ItensCupomFiscal(int id, float qtdProduto, float valorUnitarioProduto, char Status) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public char getStatus() {
        return Status;
    }

    public void setStatus(char Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "ItensCupomFiscal{" + "id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitarioProduto=" + valorUnitarioProduto + ", Status=" + Status + '}';
    }
       
       
    
}
