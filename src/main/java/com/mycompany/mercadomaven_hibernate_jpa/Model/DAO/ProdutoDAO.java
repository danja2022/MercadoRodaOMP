package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Classe;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cliente;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Produto;
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

public class ProdutoDAO implements InterfaceDAO<Produto> {

    private static ProdutoDAO instance;
    protected EntityManager entityManager;

    public static ProdutoDAO getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        return instance;
    }

    private ProdutoDAO() {
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
    public void create(Produto objeto) {
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
    public Produto retrieve(int codigo) {
        Produto produto;
        produto = entityManager.find(Produto.class, codigo);
        return produto;

    }

    @Override
    public Produto retrieve(String descricao) {
        Produto produto = entityManager.createQuery("SELECT p FROM produto p where p.descricao = :parDescricao", Produto.class).setParameter("parDescricao", descricao).getSingleResult();
        return produto;
    }

    @Override
    public List<Produto> retrieve() {
        List<Produto> produtos;
        produtos = entityManager.createQuery("SELECT p FROM produto p", Produto.class).getResultList();
        return produtos;
    }

    @Override
    public void update(Produto objeto) {
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
    public int delete(Produto objeto) {
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


