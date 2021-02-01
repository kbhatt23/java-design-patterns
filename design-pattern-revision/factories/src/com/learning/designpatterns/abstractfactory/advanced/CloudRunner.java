package com.learning.designpatterns.abstractfactory.advanced;

import com.learning.designpatterns.abstractfactory.advanced.CloudInstance.INSTANCE_TYPE;

public class CloudRunner {

	public static void main(String[] args) {
		CloudInstance.INSTANCE_TYPE cloudProvider = CloudInstance.INSTANCE_TYPE.EC2;
		String instanceId = "EC2-1234";
		String storageId = "S3-1234";
		initiateCloudTask(cloudProvider, instanceId, storageId);

		System.out.println("========GCP starts=====");
		instanceId = "GCP-1234";
		storageId = "GCPS-1234";
		cloudProvider = CloudInstance.INSTANCE_TYPE.GCP;

		initiateCloudTask(cloudProvider, instanceId, storageId);
	}

	private static void initiateCloudTask(INSTANCE_TYPE cloudProvider, String instanceId, String storageId) {

		CloudInstance cloudInstance = CloudInstance.create(cloudProvider, instanceId);
		cloudInstance.start();

		CloudStorage storage = CloudStorage.create(cloudProvider, storageId);
		cloudInstance.attachStorage(storage);
		cloudInstance.stop();
	}
}
