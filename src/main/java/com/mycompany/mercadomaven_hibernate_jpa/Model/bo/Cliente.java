package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name="cliente")
public class Cliente extends Pessoa {

    @Column
    private String cpf;
    @Column
    private String rg;  //string
    @Column
    private char sexo;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    public Cliente() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dataNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dataNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
