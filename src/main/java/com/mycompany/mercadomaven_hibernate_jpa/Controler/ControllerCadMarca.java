package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.MarcaDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_hibernate_jpa.service.MarcaService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaMarca;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadastroMarca;
import com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils;

public class ControllerCadMarca implements ActionListener {

    FoCadastroMarca telaCadMarca;
    ControllerCadastroProduto cadProd;

    public ControllerCadMarca(FoCadastroMarca partelaCadMarca) {
        this.telaCadMarca = partelaCadMarca;
        this.cadProd = null;

        adicionaAction();

    }

    public ControllerCadMarca(FoCadastroMarca partelaCadMarca, ControllerCadastroProduto cadProd) {
        this.telaCadMarca = partelaCadMarca;
        this.cadProd = cadProd;

        adicionaAction();
    }

    public void adicionaAction() {
        telaCadMarca.getBtBuscar().addActionListener(this);
        telaCadMarca.getBtCancelar().addActionListener(this);
        telaCadMarca.getBtSalvar().addActionListener(this);
        telaCadMarca.getBtNovo().addActionListener(this);
        telaCadMarca.getBtSair().addActionListener(this);
        telaCadMarca.getBtDeletar().addActionListener(this);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadMarca.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadMarca.getPnCentro());

    }

    public void atualizaCampos(int codigo) {
        Marca marca = new Marca();
        
        marca = MarcaService.buscar(codigo);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadMarca.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadMarca.getPnCentro());

        telaCadMarca.getjTextFieldIdMarca().setText(marca.getId() + "");
        telaCadMarca.getjTextFieldCadMarca().setText(marca.getDescricao());
        telaCadMarca.getjTextFieldIdMarca().setEnabled(false);

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadMarca.getBtNovo()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadMarca.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadMarca.getPnCentro());
            telaCadMarca.getjTextFieldIdMarca().setEnabled(false);

        } else if (acao.getSource() == telaCadMarca.getBtCancelar()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadMarca.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadMarca.getPnCentro());

        } else if (acao.getSource() == telaCadMarca.getBtSalvar()) {

            if (telaCadMarca.getjTextFieldCadMarca().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Campo Marca é Obrigatório");
            } else {

                Marca marca = new Marca();
                
                marca.setDescricao(telaCadMarca.getjTextFieldCadMarca().getText());

                //persistir o objeto de bairro criado
                if (telaCadMarca.getjTextFieldIdMarca().getText().equalsIgnoreCase("")) {
                    MarcaService.criar(marca);
                } else {
                    marca.setId(Integer.parseInt(telaCadMarca.getjTextFieldIdMarca().getText()));
                    MarcaService.criar(marca);

                }

                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadMarca.getjPanel4());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadMarca.getPnCentro());
            }

        } else if (acao.getSource() == telaCadMarca.getBtBuscar()) {
            FoBuscaMarca telaBuscaMarca = new FoBuscaMarca();
            ControllerBuscaMarca controllerBuscaMarca = new ControllerBuscaMarca(telaBuscaMarca, this) {
            };
            telaBuscaMarca.setVisible(true);

        } else if (acao.getSource() == telaCadMarca.getBtSair()) {
            telaCadMarca.dispose();
            this.cadProd.setComboBox();
        } else if (acao.getSource() == telaCadMarca.getBtDeletar()) {
            if (!telaCadMarca.getjTextFieldIdMarca().getText().trim().equalsIgnoreCase("")) {
                Marca marca = new Marca();
                MarcaDAO marcaDAO = new MarcaDAO();
                marca = MarcaService.buscar(Integer.parseInt(telaCadMarca.getjTextFieldIdMarca().getText()));

                if (MarcaService.excluir(marca) == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar, verifique se a marca está cadastrado em algum produto");
                } else {
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadMarca.getjPanel4());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadMarca.getPnCentro());
                }

            }
        }
    }
}
