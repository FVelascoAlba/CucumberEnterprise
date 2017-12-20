package org.prueba;

import java.util.ArrayList;

import org.prueba.PurchaseInterface;

public class Server {

	private ArrayList<Album> albums;

	public Server() {
		Song s = new Song("ArtPop", "Lady Gaga", 3);
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(s);
		Album e = new Album("ArtPop", "6/11/2013", "Lady Gaga", 15);
		e.setSongs(songs);
		albums.add(e);
	}

	public void addSong() {
	}

	public void addAlbum() {
	}

	public void modifySong(Song s) {
	}

	public void deleteSong(Song s) {
	}

	public void deleteAlbum(Album a) {
	}

	public Song searchSong() {
		return null;
	}

	public void createUserManually() {
	}

	public void createUserAutomatically() {
	}

	public void deleteUser(User u) {
	}

	public void sendMessage(User u) {
	}

	public boolean purchaseAlbum(Album al, User u) {

		boolean response = false;

		if (al != null && u != null) {
			if(albumExists(al)) {
				if(payProduct(al, u)) {
					u.setAlbums_bought(al);
					response = true;
				}
			}

		}
		return response;
	}
	
	public boolean albumExists(Album al) {
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).equals(al)) {
				return true;
			}
		}
		return false;
	}

	public boolean payProduct(Album al, User u) {
		int money = PurchaseInterface.getMoneyEarned(u);

		if (money >= al.getPrice()) {
			return true;
		} else {
			return false;
		}
	}
}