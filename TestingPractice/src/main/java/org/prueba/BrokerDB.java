package org.prueba;

import java.util.ArrayList;

/**
 *
 *
 */

public class BrokerDB {
	/**
	 *
	 */
	protected static BrokerDB mInstancia = null;
	/**
	 *
	 */
	private ArrayList<User> users = new ArrayList<User>();
	/**
	 *
	 */
	private ArrayList<Album> albums = new ArrayList<Album>();
	/**
	 *
	 */
	private ArrayList<Administrator> admins =
			new ArrayList<Administrator>();
	/**
	 *
	 */
	private ArrayList<Regular> regularUsers = new ArrayList<Regular>();
	/**
	 *
	 */
	private ArrayList<Song> songs = new ArrayList<Song>();
	/**
	 *
	 */
	private ArrayList<ListSongs> listSongs = new ArrayList<ListSongs>();

	/**
	 *
	 */
	public BrokerDB() {
		int a = 15;
		Album al = new Album("ArtPop", "6/11/2013", "Lady Gaga", a);
		int b = 2;
		Album al1 =
				new Album("Háblame bajito",
						"14/12/2017",
						"Abraham Mateo", b);
		int c = 17;
		Album al2 =
				new Album("War", "28/2/1983", "U2", c);
		int d = 15;
		Album al3 = new Album("Space Oddity", "4/11/1969",
				"David Bowie", d);

		Song s = new Song("ArtPop", "Lady Gaga", 3);
		songs.add(s);
		al.setSongs(songs);
		albums.add(al);
		albums.add(al1);
		albums.add(al2);
		albums.add(al3);

		User us = new User("FernandoV10", "asdf10");
		User us1 = new User("AmandaS21", "00aRRmn");
		User us2 = new User("MoisesCR", "7kKqkaR");

		users.add(us);
		users.add(us1);
		users.add(us2);

		Administrator ad = new Administrator("FernandoV10", "asdf10");
		admins.add(ad);

		Regular re = new Regular("AmandaS21", "00aRRmn");
		regularUsers.add(re);

		ListSongs ls = new ListSongs(1234567);
		listSongs.add(ls);
	}

	/**
	 *
	 * @return listSongs
	 */
	public final ArrayList<ListSongs> getListSongs() {
		return listSongs;
	}


	/**
	 *
	 * @param listSongsA list of songs
	 */
	public final void setListSongs(final ArrayList<ListSongs> listSongsA) {
		this.listSongs = listSongsA;
	}


	/**
	 *
	 * @return songs
	 */
	public final ArrayList<Song> getSongs() {
		return songs;
	}

	/**
	 *
	 * @param songsA list of songs
	 */
	public final void setSongs(final ArrayList<Song> songsA) {
		this.songs = songsA;
	}


	/**
	 *
	 * @return admins
	 */
	public final ArrayList<Administrator> getAdmins() {
		return admins;
	}


	/**
	 *
	 * @param adminsA list of administrators
	 */
	public final void setAdmins(final ArrayList<Administrator> adminsA) {
		this.admins = adminsA;
	}

	/**
	 *
	 * @return regularusers
	 */
	public final ArrayList<Regular> getRegularUsers() {
		return regularUsers;
	}

	/**
	 *
	 * @param regularUsersA list of regular users
	 */
	public final void setRegularUsers(
			final ArrayList<Regular> regularUsersA) {
		this.regularUsers = regularUsersA;
	}

	/**
	 *
	 * @return miInstancia
	 * @throws Exception throws exception
	 */
	protected final static BrokerDB getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new BrokerDB();
		}
		return mInstancia;
	}

	/**
	 *
	 * @return users
	 */
	public final ArrayList<User> getUsers() {
		return users;
	}

	/**
	 *
	 * @param usersA list of users
	 */
	public final void setUsers(final ArrayList<User> usersA) {
		this.users = usersA;
	}

	/**
	 *
	 * @return albums
	 */
	public final ArrayList<Album> getAlbums() {
		return albums;
	}


	/**
	 *
	 * @param albumsS list of albums
	 */
	public final void setAlbums(final ArrayList<Album> albumsS) {
		this.albums = albumsS;
	}

}
