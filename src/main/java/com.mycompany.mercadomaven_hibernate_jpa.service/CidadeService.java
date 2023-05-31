
package com.mycompany.mercadomaven_hibernate_jpa.service;



import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.CidadeDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cidade;
import java.util.List;

public class CidadeService {
     public static void criar(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.create(objeto);
    }

    public static Cidade buscar(int codigo) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        
        
      return cidadeDAO.retrieve(codigo);
    }

    public static Cidade buscar(String descricao) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(descricao);

    }

    public static List<Cidade> buscar() {
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve();

    }

    public static void atualizar(Cidade objeto) {

        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.update(objeto);
    }

    public static int excluir(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
           return cidadeDAO.delete(objeto);
        
    }
}
