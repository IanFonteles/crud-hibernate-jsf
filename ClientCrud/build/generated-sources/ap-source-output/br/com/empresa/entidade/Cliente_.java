package br.com.empresa.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> nmCliente;
	public static volatile SingularAttribute<Cliente, String> cpfCliente;
	public static volatile SingularAttribute<Cliente, Date> aniversarioCliente;
	public static volatile SingularAttribute<Cliente, String> telefoneCliente;
	public static volatile SingularAttribute<Cliente, Integer> idClient;
	public static volatile SingularAttribute<Cliente, String> dsEmail;
	public static volatile SingularAttribute<Cliente, String> nmPaiCliente;
	public static volatile SingularAttribute<Cliente, String> nmMaeCliente;

}

