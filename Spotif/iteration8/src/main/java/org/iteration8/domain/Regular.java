package Domain;

import java.util.ArrayList;

public class Regular extends User {

	public Regular_User(String name, String surname, String userName, String password, ArrayList<Song> songs_bought,
			ArrayList<Album> albums_bought, ArrayList<ArrayList<Song>> list_songs) {
		super(name, surname, userName, password, songs_bought, albums_bought, list_songs);
	}

}