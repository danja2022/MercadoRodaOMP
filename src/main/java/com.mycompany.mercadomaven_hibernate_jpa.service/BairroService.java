package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.BairroDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import java.util.List;

public class BairroService {

    public static void criar(Bairro objeto) {
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.create(objeto);
    }

    public static Bairro buscar(int codigo) {
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(codigo);
    }

    public static Bairro buscar(String descricao) {
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(descricao);

    }

    public static List<Bairro> buscar() {
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve();

    }

    public static void atualizar(Bairro objeto) {

        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.update(objeto);
    }

    public static int excluir(Bairro objeto) {
         BairroDAO bairroDAO = new BairroDAO();
           return bairroDAO.delete(objeto);
        
    }

}
