package com.learning.designpatterns.abstractfactory;

//marker interface
public interface FactoryDiscoverableObject {
	public static <T extends FactoryDiscoverableObject> T create(AbstractFactory<T> abstractFactory ,
			Class<? extends T> type) {
		return abstractFactory.build(type);
	}
}
