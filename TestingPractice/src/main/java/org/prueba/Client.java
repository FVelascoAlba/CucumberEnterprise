package org.prueba;

import java.util.ArrayList;

public class Client {

	public Client() {

	}

	/***
	 * 
	 * @param userName
	 *            Name of the user to be created
	 * @param password
	 *            Password of the new user
	 * @return A boolean value indicating if the user have been created properly
	 */
	public boolean createUser(String userName, String password) {

		User new_user = null;
		boolean response = false;

		if (!userName.equals(" ") && !password.equals(" ")) {
			if (isAlphanumeric(userName) && isAlphanumeric(password)) {
				new_user = new User(userName, password);
				response = true;
			}
		}

		return response;
	}

	/**
	 * 
	 */
	public void buySong() {
	}

	public void buyAlbum() {
	}

	public void playbackSong() {
	}

	public static boolean playbackAlbum(Album al, User us) throws Exception {

		ArrayList<User> users = BrokerDB.getAgente().getUsers();
		ArrayList<Album> albumList = BrokerDB.getAgente().getAlbums();

		if (al != null) {
			if (us != null) {
				for (int i = 0; i < users.size(); i++) {
					if (existUser(us)) {
						for (int j = 0; j < albumList.size(); j++) {
							if (al.equals(albumList.get(i))) {
								if (al.getNSongs() > 0) {
									return true;
								}
							}
						}
					}
				}
			}

		}
		return false;

	}

	public static boolean existUser(User us) throws Exception {
		ArrayList<User> users = BrokerDB.getAgente().getUsers();

		for (int i = 0; i < users.size(); i++) {
			if (us.equals(users.get(i))) {
				return true;
			}
		}
		return false;
	}

	public void deleteListSongs(ArrayList<Song> list) {
	}

	public static boolean addSongToList(Song s, User us, int id) throws Exception {

		ArrayList<User> users = BrokerDB.getAgente().getUsers();
		ArrayList<Song> songs = BrokerDB.getAgente().getSongs();

		if (s != null) {
			if (us != null) {
				for (int i = 0; i < users.size(); i++) {
					for (int j = 0; j < songs.size(); j++) {
						if (s.equals(songs.get(j))) {
							if (us.equals(users.get(i))) {
								if (us.checkID(id)) {
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	public void modifyUser(User us) {
	}

	public static boolean isAlphanumeric(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEmpty(String s) {
		if (s.length() == 1 && s.charAt(0) == ' ') {
			return true;
		}
		return false;
	}

}