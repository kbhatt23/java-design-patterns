package com.learning.designpatterns.adapter.self;

import java.util.Arrays;
import java.util.List;

public class StreamFileReader implements Reader{

	@Override
	public List<String> readFile(String path) {
		System.out.println("StreamFileReader readfile called with path "+path);
		
		return Arrays.asList("sia-ram","radhe-shyam");
	}

}
