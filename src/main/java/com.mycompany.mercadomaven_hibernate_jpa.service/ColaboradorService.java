package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ColaboradorDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Colaborador;
import java.util.List;

public class ColaboradorService {

    public static void criar(Colaborador objeto) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        colaboradorDAO.create(objeto);
    }

    public static Colaborador buscar(int codigo) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();

        return colaboradorDAO.retrieve(codigo);
    }

    public static Colaborador buscar(String descricao) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        return colaboradorDAO.retrieve(descricao);

    }

    public static List<Colaborador> buscar() {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        return colaboradorDAO.retrieve();

    }

    public static void atualizar(Colaborador objeto) {

        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        colaboradorDAO.update(objeto);
    }

    public static int excluir(Colaborador objeto) {
          ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        return colaboradorDAO.delete(objeto);

    }
}
