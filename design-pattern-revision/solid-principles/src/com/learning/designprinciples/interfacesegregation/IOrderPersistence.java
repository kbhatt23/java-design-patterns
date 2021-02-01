package com.learning.designprinciples.interfacesegregation;

public interface IOrderPersistence extends EntityPersistenceV2{

	public Entity findByOrderAddress(String orderAddress);
}
