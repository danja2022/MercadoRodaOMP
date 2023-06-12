package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ConnectionFactory;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    private static ClienteDAO instance;
    protected EntityManager entityManager;

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

    private ClienteDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Mercado_PU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    @Override
    public void create(Cliente objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }

    }

    @Override
    public Cliente retrieve(int codigo) {
        Cliente cliente;
        cliente = entityManager.find(Cliente.class, codigo);
        return cliente;
    }

    @Override
    public Cliente retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complemento, email, dataCadastro, observacao, status, cpf, rg, dataNascimento, endereco_id, sexo "
                + " FROM cliente"
                + " WHERE cpf = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Cliente cliente = new Cliente();

            while (rst.next()) {
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setFone(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setComplementoEndereco(rst.getString("complemento"));
                cliente.setEmail(rst.getString("email"));
                cliente.setDtCadastro(rst.getString("dataCadastro"));
                cliente.setObservacao(rst.getString("observacao"));
                cliente.setStatus(rst.getString("status").charAt(0));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setRg(rst.getString("rg"));
                cliente.setDtNascimento(rst.getString("dataNascimento"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));

                cliente.setEndereco(endereco);
                cliente.setSexo(rst.getString("sexo").charAt(0));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public List<Cliente> retrieve() {
        List<Cliente> clientes;
        clientes = entityManager.createQuery("SELECT id, nome, fone1, fone2, complemento, email, dataCadastro, observacao, status, cpf, rg, dataNascimento, endereco_id, sexo FROM cliente", Cliente.class).getResultList();
        return clientes;
    }

    @Override
    public void update(Cliente objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }

    }

    @Override
    public int delete(Cliente objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
        return -1;
    }

}
