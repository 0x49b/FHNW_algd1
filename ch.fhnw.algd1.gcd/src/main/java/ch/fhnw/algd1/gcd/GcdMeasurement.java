package ch.fhnw.algd1.gcd;

import java.util.Locale;

import ch.fhnw.algd1.gcd.framework.IGcd;

public class GcdMeasurement {
	private static final int x = 123456;
	private static final int y = 654321;
	private static final int N = 1_000_000;

	public static void main(String[] args) {
		measure("Iteration", new GcdIter());
		System.out.println();
		measure("Recursion", new GcdRec());
	}

	private static void measure(String method, IGcd ggt) {
		System.out.println("Start measurement with: " + method);
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			ggt.gcd(x, y);
		}
		long end = System.currentTimeMillis();
		System.out.printf(Locale.forLanguageTag("de-ch"),
				"Finished %,d times. Took %.3f seconds\n", N, (end - start) / 1000d);
	}
}
