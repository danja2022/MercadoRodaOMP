
package com.mycompany.mercadomaven_hibernate_jpa.service;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ProdutoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Produto;
import java.util.List;

public class ProdutoService {
     public static void criar(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.create(objeto);
    }

    public static Produto buscar(int codigo) {
        ProdutoDAO produtoDAO = new ProdutoDAO();;
        return produtoDAO.retrieve(codigo);
    }

    public static Produto buscar(String descricao) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve(descricao);

    }

    public static List<Produto> buscar() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve();

    }

    public static void atualizar(Produto objeto) {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(objeto);
    }

    public static int excluir(Produto objeto) {
         ProdutoDAO produtoDAO = new ProdutoDAO();
           return produtoDAO.delete(objeto);
        
    }
}
