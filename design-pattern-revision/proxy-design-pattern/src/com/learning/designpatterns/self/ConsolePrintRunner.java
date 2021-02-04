package com.learning.designpatterns.self;

public class ConsolePrintRunner implements ApplicationRunner{
//segregation of concern why to store username and password here
	@Override
	public void runTask() {
		System.out.println("ConsolePrintRunner: jai jai radha raman hari bol");
	}

	@Override
	public void runTask2() {
		System.out.println("ConsolePrintRunner: jai shree ram");
	}

}
