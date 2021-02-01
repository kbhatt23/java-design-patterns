package com.learning.designpatterns.abstractfactory.advanced;

public class CloudInstanceFactory {
//there could be n number of condition that could be added in future
	public static CloudInstance create(CloudInstance.INSTANCE_TYPE type, String instanceId) {
		return type.fetchInstance(instanceId);
	}
}
