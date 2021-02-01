package com.learning.designpatterns.abstractfactory.advanced;

public class EC2Instance extends CloudInstance{

	public EC2Instance(String instanceId) {
		super(instanceId);
	}

	@Override
	public void attachStorage(CloudStorage cloudStorage) {
		System.out.println("Started attaching storage for EC2 instance "+getInstanceId()+" with storage "+cloudStorage.getId());
		
		//complex logic in between
		
		System.out.println("Completed attaching storage for EC2 instance "+getInstanceId()+" with storage "+cloudStorage.getId());
	}

	@Override
	public void start() {
		//complex aws ec2 logic to start
		System.out.println("Started EC2 nstance with ID " + getInstanceId());		
	}

	@Override
	public void stop() {
		//complex aws ec2 logic to stop
		System.out.println("Stopped EC2 Instance with ID " + getInstanceId());		
	}

}
