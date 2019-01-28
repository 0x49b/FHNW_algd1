package ch.fhnw.algd1.stringmatch;

import ch.fhnw.algd1.stringmatch.framework.IStringMatch;

/**
 * Boyer-Moore-Horspool String Match (supporting LATIN-1 character set)
 */
public class BoyerMooreHorspoolStringMatch implements IStringMatch {
	private int[] allShifts(String pattern) {
		int[] shift = new int[256]; // we support the LATIN-1 character set
		// TODO preprocess pattern, create occurrence heuristics
		return shift;
	}

	@Override
	public int firstMatch(String text, String pattern) {
		int[] shift = allShifts(pattern);
		// TODO search for first start position i where pattern matches text
		return 0;
	}
}
