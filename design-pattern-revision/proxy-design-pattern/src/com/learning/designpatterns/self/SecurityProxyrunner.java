package com.learning.designpatterns.self;

public class SecurityProxyrunner {
	public static void main(String[] args) {
		// without proxy
		String wrongUser = "kalish";
		String wrongPassword = "wrongiseverything";
		
		
		String user = "krishna";
		String pass = "jairadhekrishna";

		String type = "file";
//		ApplicationRunner runnerWithoutProxy = getRunnerWithoutProxy(type);
//		runnerWithoutProxy.runTask();
		//ApplicationRunner runnerWithProxy = getRunnerWithProxy(wrongUser,wrongPassword,type);
		
		ApplicationRunner runnerWithProxy = getRunnerWithProxy(user,pass,type);
		//runnerWithProxy.runTask();
		runnerWithProxy.runTask2();
	}

	//wont check the credentials, better make constructor as private , and use proxy as inner class
	public static ApplicationRunner getRunnerWithoutProxy(String type) {
		if ("console".equals(type)) {
			ApplicationRunner runner1 = new ConsolePrintRunner();
			return runner1;
		} else {
			ApplicationRunner runner2 = new FileWriterRunner();
			return runner2;
		}
	}

	public static ApplicationRunner getRunnerWithProxy(String userName, String password, String type) {
		return ApplicationRunner.createSecurityInstance(type, userName, password);
	}
}
