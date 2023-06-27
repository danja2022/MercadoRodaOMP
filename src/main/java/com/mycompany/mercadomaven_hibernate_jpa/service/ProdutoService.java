package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ProdutoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Produto;
import java.util.List;

public class ProdutoService {

    public static void criar(Produto objeto) {
        ProdutoDAO.getInstance().create(objeto);
        // ProdutoDAO produtoDAO = new ProdutoDAO();
        //  produtoDAO.create(objeto);
    }

    public static Produto buscar(int codigo) {
        return ProdutoDAO.getInstance().retrieve(codigo);
        // ProdutoDAO produtoDAO = new ProdutoDAO();;
        // return produtoDAO.retrieve(codigo);
    }

    public static Produto buscar(String descricao) {
       return ProdutoDAO.getInstance().retrieve(descricao);
        

    }

    public static List<Produto> buscar() {
        return ProdutoDAO.getInstance().retrieve();
        

    }

    public static void atualizar(Produto objeto) {
         ProdutoDAO.getInstance().update(objeto);
        
    }

    public static int excluir(Produto objeto) {
        return ProdutoDAO.getInstance().delete(objeto);
       
    }
}
