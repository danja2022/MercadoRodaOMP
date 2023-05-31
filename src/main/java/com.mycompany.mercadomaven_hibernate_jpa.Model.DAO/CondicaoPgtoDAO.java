package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.CondicaoPgto;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class CondicaoPgtoDAO implements InterfaceDAO<CondicaoPgto> {

    @Override
    public void create(CondicaoPgto objeto) {
        Connection conexao = ConnectionFactory.getConnection();

        String sqlExecutar = "INSERT INTO condicaopagamento (descricaoCondicao, numeroParcelas, diaPrimeiraParcela, "
                + " diaEntreParcela, status)"
                + " VALUE(?,?,?,?,?);";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricaoCondicao());
            pstm.setInt(2, objeto.getNumeroParcelas());
            pstm.setString(3, objeto.getDiasPrimeiraParcela());
            pstm.setInt(4, objeto.getDiaEntreParcela());
            pstm.setString(5, String.valueOf(objeto.getStatus()));

            pstm.executeUpdate();
            ConnectionFactory.closeConnection(conexao, pstm);

        } catch (SQLException ex) {
            Logger.getLogger(CondicaoPgtoDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public CondicaoPgto retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricaoCondicao, numeroParcelas, diaPrimeiraParcela, diaEntreParcela, status "
                + " FROM condicaopagamento"
                + " WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            CondicaoPgto condicaoPgto = new CondicaoPgto();

            while (rst.next()) {
                condicaoPgto.setId(rst.getInt("id"));
                condicaoPgto.setDescricaoCondicao(rst.getString("descricaoCondicao"));
                condicaoPgto.setNumeroParcelas(rst.getInt("numeroParcelas"));
                condicaoPgto.setDiasPrimeiraParcela(rst.getString("diaPrimeiraParcela"));
                condicaoPgto.setDiaEntreParcela(rst.getInt("diaEntreParcela"));
                condicaoPgto.setStatus(rst.getString("status").charAt(0));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return condicaoPgto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public CondicaoPgto retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricaoCondicao, numeroParcelas, diaPrimeiraParcela, diaEntreParcela, status  FROM condicaopagamento WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            CondicaoPgto condicaoPgto = new CondicaoPgto();

            while (rst.next()) {
                condicaoPgto.setId(rst.getInt("id"));
                condicaoPgto.setDescricaoCondicao(rst.getString("descricaoCondicao"));
                condicaoPgto.setNumeroParcelas(rst.getInt("numeroParcelas"));
                condicaoPgto.setDiasPrimeiraParcela(rst.getString("diaPrimeiraParcela"));
                condicaoPgto.setDiaEntreParcela(rst.getInt("diaEntreParcela"));
                condicaoPgto.setStatus(rst.getString("status").charAt(0));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return condicaoPgto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public List<CondicaoPgto> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricaoCondicao, numeroParcelas, diaPrimeiraParcela, diaEntreParcela, status FROM condicaopagamento ";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<CondicaoPgto> listacondicaoPgto = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                CondicaoPgto condicaoPgto = new CondicaoPgto();
                condicaoPgto.setId(rst.getInt("id"));
                condicaoPgto.setDescricaoCondicao(rst.getString("descricaoCondicao"));
                condicaoPgto.setNumeroParcelas(rst.getInt("numeroParcelas"));
                condicaoPgto.setDiasPrimeiraParcela(rst.getString("diaPrimeiraParcela"));
                condicaoPgto.setDiaEntreParcela(rst.getInt("diaEntreParcela"));
                condicaoPgto.setStatus(rst.getString("status").charAt(0));
                listacondicaoPgto.add(condicaoPgto);

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listacondicaoPgto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(CondicaoPgto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE condicaopagamento SET descricaoCondicao = ?, numeroParcelas = ?, diaPrimeiraParcela = ?, diaEntreParcela = ?, status = ?"
                + " WHERE id = ?;";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricaoCondicao());
            pstm.setInt(2, objeto.getNumeroParcelas());
            pstm.setString(3, objeto.getDiasPrimeiraParcela());
            pstm.setInt(4, objeto.getDiaEntreParcela());
            pstm.setString(5, String.valueOf(objeto.getStatus()));
            pstm.setInt(6,objeto.getId());

            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public int delete(CondicaoPgto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM condicaopagamento WHERE id = ?";
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
