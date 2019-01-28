package ch.fhnw.algd1.gcd;

import ch.fhnw.algd1.gcd.GcdIter;
import ch.fhnw.algd1.gcd.framework.IGcd;

public class GcdIterTest extends AbstractGcdTest {

	@Override
	protected IGcd getGgt() {
		return new GcdIter();
	}

}
