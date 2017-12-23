package org.prueba;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class TestPlaybackAlbum extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   public TestPlaybackAlbum ( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
   public static Test suite()
    {
        return new TestSuite( TestPlaybackAlbum.class );
    }

    /**
     * Rigourous Test :-)
     * @throws Exception 
     *
     */
    
    public void test1() throws Exception {
    	Album al = new Album ("ArtPop", "6/11/2013", "Lady Gaga", 15);
    	User us = new User("FernandoV10", "asdf10");
    	
    	Song s = new Song("ArtPop", "Lady Gaga", 3);
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(s);
		al.setSongs(songs);
    	
    	assertTrue(Client.playbackAlbum(al, us));
    }
    
    
    public void test2() throws Exception {
    	Album al = new Album ("ArtPop", "6/11/2013", "Lady Gaga", 15);
    	User us = new User("FernandoV10", "asdf10");
    	
    	assertFalse(Client.playbackAlbum(al, us));
    }
    
    public void test3() throws Exception {
    	
    	Album al = new Album ("War","28/2/1983","U2",17);
    	User us = new User("FernandoV10", "asdf10");
    	
    	assertFalse(Client.playbackAlbum(al,us));
    }
    
    public void test4() throws Exception {
    	Album al = new Album("NoExisto","3/7/1637","Descartes",5000);
    	User us = new User("FernandoV10", "asdf10");
    	
    	assertFalse(Client.playbackAlbum(al, us));
    	
    }
    
    public void test5() throws Exception {
    	Album al = new Album ("ArtPop", "6/11/2013", "Lady Gaga", 15);
    	User us = new User("PepeMola", "asdf1234");
    	
    	Song s = new Song("ArtPop", "Lady Gaga", 3);
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(s);
		al.setSongs(songs);
		
		assertFalse(Client.playbackAlbum(al, us));
    }
    
    public void test6() throws Exception {
    	Album al = null;
    	User us = new User("FernandoV10", "asdf10");
    	
    	assertFalse(Client.playbackAlbum(al, us));
    	
    }
    
}