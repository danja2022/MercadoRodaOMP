package com.mycompany.mercadomaven_hibernate_jpa.Model.bo;

import com.mycompany.mercadomaven_hibernate_jpa.Model.bo.Compra;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-06-13T22:20:11")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ extends Pessoa_ {

    public static volatile SingularAttribute<Fornecedor, String> inscEstadual;
    public static volatile SingularAttribute<Fornecedor, Compra> compra;
    public static volatile SingularAttribute<Fornecedor, String> rg;
    public static volatile SingularAttribute<Fornecedor, String> cpf;
    public static volatile SingularAttribute<Fornecedor, String> cnpj;
    public static volatile SingularAttribute<Fornecedor, String> contato;
    public static volatile SingularAttribute<Fornecedor, String> razaoSocial;

}