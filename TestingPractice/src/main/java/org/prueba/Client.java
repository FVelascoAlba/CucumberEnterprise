package org.prueba;

import java.util.ArrayList;

public class Client {

	private ArrayList<User> users;
	private ArrayList<Album> albumList;

	public Client() {
		Album al = new Album("ArtPop", "6/11/2013", "Lady Gaga", 15);
		Album al1 = new Album("Háblame bajito", "14/12/2017", "Abraham Mateo", 2);

		albumList.add(al);
		albumList.add(al1);

	}

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

	public void buySong() {
	}

	public void buyAlbum() {
	}

	public void playbackSong() {
	}

	public boolean playbackAlbum(Album al, User us) {

		if (!al.equals(null)) {
			if (!us.equals(null)) {
				for (int i = 0; i < users.size(); i++) {
					if (us.equals(users.get(i))) {
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

	public void deleteListSongs(ArrayList<Song> list) {
	}

	public void modifyListSongs(ArrayList<Song> list) {
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