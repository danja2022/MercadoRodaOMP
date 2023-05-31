package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ColaboradorDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Colaborador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_hibernate_jpa.service.ColaboradorService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaColaborador;

public class ControllerBuscaColaborador implements ActionListener {

    FoBuscaColaborador foBuscaColaborador;
    ControllerCadColaborador cadColaborador;

    public ControllerBuscaColaborador(FoBuscaColaborador foBuscaColaborador, ControllerCadColaborador cadColaborador) {
        this.foBuscaColaborador = foBuscaColaborador;
        this.cadColaborador = cadColaborador;

        foBuscaColaborador.getjButtonCarregar().addActionListener(this);
        foBuscaColaborador.getjButtonSair().addActionListener(this);

        DefaultTableModel tabela = (DefaultTableModel) this.foBuscaColaborador.getjTablebusca().getModel();
        
        for (Colaborador colaboradorAtualDaLista : ColaboradorService.buscar()) {

            tabela.addRow(new Object[]{colaboradorAtualDaLista.getId(), colaboradorAtualDaLista.getNome(),
                colaboradorAtualDaLista.getFone(),
                colaboradorAtualDaLista.getEmail(),
                colaboradorAtualDaLista.getLogin()
            });
        }
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == this.foBuscaColaborador.getjButtonCarregar()) {
            if (this.foBuscaColaborador.getjTablebusca().getValueAt(this.foBuscaColaborador.getjTablebusca().getSelectedRow(), 0) != null) {
                this.cadColaborador.atualizaCampos((int) this.foBuscaColaborador.getjTablebusca().getValueAt(this.foBuscaColaborador.getjTablebusca().getSelectedRow(), 0));
                this.foBuscaColaborador.dispose();

            }

        }
        if (acao.getSource() == this.foBuscaColaborador.getjButtonSair()) {
            this.foBuscaColaborador.dispose();
        }
    }
}
