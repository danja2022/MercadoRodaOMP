package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.BairroDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import java.util.List;

public class BairroService {

    public static void criar(Bairro objeto) {
        BairroDAO.getInstance().create(objeto);
        // BairroDAO bairroDAO = new BairroDAO();
        //  bairroDAO.create(objeto);
    }

    public static Bairro buscar(int codigo) {
        return BairroDAO.getInstance().retrieve(codigo);
        //   BairroDAO bairroDAO = new BairroDAO();
        //return bairroDAO.retrieve(codigo);
    }

    public static Bairro buscar(String descricao) {
        return BairroDAO.getInstance().retrieve(descricao);
        // BairroDAO bairroDAO = new BairroDAO();
        //   return bairroDAO.retrieve(descricao);

    }

    public static List<Bairro> buscar() {
        return BairroDAO.getInstance().retrieve();
        //  BairroDAO bairroDAO = new BairroDAO();
        // return bairroDAO.retrieve();

    }

    public static void atualizar(Bairro objeto) {
        BairroDAO.getInstance().update(objeto);
        //  BairroDAO bairroDAO = new BairroDAO();
        //  bairroDAO.update(objeto);
    }

    public static int excluir(Bairro objeto) {
        return BairroDAO.getInstance().delete(objeto);
        //BairroDAO bairroDAO = new BairroDAO();
        // return bairroDAO.delete(objeto);

    }

}
