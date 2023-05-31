package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.MarcaDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import java.util.List;

public class MarcaService {

    public static void criar(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.create(objeto);
    }

    public static Marca buscar(int codigo) {
        MarcaDAO marcaDAO = new MarcaDAO();

        return marcaDAO.retrieve(codigo);
    }

    public static Marca buscar(String descricao) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.retrieve(descricao);

    }

    public static List<Marca> buscar() {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.retrieve();

    }

    public static void atualizar(Marca objeto) {

        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.update(objeto);
    }

    public static int excluir(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.delete(objeto);

    }

}
