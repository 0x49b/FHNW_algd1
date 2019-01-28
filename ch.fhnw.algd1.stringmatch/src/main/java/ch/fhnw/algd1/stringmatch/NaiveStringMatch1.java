package ch.fhnw.algd1.stringmatch;

import ch.fhnw.algd1.stringmatch.framework.IStringMatch;

public class NaiveStringMatch1 implements IStringMatch {
	@Override
	public int firstMatch(String text, String pattern) {
		// TODO sequential search for first i such that matches(text, i, pattern)
		return 0;
	}

	private boolean matches(String text, int start, String pattern) {
		// TODO return if pattern matches text from position start
		return false;
	}
}