package com.learning.designprinciples.singleresponsibility;

public class ValidationUtil {
	public boolean validateProfile(String profile) {
		return isStringNotEmpty(profile) && !profile.matches(".*\\d.*");
	}
	
	// DRY -> do not repeat yourself
	// used to empty check profile as well as generatedPAssword
	public boolean isStringNotEmpty(String str) {
		return str != null && str.length() > 0;
	}
}
