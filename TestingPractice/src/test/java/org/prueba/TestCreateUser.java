package org.prueba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class TestCreateUser 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCreateUser( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCreateUser.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testAlphanumeric1()
    {
    	Client c = new Client();
    	
    
        assertTrue(c.createUser("FernandoV10", "asdf10"));
   
    }
    
    public void testAlphanumeric2() {
    	Client c = new Client();
    	
    	assertFalse(c.createUser("Fernan-do", " "));
    }
    
    
    public void testAlphanumeric3() {
    	
    	Client c = new Client();
    	
    	assertFalse(c.createUser(" ", " "));
    	
    }
    
    
    public void testAlphanumeric4() {
    	
    	Client c = new Client();
    	
    	assertFalse(c.createUser("FernandoV10", "asdf_10"));
    	
    }
}
