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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Daniel
 */
public final class FoCadastroFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form ClasseExcluir
     *
     * @throws java.text.ParseException
     */
    public FoCadastroFornecedor() throws ParseException {

        initComponents();
        
        MaskFormatter maskCNPJ = new MaskFormatter("##.###.###/####-##");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        MaskFormatter maskTelefone1 = new MaskFormatter("(##) #####-####");
        MaskFormatter maskTelefone2 = new MaskFormatter("(##) #####-####");
      

        maskCPF.install(ftfCPF);
        maskTelefone1.install(ftfTelefone1);
        maskTelefone2.install(ftfTelefone2);
        maskCNPJ.install(ftfCNPJ);
      
    }

    
    public JFormattedTextField getjFtDataCadastro() {
        return jFtDataCadastro;
    }

    public void setjFtDataCadastro(JFormattedTextField jFtDataCadastro) {
        this.jFtDataCadastro = jFtDataCadastro;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextField getTfContato() {
        return tfContato;
    }

    public void setTfContato(JTextField tfContato) {
        this.tfContato = tfContato;
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

    public JComboBox<String> getjCbCep() {
        return jCbCep;
    }

    public void setjCbCep(JComboBox<String> jCbCep) {
        this.jCbCep = jCbCep;
    }

    public JButton getjBtCadCep() {
        return jBtCadCep;
    }

    public void setjBtCadCep(JButton jBtCadCep) {
        this.jBtCadCep = jBtCadCep;
    }

    public JFormattedTextField getFtfCNPJ() {
        return ftfCNPJ;
    }

    public void setFtfCNPJ(JFormattedTextField ftfCNPJ) {
        this.ftfCNPJ = ftfCNPJ;
    }

    public JFormattedTextField getFtfCPF() {
        return ftfCPF;
    }

    public void setFtfCPF(JFormattedTextField ftfCPF) {
        this.ftfCPF = ftfCPF;
    }

    public JFormattedTextField getFtfRG() {
        return ftfRG;
    }

    public void setFtfRG(JFormattedTextField ftfRG) {
        this.ftfRG = ftfRG;
    }

    public JFormattedTextField getFtfTelefone1() {
        return ftfTelefone1;
    }

    public void setFtfTelefone1(JFormattedTextField ftfTelefone1) {
        this.ftfTelefone1 = ftfTelefone1;
    }

    public JFormattedTextField getFtfTelefone2() {
        return ftfTelefone2;
    }

    public void setFtfTelefone2(JFormattedTextField ftfTelefone2) {
        this.ftfTelefone2 = ftfTelefone2;
    }

    public JPanel getPnEndereco() {
        return pnEndereco;
    }

    public void setPnEndereco(JPanel pnEndereco) {
        this.pnEndereco = pnEndereco;
    }

    
    public JTextField getjTextFieldIdCadFornecedor() {
        return jTextFieldIdCadFornecedor;
    }

    public void setjTextFieldIdCadFornecedor(JTextField jTextFieldIdCadFornecedor) {
        this.jTextFieldIdCadFornecedor = jTextFieldIdCadFornecedor;
    }

    public JPanel getPnCentro() {
        return pnCentro;
    }

    public void setPnCentro(JPanel pnCentro) {
        this.pnCentro = pnCentro;
    }

    public JTextField getTfBairro() {
        return tfBairro;
    }

    public void setTfBairro(JTextField tfBairro) {
        this.tfBairro = tfBairro;
    }

    public JTextField getTfCidade() {
        return tfCidade;
    }

    public void setTfCidade(JTextField tfCidade) {
        this.tfCidade = tfCidade;
    }

    public JTextField getTfComplemento() {
        return tfComplemento;
    }

    public void setTfComplemento(JTextField tfComplemento) {
        this.tfComplemento = tfComplemento;
    }

    public JTextField getTfEmail() {
        return tfEmail;
    }

    public void setTfEmail(JTextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    public JTextField getTfInscricaoEst() {
        return tfInscricaoEst;
    }

    public void setTfInscricaoEst(JTextField tfInscricaoEst) {
        this.tfInscricaoEst = tfInscricaoEst;
    }

    public JTextField getTfLogradouro() {
        return tfLogradouro;
    }

    public void setTfLogradouro(JTextField tfLogradouro) {
        this.tfLogradouro = tfLogradouro;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public JTextField getTfRazaoSocial() {
        return tfRazaoSocial;
    }

    public void setTfRazaoSocial(JTextField tfRazaoSocial) {
        this.tfRazaoSocial = tfRazaoSocial;
    }

    public JRadioButton getRbAtivo() {
        return rbAtivo;
    }

    public void setRbAtivo(JRadioButton rbAtivo) {
        this.rbAtivo = rbAtivo;
    }

    public JRadioButton getRbInativo() {
        return rbInativo;
    }

    public void setRbInativo(JRadioButton rbInativo) {
        this.rbInativo = rbInativo;
    }

    public JButton getBtDeletar() {
        return btDeletar;
    }

    public void setBtDeletar(JButton btDeletar) {
        this.btDeletar = btDeletar;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnCentro = new javax.swing.JPanel();
        jLabelNomeCadFornecedor = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        tfRazaoSocial = new javax.swing.JTextField();
        jLabelCPFCadFornecedor = new javax.swing.JLabel();
        jLabelCNPJCadFornecedor = new javax.swing.JLabel();
        jLabelRGCadFornecedor = new javax.swing.JLabel();
        jLabelInscrEstadual = new javax.swing.JLabel();
        tfInscricaoEst = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabeTel2CadFornecedor = new javax.swing.JLabel();
        jLabelEmailCadFornecedor = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabelOBSCadFornecedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnEndereco = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelCidadeCadFornecedor = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabellLogradouroCadFornecedor = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        jLabelComplementoCadFornecedor = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        jCbCep = new javax.swing.JComboBox<>();
        jBtCadCep = new javax.swing.JButton();
        ftfCPF = new javax.swing.JFormattedTextField();
        ftfRG = new javax.swing.JFormattedTextField();
        ftfCNPJ = new javax.swing.JFormattedTextField();
        ftfTelefone1 = new javax.swing.JFormattedTextField();
        ftfTelefone2 = new javax.swing.JFormattedTextField();
        jLabelIDCadFornecedor = new javax.swing.JLabel();
        jTextFieldIdCadFornecedor = new javax.swing.JTextField();
        jLabelStatusCadFornecedor = new javax.swing.JLabel();
        jLabelDataCadstroCadFornecedor = new javax.swing.JLabel();
        rbAtivo = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tfContato = new javax.swing.JTextField();
        jFtDataCadastro = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnCentro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNomeCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeCadFornecedor.setText("Nome* :");

        jLabelRazaoSocial.setText("Razão Social:");

        jLabelCPFCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPFCadFornecedor.setText("CPF* : ");

        jLabelCNPJCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCNPJCadFornecedor.setText("CNPJ* :");

        jLabelRGCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRGCadFornecedor.setText("RG* :");

        jLabelInscrEstadual.setText("Inscrição Estadual:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Telefone 1* :");

        jLabeTel2CadFornecedor.setText("Telefone 2:");

        jLabelEmailCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmailCadFornecedor.setText("Email* :");

        jLabelOBSCadFornecedor.setText("Observações:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        pnEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("CEP* :");

        jLabelCidadeCadFornecedor.setText("Cidade:");

        tfCidade.setEditable(false);

        jLabelBairro.setText("Bairro:");

        tfBairro.setEditable(false);

        jLabellLogradouroCadFornecedor.setText("Logradouro: ");

        tfLogradouro.setEditable(false);

        jLabelComplementoCadFornecedor.setText("Complemento:");

        jCbCep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBtCadCep.setText("+");

        javax.swing.GroupLayout pnEnderecoLayout = new javax.swing.GroupLayout(pnEndereco);
        pnEndereco.setLayout(pnEnderecoLayout);
        pnEnderecoLayout.setHorizontalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(jCbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtCadCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabellLogradouroCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jLabelCidadeCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComplementoCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnEnderecoLayout.setVerticalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabelCidadeCadFornecedor)
                    .addComponent(jLabellLogradouroCadFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtCadCep)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelComplementoCadFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabelIDCadFornecedor.setText("ID:");

        jLabelStatusCadFornecedor.setText("Status:");

        jLabelDataCadstroCadFornecedor.setText("Data Cadastro : ");

        buttonGroup1.add(rbAtivo);
        rbAtivo.setSelected(true);
        rbAtivo.setText("Ativo");

        buttonGroup1.add(rbInativo);
        rbInativo.setText("Inativo");

        jLabel2.setText("Contato");

        jFtDataCadastro.setEditable(false);

        javax.swing.GroupLayout pnCentroLayout = new javax.swing.GroupLayout(pnCentro);
        pnCentro.setLayout(pnCentroLayout);
        pnCentroLayout.setHorizontalGroup(
            pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(tfContato))
                        .addGap(18, 18, 18)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOBSCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfInscricaoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCentroLayout.createSequentialGroup()
                                .addComponent(ftfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ftfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPFCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRGCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCentroLayout.createSequentialGroup()
                                .addComponent(ftfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabeTel2CadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCNPJCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCentroLayout.createSequentialGroup()
                                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCentroLayout.createSequentialGroup()
                                        .addComponent(jLabelIDCadFornecedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldIdCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabelStatusCadFornecedor))
                                    .addComponent(jLabelNomeCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCentroLayout.createSequentialGroup()
                                .addComponent(jLabelDataCadstroCadFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFtDataCadastro))
                            .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelEmailCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCentroLayout.setVerticalGroup(
            pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDCadFornecedor)
                    .addComponent(jTextFieldIdCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatusCadFornecedor)
                    .addComponent(jLabelDataCadstroCadFornecedor)
                    .addComponent(rbAtivo)
                    .addComponent(jFtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeCadFornecedor)
                            .addComponent(jLabelRazaoSocial)))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInativo)))
                .addGap(18, 18, 18)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPFCadFornecedor)
                    .addComponent(jLabelRGCadFornecedor)
                    .addComponent(jLabelCNPJCadFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelOBSCadFornecedor)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelInscrEstadual)
                            .addComponent(jLabel8)
                            .addComponent(jLabeTel2CadFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfInscricaoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmailCadFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        jLabel1.setText("Cadastro de Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                new FoCadastroFornecedor().setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(FoCadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftfCNPJ;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.JFormattedTextField ftfRG;
    private javax.swing.JFormattedTextField ftfTelefone1;
    private javax.swing.JFormattedTextField ftfTelefone2;
    private javax.swing.JButton jBtCadCep;
    private javax.swing.JComboBox<String> jCbCep;
    private javax.swing.JFormattedTextField jFtDataCadastro;
    private javax.swing.JLabel jLabeTel2CadFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCNPJCadFornecedor;
    private javax.swing.JLabel jLabelCPFCadFornecedor;
    private javax.swing.JLabel jLabelCidadeCadFornecedor;
    private javax.swing.JLabel jLabelComplementoCadFornecedor;
    private javax.swing.JLabel jLabelDataCadstroCadFornecedor;
    private javax.swing.JLabel jLabelEmailCadFornecedor;
    private javax.swing.JLabel jLabelIDCadFornecedor;
    private javax.swing.JLabel jLabelInscrEstadual;
    private javax.swing.JLabel jLabelNomeCadFornecedor;
    private javax.swing.JLabel jLabelOBSCadFornecedor;
    private javax.swing.JLabel jLabelRGCadFornecedor;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelStatusCadFornecedor;
    private javax.swing.JLabel jLabellLogradouroCadFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldIdCadFornecedor;
    private javax.swing.JPanel pnCentro;
    private javax.swing.JPanel pnEndereco;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbInativo;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfContato;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfInscricaoEst;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
