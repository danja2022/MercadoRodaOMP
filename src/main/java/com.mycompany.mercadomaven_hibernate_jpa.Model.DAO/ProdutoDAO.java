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

public class ProdutoDAO implements InterfaceDAO<Produto> {

    @Override
    public void create(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();

        String sqlExecutar = "INSERT INTO produto (descricao,status,estoqueMinimo, "
                + "estoqueMaximo,barraEntrada, barraSaida, unidadeCompra, unidadeVenda,  "
                + "valorCompra, valorVenda, fatorConversao, dataCadastro, classe_id, marca_id) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,NOW(),?,?)";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, Character.toString(objeto.getStatus()));
            pstm.setFloat(3, objeto.getEstoqueMinimo());
            pstm.setFloat(4, objeto.getEstoqueMaximo());
            pstm.setString(5, objeto.getBarraEntrada());
            pstm.setString(6, objeto.getBarraSaida());
            pstm.setString(7, objeto.getUndCompra());
            pstm.setString(8, objeto.getUndVenda());
            pstm.setFloat(9, objeto.getValorCompra());
            pstm.setFloat(10, objeto.getValorVenda());
            pstm.setInt(11, objeto.getFatorConversao());
            pstm.setInt(12, objeto.getClasse().getId());
            pstm.setInt(13, objeto.getMarca().getId());
            pstm.executeUpdate();
            ConnectionFactory.closeConnection(conexao, pstm);

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public Produto retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao, valorCompra, valorVenda,unidadeCompra, unidadeVenda, fatorConversao, status,dataCadastro, barraEntrada, barraSaida, estoqueMinimo, estoqueMaximo, classe_id, marca_id "
                + " FROM produto"
                + " WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
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
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao, valorCompra, valorVenda,unidadeCompra, unidadeVenda,"
                + " fatorConversao, status,dataCadastro, barraEntrada, barraSaida, estoqueMinimo, estoqueMaximo,"
                + " classe_id, marca_id "
                + "FROM produto";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Produto> listaProduto = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Produto produto = new Produto();
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

                listaProduto.add(produto);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaProduto;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public void update(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto SET descricao = ?, valorCompra = ?, valorVenda = ?, unidadeCompra = ?, unidadeVenda = ?, "
                + " fatorConversao = ?, status = ?,barraEntrada = ?, barraSaida = ?, estoqueMinimo = ?, estoqueMaximo = ?,"
                + " classe_id = ?, marca_id =? "
                + " WHERE id = ?";
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setFloat(2, objeto.getValorCompra());
            pstm.setFloat(3, objeto.getValorVenda());
            pstm.setString(4, objeto.getUndCompra());
            pstm.setString(5, objeto.getUndVenda());
            pstm.setInt(6, objeto.getFatorConversao());
            pstm.setString(7, Character.toString(objeto.getStatus()));
            pstm.setString(8, objeto.getBarraEntrada());
            pstm.setString(9, objeto.getBarraSaida());
            pstm.setFloat(10, objeto.getEstoqueMinimo());
            pstm.setFloat(11, objeto.getEstoqueMaximo());
            pstm.setInt(12, objeto.getClasse().getId());
            pstm.setInt(13, objeto.getMarca().getId());
            pstm.setInt(14, objeto.getId());

            pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public int delete(Produto objeto) {
            Connection conexao = ConnectionFactory.getConnection();
        int retorno;

        String sqlExecutar = "SET foreign_key_checks = 0;";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm);
        }

        sqlExecutar = "DELETE FROM produto WHERE id = ?";
        pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();
            retorno = 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm);
            return -1;
        }

        sqlExecutar = "SET foreign_key_checks = 1;";
        pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeUpdate();
            return retorno;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm);
            return -1;
        }
        
    }

}
