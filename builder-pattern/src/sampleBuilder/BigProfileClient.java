package sampleBuilder;

import sampleBuilder.BigProfile.BigProfileBuilder;

public class BigProfileClient {

	public static void main(String[] args) {
		BigProfileBuilder builder = new BigProfileBuilder("raghav");
		BigProfile bigProfile = builder//.setAge(1000000)
		.setFootballFan(true).build();
		
		System.out.println(bigProfile);
	}

}
