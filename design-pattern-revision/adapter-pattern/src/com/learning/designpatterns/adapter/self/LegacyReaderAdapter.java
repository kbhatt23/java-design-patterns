package com.learning.designpatterns.adapter.self;

import java.util.Arrays;
import java.util.List;

public class LegacyReaderAdapter implements Reader {

	// add new api instance
	private LegacyReader legacyReader;

	public LegacyReaderAdapter(LegacyReader legacyReader) {
		this.legacyReader = legacyReader;
	}

	@Override
	public List<String> readFile(String path) {
		System.out.println("LegacyReaderAdapter: Adapter called with path " + path);
		// delegate to legacy code
		String[] leagyResult= legacyReader.readLegacy(path);
		return Arrays.asList(leagyResult);
	}

}
