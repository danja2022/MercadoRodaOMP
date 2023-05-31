
package com.mycompany.mercadomaven_hibernate_jpa.Controler;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.MarcaDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_hibernate_jpa.service.MarcaService;
import com.mycompany.mercadomaven_hibernate_jpa.view.FoBuscaMarca;


public class ControllerBuscaMarca implements ActionListener {

    FoBuscaMarca foBuscaMarca;
    ControllerCadMarca cadMarca;
    
        public ControllerBuscaMarca (FoBuscaMarca foBuscaMarca, ControllerCadMarca cadMarca){
            this.cadMarca = cadMarca;
            this.foBuscaMarca = foBuscaMarca;
        
            
            foBuscaMarca.getjButtonCarregar().addActionListener(this);
            foBuscaMarca.getjButtonSair().addActionListener(this);
            
            
            //carregar
            DefaultTableModel tabela = (DefaultTableModel) this.foBuscaMarca.getjTablebusca().getModel();
            
            for(Marca marcaAtualDaLista: MarcaService.buscar()){
            
                tabela.addRow(new Object[]{marcaAtualDaLista.getId(),marcaAtualDaLista.getDescricao()});
            
            }
            
            
            
            }
    
    
    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == this.foBuscaMarca.getjButtonCarregar()){
             if(this.foBuscaMarca.getjTablebusca().getValueAt(this.foBuscaMarca.getjTablebusca().getSelectedRow(),0) != null){
                this.cadMarca.atualizaCampos((int) this.foBuscaMarca.getjTablebusca().getValueAt(this.foBuscaMarca.getjTablebusca().getSelectedRow(),0));
                this.foBuscaMarca.dispose();
            }
           
            
        
        
           
        } else if (acao.getSource() == this.foBuscaMarca.getjButtonSair()){
           this.foBuscaMarca.dispose();
    }
    
}


}
