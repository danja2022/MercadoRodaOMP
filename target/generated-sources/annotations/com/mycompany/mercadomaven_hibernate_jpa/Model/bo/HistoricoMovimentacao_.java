package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.ItensCompra;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-27T22:34:35")
@StaticMetamodel(HistoricoMovimentacao.class)
public class HistoricoMovimentacao_ { 

    public static volatile SingularAttribute<HistoricoMovimentacao, Float> qtd;
    public static volatile SingularAttribute<HistoricoMovimentacao, Character> tipo;
    public static volatile SingularAttribute<HistoricoMovimentacao, Date> data;
    public static volatile SingularAttribute<HistoricoMovimentacao, Date> hora;
    public static volatile SingularAttribute<HistoricoMovimentacao, Integer> id;
    public static volatile SingularAttribute<HistoricoMovimentacao, ItensCompra> itensCompra;
    public static volatile SingularAttribute<HistoricoMovimentacao, Character> status;

}