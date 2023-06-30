/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mercadomaven_hibernate_jpa.view;

import java.awt.Component;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Daniel
 */
public class FoCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form ClasseExcluir
     */
    public FoCadastroProduto() throws ParseException {
        
        initComponents();
        
       
        
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    
    public JButton getBtBuscar() {
        return btBuscar;
    }

    public void setBtBuscar(JButton btBuscar) {
        this.btBuscar = btBuscar;
    }

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public void setBtCancelar(JButton btCancelar) {
        this.btCancelar = btCancelar;
    }

    public JButton getBtNovo() {
        return btNovo;
    }

    public void setBtNovo(JButton btNovo) {
        this.btNovo = btNovo;
    }

    public JButton getBtSair() {
        return btSair;
    }

    public void setBtSair(JButton btSair) {
        this.btSair = btSair;
    }

    public JButton getBtSalvar() {
        return btSalvar;
    }

    public void setBtSalvar(JButton btSalvar) {
        this.btSalvar = btSalvar;
    }

    public JTextField getjTextFieldBarraEntrada() {
        return jTextFieldBarraEntrada;
    }

    public void setjTextFieldBarraEntrada(JTextField jTextFieldBarraEntrada) {
        this.jTextFieldBarraEntrada = jTextFieldBarraEntrada;
    }

    public JTextField getjTextFieldBarraSaida() {
        return jTextFieldBarraSaida;
    }

    public void setjTextFieldBarraSaida(JTextField jTextFieldBarraSaida) {
        this.jTextFieldBarraSaida = jTextFieldBarraSaida;
    }

    public JFormattedTextField getjFTextFieldDtCadastro() {
        return jFTextFieldDtCadastro;
    }

    public void setjFTextFieldDtCadastro(JFormattedTextField jFTextFieldDtCadastro) {
        this.jFTextFieldDtCadastro = jFTextFieldDtCadastro;
    }

    
    public JTextField getjTextFieldEstoqMax() {
        return jTextFieldEstoqMax;
    }

    public void setjTextFieldEstoqMax(JTextField jTextFieldEstoqMax) {
        this.jTextFieldEstoqMax = jTextFieldEstoqMax;
    }

    public JTextField getjTextFieldEstoqMin() {
        return jTextFieldEstoqMin;
    }

    public void setjTextFieldEstoqMin(JTextField jTextFieldEstoqMin) {
        this.jTextFieldEstoqMin = jTextFieldEstoqMin;
    }

    public JTextField getjTextFieldFatorConversao() {
        return jTextFieldFatorConversao;
    }

    public void setjTextFieldFatorConversao(JTextField jTextFieldFatorConversao) {
        this.jTextFieldFatorConversao = jTextFieldFatorConversao;
    }

    public JTextField getjTextFieldNomeDescProd() {
        return jTextFieldNomeDescProd;
    }

    public void setjTextFieldNomeDescProd(JTextField jTextFieldNomeDescProd) {
        this.jTextFieldNomeDescProd = jTextFieldNomeDescProd;
    }

    public JTextField getjTextFieldUnidadeCompra() {
        return jTextFieldUnidadeCompra;
    }

    public void setjTextFieldUnidadeCompra(JTextField jTextFieldUnidadeCompra) {
        this.jTextFieldUnidadeCompra = jTextFieldUnidadeCompra;
    }

    public JTextField getjTextFieldUnidadeVenda() {
        return jTextFieldUnidadeVenda;
    }

    public void setjTextFieldUnidadeVenda(JTextField jTextFieldUnidadeVenda) {
        this.jTextFieldUnidadeVenda = jTextFieldUnidadeVenda;
    }

    public JTextField getjTextFieldValorCompra() {
        return jTextFieldValorCompra;
    }

    public void setjTextFieldValorCompra(JTextField jTextFieldValorCompra) {
        this.jTextFieldValorCompra = jTextFieldValorCompra;
    }

    public JTextField getjTextFieldValorVenda() {
        return jTextFieldValorVenda;
    }

    public void setjTextFieldValorVenda(JTextField jTextFieldValorVenda) {
        this.jTextFieldValorVenda = jTextFieldValorVenda;
    }

    public JPanel getPnCentro() {
        return pnCentro;
    }

    public void setPnCentro(JPanel pnCentro) {
        this.pnCentro = pnCentro;
    }

    public JLabel getjLabelId() {
        return jLabelId;
    }

    public void setjLabelId(JLabel jLabelId) {
        this.jLabelId = jLabelId;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JRadioButton getjRadioBtAtivo() {
        return jRadioBtAtivo;
    }

    public void setjRadioBtAtivo(JRadioButton jRadioBtAtivo) {
        this.jRadioBtAtivo = jRadioBtAtivo;
    }

    public JRadioButton getjRadioBtInativo() {
        return jRadioBtInativo;
    }

    public void setjRadioBtInativo(JRadioButton jRadioBtInativo) {
        this.jRadioBtInativo = jRadioBtInativo;
    }

    public JComboBox<String> getjComboBoxClasse() {
        return jComboBoxClasse;
    }

    public void setjComboBoxClasse(JComboBox<String> jComboBoxClasse) {
        this.jComboBoxClasse = jComboBoxClasse;
    }

    public JComboBox<String> getjComboBoxMarca() {
        return jComboBoxMarca;
    }

    public void setjComboBoxMarca(JComboBox<String> jComboBoxMarca) {
        this.jComboBoxMarca = jComboBoxMarca;
    }

    public JButton getBtCadClasse() {
        return btCadClasse;
    }

    public void setBtCadClasse(JButton btCadClasse) {
        this.btCadClasse = btCadClasse;
    }

    public JButton getBtCadMarca() {
        return btCadMarca;
    }

    public void setBtCadMarca(JButton btCadMarca) {
        this.btCadMarca = btCadMarca;
    }

    public JButton getBtDeletar() {
        return btDeletar;
    }

    public void setBtDeletar(JButton btDeletar) {
        this.btDeletar = btDeletar;
    }
    
    
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnCentro = new javax.swing.JPanel();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxClasse = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabelDescri = new javax.swing.JLabel();
        jTextFieldNomeDescProd = new javax.swing.JTextField();
        jLabelEstoqMinimo = new javax.swing.JLabel();
        jLabelEstoqMaximo = new javax.swing.JLabel();
        jLabelBarraEntrada = new javax.swing.JLabel();
        jLabelBarraSaida = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelUnidadeCompra = new javax.swing.JLabel();
        jTextFieldEstoqMin = new javax.swing.JTextField();
        jTextFieldEstoqMax = new javax.swing.JTextField();
        jTextFieldBarraSaida = new javax.swing.JTextField();
        jTextFieldUnidadeCompra = new javax.swing.JTextField();
        jLabelUnidadeVenda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUnidadeVenda = new javax.swing.JTextField();
        jLabelValorCompra = new javax.swing.JLabel();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jLabelValorVenda = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jLabelFatorConversao = new javax.swing.JLabel();
        jTextFieldFatorConversao = new javax.swing.JTextField();
        jTextFieldBarraEntrada = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jRadioBtAtivo = new javax.swing.JRadioButton();
        jRadioBtInativo = new javax.swing.JRadioButton();
        btCadClasse = new javax.swing.JButton();
        btCadMarca = new javax.swing.JButton();
        jFTextFieldDtCadastro = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnCentro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelDataCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDataCadastro.setText("Data Cadastro:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Classe:");

        jComboBoxClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Marca:");

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDescri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDescri.setText("Descrição* :");

        jTextFieldNomeDescProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDescProdActionPerformed(evt);
            }
        });

        jLabelEstoqMinimo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEstoqMinimo.setText("Estoque Mínimo: ");

        jLabelEstoqMaximo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEstoqMaximo.setText("Estoque Máximo:");

        jLabelBarraEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBarraEntrada.setText("Barra Entrada:");

        jLabelBarraSaida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBarraSaida.setText("Barra Saída:");

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelStatus.setText("Status:");

        jLabelUnidadeCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUnidadeCompra.setText("Unidade Compra:");

        jTextFieldUnidadeCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUnidadeCompraActionPerformed(evt);
            }
        });

        jLabelUnidadeVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUnidadeVenda.setText("Unidade Venda:");

        jLabelValorCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorCompra.setText("Valor Compra* :");

        jLabelValorVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorVenda.setText("Valor Venda* :");

        jLabelFatorConversao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelFatorConversao.setText("Fator Conversão:");

        jLabelId.setText("Id:");

        buttonGroup1.add(jRadioBtAtivo);
        jRadioBtAtivo.setSelected(true);
        jRadioBtAtivo.setText("Ativo");

        buttonGroup1.add(jRadioBtInativo);
        jRadioBtInativo.setText("Inativo");

        btCadClasse.setText("+");

        btCadMarca.setText("+");
        btCadMarca.setToolTipText("");

        jFTextFieldDtCadastro.setEditable(false);

        javax.swing.GroupLayout pnCentroLayout = new javax.swing.GroupLayout(pnCentro);
        pnCentro.setLayout(pnCentroLayout);
        pnCentroLayout.setHorizontalGroup(
            pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCentroLayout.createSequentialGroup()
                                .addComponent(jLabelEstoqMinimo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnCentroLayout.createSequentialGroup()
                                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCentroLayout.createSequentialGroup()
                                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDescri)
                                            .addComponent(jLabelUnidadeCompra)
                                            .addComponent(jLabelValorCompra)
                                            .addGroup(pnCentroLayout.createSequentialGroup()
                                                .addComponent(jLabelId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)
                                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldUnidadeCompra, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEstoqMin, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldBarraEntrada)
                                            .addGroup(pnCentroLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btCadClasse))
                                            .addComponent(jTextFieldNomeDescProd, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                                    .addComponent(jLabelBarraEntrada)
                                    .addGroup(pnCentroLayout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jTextFieldFatorConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCentroLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDataCadastro)
                                            .addComponent(jLabelStatus)
                                            .addComponent(jLabelValorVenda)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabelUnidadeVenda)
                                            .addComponent(jLabelBarraSaida))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEstoqMaximo)))))
                        .addGap(5, 5, 5))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCentroLayout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(jLabel5))
                            .addComponent(jLabelFatorConversao))
                        .addGap(156, 156, 156)))
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCadMarca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldUnidadeVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBarraSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioBtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEstoqMax, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioBtInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFTextFieldDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnCentroLayout.setVerticalGroup(
            pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadClasse)
                    .addComponent(btCadMarca))
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStatus)
                            .addComponent(jLabelDescri)))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioBtAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBtInativo)))
                .addGap(24, 24, 24)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstoqMinimo)
                    .addComponent(jTextFieldEstoqMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstoqMaximo)
                    .addComponent(jTextFieldEstoqMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBarraEntrada)
                    .addComponent(jTextFieldBarraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBarraSaida)
                    .addComponent(jTextFieldBarraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUnidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUnidadeCompra)
                            .addComponent(jLabelUnidadeVenda)
                            .addComponent(jTextFieldUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabelValorCompra))
                    .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelValorVenda)
                        .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFatorConversao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFatorConversao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataCadastro)
                            .addComponent(jFTextFieldDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mercadomaven_hibernate_jpa/imagens/Create.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setActionCommand("0");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel4.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mercadomaven_hibernate_jpa/imagens/Download.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setActionCommand("1");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(btSalvar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mercadomaven_hibernate_jpa/imagens/Cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setActionCommand("1");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btCancelar);

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mercadomaven_hibernate_jpa/imagens/Eye.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setActionCommand("0");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btBuscar);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mercadomaven_hibernate_jpa/imagens/Exit.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setActionCommand("0");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel4.add(btSair);

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/mercadomaven_hibernate_jpa/imagens/Bomb.png"))); // NOI18N
        btDeletar.setText("Deletar");
        btDeletar.setActionCommand("1");
        btDeletar.setEnabled(false);
        jPanel4.add(btDeletar);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
       
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
      
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    }//GEN-LAST:event_btSairActionPerformed

    private void jTextFieldUnidadeCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUnidadeCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUnidadeCompraActionPerformed

    private void jTextFieldNomeDescProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDescProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDescProdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoCadBairroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoCadBairroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoCadBairroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoCadBairroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FoCadastroProduto().setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(FoCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadClasse;
    private javax.swing.JButton btCadMarca;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxClasse;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JFormattedTextField jFTextFieldDtCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBarraEntrada;
    private javax.swing.JLabel jLabelBarraSaida;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelDescri;
    private javax.swing.JLabel jLabelEstoqMaximo;
    private javax.swing.JLabel jLabelEstoqMinimo;
    private javax.swing.JLabel jLabelFatorConversao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelUnidadeCompra;
    private javax.swing.JLabel jLabelUnidadeVenda;
    private javax.swing.JLabel jLabelValorCompra;
    private javax.swing.JLabel jLabelValorVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioBtAtivo;
    private javax.swing.JRadioButton jRadioBtInativo;
    private javax.swing.JTextField jTextFieldBarraEntrada;
    private javax.swing.JTextField jTextFieldBarraSaida;
    private javax.swing.JTextField jTextFieldEstoqMax;
    private javax.swing.JTextField jTextFieldEstoqMin;
    private javax.swing.JTextField jTextFieldFatorConversao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeDescProd;
    private javax.swing.JTextField jTextFieldUnidadeCompra;
    private javax.swing.JTextField jTextFieldUnidadeVenda;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JTextField jTextFieldValorVenda;
    private javax.swing.JPanel pnCentro;
    // End of variables declaration//GEN-END:variables
}
