package org.prueba;

import java.util.*;

public class BrokerDB {
	protected static BrokerDB mInstancia=null;
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Album> albums = new ArrayList<Album>();
	private ArrayList<Administrator> admins = new ArrayList<Administrator>();
	private ArrayList<Regular> regularUsers = new ArrayList<Regular>();
	private ArrayList<Song> songs = new ArrayList<Song>();
	private ArrayList<ListSongs> listSongs = new ArrayList<ListSongs>();

	
	public BrokerDB() {
		Album al = new Album("ArtPop", "6/11/2013", "Lady Gaga", 15);
		Album al1 = new Album("Háblame bajito", "14/12/2017", "Abraham Mateo", 2);
		Album al2 = new Album("War", "28/2/1983", "U2", 17);
		Album al3 = new Album("Space Oddity", "4/11/1969", "David Bowie", 15);

		Song s = new Song("ArtPop", "Lady Gaga", 3);
		ArrayList<Song> songs_album = new ArrayList<Song>();
		songs.add(s);
		songs_album.add(s);
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
	
	
	public ArrayList<ListSongs> getListSongs() {
		return listSongs;
	}


	public void setListSongs(ArrayList<ListSongs> listSongs) {
		this.listSongs = listSongs;
	}


	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}


	public ArrayList<Administrator> getAdmins() {
		return admins;
	}

	public void setAdmins(ArrayList<Administrator> admins) {
		this.admins = admins;
	}

	public ArrayList<Regular> getRegularUsers() {
		return regularUsers;
	}

	public void setRegular_users(ArrayList<Regular> regularUsers) {
		this.regularUsers = regularUsers;
	}

	protected static BrokerDB getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new BrokerDB();
		}
		return mInstancia;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(ArrayList<Album> albums) {
		this.albums = albums;
	}

}