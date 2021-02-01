package com.learning.designpatterns.abstractfactory.advanced;

//represent abstract cloud instance like EC2 for aws , googlecomputeengine for GCP
//storage could also be of type S3 for aws and googlestorage for GCP
public abstract class CloudInstance {

	// for aws start with EC2-xxx and for GCP start with GCP-XXX
	private String instanceId;

	// not mandatory and hence not added in cosntructor
	private CloudStorage cloudStorage;

	public CloudInstance(String instanceId) {
		this.instanceId = instanceId;
	}

	public abstract void start() 
;
	public abstract void stop() ;

	// we can attach differend kind of storage based on cloud provider and hence
	// making it abstract
	// way of atahing is different for GCP and AWS
	public abstract void attachStorage(CloudStorage cloudStorage);

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public CloudStorage getCloudStorage() {
		return cloudStorage;
	}

	public void setCloudStorage(CloudStorage cloudStorage) {
		this.cloudStorage = cloudStorage;
	}

	// enum saves factory even complex abstract factory looks easy
	// no ned of complex if else case and w8 if type is nto supported
	public enum INSTANCE_TYPE {
		EC2 {
			@Override
			public CloudInstance fetchInstance(String instanceId) {
				return new EC2Instance(instanceId);
			}

			@Override
			public CloudStorage fetchStorage(String id) {
				return new S3Storage(id);
			}
		},
		GCP {
			@Override
			public CloudInstance fetchInstance(String id) {
				return new GoogleCloudEngineInstance(id);
			}

			@Override
			public CloudStorage fetchStorage(String id) {
				return new GCPStorage(id);
			}
		};

		public abstract CloudInstance fetchInstance(String instanceId);

		public abstract CloudStorage fetchStorage(String id);

		// using enum extension just to support factory methods
	}

	public static CloudInstance create(INSTANCE_TYPE type, String instanceID) {
		return type.fetchInstance(instanceID);
	}
}
