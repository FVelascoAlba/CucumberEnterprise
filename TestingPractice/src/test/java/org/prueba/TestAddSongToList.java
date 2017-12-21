package org.prueba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class TestAddSongToList 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestAddSongToList( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestAddSongToList.class );
    }

    /**
     * Rigourous Test :-)
     * @throws Exception 
     */
    
    public void test1 () throws Exception {
    	
    	Song s = new Song("ArtPop", "Lady Gaga", 3);
    	User us = new User("FernandoV10", "asdf10");
    	ListSongs ls = new ListSongs(1234567);
    	
    	assertTrue(Client.addSongToList(s, us, ls.getId()));
    }
    
    public void test2 () throws Exception {
    	
    	Song s = new Song("ArtPop", "Lady Gaga", 3);
    	User us = new User("FernandoV10", "asdf10");
    	ListSongs ls = new ListSongs(0);
    	
    	assertFalse(Client.addSongToList(s, us, ls.getId()));
    }
    
    
    public void test3() throws Exception {
    	
    	Song s = new Song ("NoExisto","Descartes",500);
    	User us = new User("FernandoV10", "asdf10");
    	ListSongs ls = new ListSongs(1234567);
    	
    	assertFalse(Client.addSongToList(s, us, ls.getId()));	
    }
    
    
    public void test4() throws Exception {
    	
    	Song s = new Song("ArtPop", "Lady Gaga", 3);
    	User us = new User("PepeMola", "asdf1234");
    	ListSongs ls = new ListSongs(0);
    	
    	assertFalse(Client.addSongToList(s, us, ls.getId()));	
    }
    
    public void test5() throws Exception {
    	
    	Song s = null;
    	User us = new User("FernandoV10", "asdf10");
    	ListSongs ls = new ListSongs(1234567);
    	
    	assertFalse(Client.addSongToList(s, us, ls.getId()));	
    	
    	
    }
}