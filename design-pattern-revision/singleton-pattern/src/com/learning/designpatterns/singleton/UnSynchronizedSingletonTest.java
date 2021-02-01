package com.learning.designpatterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnSynchronizedSingletonTest {
	public static void main(String[] args) {

		//test in single core
//		for(int i =0 ; i< 5 ; i++) {
//			UnSynchronizedSingleton instance = UnSynchronizedSingleton.getInstance();
//			System.out.println(instance);
//		}
		
		System.out.println("================");
		
		//test in multi core
		ExecutorService svc = Executors.newFixedThreadPool(5);
		for(int i =0 ; i< 5 ; i++) {
			svc.execute(() -> {
				UnSynchronizedSingleton instance = UnSynchronizedSingleton.getInstance();
				System.out.println(instance);
			});
		}
		svc.shutdown();
	}
}
