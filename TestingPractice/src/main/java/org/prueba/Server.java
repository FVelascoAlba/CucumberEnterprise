package org.prueba;

import java.util.ArrayList;

import org.prueba.PurchaseInterface;

public class Server {

	public Server() {

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

	public static boolean sendMessage(Administrator ad, Email em, Regular re) throws Exception {

		if (ad != null) {
			if (re != null) {
				if (em != null) {
					if (ad.exists()) {
						if (re.exists()) {
							return true;
						}
					}
				}

			}
		}
		
		return false;
	}

	public boolean purchaseAlbum(Album al, User u) throws Exception {

		boolean response = false;
		if (al != null) {
			if (u != null) {
				if (albumExists(al)) {
					if (payProduct(al, u)) {
						u.setAlbums_bought(al);
						response = true;
					}
				}
			}

		}
		return response;
	}

	public boolean albumExists(Album al) throws Exception {

		ArrayList<Album> albums = BrokerDB.getAgente().getAlbums();
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).equals(al)) {
				return true;

			}
		}
		return false;
	}

	public boolean payProduct(Album al, User u) {
		int money = u.getMoney();

		if (money >= al.getPrice()) {
			return true;
		} else {
			return false;
		}
	}
}