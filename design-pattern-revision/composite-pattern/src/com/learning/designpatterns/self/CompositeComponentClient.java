package com.learning.designpatterns.self;

public class CompositeComponentClient {
	public static void main(String[] args) {
		Component component = new CompositeComponent(1);
		component.add(new CompositeComponent(2));
		component.add(new CompositeComponent(3));
		//component.print();
		
		Component component11 = new CompositeComponent(11);
		component11.add(new CompositeComponent(22));
		
		component.add(component11);
		
		component.print();
		
		System.out.println("lets remove");
		
		System.out.println("remove result "+component.remove(new CompositeComponent(22)));
		component.print();
	}
}
