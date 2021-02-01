package com.learning.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedSingletonTest {
	public static void main(String[] args) {

		//test in single core
//		for(int i =0 ; i< 5 ; i++) {
//			SynchronizedSingletonDoubleLocked instance = SynchronizedSingletonDoubleLocked.getInstance();
//			System.out.println(instance);
//		}
		
		System.out.println("================");
		
		//test in multi core
		ExecutorService svc = Executors.newFixedThreadPool(5);
		for(int i =0 ; i< 5 ; i++) {
			svc.execute(() -> {
				SynchronizedSingletonDoubleLocked instance = SynchronizedSingletonDoubleLocked.getInstance();
				System.out.println(instance);
			});
		}
		svc.shutdown();
	}
}
