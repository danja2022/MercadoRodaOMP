package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.CidadeDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cidade;
import java.util.List;

public class CidadeService {

    public static void criar(Cidade objeto) {
        CidadeDAO.getInstance().create(objeto);
        // CidadeDAO cidadeDAO = new CidadeDAO();
        //cidadeDAO.create(objeto);
    }

    public static Cidade buscar(int codigo) {

       return CidadeDAO.getInstance().retrieve(codigo);
       // CidadeDAO cidadeDAO = new CidadeDAO();
       // return cidadeDAO.retrieve(codigo);
    }

    public static Cidade buscar(String descricao) {
        
         return CidadeDAO.getInstance().retrieve(descricao);
        //CidadeDAO cidadeDAO = new CidadeDAO();
        //return cidadeDAO.retrieve(descricao);

    }

    public static List<Cidade> buscar() {
        
        return CidadeDAO.getInstance().retrieve();
        //CidadeDAO cidadeDAO = new CidadeDAO();
        //return cidadeDAO.retrieve();

    }

    public static void atualizar(Cidade objeto) {
        CidadeDAO.getInstance().update(objeto);
        //CidadeDAO cidadeDAO = new CidadeDAO();
        //cidadeDAO.update(objeto);
    }

    public static int excluir(Cidade objeto) {
        return CidadeDAO.getInstance().delete(objeto);
        //CidadeDAO cidadeDAO = new CidadeDAO();
        //return cidadeDAO.delete(objeto);

    }
}
