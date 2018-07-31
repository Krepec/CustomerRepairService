package pl.krepec.service.repository.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile ListAttribute<Customer, Repair> repairs;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SingularAttribute<Customer, String> surname;
	public static volatile SingularAttribute<Customer, String> street;
	public static volatile SingularAttribute<Customer, String> flatNumber;
	public static volatile SingularAttribute<Customer, String> postalCode;
	public static volatile SingularAttribute<Customer, Long> customerId;
	public static volatile SingularAttribute<Customer, String> name;
	public static volatile SingularAttribute<Customer, String> phoneNumber1;
	public static volatile SingularAttribute<Customer, String> phoneNumber2;
	public static volatile SingularAttribute<Customer, String> buildingNumber;
	public static volatile SingularAttribute<Customer, String> email;

}

