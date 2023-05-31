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

public class EnderecoDAO implements InterfaceDAO<Endereco> {

    @Override
    public void create(Endereco objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (logradouro,cep,bairro_id,cidade_id) VALUE(?,?,?,?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getLogradouro());
            pstm.setString(2, objeto.getCep());
            pstm.setInt(3, objeto.getBairro().getId());
            pstm.setInt(4, objeto.getCidade().getId());

            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public Endereco retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, logradouro, cep, bairro_id, cidade_id FROM endereco WHERE id = ?;";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            Endereco endereco = new Endereco();
            Bairro bairro = new Bairro();
            BairroDAO bairroDAO = new BairroDAO();
            Cidade cidade = new Cidade();
            CidadeDAO cidadeDAO = new CidadeDAO();

            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            
            while (rst.next()) {
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setCep(rst.getString("cep"));
                cidade = cidadeDAO.retrieve(rst.getInt("cidade_id"));
                bairro = bairroDAO.retrieve(rst.getInt("bairro_id"));                             
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
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, logradouro, cep, bairro_id, cidade_id FROM endereco;";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Endereco> listaEndereco = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Endereco endereco = new Endereco();
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setCep(rst.getString("cep"));

                Bairro bairro = new Bairro();
                BairroDAO bairroDAO = new BairroDAO();
                Cidade cidade = new Cidade();
                CidadeDAO cidadeDAO = new CidadeDAO();
                
                bairro = bairroDAO.retrieve(rst.getInt("bairro_id"));
                cidade = cidadeDAO.retrieve(rst.getInt("cidade_id"));                
             
                endereco.setBairro(bairro);
                endereco.setCidade(cidade);
                listaEndereco.add(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE endereco SET logradouro = ?, "
                + " cep = ?,"
                + " bairro_id = ?,"
                + " cidade_id = ?"
                + " WHERE id = ?;";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getLogradouro());
            pstm.setString(2, objeto.getCep());
            pstm.setInt(3, objeto.getBairro().getId());
            pstm.setInt(4, objeto.getCidade().getId());
            pstm.setInt(5, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public int delete(Endereco objeto) {

      Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM endereco WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();
            
            ConnectionFactory.closeConnection(conexao, pstm);
            return 0;
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm);
            return -1;
        }
        
    }

}
