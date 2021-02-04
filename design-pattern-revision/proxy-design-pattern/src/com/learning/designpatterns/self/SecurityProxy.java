package com.learning.designpatterns.self;

import java.util.Arrays;

//same contract as main functionaloty provier so taht client code is same
//client do not even know if proxy is used
public class SecurityProxy implements ApplicationRunner{

	//can be aded for any ApplicationRunner 
	private ApplicationRunner actualRunner;
	private String userName;
	private char[] password;
	private static String actualUserNAme;
	//for better security
	private static char[] actualPassword;
	static {
		actualUserNAme = "krishna";
		actualPassword = "jairadhekrishna".toCharArray();
	}
	

	public SecurityProxy(ApplicationRunner actualRunner, String userName, String password) {
		this.actualRunner = actualRunner;
		this.userName = userName;
		this.password = password.toCharArray();
	}


	@Override
	public void runTask() {
		if(userName.equals(actualUserNAme) && Arrays.equals(password, actualPassword)) {
			actualRunner.runTask();
		}else {
			throw new IllegalAccessError("Wrong credentials provided");
		}
		
	}


	@Override
	public void runTask2() {
		if(userName.equals(actualUserNAme) && Arrays.equals(password, actualPassword)) {
			actualRunner.runTask2();
		}else {
			throw new IllegalAccessError("Wrong credentials provided");
		}		
	}

}
