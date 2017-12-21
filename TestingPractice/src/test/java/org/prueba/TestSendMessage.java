package org.prueba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestSendMessage extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public TestSendMessage(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TestSendMessage.class);
	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws Exception
	 */

	public void test1() throws Exception {

		Administrator ad = new Administrator("FernandoV10", "asdf10");
		Regular re = new Regular("AmandaS21", "00aRRmn");
		Email em = new Email("You have added correctly the song");
		em.setSource(ad);
		em.setDestination(re);

		assertTrue(Server.sendMessage(ad, em, re));

	}

	public void test2() throws Exception {

		Administrator ad = new Administrator("FernandoV10", "asdf10");
		Regular re = new Regular("PepeMola", "asdf1234");
		Email em = new Email("You have added correctly the song");
		em.setSource(ad);
		em.setDestination(re);

		assertFalse(Server.sendMessage(ad, em, re));

	}
	
	public void test3() throws Exception {

		Administrator ad = new Administrator("FernandoV10", "asdf10");
		Regular re = new Regular("AmandaS21", "00aRRmn");
		Email em = null;

		assertFalse(Server.sendMessage(ad, em, re));

	}
	
	public void test4() throws Exception {

		Administrator ad = new Administrator("PepeMola", "asdf1234");
		Regular re = new Regular("AmandaS21", "00aRRmn");
		Email em = new Email("You have added correctly the song");
		em.setSource(ad);
		em.setDestination(re);

		assertFalse(Server.sendMessage(ad, em, re));

	}
}
