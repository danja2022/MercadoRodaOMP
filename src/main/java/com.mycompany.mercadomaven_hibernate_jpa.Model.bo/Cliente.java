package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import java.util.Date;

public class Cliente extends Pessoa {

    private String cpf;
    private String rg;  //string
    private char sexo;
    private String dtNascimento;

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

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
