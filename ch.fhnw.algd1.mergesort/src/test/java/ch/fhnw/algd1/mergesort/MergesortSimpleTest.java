package ch.fhnw.algd1.mergesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MergesortSimpleTest {

	private MergesortSimple sort;

	@Before
	public void init() {
		sort = new MergesortSimple();
	}

	@Test
	public void testEmptyArray() {
		int[] numbers = new int[] {};
		sortAndCheck(numbers);
	}

	@Test
	public void testArrayWithOneElement() {
		int[] numbers = new int[] { 2 };
		sortAndCheck(numbers);
	}

	@Test
	public void testSameNumbers() {
		int[] numbers = new int[] { 2, 2, 2, 2, 2 };
		sortAndCheck(numbers);
	}

	@Test
	public void testAlreadySorted() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5 };
		sortAndCheck(numbers);
	}

	@Test
	public void testRandomOrder() {
		int[] numbers = new int[] { 34, 64, 12, 6, 8, 345, 54 };
		sortAndCheck(numbers);
	}

	@Test
	public void testTwoSections() {
		int[] numbers = new int[] { 5, 6, 7, 8, 1, 2, 3, 4 };
		sortAndCheck(numbers);
	}

	@Test
	public void testDescendingOrder() {
		int[] numbers = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		sortAndCheck(numbers);
	}

	private void sortAndCheck(int[] numbers) {
		int[] original = Arrays.copyOf(numbers, numbers.length);
		sort.mergesort(numbers);
		assertEquals("Number of elements differs from original", original.length, numbers.length);
		assertTrue("Elements are not in ascending order", isAscending(numbers));
		Arrays.sort(original);
		assertTrue("Sorted and original elements are different", Arrays.equals(original, numbers));
	}

	private boolean isAscending(int[] a) {
		if (a.length == 0)
			return true;

		int i = 1;
		while (i < a.length && a[i - 1] <= a[i]) {
			i++;
		}
		return i == a.length;
	}

}
