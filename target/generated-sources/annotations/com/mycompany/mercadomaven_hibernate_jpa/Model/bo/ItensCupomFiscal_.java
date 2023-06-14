package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.HistoricoMovimentacao;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-13T22:08:32")
@StaticMetamodel(ItensCupomFiscal.class)
public class ItensCupomFiscal_ { 

    public static volatile SingularAttribute<ItensCupomFiscal, Character> Status;
    public static volatile SingularAttribute<ItensCupomFiscal, Float> qtdProduto;
    public static volatile SingularAttribute<ItensCupomFiscal, Float> valorUnitarioProduto;
    public static volatile SingularAttribute<ItensCupomFiscal, Produto> produto;
    public static volatile SingularAttribute<ItensCupomFiscal, HistoricoMovimentacao> historicoMovimentacao;
    public static volatile SingularAttribute<ItensCupomFiscal, Integer> id;

}