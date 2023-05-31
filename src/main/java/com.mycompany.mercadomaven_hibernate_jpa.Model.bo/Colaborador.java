
package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

//import java.util.Date;

import java.util.Date;


public class Colaborador extends Pessoa {
    
    private String login;
    private String senha;
    
    
    private CupomFiscal cupomFiscal;
    
    public Colaborador() {
       
    }

    public Colaborador(String login, String senha, String nome, int id, String fone, String fone2, String email, Date dtCadastro, String complementoEndereco, String observacao, char status, Endereco endereco) {
        super(nome, id, fone, fone2, email, dtCadastro, complementoEndereco, observacao, status, endereco);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
