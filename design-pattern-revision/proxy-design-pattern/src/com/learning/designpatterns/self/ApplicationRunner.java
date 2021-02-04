package com.learning.designpatterns.self;

public interface ApplicationRunner {

	public void runTask();
	
	public void runTask2();

	static ApplicationRunner createSecurityInstance(String type,String userName, String password) {
		switch (type) {
		case "console":
			return new SecurityProxy(new ConsolePrintRunner(),userName,password);
		case "file":
			return new SecurityProxy(new FileWriterRunner(),userName,password);
		default:
			throw new IllegalArgumentException("We do not support provide type " + type);
		}
	}
}
