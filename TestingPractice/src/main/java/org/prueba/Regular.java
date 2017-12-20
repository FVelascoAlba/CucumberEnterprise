package org.prueba;

import java.util.ArrayList;

public class Regular extends User {

	public Regular(String name, String surname, String userName, String password, ArrayList<Song> songs_bought,
			ArrayList<Album> albums_bought, ArrayList<ArrayList<Song>> list_songs) {
		super(userName, password);
	}

}