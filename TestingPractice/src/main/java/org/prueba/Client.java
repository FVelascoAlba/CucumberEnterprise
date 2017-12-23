package org.prueba;

import java.util.ArrayList;

/**
 *
 * @author nou model
 *
 */
public class Client {

	/**
	 *
	 */
	public Client() {

	}

	/***
	 *
	 * @param userName
	 *            Name of the user to be created
	 * @param password
	 *            Password of the new user
	 * @return A boolean value indicating
	 * if the user have been created properly
	 */
	public final boolean createUser(final String userName,
			final String password) {

		boolean response = false;

		if (!userName.equals(" ") && !password.equals(" ")
				&& isAlphanumeric(userName)
				&& isAlphanumeric(password)) {
			response = true;
		}

		return response;
	}

	/**
	 *
	 */
	public final void buySong() {
	}

	/**
	 *
	 */
	public final void buyAlbum() {
	}

	/**
	 *
	 */
	public final void playbackSong() {
	}

	/**
	 *
	 * @param al album
	 * @param us user
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final static boolean playbackAlbum(final Album al,
			final User us) throws Exception {

		ArrayList<User> users = BrokerDB.getAgente().getUsers();
		ArrayList<Album> albumList = BrokerDB.getAgente().getAlbums();

		if (al != null && us != null) {
			for (int i = 0; i < users.size(); i++) {
				if (existUser(us)) {
					int size = albumList.size();
					Album al1 = albumList.get(i);
					int ss = al.getNSongs();
					for (int j = 0; j < size; j++) {
						if (al.equals(al1)
								&& ss > 0) {
							return true;
						}
					}
				}
			}

		}
		return false;

	}

	/**
	 *
	 * @param us user
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final static boolean existUser(final User us) throws Exception {
		ArrayList<User> users = BrokerDB.getAgente().getUsers();

		for (int i = 0; i < users.size(); i++) {
			if (us.equals(users.get(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 * @param list list of songs
	 */
	public final void deleteListSongs(final ArrayList<Song> list) {
	}

	/**
	 *
	 * @param s song
	 * @param us user
	 * @param id id of list of songs
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final static boolean addSongToList(final Song s,
			final User us, final int id)
					throws Exception {

		ArrayList<User> users = BrokerDB.getAgente().getUsers();
		ArrayList<Song> songs = BrokerDB.getAgente().getSongs();

		if (s != null && us != null) {
			for (int i = 0; i < users.size(); i++) {
				for (int j = 0; j < songs.size(); j++) {
					User u = users.get(i);
					if (s.equals(songs.get(j))
							&& us.equals(u)
							&& us.checkID(id)) {
						return true;
					}
				}
			}
		}

		return false;

	}

	/**
	 *
	 * @param us user
	 */
	public final void modifyUser(final User us) {
	}

	/**
	 *
	 * @param s string
	 * @return boolean
	 */
	public final static boolean isAlphanumeric(final String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 *
	 * @param s string
	 * @return boolean
	 */
	public final static boolean isEmpty(final String s) {
		if (s.length() == 1 && s.charAt(0) == ' ') {
			return true;
		}
		return false;
	}

}
