package com.learning.designpatterns.singleton;

public class UnSynchronizedSingleton {

	private UnSynchronizedSingleton() {

	}

	private static UnSynchronizedSingleton INSTANCE;

	public static UnSynchronizedSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UnSynchronizedSingleton();
		}
		return INSTANCE;
	}
}
