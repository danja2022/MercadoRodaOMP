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
        Fornecedor fornecedor = entityManager.createQuery("SELECT f FROM fornecedor f where f.descricao = :parDescricao", Fornecedor.class).setParameter("parDescricao",descricao).getSingleResult();
        return fornecedor;
    }

    @Override
    public List<Fornecedor> retrieve() {
        List<Fornecedor> fornecedores;
        fornecedores = entityManager.createQuery("SELECT f FROM fornecedor f", Fornecedor.class).getResultList();
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

