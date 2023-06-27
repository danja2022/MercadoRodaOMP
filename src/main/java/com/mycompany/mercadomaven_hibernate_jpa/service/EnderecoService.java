
package com.mycompany.mercadomaven_hibernate_jpa.service;


import com.mycompany.mercadomaven_hibernate_jpa.Model.DAO.EnderecoDAO;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Endereco;
import java.util.List;

public class EnderecoService {
    
    public static void criar(Endereco objeto) {
        EnderecoDAO.getInstance().create(objeto);
      
    }

    public static Endereco buscar(int codigo) {
        return EnderecoDAO.getInstance().retrieve(codigo);
        
    }

    public static Endereco buscar(String descricao) {
        return EnderecoDAO.getInstance().retrieve(descricao);
       

    }

    public static List<Endereco> buscar() {
       
        return EnderecoDAO.getInstance().retrieve();
       

    }

    public static void atualizar(Endereco objeto) {
         EnderecoDAO.getInstance().update(objeto);
        
    }

    public static int excluir(Endereco objeto) {
         return EnderecoDAO.getInstance().delete(objeto);
        
        
    }

}
