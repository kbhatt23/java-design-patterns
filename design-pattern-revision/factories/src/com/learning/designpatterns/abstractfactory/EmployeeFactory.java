package com.learning.designpatterns.abstractfactory;

//this is sub factory for employees
public class EmployeeFactory implements AbstractFactory<Employee>{

	@Override
	public Employee build(Class<? extends Employee> type) {
		if(type == PermanentWorker.class) {
			return new PermanentWorker();
		}
		else if(type == DailyWorker.class) {
			return new DailyWorker();
		}else {
			throw new UnsupportedOperationException("We do not support of this type "+type );
		}
	
	}







}
