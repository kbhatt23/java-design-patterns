package com.learning.designprinciples.interfacesegregation;

import java.util.HashMap;
import java.util.Map;

public class UserPersistenceImplV2 implements IUserPersistence {
	private static Map<Integer, Entity> storage = new HashMap<>();

	@Override
	public Entity getByID(int id) {
		return storage.get(id);
	}

	@Override
	public void save(Entity entity) {
		storage.put(entity.getId(), entity);
	}

	// for user it is fine , but what about order
	@Override
	public Entity findByUserName(String userName) {
		return storage.values().stream().map(i -> (UserEntity) i).filter(user -> user.getName().equals(userName))
				.findFirst().orElse(null);
	}


}
