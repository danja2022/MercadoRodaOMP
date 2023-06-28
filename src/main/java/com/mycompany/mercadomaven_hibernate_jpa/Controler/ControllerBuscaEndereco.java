package com.mycompany.mercadomaven_hibernate_jpa.Controler;

import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.EnderecoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_hibernate_jpa.service.EnderecoService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaEndereco;

public class ControllerBuscaEndereco implements ActionListener {

    FoBuscaEndereco foBuscaEndereco;
    ControllerCadEndereco cadEndereco;
    ControllerCadColaborador cadColaborador;

    public ControllerBuscaEndereco(FoBuscaEndereco foBuscaEndereco, ControllerCadEndereco enderecoCad) {
        this.foBuscaEndereco = foBuscaEndereco;
        this.cadEndereco = enderecoCad;
        this.cadColaborador = null;

        this.foBuscaEndereco.getjButtonCarregar().addActionListener(this);
        this.foBuscaEndereco.getjButtonSair().addActionListener(this);

        lista();
    }

    public ControllerBuscaEndereco(FoBuscaEndereco foBuscaEndereco, ControllerCadColaborador cadColaborador) {
        this.foBuscaEndereco = foBuscaEndereco;
        this.cadEndereco = null;
        this.cadColaborador = cadColaborador;

        this.foBuscaEndereco.getjButtonCarregar().addActionListener(this);
        this.foBuscaEndereco.getjButtonSair().addActionListener(this);

        lista();
    }

    private void lista() {
        DefaultTableModel tabela = (DefaultTableModel) this.foBuscaEndereco.getjTablebusca().getModel();
        for (Endereco enderecoAtualDaLista : EnderecoService.buscar()) {

            tabela.addRow(new Object[]{enderecoAtualDaLista.getId(), enderecoAtualDaLista.getLogradouro(), enderecoAtualDaLista.getCep(),
                enderecoAtualDaLista.getBairro().getDescricao(), enderecoAtualDaLista.getCidade().getDescricao()});

        }
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == this.foBuscaEndereco.getjButtonCarregar()) {
            if (cadColaborador == null) {
                if (this.foBuscaEndereco.getjTablebusca().getValueAt(this.foBuscaEndereco.getjTablebusca().getSelectedRow(), 0) != null) {
                    this.cadEndereco.atualizaCampos((int) this.foBuscaEndereco.getjTablebusca().getValueAt(this.foBuscaEndereco.getjTablebusca().getSelectedRow(), 0));
                    this.foBuscaEndereco.dispose();
                }

            } else {
                if (this.foBuscaEndereco.getjTablebusca().getValueAt(this.foBuscaEndereco.getjTablebusca().getSelectedRow(), 0) != null) {
                    this.cadColaborador.atualizaEndereco((int) this.foBuscaEndereco.getjTablebusca().getValueAt(this.foBuscaEndereco.getjTablebusca().getSelectedRow(), 0));
                    this.foBuscaEndereco.dispose();
                }

            }
        }

        if (acao.getSource() == this.foBuscaEndereco.getjButtonSair()) {
            this.foBuscaEndereco.dispose();
        }

    }
}
