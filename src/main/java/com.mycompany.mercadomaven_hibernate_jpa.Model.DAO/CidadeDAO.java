package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import java.sql.Connection;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cidade;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ConnectionFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CidadeDAO implements InterfaceDAO<Cidade> {

    private static CidadeDAO instance;
    protected EntityManager entityManager;

    public static CidadeDAO getInstance() {
        if (instance == null) {
            instance = new CidadeDAO();
        }
        return instance;
    }

    private CidadeDAO() {
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
    public void create(Cidade objeto) {
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
    public Cidade retrieve(int codigo) {
        Cidade cidade;
        cidade = entityManager.find(Cidade.class, codigo);
        return cidade;
    }

    @Override
    public Cidade retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao FROM cidade WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Cidade cidade = new Cidade();

            while (rst.next()) {
                cidade.setId(rst.getInt("id"));
                cidade.setDescricao(rst.getString("descricao"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cidade;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;

        }

    }

    @Override
    public List<Cidade> retrieve() {
        List<Cidade> cidades;
        cidades = entityManager.createQuery("SELECT c FROM  cidade c", Cidade.class).getResultList();
        return cidades;

    }

    @Override
    public void update(Cidade objeto) {
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
    public int delete(Cidade objeto) {
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
