package com.learning.designprinciples.interfacesegregation;

import java.util.HashMap;
import java.util.Map;

public class OrderPErsistenceImpl implements EntityPersistence{
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
	public Entity findByUserName(String userName) {
		//design smell, better break down the interface
				throw new UnsupportedOperationException("order can not have username");
	}

	@Override
	public Entity findByOrderAddress(String orderAddress) {
		return storage.values().stream().map(i -> (OrderEntity) i).filter(user -> user.getAddress().equals(orderAddress))
				.findFirst().orElse(null);
	}

}
