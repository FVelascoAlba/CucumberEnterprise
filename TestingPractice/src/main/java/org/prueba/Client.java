package org.prueba;


import java.util.ArrayList;

public class Client {
	
	private ArrayList <User> users;
	
	public Client() {}

	public boolean createUser(String userName, String password) {

		User new_user = null;
		boolean response=false;

		if (!userName.equals(" ") && !password.equals(" ")) {
			if (isAlphanumeric(userName) && isAlphanumeric(password)) {
				new_user = new User(userName,password);
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

	public void playbackAlbum() {
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
		if(s.length() == 1 && s.charAt(0) == ' ') {
			return true;
		}
		return false;
	}

}