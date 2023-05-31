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

public class ColaboradorDAO implements InterfaceDAO<Colaborador> {

    @Override
    public void create(Colaborador objeto) {
        Connection conexao = ConnectionFactory.getConnection();

        String sqlExecutar = "INSERT INTO colaborador (nome, fone1, fone2, "
                + " complementoEndereco, email, dataCadastro, observacao, status, login, senha, endereco_id) "
                + " VALUES(?,?,?,?,?,NOW(),?,?,?,?,?);";

        // 1-nome, 2-fone1, 3-fone2,4-complementoEndereco, 5-email, 6-observacao, 7-status, 8-login, 9-senha, 10-endereco_id)
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setString(6, objeto.getObservacao());
            pstm.setString(7, String.valueOf(objeto.getStatus()));
            pstm.setString(8, objeto.getLogin());
            pstm.setString(9, objeto.getSenha());
            pstm.setInt(10, objeto.getEndereco().getId());
            pstm.executeUpdate();
            ConnectionFactory.closeConnection(conexao, pstm);

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public Colaborador retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, login, senha, endereco_id"
                + " FROM colaborador"
                + " WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Colaborador colaborador = new Colaborador();

            while (rst.next()) {
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setFone(rst.getString("fone1"));
                colaborador.setFone2(rst.getString("fone2"));
                colaborador.setComplementoEndereco(rst.getString("complementoEndereco"));
                colaborador.setEmail(rst.getString("email"));
                colaborador.setDtCadastro(rst.getString("dataCadastro"));
                colaborador.setObservacao(rst.getString("observacao"));
                colaborador.setStatus(rst.getString("status").charAt(0));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setSenha(rst.getString("senha"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                colaborador.setEndereco(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return colaborador;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public Colaborador retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, login, senha, endereco_id"
                + " FROM colaborador"
                + " WHERE login = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Colaborador colaborador = new Colaborador();

            while (rst.next()) {
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setFone(rst.getString("fone1"));
                colaborador.setFone2(rst.getString("fone2"));
                colaborador.setComplementoEndereco(rst.getString("complementoEndereco"));
                colaborador.setEmail(rst.getString("email"));
                colaborador.setDtCadastro(rst.getString("dataCadastro"));
                colaborador.setObservacao(rst.getString("observacao"));
                colaborador.setStatus(rst.getString("status").charAt(0));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setSenha(rst.getString("senha"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                colaborador.setEndereco(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return colaborador;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public List<Colaborador> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status,login, senha, endereco_id FROM colaborador";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Colaborador> listaColaborador = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setFone(rst.getString("fone1"));
                colaborador.setFone2(rst.getString("fone2"));
                colaborador.setComplementoEndereco(rst.getString("complementoEndereco"));
                colaborador.setEmail(rst.getString("email"));
                colaborador.setDtCadastro(rst.getString("dataCadastro"));
                colaborador.setObservacao(rst.getString("observacao"));
                colaborador.setStatus(rst.getString("status").charAt(0));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setSenha(rst.getString("senha"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                colaborador.setEndereco(endereco);

                listaColaborador.add(colaborador);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaColaborador;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public void update(Colaborador objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE colaborador SET nome = ?, fone1 = ?, fone2 = ?, complementoEndereco = ?, email = ?, "
                + " observacao = ?, status = ?,login = ?, senha = ?, endereco_id = ?"
                + " WHERE id = ?";
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setString(6, objeto.getObservacao());
            pstm.setString(7, Character.toString(objeto.getStatus()));
            pstm.setString(8, objeto.getLogin());
            pstm.setString(9, objeto.getSenha());
            pstm.setInt(10, objeto.getEndereco().getId());
            pstm.setInt(11, objeto.getId());

            pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public int delete(Colaborador objeto) {
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

        sqlExecutar = "DELETE FROM colaborador WHERE id = ?";
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
