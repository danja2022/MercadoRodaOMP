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
public class Pagar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column
    @Temporal(TemporalType.TIME)
    private int horaEmissao;
    @Column
    private Date dataVencimento;
    @Column
    private int valorPagar;
    @Column
    private char status;

    @JoinColumn
    @ManyToOne
    
    private Pagamento pagamento;

    public Pagar() {
    }

    public Pagar(int id, Date dataEmissao, int horaEmissao, Date dataVencimento, int valorPagar, char status) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.horaEmissao = horaEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPagar = valorPagar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public int getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(int horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagar{" + "id=" + id + ", dataEmissao=" + dataEmissao + ", horaEmissao=" + horaEmissao + ", dataVencimento=" + dataVencimento + ", valorPagar=" + valorPagar + ", status=" + status + '}';
    }

}
