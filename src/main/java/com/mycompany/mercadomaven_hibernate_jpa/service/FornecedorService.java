
package com.mycompany.mercadomaven_hibernate_jpa.service;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.FornecedorDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Fornecedor;
import java.util.List;

public class FornecedorService {
    public static void criar(Fornecedor objeto) {
        FornecedorDAO.getInstance().create(objeto);
        // FornecedorDAO fornecedorDAO = new FornecedorDAO();
        //fornecedorDAO.create(objeto);
    }

    public static Fornecedor buscar(int codigo) {
       return FornecedorDAO.getInstance().retrieve(codigo);
       //FornecedorDAO fornecedorDAO = new FornecedorDAO();
      //return fornecedorDAO.retrieve(codigo);
    }

    public static Fornecedor buscar(String descricao) {
         return FornecedorDAO.getInstance().retrieve(descricao);
        // FornecedorDAO fornecedorDAO = new FornecedorDAO();
        //return fornecedorDAO.retrieve(descricao);

    }

    public static List<Fornecedor> buscar() {
        return FornecedorDAO.getInstance().retrieve();
        // FornecedorDAO fornecedorDAO = new FornecedorDAO();
       // return fornecedorDAO.retrieve();

    }

    public static void atualizar(Fornecedor objeto) {
        FornecedorDAO.getInstance().update(objeto);
        //FornecedorDAO fornecedorDAO = new FornecedorDAO();
        //fornecedorDAO.update(objeto);
    }

    public static int excluir(Fornecedor objeto) {
         return FornecedorDAO.getInstance().delete(objeto);
    }
}
