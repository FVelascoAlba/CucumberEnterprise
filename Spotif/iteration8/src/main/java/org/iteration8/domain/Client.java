package Domain;

import java.util.ArrayList;

public class Client {

	public void createUser(String name, String surname, String userName, String password) {

		User new_user = new User();

		if (name.equals("") && surname.equals("") && userName.equals("") && password.equals("")) {
			if (isNotAlphanumeric(name) && isNotAlphanumeric(surname) && isNotAlphanumeric(userName)
					&& isNotAlphanumeric(password)) {
				if (name.length() < 255 && surname.length() < 255 && userName.length() < 255
						&& password.length() < 255) {

				}
			}
		}
	}
	
	public void buySong() {}
	
	public void buyAlbum() {}
	
	public void playbackSong() {}
	
	public void playbackAlbum() {}
	
	public void deleteListSongs(ArrayList<Song> list) {}
	
	public void modifyListSongs (ArrayList<Song> list) {}
	
	public void modifyUser(User us) {}
	
	
	public boolean isNotAlphanumeric(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	
}