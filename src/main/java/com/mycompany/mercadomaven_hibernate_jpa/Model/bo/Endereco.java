
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity (name="endereco")
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String logradouro;
    @Column
    private String cep;
    
    @JoinColumn
    @ManyToOne
    private Bairro bairro;
    
    @JoinColumn
    @ManyToOne
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(int id, String logradouro, String cep, Bairro bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    

    @Override
    public String toString() {
        return this.getId() + ";" + this.getLogradouro() + ";" + this.getCep() + ";" + this.getBairro().toString();
    }
    
    
    
    
}
