package ch.fhnw.algd1.gcd;

import ch.fhnw.algd1.gcd.GcdRec;
import ch.fhnw.algd1.gcd.framework.IGcd;

public class GcdRecTest extends AbstractGcdTest{

	@Override
	protected IGcd getGgt() {
		return new GcdRec();
	}

}
