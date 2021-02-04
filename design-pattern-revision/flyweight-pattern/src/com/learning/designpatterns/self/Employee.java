package com.learning.designpatterns.self;

//super class of categories
//contains updating of extrinsic properties: as these cahnges for each object asn clietn must have access of these methods
public interface Employee {

	//API task, contract of API
	public void startTask();
	
	//state that changes for each object of sub categories
	//let the client get refernce of method to update the name/extrinsci proeprty
	void updateName(String name);
	
	//for each dev skill will be different
	void updateSkill(Skill skill);
	
	//stacic: no need to create object of manin class to access the enum
	public static enum Skill{
		DEVELOPER {
			@Override
			public Employee fetchEmployee() {
				return new Developer();
			}
		},TESTER {
			@Override
			public Employee fetchEmployee() {
				return new Tester();
			}
		};
		
		public abstract Employee fetchEmployee() ;
	}
}
