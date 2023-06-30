package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.ItensCupomFiscal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-29T21:31:43")
@StaticMetamodel(CupomFiscal.class)
public class CupomFiscal_ { 

    public static volatile SingularAttribute<CupomFiscal, Date> horaVenda;
    public static volatile SingularAttribute<CupomFiscal, Float> totalCupom;
    public static volatile SingularAttribute<CupomFiscal, Date> dataVenda;
    public static volatile SingularAttribute<CupomFiscal, Float> valorDesconto;
    public static volatile SingularAttribute<CupomFiscal, Float> valorAcrescimo;
    public static volatile SingularAttribute<CupomFiscal, ItensCupomFiscal> itensCupomFiscal;
    public static volatile SingularAttribute<CupomFiscal, Integer> id;
    public static volatile SingularAttribute<CupomFiscal, Character> status;

}