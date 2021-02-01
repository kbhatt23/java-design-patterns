package com.learning.designprinciples.singleresponsibility;

import java.nio.charset.Charset;
import java.util.Random;

//representing a controller class
//we are doing only task like requestmapping and delegating to service classes
//also we are just then returning view thats it
//very few reason to modify the class and hence less regressiont esting effort will be needed in future cahnges/bugs
public class UserControllerSingleResponsiblity {
//as of now not using ioc
	private ValidationUtil validationUtil = new ValidationUtil();
	private LDAPPasswordUtil ldapPasswordUtil = new LDAPPasswordUtil();

	private ProfileDataService profileDataService = new ProfileDataService(validationUtil);

	// return the jsp view name
	public String createProfile(String profile) {
		// in case validation rule changes no need to modify this class -> controller
		// changes not needed
		if (validationUtil.validateProfile(profile)) {
			// call third party and save in LDAP D.B
			System.out.println("Profile is valid and hence generating random password");
			String randomPassword = ldapPasswordUtil.fetchRandomPassword(profile);

			// save the profile in D.B
			boolean success = profileDataService.saveProfileInDataBase(profile, randomPassword);
			if (success) {
				return "success.jsp";
			}
		}
		return "error.jsp";
	}

}
