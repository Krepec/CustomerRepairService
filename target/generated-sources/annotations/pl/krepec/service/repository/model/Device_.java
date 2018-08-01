package pl.krepec.service.repository.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Device.class)
public abstract class Device_ {

	public static volatile ListAttribute<Device, Repair> repairs;
	public static volatile SingularAttribute<Device, String> serialNumber;
	public static volatile SingularAttribute<Device, String> comments;
	public static volatile SingularAttribute<Device, Long> imei;
	public static volatile SingularAttribute<Device, String> model;
	public static volatile SingularAttribute<Device, Integer> deviceId;
	public static volatile SingularAttribute<Device, String> mark;

}

