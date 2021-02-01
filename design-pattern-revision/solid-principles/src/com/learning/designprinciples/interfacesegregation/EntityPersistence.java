package com.learning.designprinciples.interfacesegregation;

public interface EntityPersistence {

	public Entity getByID(int id);
	
	public void save(Entity entity);
	
	//bad ones now
	
	public Entity findByUserName(String userName);
	
	public Entity findByOrderAddress(String orderAddress);
}
