package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//teste

public class MarcaDAO implements InterfaceDAO<Marca> {

    private static MarcaDAO instance;
    protected EntityManager entityManager;

    public static MarcaDAO getInstance() {
        if (instance == null) {
            instance = new MarcaDAO();
        }
        return instance;
    }

    private MarcaDAO() {
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
    public void create(Marca objeto) {
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
    public Marca retrieve(int codigo) {
       
        Marca marca;
        marca = entityManager.find(Marca.class, codigo);
        return marca;
    }

    @Override
    public Marca retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao FROM marca WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Marca marca = new Marca();

            while (rst.next()) {
                marca.setId(rst.getInt("id"));
                marca.setDescricao(rst.getString("descricao"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return marca;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;

        }
    }

    @Override
    public List<Marca> retrieve() {
         List<Marca> marcas;
        marcas = entityManager.createQuery("SELECT m FROM marca m", Marca.class).getResultList();
        return marcas;
    }

    @Override
    public void update(Marca objeto) {
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
    public int delete(Marca objeto) {
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


