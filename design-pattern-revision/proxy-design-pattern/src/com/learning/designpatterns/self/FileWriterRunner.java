package com.learning.designpatterns.self;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterRunner implements ApplicationRunner{
//segregation of concern why to store username and password here
	@Override
	public void runTask() {
		try(PrintWriter writer = new PrintWriter(new File("files/sample.txt"))){
			writer.write("jai jai radha raman hari bol");
			System.out.println("file written succesfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void runTask2() {

		try(PrintWriter writer = new PrintWriter(new File("files/sample.txt"))){
			writer.write("jai shree ram");
			System.out.println("file written succesfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
