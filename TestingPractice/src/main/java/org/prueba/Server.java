package org.prueba;

import java.util.ArrayList;

/**
 *
 * @author nou model
 *
 */
public class Server {

	/**
	 *
	 */
	public Server() {

	}

	/**
	 *
	 */
	public final void addSong() {
	}

	/**
	 *
	 */
	public final void addAlbum() {
	}

	/**
	 *
	 * @param s song
	 */
	public final void modifySong(final Song s) {
	}

	/**
	 *
	 * @param s song
	 */
	public final void deleteSong(final Song s) {
	}

	/**
	 *
	 * @param a
	 */
	public final void deleteAlbum(final Album a) {
	}

	/**
	 *
	 * @return song
	 */
	public final Song searchSong() {
		return null;
	}

	/**
	 *
	 */
	public final void createUserManually() {
	}

	/**
	 *
	 */
	public final void createUserAutomatically() {
	}

	/**
	 *
	 * @param u user
	 */
	public final void deleteUser(final User u) {
	}

	/**
	 *
	 * @param ad administrator
	 * @param em email
	 * @param re regular user
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final static boolean sendMessage(final Administrator ad,
			final Email em, final Regular re)
					throws Exception {

		if (ad != null && re != null
				&& em != null && ad.exists()
				&& re.exists()) {
			return true;
		}

		return false;

	}

	/**
	 *
	 * @param al album
	 * @param u user
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final boolean purchaseAlbum(final Album al,
			final User u) throws Exception {

		boolean response = false;
		if (al != null && u != null
				&& albumExists(al) && payProduct(al, u)) {
			u.setAlbumBought(al);
			response = true;
		}

		return response;
	}

	/**
	 *
	 * @param al album
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final boolean albumExists(final Album al)
			throws Exception {

		ArrayList<Album> albums = BrokerDB.getAgente().getAlbums();
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).equals(al)) {
				return true;

			}
		}
		return false;
	}

	/**
	 *
	 * @param al album
	 * @param u user
	 * @return boolean
	 */
	public final boolean payProduct(final Album al,
			final User u) {
		int money = u.getMoney();

		if (money >= al.getPrice()) {
			return true;
		} else {
			return false;
		}
	}
}