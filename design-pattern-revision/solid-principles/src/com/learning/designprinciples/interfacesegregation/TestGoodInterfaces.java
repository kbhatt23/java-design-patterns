package com.learning.designprinciples.interfacesegregation;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestGoodInterfaces {
public static void main(String[] args) {
	Entity order = new OrderEntity(1, Arrays.asList("book","pen","bhagwat gita"), "delhi", 
			LocalDateTime.now(), "delhi");
	
	IOrderPersistence orderPersistence = new OrderPErsistenceImplV2()
			;
	orderPersistence.save(order);
	
	System.out.println("find by order id "+orderPersistence.getByID(order.getId()));
	System.out.println("find by order adddress "+orderPersistence.findByOrderAddress("delhi"));
	
	//blows up
	//method not reachable anymore
	//System.out.println("find by user name "+orderPersistence.findByUserName("delhi"));
	
	IUserPersistence userPersistence = new UserPersistenceImplV2()
			;
	Entity userEntity = new UserEntity(1, "krishna", "vaikuntha");
	userPersistence.save(userEntity);
	System.out.println("find by user id "+userPersistence.getByID(userEntity.getId()));
	System.out.println("user by name "+userPersistence.findByUserName("krishna"));
	
	//method not visible anymnore -> good interface segregation
	//System.out.println("user by order address "+userPersistence.findByOrderAddress("vaikuntha"));
}
}
