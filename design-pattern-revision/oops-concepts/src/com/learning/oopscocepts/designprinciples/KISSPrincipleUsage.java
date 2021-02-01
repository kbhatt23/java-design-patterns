package com.learning.oopscocepts.designprinciples;

import java.util.HashMap;
import java.util.Map;

//keep it simple and stupid
//dont write very smart methods with so many if else condition, break the condition into smaller methods if possible
//familiar is diff and simple is diff eg for loop vs foreach stream
public class KISSPrincipleUsage {
	private static Map<Integer, String> map ;
	static {
		map = new HashMap<>();
		map.put(1, "January");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(6, "June");
		map.put(7, "July");
		map.put(8, "August");
		map.put(9, "September");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
	}
	
	public static void main(String[] args) {
		int month = 13;
		//System.out.println(getMonthStrUsingSwitch(month));
		
		System.out.println(getMonthStrUsingArray(month));
	}

	// too many verbose things, too many if else conditions
	public static String getMonthStrUsingSwitch(int month) {
		String monthStr;
		// too much verbose and if else condition based -> may be familiar but not
		// simple
		switch (month) {
		case 1:
			monthStr = "January";
			break;
		case 2:
			monthStr = "February";
			break;
		case 3:
			monthStr = "March";
			break;
		case 4:
			monthStr = "April";
			break;
		case 5:
			monthStr = "May";
			break;
		case 6:
			monthStr = "June";
			break;
		case 7:
			monthStr = "July";
			break;
		case 8:
			monthStr = "August";
			break;
		case 9:
			monthStr = "September";
			break;
		case 10:
			monthStr = "October";
			break;
		case 11:
			monthStr = "November";
			break;
		case 12:
			monthStr = "December";
			break;

		default:
			throw new IllegalArgumentException("Passed month " + month + " is not valid");
		}

		return monthStr;
	}

	// better and simple based on KISS principle
	public static String getMonthStrUsingArray(int month) {
		if(!map.containsKey(month)) {
			throw new IllegalArgumentException("Passed month " + month + " is not valid");
		}
		return map.get(month);
	}
}
