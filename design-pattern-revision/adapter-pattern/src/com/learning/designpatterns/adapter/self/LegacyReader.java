package com.learning.designpatterns.adapter.self;
//assume a new api came form jar whihc do not folles the interface contract
public class LegacyReader {

	public String[] readLegacy(String path) {
		System.out.println("LegacyReader readfile called with path "+path);
		
		return new String[] {"uma-maheshwar","lakshmi-narayan" };
	}
}
