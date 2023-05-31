package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.EnderecoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.FornecedorDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Fornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
//import java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_hibernate_jpa.service.EnderecoService;
import com.mycompany.mercadomaven_hibernate_jpa.service.FornecedorService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaFornecedor;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadastroEndereco;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadastroFornecedor;
import com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils;

public class ControllerCadFornecedor implements ActionListener {

    FoCadastroFornecedor telaCadFornecedor;

    public ControllerCadFornecedor(FoCadastroFornecedor partelaCadFornecedor) {
        this.telaCadFornecedor = partelaCadFornecedor;

        telaCadFornecedor.getBtBuscar().addActionListener(this);
        telaCadFornecedor.getBtCancelar().addActionListener(this);
        telaCadFornecedor.getBtSalvar().addActionListener(this);
        telaCadFornecedor.getBtNovo().addActionListener(this);
        telaCadFornecedor.getBtSair().addActionListener(this);
        telaCadFornecedor.getjBtCadCep().addActionListener(this);
        telaCadFornecedor.getjCbCep().addActionListener(this);
        telaCadFornecedor.getBtDeletar().addActionListener(this);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadFornecedor.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getPnCentro());
        this.setComboBox();

    }

    public void atualizaCampos(int codigo) {
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor = FornecedorService.buscar(codigo);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadFornecedor.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadFornecedor.getPnCentro());

        telaCadFornecedor.getjTextFieldIdCadFornecedor().setText(fornecedor.getId() + "");
        if (fornecedor.getStatus() == 'A') {
            telaCadFornecedor.getRbAtivo().setSelected(true);
        } else {
            telaCadFornecedor.getRbInativo().setSelected(true);
        }
//        telaCadFornecedor.getjFtDataCadastro().setText(dateToString(fornecedor.getDtCadastro()));
        telaCadFornecedor.getTfNome().setText(fornecedor.getNome());
        telaCadFornecedor.getTfRazaoSocial().setText(fornecedor.getRazaoSocial());
        telaCadFornecedor.getFtfCPF().setText(fornecedor.getCpf());
        telaCadFornecedor.getFtfCNPJ().setText(fornecedor.getCnpj());
        telaCadFornecedor.getFtfRG().setText(fornecedor.getRg());
        telaCadFornecedor.getTfInscricaoEst().setText(fornecedor.getInscEstadual());
        telaCadFornecedor.getFtfTelefone1().setText(fornecedor.getFone());
        telaCadFornecedor.getFtfTelefone2().setText(fornecedor.getFone2());
        telaCadFornecedor.getTfEmail().setText(fornecedor.getEmail());
        telaCadFornecedor.getTfContato().setText(fornecedor.getContato());
        telaCadFornecedor.getjTextArea1().setText(fornecedor.getObservacao());
        telaCadFornecedor.getTfComplemento().setText(fornecedor.getComplementoEndereco());
        telaCadFornecedor.getjCbCep().setSelectedItem(fornecedor.getEndereco().getCep());

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

    private boolean verificaCpf(String cpf) {
        String aCpf = "";
        for (int i = 0; i < cpf.length(); i++) {
            if ((cpf.charAt(i) != '.') && (cpf.charAt(i) != '-') && (cpf.charAt(i) != ' ')) {
                aCpf = aCpf + cpf.charAt(i);
            }
        }
        return aCpf.length() == 11;

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

    private boolean verificaCnpj(String cnpj) {
        String aCnpj = "";
        for (int i = 0; i < cnpj.length(); i++) {
            if ((cnpj.charAt(i) != '.') && (cnpj.charAt(i) != '/') && (cnpj.charAt(i) != '-') && (cnpj.charAt(i) != ' ')) {
                aCnpj = aCnpj + cnpj.charAt(i);
            }
        }
        return aCnpj.length() == 14;
    }

    public void setComboBox() {
        List<Endereco> listaEndereco = new ArrayList<>();

        

        listaEndereco = EnderecoService.buscar();

        telaCadFornecedor.getjCbCep().removeAllItems();

        for (Endereco endereco : listaEndereco) {
            telaCadFornecedor.getjCbCep().addItem(endereco.getCep());
        }
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadFornecedor.getBtNovo()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadFornecedor.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadFornecedor.getPnCentro());
            telaCadFornecedor.getjTextFieldIdCadFornecedor().setEnabled(false);

        } else if (acao.getSource() == telaCadFornecedor.getBtCancelar()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadFornecedor.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getPnCentro());

        } else if (acao.getSource() == telaCadFornecedor.getBtSalvar()) {

            if (telaCadFornecedor.getTfNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo com Nome é obrigatório!");
            } else if (!verificaCpf(telaCadFornecedor.getFtfCPF().getText())) {
                JOptionPane.showMessageDialog(null, "Preencha o CPF corretamente");
            } else if (telaCadFornecedor.getFtfRG().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo RG é obrigatório");
            } else if (!verificaCnpj(telaCadFornecedor.getFtfCNPJ().getText())) {
                JOptionPane.showMessageDialog(null, "Preencha o CNPJ corretamente");
            } else if (!verificaNumero(telaCadFornecedor.getFtfTelefone1().getText())) {
                JOptionPane.showMessageDialog(null, "Preencha o telefone 1 corretamente");
            } else if (telaCadFornecedor.getTfEmail().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo EMAIL é obrigatório");
            } else {

                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setNome(telaCadFornecedor.getTfNome().getText());
                fornecedor.setRazaoSocial(telaCadFornecedor.getTfRazaoSocial().getText());
                fornecedor.setCpf(telaCadFornecedor.getFtfCPF().getText());
                fornecedor.setRg(telaCadFornecedor.getFtfRG().getText());
                fornecedor.setCnpj(telaCadFornecedor.getFtfCNPJ().getText());
                fornecedor.setInscEstadual(telaCadFornecedor.getTfInscricaoEst().getText());
                fornecedor.setFone(telaCadFornecedor.getFtfTelefone1().getText());

                if (verificaNumero(telaCadFornecedor.getFtfTelefone2().getText())) {
                    fornecedor.setFone2(telaCadFornecedor.getFtfTelefone2().getText());
                } else {
                    fornecedor.setFone2("");
                }

                if (!telaCadFornecedor.getTfEmail().getText().trim().equalsIgnoreCase("")) {
                    fornecedor.setEmail(telaCadFornecedor.getTfEmail().getText());
                } else {
                    fornecedor.setEmail("");
                }

                if (!telaCadFornecedor.getTfComplemento().getText().trim().equalsIgnoreCase("")) {
                    fornecedor.setComplementoEndereco(telaCadFornecedor.getTfComplemento().getText());
                } else {
                    fornecedor.setComplementoEndereco("");
                }

                if (!telaCadFornecedor.getTfContato().getText().trim().equalsIgnoreCase("")) {
                    fornecedor.setContato(telaCadFornecedor.getTfContato().getText());
                } else {
                    fornecedor.setContato("");
                }

                if (telaCadFornecedor.getRbAtivo().isSelected()) {
                    fornecedor.setStatus('A');
                } else {
                    fornecedor.setStatus('I');
                }

                fornecedor.setObservacao(telaCadFornecedor.getjTextArea1().getText());

                Endereco endereco = new Endereco();
                

                endereco = EnderecoService.buscar(telaCadFornecedor.getjCbCep().getSelectedItem().toString());
                fornecedor.setEndereco(endereco);

                

                if (telaCadFornecedor.getjTextFieldIdCadFornecedor().getText().trim().equalsIgnoreCase("")) {
                    FornecedorService.criar(fornecedor);
                } else {
                    fornecedor.setId(Integer.parseInt(telaCadFornecedor.getjTextFieldIdCadFornecedor().getText()));
                    FornecedorService.atualizar(fornecedor);
                }
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadFornecedor.getjPanel4());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getPnCentro());
            }

        } else if (acao.getSource() == telaCadFornecedor.getBtBuscar()) {

            FoBuscaFornecedor telaBuscaFornecedor = new FoBuscaFornecedor();
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(telaBuscaFornecedor, this);
            telaBuscaFornecedor.setVisible(true);

        } else if (acao.getSource() == telaCadFornecedor.getBtSair()) {
            telaCadFornecedor.dispose();
        } else if (acao.getSource() == telaCadFornecedor.getjBtCadCep()) {
            FoCadastroEndereco telaCadEndereco = new FoCadastroEndereco();
            ControllerCadEndereco cadEndereco = new ControllerCadEndereco(telaCadEndereco, this);
            telaCadEndereco.setVisible(true);

        } else if (acao.getSource() == telaCadFornecedor.getjCbCep()) {
            if (telaCadFornecedor.getjCbCep().getSelectedItem() != null) {
                Endereco endereco = new Endereco();
                
                endereco = EnderecoService.buscar(telaCadFornecedor.getjCbCep().getSelectedItem().toString());
                telaCadFornecedor.getTfBairro().setText(endereco.getBairro().getDescricao());
                telaCadFornecedor.getTfCidade().setText(endereco.getCidade().getDescricao());
                telaCadFornecedor.getTfLogradouro().setText(endereco.getLogradouro());
            }
        } else if (acao.getSource() == telaCadFornecedor.getBtDeletar()) {
            if (!telaCadFornecedor.getjTextFieldIdCadFornecedor().getText().trim().equalsIgnoreCase("")) {
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor = FornecedorService.buscar(Integer.parseInt(telaCadFornecedor.getjTextFieldIdCadFornecedor().getText()));

                if (FornecedorService.excluir(fornecedor) == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar. Verifique se existe um produto cadastrado com esse fornecedor");
                } else {
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadFornecedor.getjPanel4());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getPnCentro());
                    setComboBox();
                }

            }
        }

    }

}
