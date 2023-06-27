package com.mycompany.mercadomaven_hibernate_jpa.service;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ClienteDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cliente;
import java.util.List;

public class ClienteService {

    public static void criar(Cliente objeto) {
        ClienteDAO.getInstance().create(objeto);

//  ClienteDA clienteDAO = new ClienteDAO();
        // clienteDAO.create(objeto);
    }

    public static Cliente buscar(int codigo) {
        return ClienteDAO.getInstance().retrieve(codigo);
        // ClienteDAO clienteDAO = new ClienteDAO();
        // return clienteDAO.retrieve(codigo);
    }

    public static Cliente buscar(String descricao) {
        return ClienteDAO.getInstance().retrieve(descricao);
        //ClienteDAO clienteDAO = new ClienteDAO();
        // return clienteDAO.retrieve(descricao);

    }

    public static List<Cliente> buscar() {
        return ClienteDAO.getInstance().retrieve();
        // ClienteDAO clienteDAO = new ClienteDAO();
        // return clienteDAO.retrieve();

    }

    public static void atualizar(Cliente objeto) {
        ClienteDAO.getInstance().update(objeto);
        // ClienteDAO clienteDAO = new ClienteDAO();
        //  clienteDAO.update(objeto);
    }

    public static int excluir(Cliente objeto) {
        return ClienteDAO.getInstance().delete(objeto);
        //  ClienteDAO clienteDAO = new ClienteDAO();
        // return clienteDAO.delete(objeto);

    }
}
