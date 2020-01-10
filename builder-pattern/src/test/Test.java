package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("messi", "xavi", "kaka" , "iniesta");
		
	String combined = 	String.join(",", items);
		System.out.println("<p>"+"jai shree ram " + combined +"</p>");
	}

}
