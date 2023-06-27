
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.eclipse.persistence.sessions.serializers.Serializer;


@Entity (name="itenscompra")
public class ItensCompra implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private float qtdProduto;
    @Column
    private float privateUnitarioProduto;
    
    @Column
    private char status;

    @JoinColumn
    @ManyToOne
    private HistoricoMovimentacao historicoMovimentacao;
    
    public ItensCompra() {
    }

    public ItensCompra(int id, float qtdProduto, float privateUnitarioProduto, char status) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.privateUnitarioProduto = privateUnitarioProduto;
        this.status = status;
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

    public float getPrivateUnitarioProduto() {
        return privateUnitarioProduto;
    }

    public void setPrivateUnitarioProduto(float privateUnitarioProduto) {
        this.privateUnitarioProduto = privateUnitarioProduto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItensCompra{" + "id=" + id + ", qtdProduto=" + qtdProduto + ", privateUnitarioProduto=" + privateUnitarioProduto + ", status=" + status + '}';
    }
    
    
    
}
