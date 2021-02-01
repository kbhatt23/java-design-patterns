package com.learning.designpatterns.builder;

public class ImmutableUserClient {
public static void main(String[] args) {
	//can not create object directly
	//private constructort
	//ImmutableUser fake = new ImmutableUser(1, "fake", 23, 101.101);
	
	//also builder object can not be created as constructor is private
	//ImmutableUser ka = new ImmutableUser(1,"fake");
	
	ImmutableUser builtUser = ImmutableUser.builder(1, "krishna")
				.setAge(-1)
				.setSalary(-1)
				.build()
				;
	
	System.out.println(builtUser);
	//can not modify the stae anymore as setter are not there
				
}
}
