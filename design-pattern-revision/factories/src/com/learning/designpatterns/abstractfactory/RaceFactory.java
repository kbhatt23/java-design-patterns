package com.learning.designpatterns.abstractfactory;

public class RaceFactory implements AbstractFactory<Race>{

	@Override
	public Race build(Class<? extends Race> type) {
		if(type == Marathon.class) {
			return new Marathon();
		}
		else if(type == Sprint.class) {
			return new Sprint();
		}else {
			throw new UnsupportedOperationException("We do not support of this type "+type );
		}
	}


}
