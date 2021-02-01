package com.learning.designpatterns.abstractfactory.advanced;

public class GoogleCloudEngineInstance extends CloudInstance{

	public GoogleCloudEngineInstance(String instanceId) {
		super(instanceId);
	}

	@Override
	public void attachStorage(CloudStorage cloudStorage) {
		System.out.println("Started attaching storage for GCP instance "+getInstanceId() + " with storage "+cloudStorage.getId());
		
		//complex logic in between
		
		System.out.println("Completed attaching storage for GCP instance "+getInstanceId()+ " with storage "+cloudStorage.getId());
	}
	
	@Override
	public void start() {
		//complex aws ec2 logic to start
		System.out.println("Started GCP nstance with ID " + getInstanceId());		
	}

	@Override
	public void stop() {
		//complex aws ec2 logic to stop
		System.out.println("Stopped GCP Instance with ID " + getInstanceId());		
	}

}
