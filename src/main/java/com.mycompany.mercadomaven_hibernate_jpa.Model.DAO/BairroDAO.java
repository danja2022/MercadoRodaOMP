package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import java.util.List;
import java.sql.Connection;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BairroDAO implements InterfaceDAO<Bairro> {

    @Override
    public void create(Bairro objeto) {
        //solicitar uma conexão
        //tipo      objeto     classe          pega conexão
        Connection conexao = ConnectionFactory.getConnection();
        // montar o sql
        String sqlExecutar = "INSERT INTO bairro (descricao) VALUES(?)"; //inserir dados na tabela
        //jdbc stateman ou preparetostateman
        //criar aplicação
        PreparedStatement pstm = null;

        //repassa parametros (teve que criar o prepared statement)
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao()); //caso tenha mais parametros vai ter mais parametros, se tiver chave estrangeira. Preciasaremos chamar um dao para depois definir.
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        //encerrar conexão
        ConnectionFactory.closeConnection(conexao, pstm);
    }
    
    @Override

    public Bairro retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao from bairro WHERE id = ? ";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Bairro bairro = new Bairro();

            while (rst.next()) {    //essa classe que aumenta quando tem que colocar mais atributos

                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);

            return bairro;

        } catch (SQLException ex) {

            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override // select pela descrição e trás um bairro
    public Bairro retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao FROM bairro WHERE descricao =? ";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Bairro bairro = new Bairro();

            while (rst.next()) {    //essa classe que aumenta quando tem que colocar mais atributos

                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);

            return bairro;

        } catch (SQLException ex) {
            ex.printStackTrace();
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override //select sem parametros
    public List<Bairro> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao FROM bairro";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Bairro> listaBairro = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {

                Bairro bairro = new Bairro();
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
                listaBairro.add(bairro);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;

        } catch (SQLException ex) {
            ex.printStackTrace();
          
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Bairro objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE bairro SET descricao = ?  WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setInt(2, objeto.getId());
            pstm.executeUpdate();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public int delete(Bairro objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM bairro WHERE id = ?";
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
