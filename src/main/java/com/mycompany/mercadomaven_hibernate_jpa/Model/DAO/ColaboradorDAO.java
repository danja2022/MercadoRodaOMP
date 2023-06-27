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
    public Colaborador retrieve(String nome) {
        Colaborador colaborador = entityManager.createQuery("SELECT col FROM colaborador col where col.nome = :parNome", Colaborador.class).setParameter("parNome",nome).getSingleResult();
        return colaborador;
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


