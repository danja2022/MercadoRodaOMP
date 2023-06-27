package com.mycompany.mercadomaven_hibernate_jpa.Controler;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Bairro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadBairroFinal;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaBairro;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.BairroDAO;
import com.mycompany.mercadomaven_hibernate_jpa.service.BairroService;

public class ControllerCadBairro implements ActionListener {

    FoCadBairroFinal telaCadBairro;
    ControllerCadEndereco cadEndereco;

    // public static int codigo;
    public ControllerCadBairro(FoCadBairroFinal parTelaCadBairro) {
        this.telaCadBairro = parTelaCadBairro;
        this.cadEndereco = null;

        adicionaAction();

    }

    public ControllerCadBairro(FoCadBairroFinal telaCadBairro, ControllerCadEndereco cEndereco) {
        this.telaCadBairro = telaCadBairro;
        this.cadEndereco = cEndereco;

        adicionaAction();

    }

    private void adicionaAction() {
        this.telaCadBairro.getBtBuscar().addActionListener(this);
        this.telaCadBairro.getBtCancelar().addActionListener(this);
        this.telaCadBairro.getBtSalvar().addActionListener(this);
        this.telaCadBairro.getBtNovo().addActionListener(this);
        this.telaCadBairro.getBtSair().addActionListener(this);
        this.telaCadBairro.getBtDeletar().addActionListener(this);
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadBairro.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadBairro.getPnCentro());
        this.telaCadBairro.getjTextFieldBairro().setEnabled(false);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadBairro.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadBairro.getPnCentro());

    }

    public void atualizaCampos(int Codigo) {
        Bairro bairro = new Bairro();
        
        bairro = BairroService.buscar(Codigo);

        
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadBairro.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadBairro.getPnCentro());
        //telaCadBairro.getjTextFieldBairro().setEnabled(true);

        telaCadBairro.getjTextFieldId().setText(bairro.getId() + "");
        telaCadBairro.getjTextFieldBairro().setText(bairro.getDescricao());
        telaCadBairro.getjTextFieldId().setEnabled(false);

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadBairro.getBtNovo()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadBairro.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadBairro.getPnCentro());
            telaCadBairro.getjTextFieldId().setEnabled(false);

        } else if (acao.getSource() == telaCadBairro.getBtCancelar()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadBairro.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadBairro.getPnCentro());
        } else if (acao.getSource() == telaCadBairro.getBtSalvar()) {

            if (telaCadBairro.getjTextFieldBairro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo descrição é obrigatório");
            } else {

                Bairro bairro = new Bairro();
                bairro.setDescricao(telaCadBairro.getjTextFieldBairro().getText());

               
             
             

                if (this.telaCadBairro.getjTextFieldId().getText().equalsIgnoreCase("")) {
                    BairroService.criar(bairro);
                } else {
                    bairro.setId(Integer.parseInt(telaCadBairro.getjTextFieldId().getText()));
                    BairroService.atualizar(bairro);
                }
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadBairro.getjPanel4());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadBairro.getPnCentro());
            }
        } //Mudará na proxima aula
        else if (acao.getSource() == telaCadBairro.getBtBuscar()) {

            //this.codigo = 0;
            FoBuscaBairro telaBuscaBairro = new FoBuscaBairro();
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro, this);
            telaBuscaBairro.setVisible(true);

        } else if (acao.getSource() == telaCadBairro.getBtSair()) {
            if (this.cadEndereco != null) {
                this.cadEndereco.setComboBox();
            }
            telaCadBairro.dispose();
        } else if (acao.getSource() == telaCadBairro.getBtDeletar()) {
            if (!telaCadBairro.getjTextFieldId().getText().trim().equalsIgnoreCase("")) {
                Bairro bairro = new Bairro();
               // BairroDAO bairroDAO = new BairroDAO();
                bairro = BairroService.buscar(Integer.parseInt(telaCadBairro.getjTextFieldId().getText()));

                if (BairroService.excluir(bairro) == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar. Verifique se o bairro está cadastrado em algum endereço");
                } else {
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadBairro.getjPanel4());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadBairro.getPnCentro());
                }
            }
        }
    }

}
