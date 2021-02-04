package com.learning.designpatterns.adapter.self;

import java.util.List;
//existing file
public class FileReaderUtil {

	private Reader reader;

	public FileReaderUtil(Reader reader) {
		this.reader = reader;
	}

	public List<String> startReading(String path) {
		return reader.readFile(path);
	}
}
