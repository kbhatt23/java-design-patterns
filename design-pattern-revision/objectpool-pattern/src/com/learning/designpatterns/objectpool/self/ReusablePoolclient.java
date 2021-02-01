package com.learning.designpatterns.objectpool.self;

import java.util.Random;

public class ReusablePoolclient {
public static void main(String[] args) {
	int poolSize = 5;
	int maxItems= 10;
	ReusablePool pool = ThreadReusablePool.createPool(poolSize);
	//lets create diffrent threads
	for(int i = 1 ; i <= maxItems; i++) {
		Thread thread = new Thread(
				() -> {
					Reusable aquirePoolInstance = pool.aquirePoolInstance();
					//update the state
					aquirePoolInstance.updateState(new Random().nextInt());
					aquirePoolInstance.runTask();
					pool.releasePoolInstance(aquirePoolInstance);
				}
				);
		thread.start();
		
	}
	System.out.println("All tasks submitted");
}
}
