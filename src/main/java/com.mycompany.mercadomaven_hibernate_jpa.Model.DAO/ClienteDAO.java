package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ConnectionFactory;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.util.ArrayList;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    @Override
    public void create(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();

        String sqlExecutar = "INSERT INTO cliente (nome, fone1, fone2, "
                + " complemento, email, dataCadastro, observacao, status, CPF, rg, dataNascimento, endereco_id, sexo) "
                + " VALUES(?,?,?,?,?,NOW(),?,?,?,?,?,?,?);";

        // select 
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
            pstm.setString(8, objeto.getCpf());
            pstm.setString(9, objeto.getRg());
            pstm.setString(10, objeto.getDtNascimento());
            pstm.setInt(11, objeto.getEndereco().getId());
            pstm.setString(12, String.valueOf(objeto.getSexo()));
            pstm.executeUpdate();
            ConnectionFactory.closeConnection(conexao, pstm);

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public Cliente retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complemento, email, dataCadastro, observacao, status, cpf, rg, dataNascimento, endereco_id, sexo "
                + " FROM cliente"
                + " WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Cliente cliente = new Cliente();

            while (rst.next()) {
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setFone(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setComplementoEndereco(rst.getString("complemento"));
                cliente.setEmail(rst.getString("email"));
                cliente.setDtCadastro(rst.getString("dataCadastro"));
                cliente.setObservacao(rst.getString("observacao"));
                cliente.setStatus(rst.getString("status").charAt(0));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setRg(rst.getString("rg"));
                cliente.setDtNascimento(rst.getString("dataNascimento"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                cliente.setEndereco(endereco);
                cliente.setSexo(rst.getString("sexo").charAt(0));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public Cliente retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complemento, email, dataCadastro, observacao, status, cpf, rg, dataNascimento, endereco_id, sexo "
                + " FROM cliente"
                + " WHERE cpf = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Cliente cliente = new Cliente();

            while (rst.next()) {
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setFone(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setComplementoEndereco(rst.getString("complemento"));
                cliente.setEmail(rst.getString("email"));
                cliente.setDtCadastro(rst.getString("dataCadastro"));
                cliente.setObservacao(rst.getString("observacao"));
                cliente.setStatus(rst.getString("status").charAt(0));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setRg(rst.getString("rg"));
                cliente.setDtNascimento(rst.getString("dataNascimento"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));

                cliente.setEndereco(endereco);
                cliente.setSexo(rst.getString("sexo").charAt(0));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public List<Cliente> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complemento, email, dataCadastro, observacao, status, cpf, rg, dataNascimento, endereco_id, sexo FROM cliente";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setFone(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setComplementoEndereco(rst.getString("complemento"));
                cliente.setEmail(rst.getString("email"));
                cliente.setDtCadastro(rst.getString("dataCadastro"));
                cliente.setObservacao(rst.getString("observacao"));
                cliente.setStatus(rst.getString("status").charAt(0));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setRg(rst.getString("rg"));
                cliente.setDtNascimento(rst.getString("dataNascimento"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                cliente.setEndereco(endereco);
                cliente.setSexo(rst.getString("sexo").charAt(0));

                listaCliente.add(cliente);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }

    }

    @Override
    public void update(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cliente SET nome = ?, fone1 = ?, fone2 = ?, complemento = ?, email = ?, "
                + " observacao = ?, status = ?, cpf = ?, rg = ?, dataNascimento = ?, endereco_id = ?, sexo = ?"
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
            pstm.setString(8, objeto.getCpf());
            pstm.setString(9, objeto.getRg());
            pstm.setString(10, objeto.getDtNascimento());
            pstm.setInt(11, objeto.getEndereco().getId());
            pstm.setString(12, Character.toString(objeto.getSexo()));
            pstm.setInt(13, objeto.getId());

            pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public int delete(Cliente objeto) {
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

        sqlExecutar = "DELETE FROM cliente WHERE id = ?";
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
