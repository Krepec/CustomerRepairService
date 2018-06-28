package pl.krepec.service.repository.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Repair.class)
public abstract class Repair_ {

	public static volatile SingularAttribute<Repair, Date> purchaseDate;
	public static volatile SingularAttribute<Repair, String> comments;
	public static volatile SingularAttribute<Repair, Integer> partId;
	public static volatile SingularAttribute<Repair, Date> endDate;
	public static volatile SingularAttribute<Repair, String> issueDescribe;
	public static volatile SingularAttribute<Repair, Integer> repairId;
	public static volatile SingularAttribute<Repair, Integer> deviceId;
	public static volatile SingularAttribute<Repair, Integer> deliveryTypeId;
	public static volatile SingularAttribute<Repair, Integer> statusId;
	public static volatile SingularAttribute<Repair, Integer> customerId;
	public static volatile SingularAttribute<Repair, Integer> technicianId;
	public static volatile SingularAttribute<Repair, Integer> repairTypeId;
	public static volatile SingularAttribute<Repair, Date> startDate;

}

