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
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, logradouro, cep, bairro_id, cidade_id FROM endereco WHERE cep = ?;";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, cep);
            rst = pstm.executeQuery();
            Endereco endereco = new Endereco();
            Bairro bairro = new Bairro();
            BairroDAO bairroDAO = new BairroDAO();
            Cidade cidade = new Cidade();
            CidadeDAO cidadeDAO = new CidadeDAO();

            while (rst.next()) {
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setCep(rst.getString("cep"));
                bairro = bairroDAO.retrieve(rst.getInt("bairro_id"));
                cidade = cidadeDAO.retrieve(rst.getInt("cidade_id"));
                endereco.setBairro(bairro);
                endereco.setCidade(cidade);

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;

        } catch (SQLException ex) {

            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;

        }

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
