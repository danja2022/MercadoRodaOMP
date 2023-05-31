package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.CondicaoPgtoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.CondicaoPgto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_hibernate_jpa.service.CondPagService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaCondicaoPagamento;

public class ControllerBuscaCondPag implements ActionListener {

    FoBuscaCondicaoPagamento foBuscaCondicaoPagamento;
    ControllerCadCondPag controllerCadCondPag;

    public ControllerBuscaCondPag(FoBuscaCondicaoPagamento foBuscaCondicaoPagamento, ControllerCadCondPag controllerCadCondPag) {
        this.foBuscaCondicaoPagamento = foBuscaCondicaoPagamento;
        this.controllerCadCondPag = controllerCadCondPag;

        foBuscaCondicaoPagamento.getjButtonCarregar().addActionListener(this);
        foBuscaCondicaoPagamento.getjButtonSair().addActionListener(this);

        DefaultTableModel tabela = (DefaultTableModel) this.foBuscaCondicaoPagamento.getjTablebusca().getModel();
        CondicaoPgtoDAO condicaoPgtoDAO = new CondicaoPgtoDAO();
        for (CondicaoPgto CondicaoPgtoAtualDaLista : CondPagService.buscar()) {

            tabela.addRow(new Object[]{CondicaoPgtoAtualDaLista.getId(), 
                CondicaoPgtoAtualDaLista.getDescricaoCondicao(),
                CondicaoPgtoAtualDaLista.getNumeroParcelas(),
                CondicaoPgtoAtualDaLista.getDiasPrimeiraParcela(),
                CondicaoPgtoAtualDaLista.getDiaEntreParcela(),
                CondicaoPgtoAtualDaLista.getStatus()
            });
        }
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.foBuscaCondicaoPagamento.getjButtonCarregar()) {
            if (this.foBuscaCondicaoPagamento.getjTablebusca().getValueAt(this.foBuscaCondicaoPagamento.getjTablebusca().getSelectedRow(), 0) != null) {
               this.controllerCadCondPag.atualizaCampos((int) this.foBuscaCondicaoPagamento.getjTablebusca().getValueAt(this.foBuscaCondicaoPagamento.getjTablebusca().getSelectedRow(), 0));
                this.foBuscaCondicaoPagamento.dispose();

            }

        }
        if (acao.getSource() == this.foBuscaCondicaoPagamento.getjButtonSair()) {
            this.foBuscaCondicaoPagamento.dispose();
        }

    }
}
