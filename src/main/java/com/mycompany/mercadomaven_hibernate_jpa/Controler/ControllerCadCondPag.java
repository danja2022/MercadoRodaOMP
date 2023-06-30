package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.CondicaoPgtoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoCadCondicaoPagamento;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.CondicaoPgto;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_hibernate_jpa.service.CondPagService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaCondicaoPagamento;
import com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerCadCondPag implements ActionListener {

    FoCadCondicaoPagamento telaCadCondicaoPagamento;

    public ControllerCadCondPag(FoCadCondicaoPagamento partelacadCondiPagamento) {
        this.telaCadCondicaoPagamento = partelacadCondiPagamento;

        telaCadCondicaoPagamento.getBtBuscar().addActionListener(this);
        telaCadCondicaoPagamento.getBtCancelar().addActionListener(this);
        telaCadCondicaoPagamento.getBtSalvar().addActionListener(this);
        telaCadCondicaoPagamento.getBtNovo().addActionListener(this);
        telaCadCondicaoPagamento.getBtSair().addActionListener(this);
        telaCadCondicaoPagamento.getBtDeletar().addActionListener(this);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCondicaoPagamento.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagamento.getPnCentro());

    }

    public void atualizaCampos(int codigo) {
        CondicaoPgto condicaoPgto = new CondicaoPgto();
        
        condicaoPgto = CondPagService.buscar(codigo);

        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadCondicaoPagamento.getjPanel4());
        com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadCondicaoPagamento.getPnCentro());

        telaCadCondicaoPagamento.getjTfIdConPag().setText(condicaoPgto.getId() + "");
        telaCadCondicaoPagamento.getjTfDescricao().setText(condicaoPgto.getDescricaoCondicao());
        telaCadCondicaoPagamento.getjTfDiaEntreParcela().setText(condicaoPgto.getDiaEntreParcela() + "");
        telaCadCondicaoPagamento.getjTfNumParcelas().setText(condicaoPgto.getNumeroParcelas() + "");
        telaCadCondicaoPagamento.getjFTfDiaPrimeiraParcela().setText(condicaoPgto.getDiasPrimeiraParcela()+"");

        if (condicaoPgto.getStatus() == 'A') {
            telaCadCondicaoPagamento.getjRadioBtAtivo().setSelected(true);
        } else {
            telaCadCondicaoPagamento.getjRadioBtInativo().setSelected(true);
        }

    }

    private String stringToDate(String data) {
        String aData = "";
        int dia = 0, mes = 3, ano = 6;

        for (int i = ano; i < (ano + 4); i++) {
            aData = aData + data.charAt(i);
        }
        aData = aData + '-';
        for (int i = mes; i < (mes + 2); i++) {
            aData = aData + data.charAt(i);
        }
        aData = aData + '-';
        for (int i = dia; i < (dia + 2); i++) {
            aData = aData + data.charAt(i);
        }

        return aData;
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

    private boolean verificaData(String data) {
        String aData = "";
        for (int i = 0; i < data.length(); i++) {
            if ((data.charAt(i) != ' ') && (data.charAt(i) != '-')) {
                aData = aData + data.charAt(i);
            }
        }
        return aData.length() == 8;
    }

    private boolean verificaPrimeiraParcela(String data) {
        LocalDate aData = LocalDate.now();
        String ano = "", mes = "", dia = "";

        for (int i = 0; i < (0 + 2); i++) {
            dia = dia + data.charAt(i);
        }

        for (int i = 3; i < (3 + 2); i++) {
            mes = mes + data.charAt(i);
        }

        for (int i = 6; i < (6 + 4); i++) {
            ano = ano + data.charAt(i);
        }

        if (Integer.parseInt(ano) > aData.getYear()) {
            return true;
        } else if (Integer.parseInt(ano) == aData.getYear()) {
            if (Integer.parseInt(mes) == aData.getMonthValue()) {
                if (Integer.parseInt(dia) >= aData.getDayOfMonth()) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Dia não pode ser inferior ao dia de hoje!");
                    return false;
                }
            } else if (Integer.parseInt(mes) > aData.getMonthValue()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mês não pode ser inferior ao mês atual!");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ano não pode ser inferior ao ano atual!");
            return false;
        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadCondicaoPagamento.getBtNovo()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(false, telaCadCondicaoPagamento.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(true, telaCadCondicaoPagamento.getPnCentro());
            telaCadCondicaoPagamento.getjTfIdConPag().setEnabled(false);

        } else if (acao.getSource() == telaCadCondicaoPagamento.getBtCancelar()) {
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCondicaoPagamento.getjPanel4());
            com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagamento.getPnCentro());

        } else if (acao.getSource() == telaCadCondicaoPagamento.getBtSalvar()) {

            if (telaCadCondicaoPagamento.getjTfDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Descrição' é obrigatório!");
            } else if (telaCadCondicaoPagamento.getjTfDiaEntreParcela().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Dias Entrega' é obrigatório!");
            } else if ((Integer.parseInt(telaCadCondicaoPagamento.getjTfDiaEntreParcela().getText()) < 1)
                    || (Integer.parseInt(telaCadCondicaoPagamento.getjTfDiaEntreParcela().getText()) > 31)) {
                JOptionPane.showMessageDialog(null, "O campo 'Dias Entrega' deve estar entre 1 e 31!");
            } else if (telaCadCondicaoPagamento.getjTfNumParcelas().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Número de Parcelas' é obrigatório!");
            } else if (Integer.parseInt(telaCadCondicaoPagamento.getjTfNumParcelas().getText()) < 1) {
                JOptionPane.showMessageDialog(null, "O campo 'Número de Parcelas' é deve ser maior que 0!");
            } else if (telaCadCondicaoPagamento.getjFTfDiaPrimeiraParcela().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O campo 'Primeira Parcela' é obrigatório!");
            } else {
                CondicaoPgto condicaoPgto = new CondicaoPgto();

                condicaoPgto.setDescricaoCondicao(telaCadCondicaoPagamento.getjTfDescricao().getText());
                condicaoPgto.setDiaEntreParcela(Integer.parseInt(telaCadCondicaoPagamento.getjTfDiaEntreParcela().getText()));
                
                condicaoPgto.setDiasPrimeiraParcela(Integer.parseInt(telaCadCondicaoPagamento.getjFTfDiaPrimeiraParcela().getText().trim()));
                condicaoPgto.setNumeroParcelas(Integer.parseInt(telaCadCondicaoPagamento.getjTfNumParcelas().getText()));

                if (telaCadCondicaoPagamento.getjRadioBtAtivo().isSelected()) {
                    condicaoPgto.setStatus('A');
                } else {
                    condicaoPgto.setStatus('I');
                }

           
                if (telaCadCondicaoPagamento.getjTfIdConPag().getText().trim().equalsIgnoreCase("")) {
                    CondPagService.criar(condicaoPgto);
                } else {
                    condicaoPgto.setId(Integer.parseInt(telaCadCondicaoPagamento.getjTfIdConPag().getText()));
                    CondPagService.atualizar(condicaoPgto);
                }

                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCondicaoPagamento.getjPanel4());
                com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagamento.getPnCentro());
            }

        } else if (acao.getSource() == telaCadCondicaoPagamento.getBtBuscar()) {

            FoBuscaCondicaoPagamento telaCadCondicaoPagamento = new FoBuscaCondicaoPagamento();
            ControllerBuscaCondPag controllerBuscaCondPag = new ControllerBuscaCondPag(telaCadCondicaoPagamento, this) {
            };
            telaCadCondicaoPagamento.setVisible(true);

        } else if (acao.getSource() == telaCadCondicaoPagamento.getBtSair()) {
            telaCadCondicaoPagamento.dispose();
        } else if (acao.getSource() == telaCadCondicaoPagamento.getBtDeletar()) {
            if (!telaCadCondicaoPagamento.getjTfIdConPag().getText().trim().equalsIgnoreCase("")) {
                CondicaoPgto condicaoPgto = new CondicaoPgto();
                
                condicaoPgto = CondPagService.buscar(Integer.parseInt(telaCadCondicaoPagamento.getjTfIdConPag().getText()));

                if (CondPagService.excluir(condicaoPgto) == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar");
                } else {
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ativa(true, telaCadCondicaoPagamento.getjPanel4());
                    com.mycompany.mercadomaven_hibernate_jpa.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagamento.getPnCentro());
                }

            }

        }
    }

}
