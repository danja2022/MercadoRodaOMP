package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import java.util.List;
import java.sql.Connection;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BairroDAO implements InterfaceDAO<Bairro> {

    private static BairroDAO instance;
    protected EntityManager entityManager;

    public static BairroDAO getInstance() {
        if (instance == null) {
            instance = new BairroDAO();
        }
        return instance;
    }

    private BairroDAO() {
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
    public void create(Bairro objeto) {

        //repassa parametros (teve que criar o prepared statement)
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

    public Bairro retrieve(int codigo) {

        Bairro bairro;
        bairro = entityManager.find(Bairro.class, codigo);
        return bairro;
    }

    @Override // select pela descrição e trás um bairro
    public Bairro retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao FROM bairro WHERE descricao =? ";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Bairro bairro = new Bairro();

            while (rst.next()) {    //essa classe que aumenta quando tem que colocar mais atributos

                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);

            return bairro;

        } catch (SQLException ex) {
            ex.printStackTrace();

            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override //select sem parametros
    public List<Bairro> retrieve() {
        List<Bairro> bairros;
        bairros = entityManager.createQuery("SELECT b FROM bairro b", Bairro.class).getResultList();
        return bairros;
    }

    @Override
    public void update(Bairro objeto) {
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
    public int delete(Bairro objeto) {
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
