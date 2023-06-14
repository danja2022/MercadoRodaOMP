
package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.CondicaoPgtoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.CondicaoPgto;
import java.util.List;


public class CondPagService {
    
    public static void criar(CondicaoPgto objeto) {
        CondicaoPgtoDAO.getInstance().create(objeto);
        //CondicaoPgtoDAO condicaoPgtoDAO = new CondicaoPgtoDAO();
        //condicaoPgtoDAO.create(objeto);
    }

    public static CondicaoPgto buscar(int codigo) {
        return CondicaoPgtoDAO.getInstance().retrieve(codigo);
        
    }

    public static CondicaoPgto buscar(String descricao) {
        return CondicaoPgtoDAO.getInstance().retrieve(descricao);
        

    }

    public static List<CondicaoPgto> buscar() {
        return CondicaoPgtoDAO.getInstance().retrieve();

    }

    public static void atualizar(CondicaoPgto objeto) {
        CondicaoPgtoDAO.getInstance().update(objeto);
        //CondicaoPgtoDAO condicaoPgtoDAO = new CondicaoPgtoDAO();
        //condicaoPgtoDAO.update(objeto);
    }

    public static int excluir(CondicaoPgto objeto) {
       return CondicaoPgtoDAO.getInstance().delete(objeto);

    }
}
