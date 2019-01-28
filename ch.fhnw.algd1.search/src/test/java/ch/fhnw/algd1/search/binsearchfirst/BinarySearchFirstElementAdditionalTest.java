package ch.fhnw.algd1.search.binsearchfirst;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchFirstElementAdditionalTest {
	@Test
	public void testExistingIntegerAtStart() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 1);
		assertEquals(0, index);
	}

	@Test
	public void testExistingIntegerInBetween1() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 3);
		assertEquals(1, index);
	}

	@Test
	public void testExistingIntegerInBetween2() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 4);
		assertEquals(2, index);
	}

	@Test
	public void testExistingIntegerInBetween3() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 5);
		assertEquals(3, index);
	}

	@Test
	public void testExistingIntegerAtEnd() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 9);
		assertEquals(4, index);
	}

	@Test
	public void testNonExistingInteger() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 7);
		assertEquals(4, index);
	}

	@Test
	public void testTooSmallInteger() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 0);
		assertEquals(0, index);
	}

	@Test
	public void testTooLargeInteger() {
		int[] elements = new int[] { 1, 3, 4, 5, 9 };
		int index = BinSearchFirstElement.binSearch(elements, 11);
		assertEquals(elements.length, index);
	}

	@Test
	public void testEqualInteger() {
		int[] elements = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		int index = BinSearchFirstElement.binSearch(elements, 6);
		assertEquals(elements.length, index);
	}
}
