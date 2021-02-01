package com.learning.designprinciples.singleresponsibility;

public class UserControllerRunner {

	public static void main(String[] args) {
//		UserControllerBad controller = new UserControllerBad();
//String viewToReturn = controller.createProfile("jagadnath");
//		
//		System.out.println(viewToReturn);
		UserControllerSingleResponsiblity controller = new UserControllerSingleResponsiblity();
		System.out.println(controller.createProfile("jagadnath"));

	}

}
