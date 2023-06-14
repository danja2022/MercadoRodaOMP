package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Compra;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-13T22:20:11")
@StaticMetamodel(CondicaoPgto.class)
public class CondicaoPgto_ { 

    public static volatile SingularAttribute<CondicaoPgto, Compra> compra;
    public static volatile SingularAttribute<CondicaoPgto, Integer> numeroParcelas;
    public static volatile SingularAttribute<CondicaoPgto, String> diasPrimeiraParcela;
    public static volatile SingularAttribute<CondicaoPgto, Integer> diaEntreParcela;
    public static volatile SingularAttribute<CondicaoPgto, Integer> id;
    public static volatile SingularAttribute<CondicaoPgto, String> descricaoCondicao;
    public static volatile SingularAttribute<CondicaoPgto, Character> status;

}