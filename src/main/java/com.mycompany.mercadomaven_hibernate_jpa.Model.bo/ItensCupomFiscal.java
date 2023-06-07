
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class ItensCupomFiscal implements Serializable {
       
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;
       @Column
       private float qtdProduto;
       @Column
       private float valorUnitarioProduto;
       @Column
       private char Status;
       
       @JoinColumn
       @ManyToOne
       private Produto produto;
       
       @JoinColumn
       @ManyToOne
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
