package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String fone1;
    @Column
    private String fone2;
    @Column
    private String email;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column
    private String complementoEndereco;
    @Column
    private String observacao;
    @Column
    private char status;
    
    
    @JoinColumn
    @ManyToOne
    private Endereco endereco; //endereco

    public Pessoa() {
    }

    public Pessoa(String nome, int id, String fone, String fone2, String email, Date dtCadastro, String complementoEndereco, String observacao, char status, Endereco endereco) {
        this.nome = nome;
        this.id = id;
        this.fone1 = fone;
        this.fone2 = fone2;
        this.email = email;
        this.dataCadastro = dtCadastro;
        this.complementoEndereco = complementoEndereco;
        this.observacao = observacao;
        this.status = status;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFone() {
        return fone1;
    }

    public void setFone(String fone) {
        this.fone1 = fone;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtCadastro() {
        return dataCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dataCadastro = dtCadastro;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.getId() + ";" +this.getEmail();
    }
    
}
