package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.ItensCompra;
import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Pagar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-13T22:20:11")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Pagar> pagar;
    public static volatile SingularAttribute<Compra, Float> totalNF;
    public static volatile SingularAttribute<Compra, String> tipoNF;
    public static volatile SingularAttribute<Compra, Float> valorDesconto;
    public static volatile SingularAttribute<Compra, Float> valorAcrescimo;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, String> numeroNF;
    public static volatile SingularAttribute<Compra, ItensCompra> itensCompra;
    public static volatile SingularAttribute<Compra, String> horaCompra;
    public static volatile SingularAttribute<Compra, Date> dataCompra;
    public static volatile SingularAttribute<Compra, Character> status;

}