package org.prueba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestPurchaseAlbum extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public TestPurchaseAlbum(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TestPurchaseAlbum.class);
	}

	/**
	 * Rigourous Test :-)
	 * @throws Exception 
	 */

	public void test1() throws Exception {

		Server s = new Server();
		Album al = new Album("War", "28/2/1983", "U2", 17);
		User us = new User("FernandoV10", "asdf10");
		us.setMoney(20);

		assertTrue(s.purchaseAlbum(al, us));

	}

	public void test2() throws Exception {

		Server s = new Server();
		Album al = new Album("Space Oddity", "4/11/1969", "David Bowie", 15);
		User us = null;

		assertFalse(s.purchaseAlbum(al, us));

	}
	
	public void test3() throws Exception {
		
		Server s = new Server();
		
		Album al = null;
		User us = new User("MoisesCR", "7kKqkaR");
		us.setMoney(100);
		
		assertFalse(s.purchaseAlbum(al, us));
	}
	
	public void test4() throws Exception {
		
		Server s = new Server();
		
		Album al = new Album("Space Oddity", "4/11/1969", "David Bowie", 15);
		User us = new User ("AmandaS21", "00aRRmn");
		us.setMoney(7);
		
		assertFalse(s.purchaseAlbum(al, us));
	}

}
