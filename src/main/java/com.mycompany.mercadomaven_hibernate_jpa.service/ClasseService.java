
package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ClasseDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Classe;
import java.util.List;

public class ClasseService {
    public static void criar(Classe objeto) {
        ClasseDAO.getInstance().create(objeto);
        // ClasseDAO classeDAO = new ClasseDAO();
        //classeDAO.create(objeto);
    }

    public static Classe buscar(int codigo) {
        return ClasseDAO.getInstance().retrieve(codigo);
        //ClasseDAO classeDAO = new ClasseDAO();
        //return classeDAO.retrieve(codigo);
    }

    public static Classe buscar(String descricao) {
        return ClasseDAO.getInstance().retrieve(descricao);    
        //ClasseDAO classeDAO = new ClasseDAO();
        //return classeDAO.retrieve(descricao);

    }

    public static List<Classe> buscar() {
         return ClasseDAO.getInstance().retrieve();
        // ClasseDAO classeDAO = new ClasseDAO();
        //return classeDAO.retrieve();

    }

    public static void atualizar(Classe objeto) {
        ClasseDAO.getInstance().update(objeto);
       // ClasseDAO classeDAO = new ClasseDAO();
      //  classeDAO.update(objeto);
    }

    public static int excluir(Classe objeto) {
        return ClasseDAO.getInstance().delete(objeto);
        //ClasseDAO classeDAO = new ClasseDAO();
        //return classeDAO.delete(objeto);

    }
}
