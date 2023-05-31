package com.mycompany.mercadomaven_hibernate_jpa.Model.DAO;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    @Override
    public void create(Fornecedor objeto) {
        Connection conexao = ConnectionFactory.getConnection();

        String sqlExecutar = "INSERT INTO fornecedor (nome, fone1, fone2, "
                + " complementoEndereco, email, dataCadastro, observacao, status, cpf, rg, cnpj, inscEstadual, contato, razaoSocial, endereco_id) "
                + " VALUES(?,?,?,?,?,NOW(),?,?,?,?,?,?,?,?,?);";

        /* 1-nome, 2-fone1, 3-fone2, "
                + " 4-complemento, 5-email, 6-observacao, 7-status, 8-cpf, 9-rg, 10-cnpj, 11-inscEstadual, 12-contato, 13-razaoSocial, 14-endereco_id*/
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
            pstm.setString(10, objeto.getCnpj());
            pstm.setString(11, objeto.getInscEstadual());
            pstm.setString(12, objeto.getContato());
            pstm.setString(13, objeto.getRazaoSocial());
            pstm.setInt(14, objeto.getEndereco().getId());
            pstm.executeUpdate();
            ConnectionFactory.closeConnection(conexao, pstm);

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public Fornecedor retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, cnpj, cpf, rg,inscEstadual, contato, razaoSocial, endereco_id"
                + " FROM fornecedor"
                + " WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        //1-id, 2-nome, 3-fone1, 4-fone2, 5-complemento, 6-email, 7-dataCadastro, 8-observacao, 9-status, 10-cnpj, 11-cpf, 12-rg,13-inscEstadual, 14-contato, 15-razaoSocial, 16-endereco_id
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Fornecedor fornecedor = new Fornecedor();

            while (rst.next()) {
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setNome(rst.getString("nome"));
                fornecedor.setFone(rst.getString("fone1"));
                fornecedor.setFone2(rst.getString("fone2"));
                fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
                fornecedor.setEmail(rst.getString("email"));
                fornecedor.setDtCadastro(rst.getString("dataCadastro"));
                fornecedor.setObservacao(rst.getString("observacao"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                fornecedor.setCpf(rst.getString("cpf"));
                fornecedor.setRg(rst.getString("rg"));
                fornecedor.setCnpj(rst.getString("cnpj"));
                fornecedor.setInscEstadual(rst.getString("inscEstadual"));
                fornecedor.setContato(rst.getString("contato"));
                fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                fornecedor.setEndereco(endereco);

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public Fornecedor retrieve(String descricao) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, cnpj, cpf, rg,inscEstadual, contato, razaoSocial, endereco_id "
                + " FROM fornecedor"
                + " WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        //1-id, 2-nome, 3-fone1, 4-fone2, 5-complemento, 6-email, 7-dataCadastro, 8-observacao, 9-status, 10-cnpj, 11-cpf, 12-rg,13-inscEstadual, 14-contato, 15-razaoSocial, 16-endereco_id
         
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Fornecedor fornecedor = new Fornecedor();

            while (rst.next()) {
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setNome(rst.getString("nome"));
                fornecedor.setFone(rst.getString("fone1"));
                fornecedor.setFone2(rst.getString("fone2"));
                fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
                fornecedor.setEmail(rst.getString("email"));
                fornecedor.setDtCadastro(rst.getString("dataCadastro"));
                fornecedor.setObservacao(rst.getString("observacao"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                fornecedor.setCpf(rst.getString("cpf"));
                fornecedor.setRg(rst.getString("rg"));
                fornecedor.setCnpj(rst.getString("cnpj"));
                fornecedor.setInscEstadual(rst.getString("inscEstadual"));
                fornecedor.setContato(rst.getString("contato"));
                fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                fornecedor.setEndereco(endereco);

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            ConnectionFactory.closeConnection(conexao, pstm);
            return null;
        }
    }

    @Override
    public List<Fornecedor> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status, cnpj, cpf, rg,inscEstadual, contato, razaoSocial, endereco_id FROM fornecedor";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Fornecedor> listaFornecedor = new ArrayList<>();
         
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setNome(rst.getString("nome"));
                fornecedor.setFone(rst.getString("fone1"));
                fornecedor.setFone2(rst.getString("fone2"));
                fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
                fornecedor.setEmail(rst.getString("email"));
                fornecedor.setDtCadastro(rst.getString("dataCadastro"));
                fornecedor.setObservacao(rst.getString("observacao"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                fornecedor.setCpf(rst.getString("cpf"));
                fornecedor.setRg(rst.getString("rg"));
                fornecedor.setCnpj(rst.getString("cnpj"));
                fornecedor.setInscEstadual(rst.getString("inscEstadual"));
                fornecedor.setContato(rst.getString("contato"));
                fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
                Endereco endereco = new Endereco();
                EnderecoDAO enderecoDAO = new EnderecoDAO();
                endereco = enderecoDAO.retrieve(rst.getInt("endereco_id"));
                fornecedor.setEndereco(endereco);

                listaFornecedor.add(fornecedor);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;

        } catch (SQLException ex) {
       Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                ConnectionFactory.closeConnection(conexao, pstm);
                return null;
            }
        }

        @Override
        public void update
        (Fornecedor objeto
            
        
            ) {
        Connection conexao = ConnectionFactory.getConnection();
            String sqlExecutar = "UPDATE fornecedor SET nome = ?, fone1 = ?, fone2 = ?, complementoEndereco = ?, email = ?, "
                    + " observacao = ?, status = ?, cpf = ?, rg = ?,cnpj = ?, inscEstadual = ?, contato = ?, razaoSocial = ?, endereco_id = ?"
                    + " WHERE id = ?";
            PreparedStatement pstm = null;
            //1-nome, 2-fone1, 3-fone2, 4-complemento, 5-email, 6-observacao, 7-status, 8-cpf, 9-rg, 10-cnpj,11-inscEstadual, 12-contato, 13-razaoSocial, 14-endereco_id, 15-id
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
                pstm.setString(10, objeto.getCnpj());
                pstm.setString(11, objeto.getInscEstadual());
                pstm.setString(12, objeto.getContato());
                pstm.setString(13, objeto.getRazaoSocial());
                pstm.setInt(14, objeto.getEndereco().getId());
                pstm.setInt(15, objeto.getId());

                pstm.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                ConnectionFactory.closeConnection(conexao, pstm);
            }
        }

        @Override
        public int delete
        (Fornecedor objeto
            
        
            ) {
        Connection conexao = ConnectionFactory.getConnection();
            String sqlExecutar = "DELETE FROM fornecedor WHERE id = ?";
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
