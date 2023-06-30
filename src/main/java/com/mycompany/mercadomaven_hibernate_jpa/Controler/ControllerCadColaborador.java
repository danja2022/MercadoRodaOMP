package com.mycompany.mercadomaven_hibernate_jpa.Controler;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.BairroDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ColaboradorDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.EnderecoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Colaborador;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_hibernate_jpa.service.ColaboradorService;
import com.mycompany.mercadomaven_hibernate_jpa.service.EnderecoService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaColaborador;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadastroColaborador;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadastroEndereco;
import com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaEndereco;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerCadColaborador implements ActionListener {

    FoCadastroColaborador telacadColaborador;

    public ControllerCadColaborador(FoCadastroColaborador partelacadColaborador) {
        this.telacadColaborador = partelacadColaborador;

        telacadColaborador.getBtBuscar().addActionListener(this);
        telacadColaborador.getBtCancelar().addActionListener(this);
        telacadColaborador.getBtSalvar().addActionListener(this);
        telacadColaborador.getBtNovo().addActionListener(this);
        telacadColaborador.getBtSair().addActionListener(this);
        telacadColaborador.getBtCadCep().addActionListener(this);
        telacadColaborador.getjCbCep().addActionListener(this);
        telacadColaborador.getBtDeletar().addActionListener(this);
        this.setComboBox();
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telacadColaborador.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnCentro());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnEndereco());

    }

    public void atualizaEndereco(int codigo) {
        Endereco endereco = new Endereco();
        endereco = EnderecoService.buscar(codigo);
        telacadColaborador.getjCbCep().setSelectedItem(endereco.getCep());
    }

    public void atualizaCampos(int codigo) {
        Colaborador colaborador = new Colaborador();

        colaborador = ColaboradorService.buscar(codigo);
        Endereco endereco = new Endereco();

        endereco = EnderecoService.buscar(colaborador.getEndereco().getId());
        //Rodrigo Ultils
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telacadColaborador.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telacadColaborador.getPnCentro());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telacadColaborador.getPnEndereco());

        telacadColaborador.gettFId().setText(colaborador.getId() + "");
        if (colaborador.getStatus() == 'A') {
            telacadColaborador.getjRadioBtAtivo().setSelected(true);
        } else {
            telacadColaborador.getjRadioBtInativo().setSelected(true);
        }
        // Do Banco ao Form Data Rodrigo
        DateFormat sdata = new SimpleDateFormat("dd-MM-yyyy");
        telacadColaborador.getFtDataCadastro().setText(sdata.format(colaborador.getDtCadastro()));
        telacadColaborador.getTfNome().setText(colaborador.getNome());
        telacadColaborador.getTfEmail().setText(colaborador.getEmail());
        telacadColaborador.getFtfTelefone1().setText(colaborador.getFone());
        telacadColaborador.getFtfTelefone2().setText(colaborador.getFone2());
        telacadColaborador.getjTextArea1().setText(colaborador.getObservacao());
        telacadColaborador.getTfUsuario().setText(colaborador.getLogin());
        telacadColaborador.getPfSenha().setText(colaborador.getSenha());
        telacadColaborador.getjCbCep().setSelectedItem(endereco.getCep());
        telacadColaborador.getTfComplemento().setText(colaborador.getComplementoEndereco());

    }

    public void setComboBox() {
        List<Endereco> listaEndereco = new ArrayList<>();

        listaEndereco = EnderecoService.buscar();

        telacadColaborador.getjCbCep().removeAllItems();

        for (Endereco endereco : listaEndereco) {
            telacadColaborador.getjCbCep().addItem(endereco.getCep());
        }
    }

    private boolean verificaNumero(String fone) {
        String aFone = "";
        for (int i = 0; i < fone.length(); i++) {
            if ((fone.charAt(i) != '(') && (fone.charAt(i) != ')') && (fone.charAt(i) != '-') && (fone.charAt(i) != ' ')) {
                aFone = aFone + fone.charAt(i);
            }
        }
        return aFone.length() == 11;
    }

    private String dateToString(String data) {
        String aData = "";
        int dia = 8, mes = 5, ano = 0;

        for (int i = dia; i < (dia + 2); i++) {
            aData = aData + data.charAt(i);
        }
        //  aData = aData + '-';
        for (int i = mes; i < (mes + 2); i++) {
            aData = aData + data.charAt(i);
        }
        //   aData = aData + '-';
        for (int i = ano; i < (ano + 4); i++) {
            aData = aData + data.charAt(i);
        }
        return aData;
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telacadColaborador.getBtNovo()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telacadColaborador.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telacadColaborador.getPnCentro());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telacadColaborador.getPnEndereco());
            telacadColaborador.gettFId().setEnabled(false);

        } else if (acao.getSource() == telacadColaborador.getBtCancelar()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telacadColaborador.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnCentro());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnEndereco());
        } else if (acao.getSource() == telacadColaborador.getBtSalvar()) {

            if (telacadColaborador.getTfNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Nome' é obrigatório!");
            } else if (telacadColaborador.getTfEmail().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Email' é obrigatório!");
            } else if (!verificaNumero(telacadColaborador.getFtfTelefone1().getText().trim())) {
                JOptionPane.showMessageDialog(null, "Preencha o telefone 1 corretamente");
            } else if (telacadColaborador.getTfUsuario().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Usuário' é obrigatório!");
            } else if (telacadColaborador.getPfSenha().getPassword() == null) {
                JOptionPane.showMessageDialog(null, "O campo 'Senha' é obrigatório!");
            } else if (telacadColaborador.getPfSenhaConfirm().getPassword() == null) {
                JOptionPane.showMessageDialog(null, "O campo 'Confirme Senha' é obrigatório!");
            } else if (Arrays.equals(telacadColaborador.getPfSenha().getPassword(), telacadColaborador.getPfSenhaConfirm().getPassword())) {
                Colaborador colaborador = new Colaborador();

                colaborador.setNome(telacadColaborador.getTfNome().getText());
                colaborador.setEmail(telacadColaborador.getTfEmail().getText());
                colaborador.setFone(telacadColaborador.getFtfTelefone1().getText());
                colaborador.setObservacao(telacadColaborador.getjTextArea1().getText());
                if (verificaNumero(telacadColaborador.getFtfTelefone2().getText())) {
                    colaborador.setFone2(telacadColaborador.getFtfTelefone2().getText());
                } else {
                    colaborador.setFone2("");
                }

                if (telacadColaborador.getjRadioBtAtivo().isSelected()) {
                    colaborador.setStatus('A');
                } else {
                    colaborador.setStatus('I');
                }
                String strPass = new String(telacadColaborador.getPfSenha().getPassword());
                colaborador.setLogin(telacadColaborador.getTfUsuario().getText());
                colaborador.setSenha(strPass);
                colaborador.setComplementoEndereco(telacadColaborador.getTfComplemento().getText());

                Endereco endereco = new Endereco();

                endereco = EnderecoService.buscar(telacadColaborador.getjCbCep().getSelectedItem().toString());
                colaborador.setEndereco(endereco);
                // Para salvar no banco corretamente Rodrigo
                DateFormat sdata = new SimpleDateFormat("dd-MM-yyyy");
                if (telacadColaborador.getFtDataCadastro().getText().trim().equalsIgnoreCase("")) {
                    
                    Date date = new Date();
                    String strData;
                    strData = sdata.format(date);

                    try {
                        colaborador.setDtCadastro(sdata.parse(strData));
                    } catch (ParseException ex) {
                        Logger.getLogger(ControllerCadColaborador.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }else {
                    try {
                        colaborador.setDtCadastro(sdata.parse(telacadColaborador.getFtDataCadastro().getText()));
                    } catch (ParseException ex) {
                        Logger.getLogger(ControllerCadColaborador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

             

                if (telacadColaborador.gettFId().getText().trim().equalsIgnoreCase("")) {
                    ColaboradorService.criar(colaborador);

                } else {
                    colaborador.setId(Integer.parseInt(telacadColaborador.gettFId().getText()));
                    ColaboradorService.atualizar(colaborador);
                }

                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telacadColaborador.getjPanel4());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnCentro());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnEndereco());
            } else {
                JOptionPane.showMessageDialog(null, "As Senhas não conferem");
            }

        } else if (acao.getSource() == telacadColaborador.getBtBuscar()) {

            FoBuscaColaborador telaBuscaColaborador = new FoBuscaColaborador();
            ControllerBuscaColaborador controllerBuscaColaborador = new ControllerBuscaColaborador(telaBuscaColaborador, this) {
            };
            telaBuscaColaborador.setVisible(true);
        } else if (acao.getSource() == telacadColaborador.getBtSair()) {
            telacadColaborador.dispose();
        } else if (acao.getSource() == telacadColaborador.getjCbCep()) {
            if (telacadColaborador.getjCbCep().getSelectedItem() != null) {
                Endereco endereco = new Endereco();

                endereco = EnderecoService.buscar(telacadColaborador.getjCbCep().getSelectedItem().toString());
                telacadColaborador.getTfBairro().setText(endereco.getBairro().getDescricao());
                telacadColaborador.getTfCidade().setText(endereco.getCidade().getDescricao());
                telacadColaborador.getTfLogradouro().setText(endereco.getLogradouro());
            }

        } else if (acao.getSource() == telacadColaborador.getBtCadCep()) {
            FoBuscaEndereco telaBuscaEndereco = new FoBuscaEndereco();
            ControllerBuscaEndereco cadEndereco = new ControllerBuscaEndereco(telaBuscaEndereco, this);
            telaBuscaEndereco.setVisible(true);
        } else if (acao.getSource() == telacadColaborador.getBtDeletar()) {
            if (!telacadColaborador.gettFId().getText().trim().equalsIgnoreCase("")) {
                Colaborador colaborador = new Colaborador();

                colaborador = ColaboradorService.buscar(Integer.parseInt(telacadColaborador.gettFId().getText()));

                if (ColaboradorService.excluir(colaborador) == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar.");
                } else {
                    setComboBox();
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telacadColaborador.getjPanel4());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnCentro());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telacadColaborador.getPnEndereco());

                }
            }
        }
    }

}
