package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Classe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClasseDAO implements InterfaceDAO<Classe> {

    private static ClasseDAO instance;
    protected EntityManager entityManager;

    public static ClasseDAO getInstance() {
        if (instance == null) {
            instance = new ClasseDAO();
        }
        return instance;
    }

    private ClasseDAO() {
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
    public void create(Classe objeto) {
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
    public Classe retrieve(int codigo) {

        Classe classe;
        classe = entityManager.find(Classe.class, codigo);
        return classe;
    }

    @Override
    public Classe retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao FROM classe WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Classe classe = new Classe();

            while (rst.next()) {
                classe.setId(rst.getInt("id"));
                classe.setDescricao(rst.getString("descricao"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return classe;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;

        }
    }

    @Override
    public List<Classe> retrieve() {
        List<Classe> classes;
        classes = entityManager.createQuery("SELECT cc FROM classe cc", Classe.class).getResultList();
        return classes;
    }

    @Override
    public void update(Classe objeto) {
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
    public int delete(Classe objeto) {
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
