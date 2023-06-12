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
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao, valorCompra, valorVenda,unidadeCompra, unidadeVenda, fatorConversao, status,dataCadastro, barraEntrada, barraSaida, estoqueMinimo, estoqueMaximo, classe_id, marca_id "
                + " FROM produto"
                + " WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Produto produto = new Produto();

            while (rst.next()) {

                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setValorCompra(rst.getFloat("valorCompra"));
                produto.setValorVenda(rst.getFloat("valorVenda"));
                produto.setUndCompra(rst.getString("unidadeCompra"));
                produto.setUndVenda(rst.getString("unidadeVenda"));
                produto.setFatorConversao(rst.getInt("fatorConversao"));
                produto.setStatus(rst.getString("status").charAt(0));
                produto.setDataCadastro(rst.getString("dataCadastro"));
                produto.setBarraEntrada(rst.getString("barraEntrada"));
                produto.setBarraSaida(rst.getString("barraSaida"));
                produto.setEstoqueMinimo(rst.getFloat("estoqueMinimo"));
                produto.setEstoqueMaximo(rst.getFloat("estoqueMaximo"));

                Classe classe = new Classe();
                ClasseDAO classeDAO = new ClasseDAO();
                classe = classeDAO.retrieve(rst.getInt("classe_id"));
                produto.setClasse(classe);

                Marca marca = new Marca();
                MarcaDAO marcaDAO = new MarcaDAO();
                marca = marcaDAO.retrieve(rst.getInt("marca_id"));
                produto.setMarca(marca);
            }
            ConnectionFactory.closeConnection(conexao, pstm);
            return produto;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }

    }

    @Override
    public List<Produto> retrieve() {
        List<Produto> produtos;
        produtos = entityManager.createQuery("SELECT id, descricao, valorCompra, valorVenda,unidadeCompra, unidadeVenda,fatorConversao, status,dataCadastro, barraEntrada, barraSaida, estoqueMinimo, estoqueMaximo, classe_id, marca_id FROM produto", Produto.class).getResultList();
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

}
