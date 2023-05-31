package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.MarcaDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.ProdutoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_hibernate_jpa.service.ProdutoService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaProduto;

public class ControllerBuscaProduto implements ActionListener {

    FoBuscaProduto foBuscaProduto;
    ControllerCadastroProduto cadProduto;

    public ControllerBuscaProduto(FoBuscaProduto foBuscaProduto, ControllerCadastroProduto cadProduto) {
        this.cadProduto = cadProduto;
        this.foBuscaProduto = foBuscaProduto;

        this.foBuscaProduto.getjButtonCarregar().addActionListener(this);
        this.foBuscaProduto.getjButtonSair().addActionListener(this);

        //carregar
        DefaultTableModel tabela = (DefaultTableModel) this.foBuscaProduto.getjTablebusca().getModel();
        

        for (Produto produtoAtualDaLista : ProdutoService.buscar()) {

            tabela.addRow(new Object[]{produtoAtualDaLista.getId(), produtoAtualDaLista.getDescricao(),
                produtoAtualDaLista.getValorVenda(),
                produtoAtualDaLista.getMarca().getDescricao(),
                produtoAtualDaLista.getDataCadastro(),
                produtoAtualDaLista.getStatus()
            });

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == this.foBuscaProduto.getjButtonCarregar()) {
             if(this.foBuscaProduto.getjTablebusca().getValueAt(this.foBuscaProduto.getjTablebusca().getSelectedRow(),0) != null){
                this.cadProduto.atualizaCampos((int) this.foBuscaProduto.getjTablebusca().getValueAt(this.foBuscaProduto.getjTablebusca().getSelectedRow(),0));
                this.foBuscaProduto.dispose();
        }
        }

        if (acao.getSource() == this.foBuscaProduto.getjButtonSair()) {
            this.foBuscaProduto.dispose();
        }
    }

}
