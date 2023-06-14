package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import java.sql.Connection;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ConnectionFactory;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cidade;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadastroEndereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnderecoDAO implements InterfaceDAO<Endereco> {

    private static EnderecoDAO instance;
    protected EntityManager entityManager;

    public static EnderecoDAO getInstance() {
        if (instance == null) {
            instance = new EnderecoDAO();
        }
        return instance;
    }

    private EnderecoDAO() {
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
    public void create(Endereco objeto) {
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
    public Endereco retrieve(int codigo) {
        Endereco endereco;
        endereco = entityManager.find(Endereco.class, codigo);
        return endereco;

    }

    @Override
    public Endereco retrieve(String cep) {
        Endereco endereco = entityManager.createQuery("SELECT e FROM endereco e where e.cep = :parCep", Endereco.class).setParameter("parCep",cep).getSingleResult();
        return endereco;
    }

    @Override
    public List<Endereco> retrieve() {
        List<Endereco> enderecos;
        enderecos = entityManager.createQuery("SELECT e FROM endereco e", Endereco.class).getResultList();
        return enderecos;

    }

    @Override
    public void update(Endereco objeto) {

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
    public int delete(Endereco objeto) {

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
