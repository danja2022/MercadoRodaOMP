
package com.mycompany.mercadomaven_hibernate_jpa.service;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ClienteDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cliente;
import java.util.List;

public class ClienteService {
    public static void criar(Cliente objeto) {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(objeto);
    }

    public static Cliente buscar(int codigo) {
        ClienteDAO clienteDAO = new ClienteDAO();

        return clienteDAO.retrieve(codigo);
    }

    public static Cliente buscar(String descricao) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve(descricao);

    }

    public static List<Cliente> buscar() {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve();

    }

    public static void atualizar(Cliente objeto) {

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(objeto);
    }

    public static int excluir(Cliente objeto) {
          ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.delete(objeto);

    }
}
