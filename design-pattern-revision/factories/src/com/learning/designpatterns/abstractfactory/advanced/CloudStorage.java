package com.learning.designpatterns.abstractfactory.advanced;

//represent general kind of cloud storage, for AWS it is EC2 for google it is GoogleCloudStorage
public class CloudStorage {
	//starts with EC2-XXX for AWS and GCPS-XXX for GCP
	private String id;

	public CloudStorage(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static CloudStorage create(CloudInstance.INSTANCE_TYPE type, String id) {
		return type.fetchStorage(id);
	}
	
}
