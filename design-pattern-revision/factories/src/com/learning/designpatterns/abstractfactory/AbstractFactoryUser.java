package com.learning.designpatterns.abstractfactory;

public class AbstractFactoryUser {
public static void main(String[] args) {
	//forcetype check
	AbstractFactory<Race> raceFactory = new RaceFactory();
	AbstractFactory<Employee> employeefacFactory = new EmployeeFactory();
	
	
	FactoryDiscoverableObject sprint = FactoryDiscoverableObject.create(raceFactory, Marathon.class);
	System.out.println(sprint);
	
	
	FactoryDiscoverableObject permanent = FactoryDiscoverableObject.create(employeefacFactory, PermanentWorker.class);
	System.out.println(permanent);
}
}
