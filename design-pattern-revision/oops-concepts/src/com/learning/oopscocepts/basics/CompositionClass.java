package com.learning.oopscocepts.basics;

public class CompositionClass {
public static void main(String[] args) {
	//class is not accesible other than Home as kitche can not exist wothout home
	//Kitchen k = new Kitchen();
	//only way to create it is create home
	
	Home home = new Home(100, "delhi", "dal rice", 20);
	//kitche  is completely inside home
	//if homeis Gced it kills kitchen object as well
	System.out.println(home);
}
}



class Home {
	private double area;
	private String address;
	private Kitchen kitchen;
	//take individual kitchen proeprty
	//this way if home object is GCed kitche object do not exist as well
	public Home(double area, String address, String food,
	 double kitchenArea) {
		this.area = area;
		this.address = address;
		this.kitchen = new Kitchen(food, kitchenArea);
	}
	@Override
	public String toString() {
		return "Home [area=" + area + ", address=" + address + ", kitchen=" + kitchen + "]";
	}
	
	//both classes are tightly coupled
	//hence if we remove main class it kills inner class' object,
	//G.C kills inner if outer is gced
	//lets move it in inner class, should not be static
	private class Kitchen{
		private String food;
		private double area;
		public Kitchen(String food, double area) {
			super();
			this.food = food;
			this.area = area;
		}
		@Override
		public String toString() {
			return "Kitchen [food=" + food + ", area=" + area + "]";
		}
		
	}
	
}
