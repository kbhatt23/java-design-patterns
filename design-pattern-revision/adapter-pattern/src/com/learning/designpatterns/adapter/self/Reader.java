package com.learning.designpatterns.adapter.self;

import java.util.List;

public interface Reader {

	public List<String> readFile(String path);
}
