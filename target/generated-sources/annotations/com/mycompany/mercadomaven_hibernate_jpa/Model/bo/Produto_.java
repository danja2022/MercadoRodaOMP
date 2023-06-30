package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Classe;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Marca;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-29T21:31:43")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Float> estoqueMaximo;
    public static volatile SingularAttribute<Produto, Classe> classe;
    public static volatile SingularAttribute<Produto, Float> valorCompra;
    public static volatile SingularAttribute<Produto, String> barraSaida;
    public static volatile SingularAttribute<Produto, String> descricao;
    public static volatile SingularAttribute<Produto, Marca> marca;
    public static volatile SingularAttribute<Produto, Float> valorVenda;
    public static volatile SingularAttribute<Produto, String> barraEntrada;
    public static volatile SingularAttribute<Produto, String> unidadeVenda;
    public static volatile SingularAttribute<Produto, Integer> id;
    public static volatile SingularAttribute<Produto, String> unidadeCompra;
    public static volatile SingularAttribute<Produto, Date> dataCadastro;
    public static volatile SingularAttribute<Produto, Float> estoqueMinimo;
    public static volatile SingularAttribute<Produto, Integer> fatorConversao;
    public static volatile SingularAttribute<Produto, Character> status;

}