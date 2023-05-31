package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Cidade;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.CidadeDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_hibernate_jpa.service.CidadeService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaCidade;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadCidade;
import com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils;

public class ControllerCadCidade implements ActionListener {

    FoCadCidade telaCadCidade;
    ControllerCadEndereco cadEndereco;

    public ControllerCadCidade(FoCadCidade partelaCadCidade) {
        this.telaCadCidade = partelaCadCidade;
        this.cadEndereco = null;

        telaCadCidade.getBtBuscar().addActionListener(this);
        telaCadCidade.getBtCancelar().addActionListener(this);
        telaCadCidade.getBtSalvar().addActionListener(this);
        telaCadCidade.getBtNovo().addActionListener(this);
        telaCadCidade.getBtSair().addActionListener(this);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCidade.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCidade.getPnCentro());

    }

    public ControllerCadCidade(FoCadCidade telaCadCidade, ControllerCadEndereco cadEndereco) {
        this.telaCadCidade = telaCadCidade;
        this.cadEndereco = cadEndereco;

        this.telaCadCidade.getBtBuscar().addActionListener(this);
        this.telaCadCidade.getBtCancelar().addActionListener(this);
        this.telaCadCidade.getBtSalvar().addActionListener(this);
        this.telaCadCidade.getBtNovo().addActionListener(this);
        this.telaCadCidade.getBtSair().addActionListener(this);
        this.telaCadCidade.getBtDeletar().addActionListener(this);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCidade.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCidade.getPnCentro());

    }

    public void atualizaCampos(int codigo) {
        
        Cidade cidade = new Cidade();
        cidade = CidadeService.buscar(codigo);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadCidade.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadCidade.getPnCentro());
        telaCadCidade.getjTextFieldId().setText(cidade.getId() + "");
        telaCadCidade.getjTextFieldDescricao().setText(cidade.getDescricao());
        telaCadCidade.getjTextFieldId().setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadCidade.getBtNovo()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadCidade.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadCidade.getPnCentro());
            telaCadCidade.getjTextFieldId().setEnabled(false);
        } else if (acao.getSource() == telaCadCidade.getBtCancelar()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCidade.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCidade.getPnCentro());
        } else if (acao.getSource() == telaCadCidade.getBtSalvar()) {
            if (telaCadCidade.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else {
                Cidade cidade = new Cidade();
               
                cidade.setDescricao(telaCadCidade.getjTextFieldDescricao().getText());

                if (telaCadCidade.getjTextFieldId().getText().equalsIgnoreCase("")) {
                    CidadeService.criar(cidade);
                } else {
                    cidade.setId(Integer.parseInt(telaCadCidade.getjTextFieldId().getText()));
                    CidadeService.atualizar(cidade);
                }

                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCidade.getjPanel4());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCidade.getPnCentro());
            }

        } else if (acao.getSource() == telaCadCidade.getBtBuscar()) {

            FoBuscaCidade telaBuscaCidade = new FoBuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(telaBuscaCidade, this) {
            };
            telaBuscaCidade.setVisible(true);

        } else if (acao.getSource() == telaCadCidade.getBtSair()) {
            if (this.cadEndereco != null) {
                this.cadEndereco.setComboBox();
            }
            telaCadCidade.dispose();
        } else if (acao.getSource() == telaCadCidade.getBtDeletar()) {
            if (!telaCadCidade.getjTextFieldId().getText().trim().equalsIgnoreCase("")) {
                Cidade cidade = new Cidade();
               
                cidade = CidadeService.buscar(Integer.parseInt(telaCadCidade.getjTextFieldId().getText()));

                if (CidadeService.excluir(cidade) == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar. Verifique se a cidade está cadastrado em algum endereço");
                } else {
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCidade.getjPanel4());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCidade.getPnCentro());
                }
            }
        }
    }
}
