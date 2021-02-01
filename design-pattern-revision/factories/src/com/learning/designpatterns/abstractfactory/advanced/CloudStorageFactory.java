package com.learning.designpatterns.abstractfactory.advanced;

public class CloudStorageFactory {
//there could be n number of condition that could be added in future
	public static CloudStorage create(CloudInstance.INSTANCE_TYPE type, String id) {
		return type.fetchStorage(id);
	}
}
