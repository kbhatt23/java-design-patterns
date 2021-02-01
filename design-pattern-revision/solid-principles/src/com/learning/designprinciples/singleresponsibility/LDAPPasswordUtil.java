package com.learning.designprinciples.singleresponsibility;

import java.nio.charset.Charset;
import java.util.Random;

public class LDAPPasswordUtil {

	// fetched random password from Third party using json
	// what if in future api is changed, it takes xml and not json
	// no need to modify the controller class, only this class needs to be modified
	public String fetchRandomPassword(String profile) {
		System.out.println("Fetching Random password for profile " + profile);
		System.out.println("Recieved Response in JSON Format asdsd2323");
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));
		return generatedString;
	}
}
