package com.learning.designpatterns.self;

public class Developer implements Employee{

	//all the intrinsci proeprties, properties that remain same for all object of this sub category can remain here
	private String taskMessage;
	
	
	public Developer() {
		taskMessage= "Development";
	}
	//extrnisc properties
	private Skill skill;
	private String name;
	@Override
	public void startTask() {
		System.out.println("Developer with name "+name+" and skill "+skill+" started task "+taskMessage);
	}

	@Override
	public void updateName(String name) {
		this.name=name;
	}

	@Override
	public void updateSkill(Skill skill) {
		this.skill=skill;
	}

}
