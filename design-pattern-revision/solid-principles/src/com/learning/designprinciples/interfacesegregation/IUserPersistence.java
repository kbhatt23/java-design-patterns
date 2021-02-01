package com.learning.designprinciples.interfacesegregation;

public interface IUserPersistence extends EntityPersistenceV2{

	public Entity findByUserName(String userName);
}
