package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    private static FornecedorDAO instance;
    protected EntityManager entityManager;

    public static FornecedorDAO getInstance() {
        if (instance == null) {
            instance = new FornecedorDAO();
        }
        return instance;
    }

    private FornecedorDAO() {
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
    public void create(Fornecedor objeto) {
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
    public Fornecedor retrieve(int codigo) {
        Fornecedor fornecedor;
        fornecedor = entityManager.find(Fornecedor.class, codigo);
        return fornecedor;
    }

    @Override
    public Fornecedor retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, cnpj, cpf, rg,inscEstadual, contato, razaoSocial, endereco_id "
                + " FROM fornecedor"
                + " WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        //1-id, 2-nome, 3-fone1, 4-fone2, 5-complemento, 6-email, 7-dataCadastro, 8-observacao, 9-status, 10-cnpj, 11-cpf, 12-rg,13-inscEstadual, 14-contato, 15-razaoSocial, 16-endereco_id

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Fornecedor fornecedor = new Fornecedor();

            while (rst.next()) {
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setNome(rst.getString("nome"));
                fornecedor.setFone(rst.getString("fone1"));
                fornecedor.setFone2(rst.getString("fone2"));
                fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
                fornecedor.setEmail(rst.getString("email"));
                fornecedor.setDtCadastro(rst.getString("dataCadastro"));
                fornecedor.setObservacao(rst.getString("observacao"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                fornecedor.setCpf(rst.getString("cpf"));
                fornecedor.setRg(rst.getString("rg"));
                fornecedor.setCnpj(rst.getString("cnpj"));
                fornecedor.setInscEstadual(rst.getString("inscEstadual"));
                fornecedor.setContato(rst.getString("contato"));
                fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                fornecedor.setEndereco(endereco);

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public List<Fornecedor> retrieve() {
        List<Fornecedor> fornecedores;
        fornecedores = entityManager.createQuery("SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, cnpj, cpf, rg,inscEstadual, contato, razaoSocial, endereco_id FROM fornecedor", Fornecedor.class).getResultList();
        return fornecedores;
    }

    @Override
    public void update(Fornecedor objeto) {
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
    public int delete(Fornecedor objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
        return -1;
    }

}

