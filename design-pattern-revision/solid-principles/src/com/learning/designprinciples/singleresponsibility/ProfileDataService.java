package com.learning.designprinciples.singleresponsibility;

public class ProfileDataService {
	private ValidationUtil validationUtil;

	public ProfileDataService(ValidationUtil validationUtil) {
		this.validationUtil = validationUtil;
	}

	// what if in future we want to save more fields
	// or save in another apis way of Db call
	// again controller needs to be modified
	public boolean saveProfileInDataBase(String profile, String randomPassword) {
		if (validatePassword(randomPassword)) {
			System.out.println("Saving Profile " + profile + " in session with generated password " + randomPassword);
			return true;
		} else {
			return false;
		}
	}

	private boolean validatePassword(String randomPassword) {
		return validationUtil.isStringNotEmpty(randomPassword);
	}
}
