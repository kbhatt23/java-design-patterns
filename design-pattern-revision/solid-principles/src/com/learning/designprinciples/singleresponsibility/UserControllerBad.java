package com.learning.designprinciples.singleresponsibility;

import java.nio.charset.Charset;
import java.util.Random;

//representing a controller class
//should have functionality only to provide requestmaping and delegating to servic method
//should never have validation/thiruid party call/D.B saving etc
public class UserControllerBad {

	// return the jsp view name
	public String createProfile(String profile) {
		if (validateProfile(profile)) {
			// call third party and save in LDAP D.B
			System.out.println("Profile is valid and hence generating random password");
			String randomPassword = fetchRandomPassword(profile);

			// save the profile in D.B
			boolean success = saveProfileInDataBase(profile, randomPassword);
			if (success) {
				return "success.jsp";
			}
		}
		return "error.jsp";
	}
//what if in future we want to save more fields
	//or save in another apis way of Db call
	//again controller needs to be modified
	private boolean saveProfileInDataBase(String profile, String randomPassword) {
		if (validatePassword(randomPassword)) {
			System.out.println("Saving Profile " + profile + " in session with generated password " + randomPassword);
			return true;
		} else {
			return false;
		}
	}

	private boolean validatePassword(String randomPassword) {
		return isStringNotEmpty(randomPassword);
	}

	// DRY -> do not repeat yourself
	// used to empty check profile as well as generatedPAssword
	private boolean isStringNotEmpty(String str) {
		return str != null && str.length() > 0;
	}

//fetched random password from Third party using json
	//what if in future api is changed, it takes xml and not json
	private String fetchRandomPassword(String profile) {
		System.out.println("Fetching Random password for profile " + profile);
		System.out.println("Recieved Response in JSON Format asdsd2323");
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));
		return generatedString;
	}

	//what if in future validation rules changes
	//again we have to modify the code in cotnroller whihc leds to do more vigorous integration and unit testing
	private boolean validateProfile(String profile) {
		return isStringNotEmpty(profile) && !profile.matches(".*\\d.*");
	}
}
