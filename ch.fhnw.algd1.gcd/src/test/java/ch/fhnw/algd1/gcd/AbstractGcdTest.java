package ch.fhnw.algd1.gcd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ch.fhnw.algd1.gcd.framework.IGcd;

public abstract class AbstractGcdTest {
	private IGcd ggt;

	@Before
	public void init() {
		ggt = getGgt();
	}

	@Test
	public void testOnes() {
		assertEquals(1, ggt.gcd(1, 1));
	}

	@Test
	public void testOneThree() {
		assertEquals(1, ggt.gcd(1, 3));
	}

	@Test
	public void testThreeOne() {
		assertEquals(1, ggt.gcd(3, 1));
	}

	@Test
	public void testTwoThree() {
		assertEquals(1, ggt.gcd(2, 3));
	}

	@Test
	public void testThreeTwo() {
		assertEquals(1, ggt.gcd(3, 2));
	}

	@Test
	public void testTen1() {
		assertEquals(10, ggt.gcd(10, 100));
	}

	@Test
	public void testTen2() {
		assertEquals(10, ggt.gcd(100, 10));
	}

	@Test
	public void testThree1() {
		assertEquals(3, ggt.gcd(9, 15));
	}

	@Test
	public void testThree2() {
		assertEquals(3, ggt.gcd(15, 9));
	}

	@Test
	public void testPrimes1() {
		assertEquals(1, ggt.gcd(1637, 15683));
	}

	@Test
	public void testPrimes2() {
		assertEquals(1, ggt.gcd(15683, 1637));
	}

	@Test
	public void testNonPrimes1() {
		assertEquals(221, ggt.gcd(1637 * 221, 15683 * 221));
	}

	@Test
	public void testNonPrimes2() {
		assertEquals(221, ggt.gcd(15683 * 221, 1637 * 221));
	}

	@Test
	public void testThousands() {
		assertEquals(1000, ggt.gcd(1000, 1000));
	}

	protected abstract IGcd getGgt();
}
