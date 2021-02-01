package com.learning.oopscocepts.designprinciples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//write code so that in future same class is not needed to be modified for new implementations
//just like delgation example we could use interface for that, but herer i am using functional programming
public class OpenClosePrincipleUsage {
	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//even numbers only
		List<Integer> filtered1 = FindItems.findAndFilter(items, i -> i % 2 == 0);
		System.out.println(filtered1);

//odd numbers only
		List<Integer> filtered2 = FindItems.findAndFilter(items, i -> i % 2 != 0);
		System.out.println(filtered2);
		System.out.println(items.size() == (filtered1.size() + filtered2.size()));
	}
}

class FindItems {
	// lets say we could write code to filter based on diff criteria
	// that way we must write multiple method, using lambda we can take the logic
	// from the user
	public static <T> List<T> findAndFilter(List<T> items, Predicate<T> filter) {

		return items.stream().filter(filter).collect(Collectors.toList());
	}
}
