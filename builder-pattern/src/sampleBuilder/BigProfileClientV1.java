package sampleBuilder;

import sampleBuilder.BigProfileV1.BigProfileBuilderV1;

public class BigProfileClientV1 {

	public static void main(String[] args) {
		BigProfileV1	profile = new BigProfileBuilderV1()
		.addage(23)
		.addFirstName("raghav")
		//.addFootballFan(true)
		.build();
	
		System.out.println(profile);
	}

}
