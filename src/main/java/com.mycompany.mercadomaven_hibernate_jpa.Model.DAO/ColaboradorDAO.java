package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Colaborador;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ColaboradorDAO implements InterfaceDAO<Colaborador> {

    private static ColaboradorDAO instance;
    protected EntityManager entityManager;

    public static ColaboradorDAO getInstance() {
        if (instance == null) {
            instance = new ColaboradorDAO();
        }
        return instance;
    }

    private ColaboradorDAO() {
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
    public void create(Colaborador objeto) {
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
    public Colaborador retrieve(int codigo) {
        Colaborador colaborador;
        colaborador = entityManager.find(Colaborador.class, codigo);
        return colaborador;
    }

    @Override
    public Colaborador retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, login, senha, endereco_id"
                + " FROM colaborador"
                + " WHERE login = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Colaborador colaborador = new Colaborador();

            while (rst.next()) {
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setFone(rst.getString("fone1"));
                colaborador.setFone2(rst.getString("fone2"));
                colaborador.setComplementoEndereco(rst.getString("complementoEndereco"));
                colaborador.setEmail(rst.getString("email"));
                colaborador.setDtCadastro(rst.getString("dataCadastro"));
                colaborador.setObservacao(rst.getString("observacao"));
                colaborador.setStatus(rst.getString("status").charAt(0));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setSenha(rst.getString("senha"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                colaborador.setEndereco(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return colaborador;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public List<Colaborador> retrieve() {
        List<Colaborador> colaboradores;
        colaboradores = entityManager.createQuery("SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status,login, senha, endereco_id FROM colaborador", Colaborador.class).getResultList();
        return colaboradores;
    }

    @Override
    public void update(Colaborador objeto) {
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
    public int delete(Colaborador objeto) {
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


