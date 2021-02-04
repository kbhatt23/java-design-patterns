package com.learning.designpatterns.self;

import java.util.ArrayList;
import java.util.List;

public class SelfImmutableList {
public static void main(String[] args) {
	List<Integer> items = new ArrayList<>();
	
	for(int i = 1; i <=10 ; i++) {
		items.add(i);
	}
	
	List<Integer> createImmutableList = createImmutableList(items);
	
	createImmutableList.add(23);
	
}

public static <T>  List<T> createImmutableList(List<T> actualList){
	return new ListUnmodifableProxy<>(actualList);
}
}
