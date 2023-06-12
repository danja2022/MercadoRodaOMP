package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.CondicaoPgto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CondicaoPgtoDAO implements InterfaceDAO<CondicaoPgto> {

    
    private static CondicaoPgtoDAO instance;
    protected EntityManager entityManager;

    public static CondicaoPgtoDAO getInstance() {
        if (instance == null) {
            instance = new CondicaoPgtoDAO();
        }
        return instance;
    }

    private CondicaoPgtoDAO() {
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
    public void create(CondicaoPgto objeto) {
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
    public CondicaoPgto retrieve(int codigo) {
        CondicaoPgto condicaoPgto;
        condicaoPgto = entityManager.find(CondicaoPgto.class, codigo);
        return condicaoPgto;
    }

    @Override
    public CondicaoPgto retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricaoCondicao, numeroParcelas, diaPrimeiraParcela, diaEntreParcela, status  FROM condicaopagamento WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            CondicaoPgto condicaoPgto = new CondicaoPgto();

            while (rst.next()) {
                condicaoPgto.setId(rst.getInt("id"));
                condicaoPgto.setDescricaoCondicao(rst.getString("descricaoCondicao"));
                condicaoPgto.setNumeroParcelas(rst.getInt("numeroParcelas"));
                condicaoPgto.setDiasPrimeiraParcela(rst.getString("diaPrimeiraParcela"));
                condicaoPgto.setDiaEntreParcela(rst.getInt("diaEntreParcela"));
                condicaoPgto.setStatus(rst.getString("status").charAt(0));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return condicaoPgto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public List<CondicaoPgto> retrieve() {
       List<CondicaoPgto> condicaoPgtos;
        condicaoPgtos = entityManager.createQuery("SELECT cp condicaopagamento cp", CondicaoPgto.class).getResultList();
        return condicaoPgtos;

    }

    @Override
    public void update(CondicaoPgto objeto) {
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
    public int delete(CondicaoPgto objeto) {
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

}
