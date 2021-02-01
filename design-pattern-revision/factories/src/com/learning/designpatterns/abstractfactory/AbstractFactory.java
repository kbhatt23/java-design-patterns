package com.learning.designpatterns.abstractfactory;
//each factory group will implement this
public interface AbstractFactory<T> {

	//assuming it calls no arg constructos only as of now
	public  T  build(Class<? extends T> type);
}
