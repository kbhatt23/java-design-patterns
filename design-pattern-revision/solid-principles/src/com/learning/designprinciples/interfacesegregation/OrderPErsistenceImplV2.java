package com.learning.designprinciples.interfacesegregation;

import java.util.HashMap;
import java.util.Map;

public class OrderPErsistenceImplV2 implements IOrderPersistence{
	private static Map<Integer, Entity> storage = new HashMap<>();
	
	@Override
	public Entity getByID(int id) {
		return storage.get(id);
	}

	@Override
	public void save(Entity entity) {
		storage.put(entity.getId(), entity);
	}

	@Override
	public Entity findByOrderAddress(String orderAddress) {
		return storage.values().stream().map(i -> (OrderEntity) i).filter(user -> user.getAddress().equals(orderAddress))
				.findFirst().orElse(null);
	}


}
